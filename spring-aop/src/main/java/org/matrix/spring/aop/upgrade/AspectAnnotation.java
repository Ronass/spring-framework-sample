package org.matrix.spring.aop.upgrade;

import org.aspectj.lang.annotation.*;
import org.matrix.spring.aop.operation.AccessHock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 匹配注解
 * @author matrix
 * @datetime 2020/9/21 22:35
 */
@Aspect
@Component
public class AspectAnnotation {

    @Autowired
    private AccessHock accessHock;

    //匹配标有Access注解的方法
    @Pointcut("@annotation(org.matrix.spring.aop.upgrade.Access)")
    public void match1() {
    }

    //匹配标有Hock注解的方法,要求注解的RetentionPolicy.CLASS级别
    @Pointcut("@within(org.matrix.spring.aop.upgrade.Hock)")
    public void match2() {
    }

    //匹配标有Hock注解的方法,要求注解的RetentionPolicy.RUNTIME级别
    @Pointcut("@target(org.matrix.spring.aop.upgrade.Access)")
    public void match3() {
    }

    //匹配传入参数标有HockParam注解的方法
    @Pointcut("@args(org.matrix.spring.aop.upgrade.HockParam)")
    public void match4() {
    }

    @Before("match2()")
    public void beforeExe() {
        System.err.println("密探介入开始检查！");
        accessHock.access();
    }

    @After("match2()")
    public void after() {
        System.err.println("密探介入检查完成！");
    }


}
