package com.neu.testspringboot.dao;

import com.neu.testspringboot.dto.UserLogin;
import com.neu.testspringboot.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@Repository
public class UserInfoDAO {

    public List<UserInfo> findAll() { //first way, the simple one, to get the all eneity into the table

        HashSet<UserInfo> resultSet = new HashSet<>();

        UserInfo userInfo1 = new UserInfo();

        userInfo1.setUserId(1);
        userInfo1.setUserName("junghoon");
        userInfo1.setPassword("1218");
        userInfo1.setEmail("junghoon@naver.com");
        userInfo1.setAge(27);
        userInfo1.setAddress("Shenyang");
        resultSet.add(userInfo1);

        UserInfo userInfo2 = new UserInfo();

        userInfo2.setUserId(2);
        userInfo2.setUserName("junghoon1");
        userInfo2.setPassword("12181");
        userInfo2.setEmail("junghoon1@naver.com");
        userInfo2.setAge(28);
        userInfo2.setAddress("Shenyang1");
        resultSet.add(userInfo2);

        List<UserInfo> list = new ArrayList<>();

        Iterator<UserInfo> iterator = resultSet.iterator();
        while (iterator.hasNext()){
            UserInfo userInfo = iterator.next();
            list.add(userInfo);
        }

        return list;

    }
}
