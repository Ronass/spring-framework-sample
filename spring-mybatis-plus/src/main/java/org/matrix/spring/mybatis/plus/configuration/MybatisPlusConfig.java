package org.matrix.spring.mybatis.plus.configuration;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author matrix
 * @datetime 2020/9/26 23:07
 */
@Configuration
@MapperScan("org.matrix.spring.mybatis.plus.**.mapper")
public class MybatisPlusConfig {

    @Bean
    public PaginationInnerInterceptor paginationInterceptor() {
        return new PaginationInnerInterceptor(DbType.MYSQL);
    }
}