package org.matrix.spring.aop.higher;

import org.springframework.stereotype.Service;

@Service
public class CaService {

    public String name(String name) {
        System.err.println("高级名称生成中...：" + name);
        return "鲍勃专家:" + name;
    }

    public String name(String name,int no) {
        System.err.println("高级名称生成中...：" + no);
        return "鲍勃专家:" + name + ",编号：" + no;
    }

    public void hiker(String name,int no) {
        System.err.println("黑盒名称生成中...：" + no);
    }

    public void exception(int no) throws RuntimeException{
        System.err.println("白盒名称生成中...：" + no);
    }

    public void exception1(int no){
        throw new RuntimeException("我是异常:" + no);
    }

}
