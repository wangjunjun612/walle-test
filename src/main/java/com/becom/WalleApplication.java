package com.becom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by becom on 2019/12/19.
 */
@Controller
@SpringBootApplication
@Configuration
public class WalleApplication {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world！";
    }

    public static void main(String[] args) {
        SpringApplication.run(WalleApplication.class, args);
    }
}
