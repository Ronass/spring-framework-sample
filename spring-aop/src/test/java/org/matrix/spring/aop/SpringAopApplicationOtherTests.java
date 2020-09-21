package org.matrix.spring.aop;

import org.junit.jupiter.api.Test;
import org.matrix.spring.aop.higher.CaService;
import org.matrix.spring.aop.higher.sub.SubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAopApplicationOtherTests {

    @Autowired
    private CaService caService;
    @Autowired
    private SubService subService;


    @Test
    void contextLoads() {
        // System.err.println(caService.name("李笑来"));
        // System.err.println(caService.name("李笑来",1));
        // System.err.println(subService.name("乾隆"));
        // System.err.println(subService.name("康熙",1));
        // caService.hiker("雍正",1);
        caService.exception(1);
        // userDao.delete(1);
        // cacheDaoImpl.delete(1);
    }

}
