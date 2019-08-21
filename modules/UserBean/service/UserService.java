package com.renyong.springboot003.modules.UserBean.service;

import com.renyong.springboot003.modules.UserBean.dao.UserBeanDao;
import com.renyong.springboot003.modules.UserBean.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther 任勇勇
 * @Date: 2019/08/21 16:33
 * @Description:
 */
@Service
public class UserService {
    @Autowired
    private UserBeanDao dao;
    public List<UserBean> finAll(){
        return dao.findAll();
    }
}
