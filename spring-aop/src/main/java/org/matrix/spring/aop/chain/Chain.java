package org.matrix.spring.aop.chain;

import java.util.List;

public class Chain {
    private List<ChainHandler> chainHandlers;

    private int index;

    public Chain(List<ChainHandler> chainHandlers) {
        this.chainHandlers = chainHandlers;
    }

    public void process(){
        if (index >= chainHandlers.size()){
            return;
        }
        chainHandlers.get(index++).execute(this);
    }
}
