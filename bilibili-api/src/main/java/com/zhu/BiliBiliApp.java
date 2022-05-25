package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author honey
 */
@SpringBootApplication
public class BiliBiliApp {
    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(BiliBiliApp.class,args);
    }
}
