package com.ailin.service;

import com.ailin.dao.TbNewsDao;
import com.ailin.model.TbNews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class TbNewsServiceImpl implements TbNewsService{
    @Autowired
    private TbNewsDao newsDao;
    public List<TbNews> selectAll() {
        return newsDao.selectAllNews();
    }
}
