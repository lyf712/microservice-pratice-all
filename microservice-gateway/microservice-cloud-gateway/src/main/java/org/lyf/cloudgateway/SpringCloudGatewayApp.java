package org.lyf.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class SpringCloudGatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayApp.class, args);
    }
}
