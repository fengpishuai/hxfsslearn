$(document).ready(function(){
	init();
});
function init(){
	WDDJ.initWddj();
	WDDB.initWddb();
	WDYB.initWdyb();
}
var comWelcome = {
		
};
var WDDJ = {
		initWddj:function(){
			WDDJ.bindEvent();
		},
		bindEvent:function(){
			$("#wddjspan").on("click",function(){
				$(".comnav").removeClass("active");
				$(this).addClass("active");
				var userId=1;
			    $.ajax({ 
			        url:sys_ctx+"/workFlow/queryWDDBList.action", 
			        type:'post', 
			        dataType:'json', 
			        success : function(data){ 
			            if(data.length>0){
			            	$.each(data,function(k,v){
			            		var li = '<li class="item">'
		                            +'<div class="check_box"></div>'
		                            +'<div class="item_xh ">'+(k+1)+'</div>'
		                            +'<div class="item_content">'
		                            +'<div class="item_djlx"><span>'+v.fDjbh+'</span>/'+v.djmc+'</div>'
		                            +'<div class="item_djzt"><span class="nameSapn">状态：</span></div>'
		                            +'<div class="item_djje"><span class="nameSapn">金额：</span><span class="nameSapn">--</span></div>'
		                            +'<div class="item_tbrq"><span class="nameSapn">日期：</span>'+v.fZdsj+'</div>'
		                            +'<div class="item_tbr"><span class="nameSapn">填报人：</span>'+v.fZdr+'</div>'
		                            +'</div>'
		                            +'</li>';
		                        $("#wddj-ul-list").append(li);
			            	});
			            }
			        } 
			    });
			});
		}
};
var WDDB = {
		initWddb:function(){
			WDDB.bindEvent();
		},
		bindEvent:function(){
			$("#wddbspan").on("click",function(){
				$(".comnav").removeClass("active");
				$(this).addClass("active");
				var userId=1;
			    $.ajax({ 
			        url:sys_ctx+"/workFlow/queryWDDBList.action", 
			        type:'post', 
			        dataType:'json', 
			        success : function(data){ 
			            if(data.length>0){
			            	
			            }
			        } 
			    });
			});
		}
};
var WDYB = {
		initWdyb:function(){
			WDYB.bindEvent();
		},
		bindEvent:function(){
			$("#wdybspan").on("click",function(){
				$(".comnav").removeClass("active");
				$(this).addClass("active");
				var userId=1;
			    $.ajax({ 
			        url:sys_ctx+"/workFlow/queryWDDBList.action", 
			        type:'post', 
			        dataType:'json', 
			        success : function(data){ 
			            if(data.length>0){
			            	
			            }
			        } 
			    });
			});
		}
};
function createGrid(){
	
}