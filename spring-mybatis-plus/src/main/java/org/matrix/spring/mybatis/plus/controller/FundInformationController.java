package org.matrix.spring.mybatis.plus.controller;

import org.matrix.spring.mybatis.plus.mapper.FundInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Q:为什么mybatis-plus中mapper方法不能重载
 * A:因为mybatis在调用mapper方法的时候是采用动态代理
 *   即会优先匹配方法执行在第一个的方法，如果返回值，方法名相同，会调用第一个被匹配的方法
 *   所以会出现异常问题，猜测是与mybatis保存方法的唯一key有关系
 * 建议:不要重载方法
 *
 *
 * @author matrix
 * @datetime 2020/9/26 23:42
 */
@RestController
public class FundInformationController {

    @Autowired
    private FundInformationMapper fundInformationMapper;

    @GetMapping("/search")
    public String search(){
        String query = fundInformationMapper.query(1);
        return query;
    }

}
