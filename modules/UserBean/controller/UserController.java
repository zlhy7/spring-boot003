package com.renyong.springboot003.modules.UserBean.controller;

import com.renyong.springboot003.modules.UserBean.model.UserBean;
import com.renyong.springboot003.modules.UserBean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther 任勇勇
 * @Date: 2019/08/21 16:34
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ApplicationContext ioc;
    @RequestMapping("/hello")
    public String hello(){
        boolean b = ioc.containsBean("userBeanDao");
        List<UserBean> list = userService.finAll();
        return "hello world";
    }
}
