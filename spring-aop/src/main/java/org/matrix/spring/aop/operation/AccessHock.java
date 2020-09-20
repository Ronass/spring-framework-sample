package org.matrix.spring.aop.operation;

import org.springframework.stereotype.Component;

@Component
public class AccessHock {

    public void access(){
        String name = UserContentHolder.whoIsName();
        if (name.equals("和珅")){
            throw new RuntimeException("和珅禁止入内！");
        }
    }

}
