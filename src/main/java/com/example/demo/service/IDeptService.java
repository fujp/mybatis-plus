package com.example.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Dept;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fujp
 * @since 2021-04-19
 */
public interface IDeptService extends IService<Dept> {

    List<Dept> getList();

    String updateDept();

}
