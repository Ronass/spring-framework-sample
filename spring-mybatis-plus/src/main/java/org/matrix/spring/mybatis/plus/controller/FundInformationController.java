package org.matrix.spring.mybatis.plus.controller;

import org.matrix.spring.mybatis.plus.mapper.FundInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
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
