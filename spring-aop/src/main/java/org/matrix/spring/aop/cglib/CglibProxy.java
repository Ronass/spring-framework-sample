package org.matrix.spring.aop.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Method;

/**
 * Cglib代理
 * @author matrix
 * @datetime 2020/9/23 01:15
 */
//强制使用Cglib代理
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.err.println("cglib run!");
        Object result = null;
        try {
            result = methodProxy.invokeSuper(o, objects);
        } catch (Exception e) {
            System.err.println("e:" + e);
            throw e;
        } finally {
            System.err.println("finally");
        }
        return result;
    }
}
