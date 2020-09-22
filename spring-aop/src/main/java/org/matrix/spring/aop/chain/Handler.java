package org.matrix.spring.aop.chain;

/**
 * 责任链模式
 * @author matrix
 * @datetime 2020/9/23 01:57
 */
public abstract class Handler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    protected abstract void handlerProcess();

    public void execute(){
        handlerProcess();
        if (handler != null){
            handler.execute();
        }
    }

}
