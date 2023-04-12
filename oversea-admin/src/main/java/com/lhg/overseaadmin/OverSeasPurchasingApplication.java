package com.lhg.overseaadmin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OverSeasPurchasingApplication {

    private static final Logger log = LoggerFactory.getLogger(OverSeasPurchasingApplication.class);
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(OverSeasPurchasingApplication.class, args);
        log.info("─=≡Σ(((つ•̀ω•́)つ Successful！海外代购平台启动成功！_φ_(．．)");

    }

}
