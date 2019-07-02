package com.sunup.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PracticeSpringcloudNacosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeSpringcloudNacosProviderApplication.class, args);
    }

}
