package org.matrix.spring.mybatis.plus.service;

import org.matrix.spring.mybatis.plus.mapper.FundInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author matrix
 * @datetime 2020/9/26 23:45
 */

@Service
public class FundInformationService {
	
	@Autowired
	private FundInformationMapper fundInformationMapper;
}
