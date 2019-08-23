package com.renyong.springboot003.base.model;

import com.renyong.springboot003.base.util.GenerateUtil;
import com.renyong.springboot003.modules.UserBean.model.UserBean;
import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Auther: 任勇勇
 * @Date: 2019/4/14 16:02
 * @Description: 基础的bean，其他的继承这个类
 */
@Data
public abstract class BaseEntity<T> implements Serializable{
    private static final long serialVersionUID = 1L;
    private String CD_NAME = "";
    /**
     * 主键
     */
    protected String id;
    /**
     * 备注
     */
    protected String remarks;
    /**
     * 创建人
     */
    protected UserBean createUser;
    /**
     * 创建时间
     */
//    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    protected Date createDate;
    /**
     * 更新人
     */
    protected UserBean lastUpdateUser;
    /**
     * 最后更新时间
     */
//    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    protected Date lastUpdateDate;
    /**
     * 删除标记
     */
    protected String delFlag = "0";
    /**
     * 当前页码
     */
    protected int pageNum = 1;
    public void preInsert(){
        /**
         * 保存id
         */
        this.id = GenerateUtil.uuid();
        if(!"".equals(this.getCD_NAME())){
            /**
             * 如果没传cd则自己生成
             */
            Class class1 = this.getClass();
            String cdName = this.getCD_NAME();
            String code = GenerateUtil.getAutoCd(cdName.split(",")[0]);
            try {
                Method method = class1.getDeclaredMethod(cdName.split(",")[1],String.class);
                method.invoke(this,code);
            }catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        /**
         * 当前登录用户
         */
//        this.createUser = UserUtil.getCurrentUserBean();
        /**
         * 最后更新时间
         */
        this.lastUpdateDate = new Date();
        this.createDate = this.lastUpdateDate;
        this.delFlag = "0";
    }
    public void preUpdate(){
        /**
         * 最后更新时间
         */
        this.lastUpdateDate = new Date();
        /**
         * 最后更新人
         */
//        this.lastUpdateUser = UserUtil.getCurrentUserBean();
    }
}
