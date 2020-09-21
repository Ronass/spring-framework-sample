package org.matrix.spring.aop.upgrade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.matrix.spring.aop.operation.AccessHock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 匹配包/类型
 * @author matrix
 * @datetime 2020/9/21 22:35
 */
@Aspect
@Component
public class AspectWithin {

    @Autowired
    private AccessHock accessHock;

    //匹配UserService类里的所有方法
    @Pointcut("within(org.matrix.spring.aop.operation.UserService)")
    public void match1() {
    }

    //匹配org.matrix.spring包及其子包下所有类的方法
    @Pointcut("within(org.matrix.spring..*)")
    public void match2() {
    }

    @Before("match1()")
    public void beforeExe() {
        System.err.println("内务府介入开始检查！");
        accessHock.access();
    }
}
