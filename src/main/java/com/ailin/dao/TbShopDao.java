package com.ailin.dao;


import com.ailin.model.TbShop;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@MapperScan
public interface TbShopDao {
    List<TbShop> selectWithManager();
}
