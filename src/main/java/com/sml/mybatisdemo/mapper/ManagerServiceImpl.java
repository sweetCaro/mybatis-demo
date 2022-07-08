package com.sml.mybatisdemo.mapper;

import com.sml.mybatisdemo.dao.ManagerDao;
import com.sml.mybatisdemo.domin.Manager;
import com.sml.mybatisdemo.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Resource
    ManagerDao managerDao;

    @Override
    public List<Manager> getAllManager() {
        return managerDao.getAllManager();
    }

    @Override
    public void insert(Manager manager) {
        managerDao.insert(manager);
    }
}