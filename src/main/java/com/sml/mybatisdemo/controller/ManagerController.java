package com.sml.mybatisdemo.controller;

import com.sml.mybatisdemo.domin.Manager;
import com.sml.mybatisdemo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManagerController {
    @Autowired
    ManagerService managerService;

    @GetMapping(value = "/getAllWorker")
    public List<Manager> getAllManager(){
        return managerService.getAllManager();
    }
    @PostMapping("/add")
    public void addManager(@RequestBody Manager manager){
        managerService.insert(manager);
    }

}