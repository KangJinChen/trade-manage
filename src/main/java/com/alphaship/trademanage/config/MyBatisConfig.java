package com.alphaship.trademanage.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.alphaship.trademanage.mapper")
public class MyBatisConfig {
}
