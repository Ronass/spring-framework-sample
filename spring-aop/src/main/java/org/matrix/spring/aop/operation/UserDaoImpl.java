package org.matrix.spring.aop.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao{

    @Autowired
    AccessHock accessHock;

    // @Access
    @Override
    public void delete(int id) {
        //accessHock.access();
        System.err.println("当前删除用户编号为：" + id);
        System.err.println("删除成功！");
    }

    // @Access
    @Override
    public void add(int id) {
        //accessHock.access();
        System.err.println("当前添加用户编号为：" + id);
        System.err.println("添加成功！");
    }

}
