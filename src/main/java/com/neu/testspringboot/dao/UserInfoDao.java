package com.neu.testspringboot.dao;

import com.neu.testspringboot.dao.baseDao.BaseDao;
import com.neu.testspringboot.entity.UserInfo;

import java.util.List;

public interface UserInfoDao extends BaseDao {

    public List<UserInfo> findAll();
}
