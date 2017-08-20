package com.ailin.dao;

import com.ailin.model.Manager;
import com.ailin.model.Shop;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by 达达 on 2017/8/6.
 */
@MapperScan
public interface ManagerDao {

    Manager login(Manager manager);

    List<Shop> selectByPrimaryKeyWithShop(Integer managerId);

}
