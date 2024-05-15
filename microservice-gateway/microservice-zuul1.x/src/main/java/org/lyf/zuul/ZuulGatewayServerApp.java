package org.lyf.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

//@EnableZuulServer
@EnableZuulProxy
@SpringBootApplication
public class ZuulGatewayServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayServerApp.class, args);
    }
}
