package com.lx.admin.controller;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class LoginController {

    //登录提交地址,和application-shiro.xml里的loginUrl一致
    @RequestMapping(value = "login")
    public String login(HttpServletRequest request)throws Exception{

        //如果登录失败从request中获取认证异常信息,shiroLoginFailure就是shiro异常类的全限定名
        String exceptionClassName = (String)request.getAttribute("shiroLoginFailure");

        //根据shiro返回的异常的信息，抛出自己指定的异常信息
        if (exceptionClassName != null){
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                //最终会抛给异常处理器
                throw new  Exception("账号不存在!");
            }else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)){
                throw new Exception("用户名密码错误!");
            }else{
                throw new Exception();
            }
        }

        //此方法不处理登录成功，shiro认证成功会自动跳转到上一个路径

        //登录失败返回到 login 页面
        return "page-login";

    }

}
