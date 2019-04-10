(function($){
	//弹出框
	function popBoxElem(val,opt){
		var tableId = $(this).attr("id");
        var html = '<div><input class="commonGridInput" type="text"/>';
        html += '<i class="commonGridSearch" onclick=\'chooseProduct("' + tableId + '","' + opt.id + '","'+opt.name+'")\'></i></div>';
        var a = $(html);
        if (val) {
            a.find('input').val(val);
        }
        return a.get(0);
	}
	function popBoxValue(elem, operation, value){
		if (operation === 'get') {
            return $(elem).find('input').val() || '';
        } else if (operation === 'set') {
            $('input', elem).val(value);
        }
	}
	$.fn.hlicStoGrid = function(options,para){
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
        var defaults = {
        	"datatype"    : "json",
            "url"         : "",
            "STO_ID"      : "",
            "STO_KEY"     : "",
            "SQL_Filter"  : "",
            "SQL_Where"   : "",
            "width"       : "",
            "height"      : "",
            "colNames"    : [],
            "pager"       : "",
            "cellEdit"    : true,
            "shrinkToFit" : false,//自动填充宽度
			"autoClickOne":true,//默认选中第一行
            "colModel"    : []
            
        };
        var opts = $.extend(defaults,options);
        return this.each(function(){
        	var lastrow = 0,
                lastcell=0,
                stoClient = {},//初始化数据
                editData=[],//编辑的数据
                newData = [],//新增的数据
                delData = [];//删除的数据
        	var dctLink = {};//
        	this._create = function(){
                this._init();
            };
            this._init = function(){
            	//this._formatterFn(opts.colModel);
            	this._initData();
            	this._createGrid();
            };
            this._initData = function(){
            	if(opts.colModel.length == 0 || opts.colNames.length == 0){
            		var sendData = {};
                	sendData.STO_ID = opts.STO_ID;
                	$.ajax({
                        url:sys_ctx+"/base/queryStoreColsList.action",
                        type:'post',
                        dataType:'json',
                        contentType:"application/json",
                        data:JSON.stringify(sendData),
                        async:false
                    }).done(function(data){
                    	if(data.colList.length > 0){
                    		setColModel(data.colList);
                    		stoClient["dofStores"] = data.dictList;
                    	}else{
                    		console.log("请检查dof_dct_cols中列，是否配置正确！");
                    	}
                    });
            	}
            	function setColModel(colList){
                	var colModels = [];
                	var colNames = [];
                	var title = "";
            		for(var i=0;i<colList.length; i++){
            			var model = {};
            			//弹出帮助框
            			if(colList[i].colFkDct == 1){
            				title = colList[i].colTitle;
            				colNames.push(title);
            				model = {name:colList[i].colId,index:colList[i].colId,editable: true,hidden: true, width:colList[i].colShowSize};
            				colModels.push(model);
            				title = colList[i].colTitle;
            				model = {name:colList[i].colId,index:colList[i].colId,classes: 'cus-edit-td',editable: true,edittype: 'custom',align:"center", width:colList[i].colShowSize,edittype: 'custom',
                                editoptions: {
                                    custom_element: popBoxElem,
                                    custom_value: popBoxValue,
                                    a:1
                                }
                     		};
            			}else if(colList[i].colEditStyle == 4){//复选框
            				title = colList[i].colTitle;
            				model = {name:colList[i].colId,index:colList[i].colId,editable: true,edittype:'checkbox',formatter:'checkbox',align:"center", width:colList[i].colShowSize};
            			}else{
            				title = colList[i].colTitle;
            				model = {name:colList[i].colId,index:colList[i].colId,editable: true, width:colList[i].colShowSize};
            			}
            			colNames.push(title);
            			colModels.push(model);
            		}
            		opts.colNames = colNames;
            		opts.colModel = colModels;
                }
            };
            this._createGrid = function(){
            	$(this).jqGrid({
            		datatype: opts.datatype, //将这里改为使用JSON数据 
            		url:opts.url, //这是Action的请求地址 
            		mtype: 'POST', 
            		jsonReader:{
           		　　　　//id: "Id", //相当于设置主键
           		　　　　total: "totals",　　 //总页数(数据库中数据一共有多少页)
           		　　　　page: "page",　　//当前页
           		　　　　records: "records",//总记录数（一共多少条）
           		       root: "rows",　　　 //Json数据{jqGrid需要的数据行}
           		　　　　repeatitems: false
           		　　},
            		width: opts.width,
                    height: opts.height,
            		colNames:opts.colNames, 
            		colModel:opts.colModel, 
            		postData:{"STO_ID":opts.STO_ID,"SQL_Filter":opts.SQL_Filter != "" ? JSON.stringify(opts.SQL_Filter) : ""}, // 初始化传值
            		pager: opts.pager, //分页工具栏 
            		//imgpath: 'js/themes/basic/images', //图片存放路径 
            		rowNum:40, //每页显示记录数 
            		//rownumbers:true, //行序号
            		viewrecords: true, //是否显示行数 
            		rowList:[20,30,40], //可调整每页显示的记录数 
            		multiselect: false, //是否支持多选 
            		loadonce : false,//loadonce 如果设置为true，grid只从服务器加载一次数据。加载数据完成之后，datatype就被指定为local，并且以后所有的操作都是基于客户端的操作，同时，导航功能也会被禁用
            		altRows: true,
            		shrinkToFit: opts.shrinkToFit,//自动填充宽度
                    altclass:"someClass",
            		cellsubmit: "clientArray",//防止错误提示
            		cellEdit: opts.cellEdit,
            		//caption: "信息显示",
            		onSelectRow: function(id) {
            		},
            		onCellSelect: function(rowid,iCol,cellcontent,e){//获取选中单元格
            		    this.event.DSEVENT_ROW_CLICK(rowid);
            		    return true;
            		},
            		beforeEditCell:function(rowid,cellname,v,iRow,iCol){
            			lastrow = iRow;
            			lastcell = iCol;
            	    },
            	    formatCell:function(rowid,cellname,v,iRow,iCol){
            	    },
            	    afterEditCell:function(rowid,cellname,value,iRow,iCol){
            	    	return $(this).hlicStoGrid("hlicStoGrid_afterEditCell",{"rowid":rowid, "cellname":cellname, "value":value, "iRow":iRow, "iCol":iCol})||true;
            	    },
            	    afterInsertRow:function(rowid, rowdata, rowelem){
            	    },
            	    beforeSaveCell:function(rowid,cellname,value,iRow,iCol){
            	    	var updateData = {};
            	    	updateData.rowid = rowid;
                        updateData.cellFmc = cellname;
                        updateData.cellFmcVal = value;
                        updateData.iRow = iRow;
                        updateData.iCol = iCol;
            	    	this.synStoData(updateData);
                    },
                    loadComplete  : function(data){// 加载完毕 后执行
				    	return $(this).hlicStoGrid("hlicStoGrid_loadComplete",{})||true;
				    }
            	});
            };
            /**
             * 同步修改sto在编辑的时候的数据主要操作 editData=[],//编辑的数据 newData = [],//新增的数据 delData = [];//删除的数据
             * rowid = "1", cellname = "colEnum", value = "No", iRow = 1, iCol = 7
             */
            this.synStoData = function(updateData){
            	var rowid = updateData.rowid,
            	    cellFmc = updateData.cellFmc,
            	    cellFbh = updateData.cellFbh,
            	    cellFmcVal = updateData.cellFmcVal,
            	    cellFbhVal = updateData.cellFbhVal,
            	    iRow = updateData.iRow,
            	    iCol = updateData.iCol;
            	var isEditOtherRow = true,
	            	isEditSameRow = true,
	            	isNewOtherRow = true,
	            	isNewSameRow = true,
	            	editAllRow={},
	                editOneRowData={};
	            if(newData.length > 0){
	            	for(var i=0; i<newData.length; i++){
	            		var rowData = newData[i];
	            		$.each(rowData,function(k,v){
	            			if(k == rowid){
	            				$.each(v,function(key,val){
	            					//修改编辑行字段的值
	            					if(key == cellFmc && val != cellFmcVal){
	            						if(cellFmcVal == undefined || cellFmcVal == ""){
	            							delete v[key];
	            						}else{
	            							v[key]=cellFmcVal;
	            							//弹窗口特殊处理
	            							if(cellFbh != undefined && cellFbh != ""){
	            								v[cellFbh] = cellFbhVal;
	            							}
	            						}
	            						isNewSameRow = false;
	            					}
	            				});
	            				//给编辑行添加字段
	            				if(isNewSameRow){
	            					if(cellFmcVal != undefined && cellFmcVal != ""){
	            						v[cellFmc] = cellFmcVal;
            							//弹窗口特殊处理
	            						if(cellFbh != undefined && cellFbh != ""){
            								v[cellFbh] = cellFbhVal;
            							}
	            					}
	            				}
	            				isNewOtherRow = false
	            			}
	            			
	            		});
	            	}
	            	console.log("------------存储表新增数据start--------------");
	            	console.log(newData);
	            	console.log("------------存储表新增数据end--------------");
	            }
	            //当新增行中没有这行数据时，表示在编辑一行已有的数据
	           	if(isNewOtherRow){
	           		if(editData.length>0){
	                	for(var i=0; i<editData.length; i++){
	                		var rowData = editData[i];
	                		$.each(rowData,function(k,v){
	                			if(k == rowid){
	                				$.each(v,function(key,val){
	                					//修改编辑行字段的值
	                					if(key == cellFmc && val != cellFmcVal){
	                						if(cellFmcVal == undefined || cellFmcVal == ""){
	                							delete v[key];
	                						}else{
	                							v[key]=cellFmcVal;
		            							//弹窗口特殊处理
	                							if(cellFbh != undefined && cellFbh != ""){
		            								v[cellFbh] = cellFbhVal;
		            							}
	                						}
	                						isEditSameRow = false;
	                					}
	                				});
	                				//给编辑行添加字段
	                				if(isEditSameRow){
	                					if(cellFmcVal != undefined && cellFmcVal != ""){
	                						v[cellFmc] = cellFmcVal;
	            							//弹窗口特殊处理
	                						if(cellFbh != undefined && cellFbh != ""){
	            								v[cellFbh] = cellFbhVal;
	            							}
	                					}
	                				}
	                				isEditOtherRow = false
	                			}
	                		});
	                	}
	                	//添加一行数据
	                	if(isEditOtherRow){
	                		if(cellFmcVal != undefined && cellFmcVal != ""){
	                		    var rowData = $(this).jqGrid("getRowData",rowid);
	                		    editOneRowData[opts.STO_KEY] = rowData[opts.STO_KEY];
	                			editOneRowData[cellFmc]=cellFmcVal;
    							//弹窗口特殊处理
	                			if(cellFbh != undefined && cellFbh != ""){
	                				editOneRowData[cellFbh] = cellFbhVal;
    							}
	                            editAllRow[rowid]=editOneRowData;
	                            editData.push(editAllRow);
	                		}
	                	}
	                }else{
	                	//第一次进来赋值
	                	if(cellFmcVal != undefined && cellFmcVal != ""){
	            		    var rowData = $(this).jqGrid("getRowData",rowid);
	            		    editOneRowData[opts.STO_KEY] = rowData[opts.STO_KEY];
	                		editOneRowData[cellFmc]=cellFmcVal;
							//弹窗口特殊处理
	                		if(cellFbh != undefined && cellFbh != ""){
                				editOneRowData[cellFbh] = cellFbhVal;
							}
	                        editAllRow[rowid]=editOneRowData;
	                        editData.push(editAllRow);
	                	}
	                }
	           		console.log("------------存储表更新的数据start--------------");
	                console.log(editData);
	                console.log("------------存储表更新的数据end--------------");
	           	}
            };
            this.hlicStoGrid_afterEditCell = function(para){
				var rowid 		= para.rowid, 
					cellname 	= para.cellname, 
					value 		= para.value, 
					iRow 		= para.iRow, 
					iCol 		= para.iCol,
				    cellId      = para.rowid+"_"+para.cellname,
				    refDctName = "";
				var dom = this;
				var editCell = $("#"+ iRow +"_"+ cellname);
				var editCellLastVal = editCell.val();
				var refFieldName = cellname;
				var fieldSuffix = refFieldName.substring(refFieldName.length-4);
				var grid_id = $(this).attr("id");
				//弹出帮助框
				if(fieldSuffix == "_FMC"){
					//editCell.after('<i class="commonGridSearch" onclick=\'chooseProduct("'+grid_id+'","' + rowid + '","' + cellId + '","'+cellname+'")\'>');
					if(!$.isEmptyObject(dctLink)){
						$.each(dctLink,function(k,v){
							if(refFieldName == k){
								var dctId = v;
								editCell.after("<i class='commonGridSearch' onclick='$(\"#"+grid_id+"\").hlicStoGrid(\"chooseRow\",{realRowId:"+rowid+", gridRowId:"+iRow+", gridColId:"+iCol+", refDctName:\""+dctId+"\", refFieldName:\""+ refFieldName +"\"})'>");
							}
						});
					}else{
						editCell.after("<i class='commonGridSearch' onclick='$(\"#"+grid_id+"\").hlicStoGrid(\"chooseRow\",{realRowId:"+rowid+", gridRowId:"+iRow+", gridColId:"+iCol+", refDctName:\""+refDctName+"\", refFieldName:\""+ refFieldName +"\"})'>");	
					}
				}
				//$(dom).trigger("beforeSaveCell",{editCell:editCell,para:para});
				//$(dom).trigger("aftereditcell",{editCell:editCell,para:para});
            };
            this._formatterFn = function(colModel){
            	/*$.each(colModel, function(k,v){
            		if(v.formatter != undefined){
            			switch(v.formatter)
            			{
            				case "checkbox":
            					colModel[k].formatter = function(v,x,r){ 
                            		return v==1 ? "<input type='checkbox' checked/>" : "<input type='checkbox'/>"; 
                            	}
            					break;
            				default : console.log("formatter配置的参数不存在！");
            			}
            			console.log(v.formatter);
            		}
            	});*/
            	//var colOneModel = colModel
            };
            this.chooseRow = function(options){
            	var realRowId = options.realRowId,
				    gridRowId = options.gridRowId,
				    gridColId = options.gridColId,
				    refDctName = options.refDctName,
				    refFieldName = options.refFieldName,
				    refFieldFBH = refFieldName.substring(refFieldName.length-4,0)+"_FBH",
            	    cellFmcId = realRowId+"_"+refFieldName,
            	    cellFbhId = realRowId+"_"+refFieldFBH;
            	//重置编辑状态
            	$(this).restoreCell(gridRowId, gridColId);
            	var grid_id = $(this).attr("id");
            	var sendData = {"dctId":refDctName};
            	//取消老的弹出框 替换为新的  
            	$("#search"+grid_id+refFieldName+refDctName).find("#commonUser").hlicComSelect({
                    "width"    : "720px",//弹出框的宽度
                    "height"   : "480px",//弹出框的高度   
                    "title":"设置条件",
                    "loadtext":"正在加载中...",
                    "url"      : sys_ctx+"/project/filter/comDctHelp.jsp",
                    "dydata"   : sendData,
                    "onlyfirst"  : true,
                    "parenturl"  : window.location.href,
                    "callback" : function(data){
                    	doCheck(data);
                    }
                });
                function doCheck(data) {
                    var newData = {},
                        updateData = {};
                    newData[refFieldFBH]  = data.F_ID;
                    newData[refFieldName] = data.F_MC;
                    $("#" + cellFmcId).find('input').val(data.F_ID);
                    $("#" + cellFbhId).find('input').val(data.F_MC);
                    updateData.rowid = realRowId;
                    updateData.cellFmc = refFieldName;
                    updateData.cellFbh = refFieldFBH;
                    updateData.cellFmcVal = data.F_MC;
                    updateData.cellFbhVal = data.F_ID;
                    updateData.iRow = gridRowId;
                    updateData.iCol = gridColId;
                    $("#" + grid_id).hlicStoGrid("synStoData",updateData)
                    $("#" + grid_id).jqGrid("setRowData", realRowId, newData);
                } 
            };
            //新增一行数据
            this.addNewRow = function(param){
                var id = $(this).jqGrid('getDataIDs');
            	var rowId = 0,
            		column = 0;
                if(id.length > 0){
                	rowId = parseInt(id[id.length-1]);
                }
                if(stoClient.dofStores.length > 0){
                	var storeParam = stoClient.dofStores[0];
                	if(storeParam.stoKeyCrtr == "UUID"){
                		column = this.queryUniqueKeyValue(storeParam.stoId, "");
                	}else if(storeParam.stoKeyCrtr != ""){
                		if(id.length > 0){
                			var rowData = $(this).jqGrid('getRowData',rowId);
                			var fId = rowData[storeParam.stoKeyField];
                			fId = parseInt(fId.substr(-6))+1;
                			column = fId;
                		}
                	}
                }
                param[storeParam.stoKeyField] = column;
            	var oneRow = {};
            	$(this).jqGrid("addRowData",rowId+1,param);
            	oneRow[rowId+1] = param;
            	//给新增数组赋值
            	newData.push(oneRow);
            };
            this.queryUniqueKeyValue = function(tId, parentId){
            	var column = "";
            	var saveData = {
            		"tId":tId,
            		"parentId":parentId
            	};
            	$.ajax({
                    "url":sys_ctx+"/base/queryUniqueKeyValue.action", 
                    "type":'post', 
                    "dataType":'json', 
                    "contentType":"application/json",
                    "data":JSON.stringify(saveData), 
                    "async":false,
                    "success" : function(data){ 
                    	if(data.type == 1){
                    		column = data.message;
                    	}
                    } 
                });
            	return column;
            };
            //删除行
            this.deleteRow = function(){
            	var rowid = $(this).jqGrid("getGridParam","selrow");
            	var rowData = $(this).jqGrid("getRowData",rowid);
            	var storeParam = stoClient.dofStores[0];
            	var obj={};
            	if(rowData[storeParam.stoKeyField] != ""){
            		obj[storeParam.stoKeyField] = rowData[storeParam.stoKeyField];
                	delData.push(obj);
            	}
            	$(this).find("tr[id='"+rowid+"']").attr("style","display:none");
            	$(this).setGridParam({cellEdit:true});
            };
            
            this.removeEditState = function(){
            	try{
            		$(this).jqGrid("saveCell",lastrow,lastcell);//防止编辑取出html格式的值
            	}catch(e){}
            };
            //获取变更数据
            this.getSaveData = function(){
            	this.removeEditState();
            	var gridSelf = this;
            	var saveData = {},
            		editSave = [],
            		newSave = [],
            		delSave = [];
            	//编辑数据
            	for(var i=0; i< editData.length; i++){
            		$.each(editData[i],function(k,v){
            			var filterObj = gridSelf.formatSaveData(v);
            			editSave.push(filterObj);
            		});
            	}
            	//新增数据
            	for(var i=0; i< newData.length; i++){
            		$.each(newData[i],function(k,v){
            			var filterObj = gridSelf.formatSaveData(v);
            			newSave.push(filterObj);
            		});
            	}
            	//删除数据
            	/*for(var i=0; i< delData.length; i++){
            		$.each(delData[i],function(k,v){
            			var filterObj = gridSelf.formatSaveData(v);
            			delSave.push(filterObj);
            		});
            	}*/
            	delSave = delData;
            	if(editSave.length > 0){
            		saveData["editSave"] = editSave;
            	}
            	if(newSave.length > 0){
            		saveData["newSave"] = newSave;
            	}
            	if(delSave.length > 0){
            		saveData["delSave"] = delSave;
            	}
            	return saveData;
            };
            var eventDom = this;
            this.event = {
        		DSEVENT_ROW_CLICK:function(rowid){
        			$(eventDom).trigger("DSEVENT_ROW_CLICK", {"rowid":rowid});
        		},
            };
            this.setSqlFilter = function(param){
            	opts.SQL_Filter = param;
            };
            this.setSqlWhere = function(param){
            	opts.SQL_Where = param;
            };
            this.setDctId = function(param){
            	opts.STO_ID = param;
            }
            this.reloadGridData = function(){
            	$(this).jqGrid('setGridParam',{
    	        	postData:{"STO_ID":opts.STO_ID,"SQL_Filter":opts.SQL_Filter != "" ? JSON.stringify(opts.SQL_Filter) : "","SQL_Where":opts.SQL_Where}
    	    	}).trigger('reloadGrid'); 
            };
            this.saveData = function(path) {
            	this.removeEditState();
            	var gridSelf = this;
            	var storeParam = stoClient.dofStores[0];
            	var saveData = {"stoId":storeParam.stoId,"fId":storeParam.stoKeyField},
            		editSave = [],
            		newSave = [],
            		delSave = [];
            	//编辑数据
            	for(var i=0; i< editData.length; i++){
            		$.each(editData[i],function(k,v){
            			var filterObj = gridSelf.formatSaveData(v);
            			editSave.push(filterObj);
            		});
            	}
            	//新增数据
            	for(var i=0; i< newData.length; i++){
            		$.each(newData[i],function(k,v){
            			var filterObj = gridSelf.formatSaveData(v);
            			newSave.push(filterObj);
            		});
            	}
            	//删除数据
            	/*for(var i=0; i< delData.length; i++){
            		$.each(delData[i],function(k,v){
            			var filterObj = gridSelf.formatSaveData(v);
            			delSave.push(filterObj);
            		});
            	}*/
            	delSave = delData;
            	if(editSave.length > 0){
            		saveData["editSave"] = editSave;
            	}
            	if(newSave.length > 0){
            		saveData["newSave"] = newSave;
            	}
            	if(delSave.length > 0){
            		saveData["delSave"] = delSave;
            	}
            	console.log("------------存储表保存时发送到后台的数据start--------------");
            	console.log(saveData);
            	console.log("------------存储表保存时发送到后台的数据end--------------");
            	if(!$.isEmptyObject(saveData)){
            		$.ajax({ 
                        url:path, 
                        type:'post', 
                        dataType:'json', 
                        contentType:"application/json",
                        data:JSON.stringify(saveData), 
                        success : function(data){ 
                        	if(data.type == 1){
                        		editData = [];
                            	newData = [];
                            	delData = [];
                                tipAlert("提示","成功！","确定");
                        	}
                        } 
                    });
            	}
            };
            //格式化保存数据
            this.formatSaveData = function(formatData){
            	var obj = {};
            	$.each(formatData,function(k,v){
            		//获取列编号后缀
            		var cellSuffix = k.substring(k.length-4);
            		if(cellSuffix == "_FBH"){
            			var cellField = k.substring(k.length-4,0);
            			obj[cellField] = v;
            		}else if(cellSuffix == "_FMC"){
            			
            		}else if(cellSuffix == "_FCB"){//复选框
            			var cellField = k.substring(k.length-4,0);
            			if(v == "Yes"){
            				obj[cellField] = 1;
            			}else{
            				obj[cellField] = 0;
            			}
            		}else{
            			obj[k] = v;
            		}
            	});
            	return obj;
            };
            //外部设置字典帮助框
            this.setDctLink = function(dctLinkData){
            	//dctLink = {"F_Name":"SSF_USERS"}
            	dctLink = dctLinkData;
            };
            this.hlicStoGrid_loadComplete = function(){
		        $(this).trigger("hlicStoGrid_loadCompleteTrigger", {});
			};
            this._create();
        });    
	};
})(jQuery);
function gettypes(){
	/*var types = "";
	$.ajax({ 
        url:"${ctx}/", 
        type:'post', 
        async:false,
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData)
	}).done(function(data){
		
	});*/
	return "1:下拉框;2:下";
};   