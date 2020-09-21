package org.matrix.spring.aop.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UserDao {

    // @Access
    public void delete(int id);

    // @Access
    public void add(int id);

}
