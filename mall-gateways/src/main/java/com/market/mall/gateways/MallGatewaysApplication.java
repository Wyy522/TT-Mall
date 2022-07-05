package com.market.mall.gateways;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import rx.internal.util.atomic.LinkedQueueNode;

import java.util.HashMap;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MallGatewaysApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallGatewaysApplication.class, args);
        HashMap
    }

}
