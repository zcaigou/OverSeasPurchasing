package com.lhg;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class OverSeasPurchasingApplication {

    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(OverSeasPurchasingApplication.class, args);
        log.info("─=≡Σ(((つ•̀ω•́)つ Successful！海外代购平台启动成功！_φ_(．．)");

    }

}
