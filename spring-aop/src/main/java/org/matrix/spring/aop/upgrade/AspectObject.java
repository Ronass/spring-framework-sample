package org.matrix.spring.aop.upgrade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.matrix.spring.aop.operation.AccessHock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 匹配对象
 * @author matrix
 * @datetime 2020/9/21 22:35
 */
@Aspect
@Component
public class AspectObject {

    @Autowired
    private AccessHock accessHock;

    //匹配AOP对象的目标对象为指定类型的方法,即UserDaoImpl的aop代理对象的方法
    @Pointcut("this(org.matrix.spring.aop.operation.UserDaoImpl)")
    public void match1() {
    }

    //匹配实现UserDao接口的目标对象(而不是aop代理后的对象)的方法,这里即UserDaoImpl的方法
    @Pointcut("target(org.matrix.spring.aop.operation.UserDao)")
    public void match2() {
    }

    //匹配所有以Service结尾的bean里的方法
    @Pointcut("bean(*Service))")
    public void match3() {
    }

    @Before("match1()")
    public void beforeExe() {
        System.err.println("顺天府尹介入开始检查！");
        accessHock.access();
    }
}
