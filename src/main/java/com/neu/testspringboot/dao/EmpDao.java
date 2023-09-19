package com.neu.testspringboot.dao;

import com.neu.testspringboot.dao.baseDao.BaseDao;
import com.neu.testspringboot.entity.Emp;

import java.util.List;

public interface EmpDao extends BaseDao {

    public List<Emp> findAll();

}
