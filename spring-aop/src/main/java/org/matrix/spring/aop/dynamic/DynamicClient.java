package org.matrix.spring.aop.dynamic;

import org.matrix.spring.aop.proxy.Car;
import org.matrix.spring.aop.proxy.SmartCar;

import java.lang.reflect.Proxy;

/**
 * Jdk动态代理调用
 * @author matrix
 * @datetime 2020/9/23 00:50
 */
public class DynamicClient {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratorFiles","true");
        Object instance = Proxy.newProxyInstance(
                DynamicClient.class.getClassLoader(),
                new Class[]{Car.class},
                new JdkDynamicProxy(new SmartCar()));
        Car proxyCar = (Car) instance;
        proxyCar.stop();
    }

}
