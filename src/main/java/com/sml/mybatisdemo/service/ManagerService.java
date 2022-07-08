package com.sml.mybatisdemo.service;

import com.sml.mybatisdemo.domin.Manager;

import java.util.List;

public interface ManagerService {
    List<Manager> getAllManager();
    void insert(Manager manager);
}