package com.hlic.gools.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("gools")
public class GoolsBaseManageAction {
	/*
	 * 商品池
	 */
	@RequestMapping("/goolsPools")
    public String goolsPools(Model model){
        return "/project/pay/base/gools_pools";
    }
}
