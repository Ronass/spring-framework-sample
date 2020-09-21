package org.matrix.spring.aop.upgrade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.matrix.spring.aop.operation.AccessHock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 表达式注解
 * @author matrix
 * @datetime 2020/9/21 22:35
 */
@Aspect
@Component
public class AspectExecution {

    @Autowired
    private AccessHock accessHock;

    //匹配org.matrix.spring.aop.higher包下面以Service结尾的类的任意方法,并且任意参数
    @Pointcut("execution(public * org.matrix.spring.aop.higher.*Service.*(..))")
    public void match1() {
    }

    //匹配org.matrix.spring.aop.higher包及其子包下面以Service结尾的类的任意方法,并且任意参数
    @Pointcut("execution(public * org.matrix.spring.aop.higher..*Service.*(..))")
    public void match5() {
    }

    //匹配org.matrix.spring.aop.higher包及其子包下面以Service结尾的类的返回值为String的任意方法,并且任意参数
    @Pointcut("execution(public String org.matrix.spring.aop.higher..*Service.*(..))")
    public void match2() {
    }

    //匹配org.matrix.spring.aop.higher包及其子包下面以Service结尾的类的返回值为String的任意方法,并且无参数
    @Pointcut("execution(public String org.matrix.spring.aop.higher..*Service.*())")
    public void match3() {
    }

    //匹配org.matrix.spring.aop.higher包及其子包下面以Service结尾的类的返回值为String的任意方法,并且无参数
    @Pointcut("execution(public void org.matrix.spring.aop.higher..*Service.*(..) throws java.lang.RuntimeException)")
    public void match4() {
    }

    @Before("match4()")
    public void beforeExe() {
        System.err.println("110介入开始检查！");
        accessHock.access();
    }
}
