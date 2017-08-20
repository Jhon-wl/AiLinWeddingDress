package com.ailin.dao;


import com.ailin.model.TbHomeRotation;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@MapperScan
public interface TbHomeRotationDao {
    List<TbHomeRotation> selectAll();
}
