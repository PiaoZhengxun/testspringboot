package com.neu.testspringboot;

import com.neu.testspringboot.dao.HelloDao;
import com.neu.testspringboot.utils.SpringContextUtil;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestspringbootApplicationTests {

//    @Autowired
//    @Qualifier(value="helloDaoBean")
    @Resource(name = "helloDaoBean")
    HelloDao helloDao1;

//    @Autowired
//    @Qualifier(value="helloDaoBean")
    @Resource(name = "helloDaoBean")
    HelloDao helloDao2;


    @Test
    void test1() {

        HelloDao helloDao1 = (HelloDao) SpringContextUtil.getBean(HelloDao.class);
        HelloDao helloDao2 = (HelloDao) SpringContextUtil.getBean(HelloDao.class);
        System.out.println(helloDao1.ObjectName);
        System.out.println(helloDao2.ObjectName);
        System.out.println(helloDao1);
        System.out.println(helloDao2);
    }

    @Test
    void contextLoads() {

        System.out.println("helloDao1 : " + helloDao1);
        System.out.println("helloDao2 : " + helloDao2);

//        HelloDao helloDao3 = HelloDao.getHelloDaoInstance();
//        HelloDao helloDao4 = HelloDao.getHelloDaoInstance();
//
//        System.out.println("helloDao3 : " + helloDao3);
//        System.out.println("helloDao4 : " + helloDao4);

        HelloDao helloDao3 = new HelloDao();
        HelloDao helloDao4 = new HelloDao();

        System.out.println("helloDao3 : " + helloDao3);
        System.out.println("helloDao4 : " + helloDao4);

        HelloDao helloDao5 = HelloDao.getHelloDaoInstance();
        HelloDao helloDao6 = HelloDao.getHelloDaoInstance();

        System.out.println("helloDao5 : " + helloDao5);
        System.out.println("helloDao6 : " + helloDao6);




    }

}
