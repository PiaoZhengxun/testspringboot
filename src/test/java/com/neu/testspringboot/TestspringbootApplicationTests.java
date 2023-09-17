package com.neu.testspringboot;

import com.neu.testspringboot.dao.HelloDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestspringbootApplicationTests {

    @Autowired
    HelloDao helloDao1;

    @Autowired
    HelloDao helloDao2;

    @Test
    void contextLoads() {

        System.out.println("helloDao1 : " + helloDao1);
        System.out.println("helloDao2 : " + helloDao2);

        HelloDao helloDao3 = HelloDao.getHelloDaoInstance();
        HelloDao helloDao4 = HelloDao.getHelloDaoInstance();

        System.out.println("helloDao3 : " + helloDao3);
        System.out.println("helloDao4 : " + helloDao4);




    }

}
