package com.angpa.shoppro.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jasper Zhan
 * @date 2022年02月04日 15:11
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GatewyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewyApplication.class, args);
    }
}
