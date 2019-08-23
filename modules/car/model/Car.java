package com.renyong.springboot003.modules.car.model;

import com.renyong.springboot003.base.model.BaseEntity;
import lombok.Data;

/**
 * @Auther: 任勇勇
 * @Date: 2019/5/7 14:29
 * @Description: 汽车
 */
@Data
public class Car extends BaseEntity<Car> {
    private static final long serialVersionUID = 1L;
    private String CD_NAME = "CAR_CD,setCarCd";//第一个用于自动编码，第二个用于反射解析方法
    private String carCd;//车辆编码
    private String carBrand;//品牌
    private String carModel;//型号
    private String carColor;//颜色
    private String carNumber;//车牌号
}
