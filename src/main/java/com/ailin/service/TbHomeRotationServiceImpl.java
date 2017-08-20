package com.ailin.service;

import com.ailin.dao.TbHomeRotationDao;
import com.ailin.model.TbHomeRotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbHomeRotationServiceImpl implements TbHomeRotationService {
    @Autowired
    private TbHomeRotationDao homeRotationDao;
    public List<TbHomeRotation> selectAllHomeRotation() {
        return homeRotationDao.selectAll();
    }
}
