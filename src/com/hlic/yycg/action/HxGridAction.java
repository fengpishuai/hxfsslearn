package com.hlic.yycg.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hxGrid")
public class HxGridAction {

	// 初审派单
    @RequestMapping("/cspd")
    public String cspd(Model model) throws Exception {

        return "/project/docdelivery/cspd";
    }
}
