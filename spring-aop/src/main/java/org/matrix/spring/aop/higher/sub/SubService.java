package org.matrix.spring.aop.higher.sub;

import org.springframework.stereotype.Service;

@Service
public class SubService {

    public String name(String name) {
        System.err.println("低级名称生成中...：" + name);
        return "鲍勃新手:" + name;
    }

    public String name(String name,int no) {
        System.err.println("低级编号生成中...：" + no);
        return "鲍勃新手:" + name + ",编号：" + no;
    }

}
