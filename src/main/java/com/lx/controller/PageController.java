package com.lx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping(value = "index")
    public String showIndex(){
        return "index";
    }

    @RequestMapping(value = "/")
    public String showIndex1(){
        return "index";
    }

//    @RequestMapping(value = "page-login")
//    public String showPageLogin(){
//        return "page-login";
//    }

    @RequestMapping(value = "/admin/{page}")
    public String showPageError(@PathVariable("page")String page){
        return page;
    }

}
