package com.sml.mybatisdemo.dao;

import com.sml.mybatisdemo.domin.Manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ManagerDao {
    List<Manager> getAllManager();
    void insert(Manager manager);

}