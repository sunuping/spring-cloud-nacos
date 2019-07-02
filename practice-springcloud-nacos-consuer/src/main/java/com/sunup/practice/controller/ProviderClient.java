package com.sunup.practice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("nacos-provider")
public interface ProviderClient {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name",defaultValue = "nacos",required = false)String name);
}
