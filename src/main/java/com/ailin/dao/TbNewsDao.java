package com.ailin.dao;

import com.ailin.model.TbNews;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface TbNewsDao {
    List<TbNews> selectAllNews();
}
