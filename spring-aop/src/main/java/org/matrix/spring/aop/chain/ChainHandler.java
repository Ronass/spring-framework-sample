package org.matrix.spring.aop.chain;

/**
 * 优化责任链模式
 * @author matrix
 * @datetime 2020/9/23 02:08
 */
public abstract class ChainHandler {

    protected abstract void handlerProcess();

    public void execute(Chain chain){
        handlerProcess();
        chain.process();
    }
}
