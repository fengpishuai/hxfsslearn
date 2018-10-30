/*
 * jqGrid通用展示插件
 * author:zhanggz
 */
(function($){
	$.fn.commGrid = function(options){
		var otherArgs = Array.prototype.slice.call(arguments, 1);
		if (typeof options == 'string') {
			var fn = this[0][options];
			if($.isFunction(fn)){
				return fn.apply(this, otherArgs);
			}else{
				throw ("commGrid - No such method: " + options);
			}
		}
		return this.each(function() {
			var opts = {};
			var dom = this;  // 保存组件对象
			var gridData = {};//所有的数据
			var defaults = {
				url				: sys_ctx+'/commQueryAction.do',//url
				postData		: {},//发送数据
				FILTER_SQL		: "FILTER_SQL",//支持sql的条件 必须
				TABLE_INFO		: "TABLE_INFO",//返回的数据
				COL_LIST		: "COL_LIST",//返回的表头
				COL_TITLE		: "COL_TITLE",//返回表中头的列名称
				COL_ID			: "COL_ID",//返回表中头的列ID
				cwidth			: 5,//调整宽度
				cheight			: 140,//调整高度
				prmNames 		: {
		        	page		: "CUR_PAGE",// 传递的当前页
		        	rows		: "PAGE_ROW" // 传递的每页多少行
		        },
		        jsonReader		: {
		            userdata 	: "redate",
		            root		: "TABLE_INFO.ROWS", // 数据行
		            page		: "CUR_PAGE",  // 当前页
		            total		: "COUNT_PAGE",    // 总页数
		            records		: "COUNT_ROW", // 总记录数
		            repeatitems : false // 设置成false，在后台设置值的时候，可以乱序。且并非每个值都得设
		        },
		        rowNum			: 100,
		        rowList			: [100,150,200],
		        height			: $("#sidegrid").height()-140,
		        shrinkToFit		: false,
		        rownumbers		: false,
		        pager			: '#grid9_pager',
		        sortname		: '',
		        multiselect		: false,
		        multiboxonly	: false,
		        cellEdit		: false,
		        scroll			: false,
		        loadonce		: false,
		        hoverrows		: false,
		        altRows			: true,
		        isHaveColMN		: false,//外部传入colModel和name
		        colModel		: {},//{"字段":{对应的colModel}}
		        colMN			: [],//[{"COL_ID":"F_YT","COL_TITLE":"业态"},{"COL_ID":"F_FRGS","COL_TITLE":"法人公司名称"}]
		        isHaveTwoTitle	: false,//是否有二级表头
		        twoTitle		: "SLEVEL_TITLE",//二级表头
		        twoTitleId		: "TWO_TITLE_ID",//二级表头id
		        twoTitleMc		: "TWO_TITLE_MC",//二级表头名称
		        twoTitleCols	: "TWO_TITLE_COLS",//二级表头占的列数
			};
			opts = $.extend(defaults,options);
			this.init = function(){
				if(opts.isHaveColMN==false){
					dom.queryData();
				}else{
					gridData.COL_LIST = opts.colMN;
					dom.creatGrid();
				}
			};
			//查询数据
			this.queryData = function(){
				var sendData = $.copy(opts.postData);
				var expr = opts.FILTER_SQL;
				var prm	= [];
				var ret,p;
				if(sendData[expr]==null){
					 if ( typeof expr === 'string' ) {
						 prm = expr.split('.');
				     }
					 var i = prm.length;
					 if( i ) {
						 ret = sendData;
						 while (ret && i--) {
							 p = prm.shift();
							 if(i==0){
								 ret[p] = " 1=0 ";
								 break;
							 }
							 ret = ret[p];
						 }
					 }
				}else{
					sendData[expr] = " 1=0 ";
				}
			    $.ajax({
			          url		: opts.url,
			          type		: "POST",
			          data		: {jsondata:$.toJSON(sendData)},
			          dataType	: "json",
			          async 	: true,
			          success	: function( data ) {
			        	  if(data.RET_CODE == "-1"){
			        		  tipAlert(JSCONFIG.PUBLIC_ALERT1,data.RET_MSG,JSCONFIG.PUBLIC_ALERT2,0);
			        		  return ;
			        	  }else{
			        		  gridData.COL_LIST  	 = data[opts.TABLE_INFO][opts.COL_LIST];
			        		  if(opts.isHaveTwoTitle == true){
			        			  gridData.TWO_COL_LIST  = data[opts.TABLE_INFO][opts.twoTitle];
			        		  }
			        	      dom.creatGrid();
			        	  }
			          }
			     });
			};
			this.creatGrid = function(){
				var colNames = [];
				var colModel = [];
				var wcolModel 	= opts['colModel'];
				$.each(gridData.COL_LIST,function(k,v){
					var COL_TITLE 	= v[opts.COL_TITLE];
					colNames.push(COL_TITLE);
					var COL_ID 		= v[opts.COL_ID];
					var col 		= {name:COL_ID,index:COL_ID, width:200, frozen : false,sortable:false,sorttype:'text',edittype:"text",align:"left",editable:false,hidden:false};
					var ccol		= wcolModel[COL_ID];
					col				= $.extend(col,ccol);
					colModel.push(col);
				});
				function format(cellvalue){
			    	if(cellvalue!==""&&cellvalue!=null){
			    		var year = 0;
						var month = 0;
						var day = 0;
				        var hour = 0;
				        var minute = 0;
				        var second = 0;
				        year = cellvalue.substring(0,4);
				        month = cellvalue.substring(4,6);
				        day = cellvalue.substring(6,8);
				        hour = cellvalue.substring(8,10);
				        minute = cellvalue.substring(10,12);
				        second = cellvalue.substring(12,14);
				        if(hour!="" && minute!="" && second!=""){
				        	return (year+"-"+month+"-"+day+" "+hour + ":" + minute + ":"+ second);
				        }else{
				        	return (year+"-"+month+"-"+day);
				        }
			    	}else{
			    		return "";
			    	}
			    }
				$(dom).jqGrid({
			        url				:opts.url,//创建表格
			        datatype		: "json",
			        data			:[],
			        postData		:{jsondata:$.toJSON(opts['postData'])},
			        mtype			:"post",
			        prmNames 		:{
			        	page		:opts.prmNames.page,
			        	rows		:opts.prmNames.rows
			        },
			        jsonReader		: {
			            userdata 	: opts.jsonReader.userdata,
			            root		: opts.jsonReader.root, // 数据行
			            page		: opts.jsonReader.page,  // 当前页
			            total		: opts.jsonReader.total,    // 总页数
			            records		: opts.jsonReader.records, // 总记录数
			            repeatitems : opts.jsonReader.repeatitems // 设置成false，在后台设置值的时候，可以乱序。且并非每个值都得设
			        },
			        colNames		:colNames,
			        colModel		:colModel,
			        rowNum			:opts['rowNum'],
			        height			:$("#sidegrid").height()-parseFloat(opts.cheight),
			        autowidth		:true,
			        autoScroll		:true,
			        autoheight		:true,
			        shrinkToFit		:opts['shrinkToFit'],
			        rownumbers		:opts['rownumbers'],
			        rowList			:opts['rowList'],
			        pager			: '#grid9_pager',
			        sortname		: opts['sortname'],
			        viewrecords		: true,
			        sortorder		: "desc",
			        recordtext		: "{0} - {1}\u3000共 {2} 条",
			        emptyrecords	: "",
			        loadtext		: "读取中...",
			        pgtext 			: " {0} 共 {1} 页",
			        multiselect		: opts['multiselect'],
			        multiboxonly	:opts['multiboxonly'],
			        cellEdit		:opts['cellEdit'],
			        cellsubmit 		: 'clientArray',
			        scroll			:opts['scroll'],
			        loadonce		:opts['loadonce'],
			        hoverrows		:opts['hoverrows'],
			        altRows			:opts['altRows'],
			        //footerrow:true,//合计
			        gridComplete	: function() {
			        	$(dom).trigger("gridCreatComplete");
			        },
			        afterEditCell 	: function(rowid, cellname, value, iRow, iCol) { // 进入编辑框显示 rowid 唯一;iRow行号
			        },
			        loadComplete:function(data){
			        	$(dom).trigger("gridloadComplete",data);
			        	dom.gridResize();
			        }
			    });
			    $(dom).jqGrid('navGrid','#grid9_pager',{edit:false,add:false,del:false,search:false,refresh:false});
			    $(dom).trigger("gridCreatGrid");
			    if(opts.isHaveTwoTitle == false)return;
			    dom.creatTwoTitle({twoTitle:gridData.TWO_COL_LIST});
			};
			//创建二级表头
			this.creatTwoTitle = function(para){
				var twoTitle = para.twoTitle||[];
				var arrayobj = [];
				$.each(twoTitle,function(k,v){
					var obj = {startColumnName: v[opts['twoTitleId']], numberOfColumns: v[opts['twoTitleCols']], titleText: v[opts['twoTitleMc']]};
					arrayobj.push(obj);
				});
				$(dom).jqGrid('setGroupHeaders',{ useColSpanStyle: true,
					groupHeaders:arrayobj 
				});
			};
			this.gridResize = function(){
				gridResize();
				$(document).ready(function(){
				    $(window).resize(function() {
				        gridResize();
				    });
				});
				function gridResize(){
				    var jqueryDom    = $(dom);
				    var iframeHeight = $("#sidegrid").height();
				    var iframeWidth  = $("#sidegrid").width();
				    jqueryDom.setGridHeight(iframeHeight - parseFloat(opts['cheight']));
				    jqueryDom.setGridWidth(iframeWidth -parseFloat(opts['cwidth']));
				}
			};
			this.setPostData = function(para){
				var postData = para.postData;
				$(dom).jqGrid("updatePaging",{page:"1"});
				var data = {postData:{jsondata:$.toJSON(postData)}};
				if(opts.loadonce==true){
					data.datatype = 'json';
				}
			    $(dom).jqGrid("setGridParam",data);
			    $(dom).trigger("reloadGrid");
			};
			this.init();
		});
	};
})(jQuery);