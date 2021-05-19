package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fujp
 * @since 2021-04-19
 */
public class Dept extends Model<Dept> {

    private static final long serialVersionUID = 1L;


    private Integer deptno;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private String dname;
    private String dbSource;
    private BigDecimal jine;
    private LocalDateTime creatime;


    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    public BigDecimal getJine() {
        return jine;
    }

    public void setJine(BigDecimal jine) {
        this.jine = jine;
    }

    public LocalDateTime getCreatime() {
        return creatime;
    }

    public void setCreatime(LocalDateTime creatime) {
        this.creatime = creatime;
    }

    @Override
    public String toString() {
        return "Dept{" +
        ", deptno=" + deptno +
        ", dname=" + dname +
        ", dbSource=" + dbSource +
        ", jine=" + jine +
        ", creatime=" + creatime +
        "}";
    }
}
