package com.ailin.service;

import com.ailin.model.Manager;
import com.ailin.model.Shop;

import java.util.List;

/**
 * Created by 达达 on 2017/8/8.
 */
public interface ManagerService {

    Manager managerlogin(Manager manager);

    List<Shop> shopSelect(Integer managerId);

}
