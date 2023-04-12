package com.lhg.overseaadmin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class OverseasPurchasingApplication {
    private static final Logger logger = LoggerFactory.getLogger(OverseasPurchasingApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OverseasPurchasingApplication.class, args);
        logger.info("─=≡Σ(((つ•̀ω•́)つ Successful！海外代购平台启动成功！_φ_(．．)");
        System.out.println("1111111111111");
    }

}
