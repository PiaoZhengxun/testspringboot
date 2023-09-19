package com.neu.testspringboot.dao;

import com.neu.testspringboot.dao.baseDao.BaseDao;
import com.neu.testspringboot.dto.UserLogin;
import com.neu.testspringboot.dto.UserStatus;
import com.neu.testspringboot.entity.UserInfo;
import com.neu.testspringboot.service.baseService.BaseService;
import com.neu.testspringboot.tempDBResult.CountResult;

import java.util.HashSet;
import java.util.Iterator;

public interface HelloDao extends BaseDao {

    public UserInfo verifyUserInfoWay1(UserLogin userLogin);

    public UserStatus verifyUserInfoWay2(UserLogin userLogin);

    public int verifyUserInfoWay3(UserLogin userLogin);

}
