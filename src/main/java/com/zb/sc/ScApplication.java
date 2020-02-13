package com.zb.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//服务中心,即服务提供者
@SpringBootApplication
@EnableEurekaServer
public class ScApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScApplication.class, args);
    }

}
