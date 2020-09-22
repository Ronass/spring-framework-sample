package org.matrix.spring.aop.cglib;

import org.matrix.spring.aop.proxy.Car;
import org.matrix.spring.aop.proxy.SmartCar;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Jdk动态代理调用
 * @author matrix
 * @datetime 2020/9/23 00:50
 */
public class CglibClient {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SmartCar.class);
        enhancer.setCallback(new CglibProxy());
        Car car = (Car)enhancer.create();
        car.stop();
    }

}
