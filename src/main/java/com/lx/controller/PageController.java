package com.lx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <B>系统名称: </B><BR>
 * <B>模块名称: </B><BR>
 * <B>概要说明: </B><BR>
 *
 * @author MR.Administrator
 * @since 2018年05月10日
 */
@Controller
public class PageController {

    @RequestMapping(value = "index")
    public String showIndex(){
        return "index";
    }

    @RequestMapping(value = "page-login")
    public String showPageLogin(){
        return "page-login";
    }

}
