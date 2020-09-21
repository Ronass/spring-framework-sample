package org.matrix.spring.aop;

import org.junit.jupiter.api.Test;
import org.matrix.spring.aop.operation.UserContentHolder;
import org.matrix.spring.aop.operation.UserDao;
import org.matrix.spring.aop.operation.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAopApplicationTests {

    @Autowired
    private UserService userService;
    @Autowired
    @Qualifier("cacheDaoImpl")
    private UserDao cacheDaoImpl;

    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    @Test
    void contextLoads() {
        UserContentHolder.setCache("和珅");
        UserContentHolder.setCache("纪晓岚");
        UserContentHolder.whois();
        userService.add(1);
        // userDao.delete(1);
        // cacheDaoImpl.delete(1);
    }

}
