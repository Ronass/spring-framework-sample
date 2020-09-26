package org.matrix.spring.mybatis.plus.model;/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2020
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 基金信息
 * @version 1.0
 * @author rapid
 */
 

@TableName(value = "fund_information")
@NoArgsConstructor
@Getter
@Setter
public class FundInformation implements Serializable {

	@TableId(type = IdType.AUTO)
	private Integer id;
	
	private String fundName;
	
	private String fundCode;
	
	private String manager;
	
	private String establishedTime;
	
	private Double assetSize;
	
	private String trusteeName;
	
	private String managementName;
	
	private Date createTime;
	
}
