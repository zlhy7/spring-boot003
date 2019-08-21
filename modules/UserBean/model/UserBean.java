package com.renyong.springboot003.modules.UserBean.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @auther 任勇勇
 * @Date: 2019/08/21 16:24
 * @Description:
 */
@Data
public class UserBean implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户cd
     */
    private String userCd;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 加密秘钥
     */
    private String secretKey;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 用户性别
     */
    private String userSex;

    /**
     * 用户电话
     */
    private String userPhone;

    /**
     * 用户头像
     */
    private String headPortrait;

    /**
     * 删除标记
     */
    private String delFlag;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private String lastUpdateUser;

    /**
     * 更新时间
     */
    private Date lastUpdateDate;

    /**
     * 备注
     */
    private String remarks;
}
