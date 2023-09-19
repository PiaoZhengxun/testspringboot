package com.neu.testspringboot.dao.daoImpl;

import com.neu.testspringboot.dao.HelloDao;
import com.neu.testspringboot.dao.baseDao.BaseDaoImpl;
import com.neu.testspringboot.dto.UserLogin;
import com.neu.testspringboot.dto.UserStatus;
import com.neu.testspringboot.entity.UserInfo;
import com.neu.testspringboot.tempDBResult.CountResult;

import java.util.HashSet;
import java.util.Iterator;

//@Repository
//@Scope("prototype")
public class HelloDaoImpl extends BaseDaoImpl implements HelloDao {
//    private HelloDao(){}
    public String ObjectName;
    //Singleton
    private static HelloDaoImpl helloDao = null;

    public static HelloDaoImpl getHelloDaoInstance() {
        if(helloDao == null){
            helloDao = new HelloDaoImpl();
            return helloDao;
        } else {
            return helloDao;
        }
    }

    public UserInfo verifyUserInfoWay1(UserLogin userLogin) { //first way, the simple one, to get the all eneity into the table

        HashSet<UserInfo> resultSet = new HashSet<>();

        UserInfo userInfo = new UserInfo();

        if ("junghoon".equals(userLogin.getUserName()) && "1218".equals(userLogin.getPassword())){

            userInfo.setUserId(1);
            userInfo.setUserName("junghoon");
            userInfo.setPassword("1218");
            userInfo.setEmail("junghoon@naver.com");
            userInfo.setAge(27);
            userInfo.setAddress("Shenyang");
            resultSet.add(userInfo);

        }

        UserInfo userInfoResult = null;
        Iterator<UserInfo> iterator = resultSet.iterator();
        while (iterator.hasNext()){
            userInfoResult = iterator.next();
        }

        return userInfoResult;

    }

    public UserStatus verifyUserInfoWay2(UserLogin userLogin) {

        HashSet<UserInfo> resultSet = new HashSet<>();

        if ("junghoon".equals(userLogin.getUserName()) && "1218".equals(userLogin.getPassword())){

            UserInfo userInfo = new UserInfo();

            userInfo.setUserId(1);
            userInfo.setUserName("junghoon");
            resultSet.add(userInfo);

        }

        UserStatus userStatus = new UserStatus();
        Iterator<UserInfo> iterator = resultSet.iterator();
        while (iterator.hasNext()){
            UserInfo userInfo = iterator.next();
            userStatus.setUserId(userInfo.getUserId());
            userStatus.setUserName(userInfo.getUserName());
        }

        return userStatus;

    }

    public int verifyUserInfoWay3(UserLogin userLogin) {

        HashSet<CountResult> resultSet = new HashSet<>();

        CountResult countResult = new CountResult();

        if ("junghoon".equals(userLogin.getUserName()) && "1218".equals(userLogin.getPassword())){

            countResult.setCountNum(1);
            resultSet.add(countResult);

        } else {
            countResult.setCountNum(0);
            resultSet.add(countResult);

        }

        int num = 0;

        Iterator<CountResult> iterator = resultSet.iterator();
        while (iterator.hasNext()){
            CountResult countResult1 = iterator.next();
            num = countResult1.getCountNum();
        }

        return num;

    }


}
