package com.ailin.service;

import com.ailin.dao.ManagerDao;
import com.ailin.model.Manager;
import com.ailin.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by 达达 on 2017/8/8.
 */
@Service("managerServiceImpl")
public  class ManagerServiceImpl implements ManagerService{
@Autowired
    private ManagerDao managerDao;
    public Manager managerlogin(Manager manager) {

        return managerDao.login(manager);
    }

    public List<Shop> shopSelect(Integer managerId) {

        return managerDao.selectByPrimaryKeyWithShop(managerId);
    }


}
