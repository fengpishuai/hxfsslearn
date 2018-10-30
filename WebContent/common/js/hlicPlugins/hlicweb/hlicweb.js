String.prototype.getQueryString = function(name)//name 是URL的参数名字 
{ 
	var reg = new RegExp("(^|&|\\?)"+ name +"=([^&]*)(&|$)"), r; 
	if (r=this.match(reg)) {
		return unescape(r[2]); 
	}
	return null; 
};

$.extend($,{
	int:function(f){
		return parseInt(f);
	},
	copy:function(obj){//object复制
//		return new obj.constructor(); 
		return $.parseJSON($.toJSON(obj));
	},
	cut:function(obj){//object剪切
//		var a = new obj.constructor(); 
//		obj = undefined;
//		return a;
		var a = $.parseJSON($.toJSON(obj));
		obj = undefined;
		return a;
	},
	accAdd: function (arg1,arg2){     //自定义加法
		var r1,r2,m;
		try{
			r1 = arg1.toString().split(".")[1].length;//获得arg1小数位的位数
		}catch(e){r1 = 0;};
		try{
			r2 = arg2.toString().split(".")[1].length;//获得arg2小数位的位数
		}catch(e){r2 = 0;};
		m = Math.pow(10,Math.max(r1,r2));
		return (arg1*m+arg2*m)/m;
	},
	accSub:function (arg1,arg2){//自定义减法
		var r1,r2,m,n;
	    try{
	    	r1=arg1.toString().split(".")[1].length;
	    }catch(e){
	    	r1=0;
	    }
	    try{
	    	r2=arg2.toString().split(".")[1].length;
	    }catch(e){
	    	r2=0;
	    }
	    m=Math.pow(10,Math.max(r1,r2));
	     //last modify by deeka
	     //动态控制精度长度
	    n=(r1>=r2)?r1:r2;
	    return ((arg1*m-arg2*m)/m).toFixed(n);
	} ,
	accMul:function (arg1,arg2){ //自定义乘法
		var m=0,s1=arg1.toString(),s2=arg2.toString(); 
		try{
			m+=s1.split(".")[1].length;
		}catch(e){} 
		try{
			m+=s2.split(".")[1].length;
		}catch(e){} 
		return Number(s1.replace(".",""))*Number(s2.replace(".",""))/Math.pow(10,m) ;
	},
	accDiv:function (arg1,arg2){ //自定义除法
		var t1=0,t2=0,r1,r2; 
		try{
			t1=arg1.toString().split(".")[1].length;
		}catch(e){} 
		try{
			t2=arg2.toString().split(".")[1].length;
		}catch(e){} 
		with(Math){ 
			r1=Number(arg1.toString().replace(".",""));
			r2=Number(arg2.toString().replace(".",""));
			return $.accMul(r1/r2,pow(10,t2-t1));
//			return (r1/r2)*pow(10,t2-t1); 
		} 
	},
	jHtml:function(j){//获取当前jquery对象的整体html
		return $("<div />").append(j).html();
	},
	objMerge:function(o1,o2){//将jquery对象合并
		return $(o1).add(o2);//新实现方法
//		return $("<div />").append(o1).append(o2).find(">*");
	},
	arrayToJQuery:function(arraylist){
		
		var content = $("<div />");
		for(var i=0;i<arraylist.length;i++){
			content.append(arraylist[i]);
		}
		
		return content.find(">*");
	},
	methodParam:function(){
//		return ["abcc","def"];
		var retargu = new Array();
		for(var i=0;i<arguments.length;i++){
			retargu.push(arguments[i]);
		}
		return retargu;
	},
	getMethodParam : function(str){
		var mat = str.match(new RegExp("@.+@","g"));
		if(mat!=null&&mat.length>0){
			str = str.pantrim("^@[:%#]|@$");
			var splitStr = str.split(".");
			if(splitStr.length>=2){
				return splitStr;
			}else{
				splitStr.unshift("this_id");
				return splitStr;
			}
		}else{
			return eval("$.methodParam("+str+")");
		}
	},
	/*获取object中的所有key*/
	getObjKeys:function(obj){
		var retArray = new Array();
		$.each(obj,function(k,v){
			retArray.push(k);
		});
		return retArray;
	},
	//针对obj数组里面的一个字段进行排序(asc,desc)
	orderObjectArray:function(array,bykey,type){
		var retArray = array;
		var temp ;
		for(var i=0;i<retArray.length;i++){
			for(var j=i+1;j<retArray.length;j++){
				var v1 = retArray[i][bykey];
				var v2 = retArray[j][bykey];
				if(type.toUpperCase()=="DESC"){
					if(v1<v2){
						temp = retArray[i];
						retArray[i] =  retArray[j];
						retArray[j]=temp; 
					}
				}else{
					if(v1>v2){
						temp = retArray[i];
						retArray[i] =  retArray[j];
						retArray[j]=temp; 
					}
				}
			}
		}
		return retArray;
	}
});