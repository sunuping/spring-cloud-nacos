package com.sunup.practice.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProviderController {
    @SentinelResource(value="hello")
    @GetMapping("/hello")
    public String hi(@RequestParam(value = "name", defaultValue = "nacos", required = false) String name) {
        log.debug(name);
        return "hello" + name;
    }
}
