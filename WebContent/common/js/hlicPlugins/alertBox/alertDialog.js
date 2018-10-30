$.fn.drag = function(opt) {
	opt = opt ? opt : this;
	$(this).each(function() {
		this.onselectstart = function() {
			return false;
		};
		if ($.browser.mozilla)
			this.addEventListener('DOMMouseScroll', function(e) {
				e.preventDefault();
			}, false);
		else
			this.onmousewheel = function() {
				return false;
			};
		var $drag = $(opt);
		var w = $(window).width() - $drag.width() - 4;
		var c = $drag.offset().top - $(window).scrollTop();
		var scroll = function() {
			$drag.stop(true, false).animate({
				top : c + $(window).scrollTop()
			});
		};
		$(this).css('cursor', 'move').mousedown(function(e) {
			var st = $(window).scrollTop();
			var t = st + 4;
			var u = st + $(window).height() - $drag.height() - 4;
			var x = e.pageX - $drag.fadeTo('fast', 0.1).offset().left;
			var y = e.pageY - $drag.offset().top - st;
			$(document).mousemove(function(e) {
				var cx = e.clientX - x;
				var cy = e.clientY - y;
				c = $drag.css({
					left : cx < 4 ? 4 : (cx > w ? w : cx),
					top : cy > u ? u : (cy < t ? t : cy)
				}).offset().top - $(window).scrollTop();
			}).mouseup(function() {
				$drag.fadeTo('fast', 1);
				$(this).unbind('mousemove').unbind('mouseup');
			});
			return false;
		});
		$(window).bind('scroll', scroll);
	});
	return $(this);
};
var amrt = false;
function alertM(content, opt) {
	opt = $.extend({
		time : 4000,
		type :'warn',
		title : 'alert',
		width : 400,
		height : 'auto',
		btnC : true,
		btnY : true,
		btnYT : '确 认',
		btnN : true,
		btnNT : '放 弃',
		cF : function() {
		},
		yF : function() {
		},
		nF : function() {
		},
		rF : function() {
		}
	}, opt || {});
	var w = {
		height : $(document).height(),
		left : $(window).width() / 2 - opt.width / 2,
		top : $(window).height() / 2 + $(window).scrollTop()
	};
	opt.h = function() {
		//原样式$('<div id="hbg" style="height:' + w.height + 'px;"></div>').
		//bug表现：当浏览器使用一个较小窗口打开一个弹出框会话，再将浏览器最大化时，这个遮罩层无法覆盖全屏！！！
		//修改方式：将内嵌的height样式去掉
		$('<div id="hbg" ></div>').appendTo('body').fadeTo('fast', 0.1);
		return opt;
	};
	opt.s = function() {
		var str = [ '<div id="alertM" style="left:', w.left, 'px;height:',
				opt.height, 'px;width:', opt.width,
				'px;overflow:hidden"><h5 id="alertT" class=',(opt.type==="warn")?'warnT':'errorT' ,'>', opt.title, '</h5>' ];
		if (opt.btnC)
			str
					.push('<a id="alertR" title="关 闭" href="javascript:void(0)">&times;</a>');
		str.push('<div id="alertP" class=',(opt.type==="warn")?'warnP':'errorP' ,'>', content, '</div>');
		if (opt.btnY || opt.btnN) {
			str.push('<div id="alertBtns">');
			if (opt.btnY)
				str.push('<a id="alertY" href="javascript:void(0)">',
						opt.btnYT, '</a>');
			if (opt.btnN)
				str.push('<a id="alertN" href="javascript:void(0)">',
						opt.btnNT, '</a>');
			str.push('</div>');
		}
		str.push('</div>');
		w.top = w.top - $(str.join('')).appendTo('body').height() / 2 - 99;
		$('#alertM').css('top', w.top);
		return opt;
	};
	opt.a = function() {
		$('#alertM').animate({
			top : w.top + 50,
			opacity : 'show'
		}, opt.b);
		
		$('#alertM').resizable({
			handles:"e"
		});
	};
	opt.b = function() {
		$('#alertM').show().css('top', w.top + 50);
		$('#alertT').drag('#alertM');
		$('#alertR').click(function() {
			if (opt.cF() != false)
				opt.r();
			$(this).trigger("alertRclick");
		});
		$('#alertY').click(function() {
			if (opt.yF() != false)
				opt.r();
			$(this).trigger("alertYclick");
		});
		$('#alertN').click(function() {
			if (opt.nF() != false)
				opt.r();
			$(this).trigger("alertNclick");
		});
	};
	if ($('#alertM').length > 0) {
		$('#alertM').remove();
		opt.s().b();
	} else
		opt.h().s().a();
	if (amrt)
		;
	clearTimeout(amrt);
	amrt = false;
	opt.r = function() {
		$('#alertM').animate({
			top : w.top + 100,
			opacity : 'hide'
		}, function() {
			$('#hbg').fadeOut(function() {
				$(this).remove();
				opt.rF();
			});
			$(this).remove();
		});
		if (amrt)
			;
		clearTimeout(amrt);
		amrt = false;
		return opt;
	};
	if (!isNaN(opt.time)) {
		amrt = setTimeout(function() {
			opt.r();
		}, opt.time);
	}
}

function tipAlert(title,text,btntext,type,callback){
	alertM(text,{
		time:'y',
		type:type?type:'warn',
		btnYT:btntext,
		btnN:false,
		title : title,
		cF:function(){
			if($.isFunction(callback)){
				callback("c");
			}
		},
		yF:function(){
			if($.isFunction(callback)){
				callback("y");
			}
		},
		nF:function(){
			if($.isFunction(callback)){
				callback("n");
			}
		},
		rF:function(){
			if($.isFunction(callback)){
				callback("r");
			}
		}
	});
}
function tipAlertError(title,text,btntext){
	tipAlert(title,text,btntext,"error");
	//控制警告框按钮边框样式
	$("#alertBtns a").css("border","1px #FE0000 solid");
}

function tipInfo(title,text,time,type){
	alertM(text,{
		time:time,
		type:type?type:'warn',
		btnN:false,
		btnY:false,
		title : title
	});
}
function tipInfoError(title,text,time){
	tipInfo(title,text,time,"error");
}

function tipConfirm(title,text,oktext,canceltext,callback,type){
	function clickTrue(){
		callback.call(this,true);
	}
	function clickFalse(){
		callback.call(this,false);
	}
	alertM(text,{
		time: 'y',
		type:type?type:'warn',
		btnN:true,
		btnY:true,
		btnYT:oktext,
		btnNT:canceltext,
		yF:function(){
			if($.isFunction(callback)){
				var dom = this;
				setTimeout(function(){
					callback.call(dom,true);
				},0);
			}
		},
		nF:function(){
			if($.isFunction(callback)){
				var dom = this;
				setTimeout(function(){
					callback.call(dom,false);
				},0);
			}
		},
		title : title
	});
}