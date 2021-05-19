package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.DeptMapper;
import com.example.demo.entity.Dept;
import com.example.demo.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fujp
 * @since 2021-04-19
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getList() {
        QueryWrapper<Dept> queryWrapper = new QueryWrapper<>();
        return deptMapper.selectList(queryWrapper);
//        return deptMapper.selectList(null);
//        return deptMapper.getList();
    }

    @Override
    public String updateDept() {
        Dept dept = new Dept();
        dept.setCreatime(LocalDateTime.now());
        UpdateWrapper<Dept> deptUpdateWrapper = new UpdateWrapper<>();
        deptUpdateWrapper.eq("deptno",1);
        return String.valueOf(deptMapper.update(dept,deptUpdateWrapper));
    }
}
