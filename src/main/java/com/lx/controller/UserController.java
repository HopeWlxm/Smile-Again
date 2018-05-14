package com.lx.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lx.common.DataTable;
import com.lx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user-list")
    public String showUserList() {
        return "/user/user-list";
    }

    @RequestMapping(value = "/select", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=utf-8")
    @ResponseBody
    public String getUserList(@RequestParam("start")Integer start,
                                 @RequestParam("length")Integer length,
                                 @RequestParam("draw")Integer draw){
        DataTable result = userService.queryUserList((start/length)+1,length,draw);


        return JSON.toJSONString(result, SerializerFeature.WriteMapNullValue);
    }

}
