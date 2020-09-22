package org.matrix.spring.aop.dynamic;

import org.matrix.spring.aop.proxy.SmartCar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Jdk动态代理
 * 相当于Aspect
 * @author matrix
 * @datetime 2020/9/23 00:42
 */
public class JdkDynamicProxy implements InvocationHandler {

    private SmartCar smartCar;

    public JdkDynamicProxy(SmartCar smartCar) {
        this.smartCar = smartCar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            System.err.println("Dynamic proxy run");
            result = method.invoke(smartCar, args);
        } catch (Exception e) {
            System.err.println("e:" + e);
        }finally {
            System.err.println("finally");
        }
        return result;
    }
}
