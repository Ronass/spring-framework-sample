package org.matrix.spring.aop.chain;

public class Client {
    static class HandlerA extends Handler{
        @Override
        protected void handlerProcess() {
            System.err.println("a");
        }
    }
    static class HandlerB extends Handler{
        @Override
        protected void handlerProcess() {
            System.err.println("b");
        }
    }
    static class HandlerC extends Handler{
        @Override
        protected void handlerProcess() {
            System.err.println("c");
        }
    }

    public static void main(String[] args) {
        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        HandlerC handlerC = new HandlerC();

        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);

        handlerA.execute();


    }

}
