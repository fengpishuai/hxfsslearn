/**
 *   举例：
 *   创建：	$("#hlicSelect").hlicSelect({
 *				"defaultItem":"请选择",					//默认的选择，无配置此参数时，不显示
 *				"url":"/TagLeftMenuAction.do",			//后台请求数据的action，无配置此参数时，不加载数据
 *				"remote":sys_ctx,						//项目路径，无配置此参数时，从host根路径开始
 *				"width":"150px"							//默认宽度，无此参数时，遵循class样式
 *			});
 *
 *	方法：	$("#hlicSelect").hlicSelect("destory")		//销毁创建的组件，恢复到原来的组件
 *			$("#hlicSelect").hlicSelect("setValue"，value)//设置组件的选中值为value
 *			$("#hlicSelect").hlicSelect("getValue")		//获取当前选中的value
 *			$("#hlicSelect").hlicSelect("addItem",{text:"选择一",value:"1"})		//静态添加一个选项
 */

(function($){
	$.fn.hlicSelect = function(options,para){
		if($.type(options)=="string"){
			if(this.length>1){
				var valueArray = [];
				this.each(function(){
					if($.isFunction(this[options])){
						valueArray.push(this[options](para));
					}else{
						console.error("no method!   "+options);
						valueArray.push(null);
					}
				});
				return valueArray;
			}else if(this.length==1){
				var domObj = this.get(0);
				if($.isFunction(domObj[options])){
					return domObj[options](para);
				}else{
					console.error("no method!   "+options);
					return this;
				}
			}else{
				return this;
			}
		}
		return this.each(function(){
			var defaults = {
					"defaultItem"		: null		,	// Default select item. for example, add "please select"
					"defaultKey"        : null      ,   // 
					"url"				: null		,	// Network address that the plugin can ask for item data
					"remote"			: ""		,	// Relativing to the host, it can be a project default name
					"width"				: "80px"	,	// The width of select of plugin
					"height"			: "19px"	,	// The height of select of plugin
					"selectTime"		: 100		,	// The time of effect for show or hide
					"key"				: ""		,	// The location of key for item
					"value"				: ""		,	// The location of show text of item
					"fjMark"			: ""		,	// The location of show fenji of item
					"fjMarkGroupid"		:"0"		,	// The location of show fenji of item
					"location"			: ""		,	// The location of key-value in response data
					"selectFirst"		: false		,	// Default selecting the first item
					"sendData"			: {}		,	// The plugin can send this data to ask for item data
					"debug"				: false		,	//show the debug information
					"createComplete"	: null		,	//When created,calling this method
					"groupId"			: "0" 		,			//
					"maxHeight"			: null		,	//
					"isInput"			:true 		, 		//是否支持用户输入
					"searchfun"			:false 		, 		//是否搜索
					"listclass"			:"" 		, 		//可选择列表的自定义class
					"changed"			:null 		//选项改变回调
			};
			var opts = $.extend(defaults,options);
			var allItems = new Array();
			this._create = function(){
				$(this).empty();
				this.init();
				this._loadData();
			};
			this.init = function(){
			};
			var dataobj = {};
			var pItemData = new Object() ;
			this._loadData = function(){
				var obj = this;
				if(opts.url){
//					var sendData = {DCT_ID:"SSO_FUN_SSO",service:"BizWebAppService",smethod:"queryAppFunList"};
					$.ajax({
						url:opts.remote+opts.url,
						data : opts.sendData,
						dataType:"json",
						type:"GET",
						success:function(data){
							dataobj = $.copy(data);
							if(opts.debug){
								console.info("下拉框返回数据");
								console.info(data);
							}
							obj._parseData(data);
							if(opts.createComplete){//执行回调
								setTimeout(function(){
									opts.createComplete();
								},0);
							}
						},
						error:function(){
							if(opts.debug){
								console.info("错误");
								console.error("加载出错：↓↓↓↓↓↓↓");
								console.info("dom：");
								console.info(obj);
								console.info("url:");
								console.info(opts.remote+opts.url);
								console.error("加载出错：↑↑↑↑↑↑↑↑");
							}
						},
						complete:function(){
							
						}
					});
					
				}else{
					if(opts.createComplete){//执行回调
						setTimeout(function(){
							opts.createComplete();
						},0);
					}
				}
			};
			//获取返回的数据
			this.getAllData = function(){
				return dataobj;
			};
			this._trim = function(str){
				$.each(opts.fjMarkOption,function(key,val){
					str = str.replace(val,"");
				});
				return str;
			};
			
			this.addEvent = function(){
				$(this).bind("change",function(e){
					var value = $(this).select2("data");
					$(this).trigger("select_change",value);
					if($.isFunction(opts.changed)){
						opts.changed.call(this,pItemData[value.id]||value);
					}
				});
			};
			
			
			this.selectIndex = function(index){
				var selectindex = parseInt(index);
				if(selectindex>allItems.length-1){
					return false;
				}
				var item = allItems[selectindex];
				$(this).select2("data", {id: item.id, text: item.text});
			};
			//得到选中的编号
			this.getSelectIndex = function(){
				var selval = this.getValue();
				var selid = "";
				$.each(allItems,function(k,v){
					if(v.id===selval){
						selid = k;
						return false;
					}
				});
				return selid;
			};
			//得到所有下拉框中的数据
			this.getInitData = function(){
				return allItems;
			};
			
			this.destory = function(){
				$(this).replaceWith(oldObj);
			};
			
			this.setValue = function(value){
				var valueobj ;
				if(value===""){
					$(this).select2("data","");
					return true;
				}
				if(value!=null){
					$.each(allItems,function(i,obj){
						if(obj.id ===value){
							valueobj = $.copy(obj);
							return false;
						}
					});
					if(valueobj){
						return $(this).select2("data",valueobj);
					}
				}
				
			};
			this.getValue = function(){
				return $(this).select2("val");
			};
			this.getFullValue = function(){
				return $(this).select2("data");
			};
			this.getName = function(){
				return $(this).select2("val").text;
			};
			this.getConfig = function(){
				return dataobj;
			};
			
			this.creatMapData = function(array){
				var retObj = new Object();
				if($.type(array)==="array"){
					for(var i=0;i<array.length;i++){
						retObj[array[i][opts.key]] = array[i];
					}
				}
				return retObj;
			};
			
			this._parseData = function(para){
				var obj = this;
				var array =para;
				
				$.each(opts.location.split("."),function(a,b){
					array = array[b];
				});
				if(opts.debug){
					console.info(array);
				}
				pItemData = this.creatMapData(array);
				var itemData = new Array();
				if($.type(array)==="array"){
					$.each(array,function(a,b){
						var key = b;
						$.each(opts.key.split("."),function(c,d){
							key = key[d];
						});
						var value = b;
						$.each(opts.value.split("."),function(c,d){
							value = value[d];
						});
						var fjMark = b;
						$.each(opts.fjMark.split("."),function(c,d){
							fjMark = fjMark[d];
						});
						if(opts.debug){
							console.info("key-value");
							console.info(key+"-"+value);
						}
						var item = {};
						item.id = key;
						item.text=value;
						item.fjMark=fjMark;
						
						itemData.push(item);
						
					});
				}
				var items = new Array();;
				if(opts.fjMark){
					var item ;
					for(var i=0;i<itemData.length;i++){
						if(itemData[i]["fjMark"]===opts.fjMarkGroupid){
							if(item!=null){
								items.push(item);
							}
							item = itemData[i];
							item.children = new Array();
							item.element = new Array();
							item.id=undefined;
							item.element.push($("<optgroup label='123123' />")[0]);
							
						}else{
							item.children.push( itemData[i]);
							allItems.push(itemData[i]);
						}
						//如果是最后一次循环，则将数据插入
						if(i==itemData.length-1){
							if(item!=null){
								items.push(item);
							}
						}
					}
					
				}else{
					items = itemData;
					allItems = itemData;
				}
				
				
				this.initSelect(items);
//				this.initSelect(itemData);
			};
			this.initData = function(items){
				allItems = items;
				this.initSelect(items);
			};
			this.format  =function(result, label, query) { 
				var retdata;
	
				retdata = "<span class='select2-match'></span>"+result.text;
				return retdata; 
			};
			 
			this.initSelect = function(data){
				
				$(this).select2({
					data:data,
					width:opts.width,
					placeholder:opts.defaultItem,
					formatResult:this.format,
					formatNoMatches: function () { return "未找到可选项"; },
					searchfun:opts.searchfun,
					listclass:opts.listclass
					
				});
				if(opts.selectFirst){
					this.selectIndex(0);
				}
				if(opts.defaultKey){  // 判断defaultKey是否存在   
					this.setValue(opts.defaultKey);  // 如果存在就设置缺省的text
				}
				this.addEvent();
			};
			
			this.readonly = function(){
				$(this).select2("disable");
			};
			this.removeReadonly = function(){
				$(this).select2("enable");
			};
			if(opts.debug){
				console.info("创建hlicSelect");
			}
			this._create();
		});
		
	};
})(jQuery);