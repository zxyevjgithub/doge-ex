package com.doge.exchange.center.web;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动类
 */


@Slf4j
@SpringBootApplication(scanBasePackages = {"com.doge.exchange"})
@EnableTransactionManagement
@MapperScan({"com.doge.exchange.center.dal.mapper"})
@EnableDubbo(scanBasePackages = {"com.doge.exchange.center.service"})
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        log.info("*************************************************************");
        log.info("*************************DOGE-EXCHANGE START**********************");
        log.info("*************************************************************");
    }


}
