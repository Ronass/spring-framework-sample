package org.matrix.spring.aop.proxy;

public class ProxySmartCar implements Car {

    private SmartCar smartCar;

    public ProxySmartCar(SmartCar smartCar) {
        this.smartCar = smartCar;
    }

    @Override
    public void run() {
        System.err.println("代理运行了");
        try {
            smartCar.run();
        } catch (Exception e) {
            System.err.println("e:" + e);
        }finally {
            System.err.println("finally");
        }

    }

    @Override
    public void stop() {
        smartCar.stop();
    }
}
