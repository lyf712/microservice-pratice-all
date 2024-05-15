package com.lyf.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liyunfei
 **/
//@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaServer
public class NeflixRegisterCenterApp {
    public static void main(String[] args) {
        //SpringApplication.run(NeflixRegisterCenterApp.class, args);
//        new SpringApplicationBuilder(NeflixRegisterCenterApp.class)
//            //.web(WebApplicationType.REACTIVE)
//            .web(WebApplicationType.REACTIVE)
//            .run(args);
        SpringApplication.run(NeflixRegisterCenterApp.class, args);
    }
}
