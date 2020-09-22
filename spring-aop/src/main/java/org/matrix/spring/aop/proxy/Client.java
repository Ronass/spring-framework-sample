package org.matrix.spring.aop.proxy;

public class Client {

    public static void main(String[] args) {
        Car proxyCar = new ProxySmartCar(new SmartCar());
        proxyCar.run();
    }

}
