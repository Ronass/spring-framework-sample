package org.matrix.spring.aop.chain;

import java.util.Arrays;
import java.util.List;

public class ChainClient {
    static class ChainHandlerA extends ChainHandler{
        @Override
        protected void handlerProcess() {
            System.err.println("chain a");
        }
    }
    static class ChainHandlerB extends ChainHandler{
        @Override
        protected void handlerProcess() {
            System.err.println("chain a");
        }
    }
    static class ChainHandlerC extends ChainHandler{
        @Override
        protected void handlerProcess() {
            System.err.println("chain c");
        }
    }

    public static void main(String[] args) {
        List<ChainHandler> chainHandlers = Arrays.asList(
                new ChainHandlerA(),
                new ChainHandlerB(),
                new ChainHandlerC()
        );
        Chain chain = new Chain(chainHandlers);
        chain.process();
    }
}
