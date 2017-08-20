package com.ailin.service;


import com.ailin.dao.TbShopDao;
import com.ailin.model.TbShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbShopServiceImpl implements TbShopService {
    @Autowired
    private TbShopDao shopDao;
    public List<TbShop> selectManager() {
        return shopDao.selectWithManager();
    }
}
