package org.matrix.spring.aop.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CacheDaoImpl implements UserDao{

    @Autowired
    AccessHock accessHock;

    // @Access
    @Override
    public void delete(int id) {
        //accessHock.access();
        System.err.println("Cache当前删除用户编号为：" + id);
        System.err.println("Cache删除成功！");
    }

    // @Access
    @Override
    public void add(int id) {
        //accessHock.access();
        System.err.println("Cache当前添加用户编号为：" + id);
        System.err.println("Cache添加成功！");
    }

}
