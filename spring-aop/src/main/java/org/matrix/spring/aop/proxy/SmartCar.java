package org.matrix.spring.aop.proxy;

public class SmartCar implements Car{
    @Override
    public void run() {
        System.err.println("小汽车跑起来了");
    }

    @Override
    public void stop() {
        System.err.println("小汽车停止了");
    }
}
