package com.example.demo.controller;


import com.example.demo.entity.Dept;
import com.example.demo.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fujp
 * @since 2021-04-19
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private IDeptService deptService;


    @GetMapping("getList")
    public List<Dept> getList(){
        return deptService.getList();
    }

    @GetMapping("update")
    public String updateDept(){
        return deptService.updateDept();
    }

}

