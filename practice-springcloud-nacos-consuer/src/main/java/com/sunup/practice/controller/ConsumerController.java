package com.sunup.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/helloFeign")
    public String helloFeign() {
        return providerClient.hello("feign");
    }

    @GetMapping("/helloResttemplate")
    public String resttemplate() {
        return restTemplate.getForObject("http://nacos-provider/hello?name=resttemplate", String.class);
    }
}
