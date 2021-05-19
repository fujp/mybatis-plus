package com.example.demo.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fujp
 * @since 2021-04-19
 */
@Mapper
public interface DeptMapper extends BaseMapper<Dept> {

    List<Dept> getList();
}
