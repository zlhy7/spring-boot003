package com.renyong.springboot003.modules.UserBean.dao;

import com.renyong.springboot003.modules.UserBean.model.UserBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther 任勇勇
 * @Date: 2019/08/21 16:26
 * @Description:
 */
@Repository
public interface UserBeanDao {
    public List<UserBean> findAll();
}
