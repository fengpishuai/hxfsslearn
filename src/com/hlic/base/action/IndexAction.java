package com.hlic.base.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlic.base.pojo.po.SysMenus;
import com.hlic.base.pojo.po.SysUser;
import com.hlic.base.service.SysMenusService;
import com.hlic.base.service.UserService;

@Controller
@RequestMapping("/index")
public class IndexAction {

	@Autowired
	private SysMenusService sysMenusService;
	
	@Autowired
	private UserService userService; 
	 
	/*
	 * 登录功能
	 */
	@RequestMapping("/login")  
	public String Login(HttpSession httpSession, String userId, String password){  
		List<SysUser> userList = userService.selectUseridAndPassword(userId, password);
		if(userList.size() > 0){
			httpSession.setAttribute("userId",userId);
			String path = "";
			//String.valueOf(httpSession.getAttribute("URL")).isEmpty() ? httpSession.getAttribute("URL").toString() : "";
			if(String.valueOf(httpSession.getAttribute("URL")).isEmpty()){
				path = "main.action";
			}else{
				path = httpSession.getAttribute("URL").toString();
			}
			
			/*if(path == null){
				path = "main.action";
			}*/
			if(path.equals("/index/clientLogin.action")){
				return "redirect:main.action";
			}
			return "redirect:" + path;  
		}else{
			return "forward:clientLogin.action"; 
		}
	}  
	/*
	 * 退出登录
	 */
	@RequestMapping("/clientLoginOut")  
    public void LoginOut(HttpSession httpSession){ 
		httpSession.removeAttribute("userId");
    } 
	/*
	 * 登录页面
	 */
	@RequestMapping("/clientLogin")
    public String clientLogin(Model model){
        return "/common/login";
    }
	
	@RequestMapping("/main")
    public String index(Model model){
        return "/project/main";
    }
	@RequestMapping("/querySysMenusList")
    public @ResponseBody List<SysMenus> querySysMenusList() throws Exception{
		List<SysMenus> sysMenus = sysMenusService.querymenusList();
        return sysMenus;
    }
    @RequestMapping("/welcome")
    public String welcome(Model model){
        return "/project/welcome";
    }
}
