package com.neu.testspringboot;

import com.neu.testspringboot.dao.daoImpl.HelloDaoImpl;
import com.neu.testspringboot.utils.SpringContextUtil;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestspringbootApplicationTests {

//    @Autowired
//    @Qualifier(value="helloDaoBean")
    @Resource(name = "helloDaoBean")
HelloDaoImpl helloDao1;

//    @Autowired
//    @Qualifier(value="helloDaoBean")
    @Resource(name = "helloDaoBean")
HelloDaoImpl helloDao2;


    @Test
    void test3(){
        String fileName="pic1.png";
        String name = fileName.substring(fileName.indexOf("."));
        System.out.println(name);
    }
    @Test
    void test2() {

        Female female = new Female();
        Male male = new Male();
        female.sayHello();
        male.sayHello();
        female.sayGoodbye();
        male.sayGoodbye();


    }


    @Test
    void test1() {

        HelloDaoImpl helloDao1 = (HelloDaoImpl) SpringContextUtil.getBean(HelloDaoImpl.class);
        HelloDaoImpl helloDao2 = (HelloDaoImpl) SpringContextUtil.getBean(HelloDaoImpl.class);
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

        HelloDaoImpl helloDao3 = new HelloDaoImpl();
        HelloDaoImpl helloDao4 = new HelloDaoImpl();

        System.out.println("helloDao3 : " + helloDao3);
        System.out.println("helloDao4 : " + helloDao4);

        HelloDaoImpl helloDao5 = HelloDaoImpl.getHelloDaoInstance();
        HelloDaoImpl helloDao6 = HelloDaoImpl.getHelloDaoInstance();

        System.out.println("helloDao5 : " + helloDao5);
        System.out.println("helloDao6 : " + helloDao6);




    }

}
