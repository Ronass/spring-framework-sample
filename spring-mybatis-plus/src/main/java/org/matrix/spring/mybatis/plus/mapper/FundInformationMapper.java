/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2020
 */
package org.matrix.spring.mybatis.plus.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.matrix.spring.mybatis.plus.model.FundInformation;

/**
 * FundInformationMapper
 * @author rapid
 * @date - 2020
 */
public interface FundInformationMapper extends BaseMapper<FundInformation> {

    @Select("select fund_name from  fund_information")
    String query();

    @Select("select fund_name from  fund_information where id = #{id}")
    String query(@Param("id") Integer id);
}