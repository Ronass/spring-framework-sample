package org.matrix.spring.aop.upgrade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.matrix.spring.aop.operation.AccessHock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 匹配参数
 * @author matrix
 * @datetime 2020/9/21 22:35
 */
@Aspect
@Component
public class AspectParam {

    @Autowired
    private AccessHock accessHock;

    //匹配以add开头的并且只有一个int参数的方法
    @Pointcut("execution(void *..add*(int))")
    public void match1() {
    }

    //匹配任何只有一个int参数的方法
    @Pointcut("args(int)")
    public void match2() {
    }

    //匹配以add开头的并且只有第一个int参数的方法
    @Pointcut("execution(void *..add*(int,..))")
    public void match3() {
    }

    //匹配任何只有第一个int参数的方法
    @Pointcut("args(int,..)")
    public void match4() {
    }

    @Before("match3()")
    public void beforeExe() {
        System.err.println("经济处介入开始检查！");
        accessHock.access();
    }
}
