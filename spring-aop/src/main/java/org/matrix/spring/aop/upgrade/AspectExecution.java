package org.matrix.spring.aop.upgrade;

import org.aspectj.lang.annotation.*;
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

    //匹配org.matrix.spring.aop.higher包及其子包下面以Service结尾的类的返回值为String的任意方法
    @Pointcut("execution(public void org.matrix.spring.aop.higher..*Service.*(..) throws java.lang.Exception)")
    public void match4() {
    }

    //匹配AOP对象的目标对象为指定类型的方法,即UserDaoImpl的aop代理对象的方法
    @Pointcut("this(org.matrix.spring.aop.higher.CaService)")
    public void match6() {
    }

    @Before("match6()")
    public void beforeExe() {
        System.err.println("110介入开始检查！");
        accessHock.access();
    }

    @After("match6()")
    public void after() {
        System.err.println("110介入检查完成！");
    }

    @AfterThrowing("match6()")
    public void afterThrowing() {
        System.err.println("110介入检查afterThrowing！");
    }

/*    @Around("match6()")
    public void around() {
        System.err.println("110介入检查完成around！");
    }*/
}
