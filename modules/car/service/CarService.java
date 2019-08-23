package com.renyong.springboot003.modules.car.service;

import com.renyong.springboot003.base.service.BaseService;
import com.renyong.springboot003.modules.car.dao.CarDao;
import com.renyong.springboot003.modules.car.model.Car;
import org.springframework.stereotype.Service;

/**
 * @Auther: 任勇勇
 * @Date: 2019/5/9 23:51
 * @Description: 汽车业务层
 */
@Service
public class CarService extends BaseService<CarDao,Car> {
}
