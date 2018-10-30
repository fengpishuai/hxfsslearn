function chooseProduct(grid_id, rowid, cellId, cellname) {
	$(window.top.document).find("#commonUser").hlicComSelect({
        "width"    : "600px",//弹出框的宽度
        "height"   : "360px",//弹出框的高度   
        "title":"设置条件",
        "loadtext":"正在加载中...",
        "url"      : sys_ctx+"/project/filter/commonGrid.jsp",
        "onlyfirst"  : false,
        "parenturl"  : window.location.href,
        "callback" : function(data){
        	doCheck(data);
        }
    });
    function doCheck(data) {
        var newData = {};
        newData[cellname] = data.F_HSZT_MC;
        $("#" + cellId).find('input').val(data.usrName);
        $("#" + grid_id).jqGrid("setRowData", rowid, newData);
    } 
}
/**
 * 下拉框
 * @param colShowMask
 * @param colEnum
 * @param colEnumKey
 * @returns {String}
 */
function getSelectTypes(colShowMask, colEnum, colEnumKey){
	var valType = "";
	var reg=/;$/gi; //正则表达式去除字符串后面的分号
	if(colEnum == 1){
		var saveData ={
			"parentId":colEnumKey
		};
		$.ajax({ 
	        url:sys_ctx+"/queryBase/queryDctEnumList.action", 
	        type:'post', 
	        async:false,
	        dataType:'json', 
	        contentType:"application/json",
	        data:JSON.stringify(saveData)
		}).done(function(data){
			if(data.length > 0){
				for(var i=0; i<data.length; i++){
					valType += data[i].fT1+":"+data[i].fMc+";";
				}
			}
		});
	}else if(colShowMask != "" && colShowMask != undefined && colShowMask != null){
		valType = colShowMask;
	}
	return valType.replace(reg,"");
}
var hlicGridPlus = {
	/**
	 * 查询后台数据
	 * @param url 连接地址
	 * @param sendData 入参
	 */
	queryTableRows : function(url, sendData){
		var rows = [];
		$.ajax({
	        url:sys_ctx+"/"+url,
	        type:'post',
	        dataType:'json',
	        contentType:"application/json",
	        data:JSON.stringify(sendData),
	        async:false
	    }).done(function(data){
	    	if(data.length > 0){
	    		rows = data;
	    	}else{
	    		console.log("请求失败！");
	    	}
	    });
		return rows;
	}
}
