package org.matrix.spring.aop.upgrade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.matrix.spring.aop.operation.AccessHock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserHockAspect {

    @Autowired
    private AccessHock accessHock;

    @Pointcut("@annotation(Access)")
    public void access() {

    }

    @Before("access()")
    public void beforeExe() {
        System.err.println("内务府介入开始检查！");
        accessHock.access();
    }

}
