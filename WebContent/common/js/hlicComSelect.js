(function($,undefined){
var baseHtml = '<div class="win-show">'
	           +'   <div class="win-showlayer"></div>'
	           +'     <div class="win-container" id="win-container">'
	           +'         <div class="win-title" id="win-title">'
	           +'             <span class="sicon"></span>'
	           +'             <span class="closeimg"></span>'
	           +'             <span class="freshbtn2"></span>'
	           +'         </div>'
	           +'         <div class="win-content">'
	           +'             <iframe id="url" name="frame0" width="100%" height="100%" frameborder="0" frameid="0" src=""></iframe>'
	           +'         </div>'
	           +'     </div>'
	           +' </div>'; 
$.fn.hlicComSelect = function(options,param){
	if(typeof options ==="string"){
		return this.each(function(){
			return this[options]();
		});
	}
	var wdom = this;
	if(this.length<=0){
		var ddd = $("<div />");
		var rrr = this.selector.replace("#","");
		ddd.attr("id",rrr);
		$(parent.document.body).append(ddd);
		wdom = ddd;
	}
	return wdom.each(function(){
		var defaults = {
				"callback":null, 			//相通环境变量的传递方法
				"width":"300",				//窗口的宽度
				"height":"300",				//窗口的高度
				"title":"弹出框",			//窗口的标题
				"lockbg":true,//是否锁定背景
				"loadtext":"正在加载中...",	//遮罩的文本提示
				"dragtext":"*释放鼠标进行查看*",	//拖动的文本提示
				"url":"",					//需要打开的url
				"onlyfirst":false, 			//是否只使用一次，用完就销毁
				"parenturl":null,			//父容器的url
				"dydata":null,//动态数据，这里的每次都可以不同
				"customdata":null,			//自定义需要带的数据，指定function，返回值就是自定义数据
				"iconclass":"default",		//标题的class样式，只填写16*16的背景图片就好
				"hotstart":false 			//是否热启动。true时，会预先加载
					
		};
		var dom = this;
		var opts = $.extend(defaults,options);
		dom.selectcallback = opts.callback;
		if($.isFunction(this["isComSelect"])){
			if(this["isComSelect"]()==true){
				var dydata = typeof options==="object"?options.dydata:null;
				this.inputParam(dydata);
				this.show();
				return ;
			}
		}
		/*
		 * 公共表格弹出框
		 * title：表格名称
		 * url:表格连接
		 * fn:返回函数
		 */
		this.create = function(){
			var dom = this;
			var dctDom = $(baseHtml);
			var iframecontent = dctDom.find("#url");
			function windowclose(){
				setTimeout(function(){
					dom.close();
				},0);
			}
			function callback(){
				if($.isFunction(dom.selectcallback)){
					return dom.selectcallback.apply(dom,arguments);
				}else{
					return null;
				}
			}
			iframecontent.bind("load",function(e){
				if($.isFunction(callback)){
					// 设置回调参数
					if ( $.browser.msie&&+$.browser.version<8 ){//低于ie8的浏览器处理
						// ie
						document.frames[iframecontent[0].id].window["callback"] = callback;
					}else{
						// 设置全局变量，方便其他js可以调用
						iframecontent[0].contentWindow["callback"] = callback;  
					}
				}
				if($.isFunction(opts.customdata)){
					// 设置回调参数
					if ( $.browser.msie&&+$.browser.version<8 ){//低于ie8的浏览器处理
						// ie
						document.frames[iframecontent[0].id].window["getComSelectData"] = opts.customdata;
					}else{
						// 设置全局变量，方便其他js可以调用
						iframecontent[0].contentWindow["getComSelectData"] = opts.customdata;  
					}
				}
				// 设置回调参数
				if ( $.browser.msie&&+$.browser.version<8 ){//低于ie8的浏览器处理
					// ie
					document.frames[iframecontent[0].id].window["panClose"] = windowclose;
				}else{
					// 设置全局变量，方便其他js可以调用
					iframecontent[0].contentWindow["panClose"] = windowclose;
				}
				// 设置关闭的判断处理
				if ( $.browser.msie&&+$.browser.version<8 ){//低于ie8的浏览器处理
					// ie
					beforeClose = document.frames[iframecontent[0].id].window["beforeClose"];
				}else{
					// 设置全局变量，方便其他js可以调用
					beforeClose = iframecontent[0].contentWindow["beforeClose"];
				}
				dom.inputParam(opts.dydata);
			});
			$(this).append(dctDom);
			this.load();
	    	//$(wdom).find("iframe").attr("src",opts.url);
		};
		this.load = function(){
			$(this).find("#url").attr("src",opts.url);
		};
		this.isComSelect = function(){
			return true;
		};
		this.close = function(){
			if(opts.onlyfirst){
				this.remove ();
			}else{
				this.hide();
			}
		};
		this.remove = function(){
			$(this).unbind().remove();
		};
		this.show = function(){
			$(this).show();
		};
		this.hide = function(){
			$(this).hide();
		};
		this.hideDravOver = function(){
			$(this).find(".dravover").hide();
		};
		this.showDravOver = function(){
			$(this).find(".dravover").show();
		};
		this.inputParam = function(dydata){
			var initCallBack = null;
			if ( $.browser.msie&&+$.browser.version<8 ){//低于ie8的浏览器处理
				// ie
				initCallBack = $("#url",this)[0].window.initSelect;
			}else{
				// 设置全局变量，方便其他js可以调用
				initCallBack = $("#url",this)[0].contentWindow.initSelect;
			}
			if($.isFunction(initCallBack)){
				initCallBack.call(this,dydata);
			}
		};
		
		this.draggableListener = function(){
			var dom = this;
			var htmlContent = $(this).find("#url");
			$(this).find("#win-container").draggable({
				cursor:"move", 
				containment: "parent.window",
				scroll: false,
//				containment: "document.body",
				start:function(){
					//dom.showDravOver();
					//htmlContent.hide();
				},
				stop:function(){
					//dom.hideDravOver();
					//htmlContent.show();
				}
			});
		};
		this.create();
		this.draggableListener();
	});
};
})(jQuery,undefined);