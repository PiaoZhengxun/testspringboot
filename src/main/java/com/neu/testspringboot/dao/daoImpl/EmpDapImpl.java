package com.neu.testspringboot.dao.daoImpl;

import com.neu.testspringboot.dao.EmpDao;
import com.neu.testspringboot.dao.baseDao.BaseDaoImpl;
import com.neu.testspringboot.entity.Emp;

import java.util.List;

public class EmpDapImpl extends BaseDaoImpl implements EmpDao {


    @Override
    public List<Emp> findAll() {
        return null;
    }
}
