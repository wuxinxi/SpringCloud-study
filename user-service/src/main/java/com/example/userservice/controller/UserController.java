package com.example.userservice.controller;

import com.example.userservice.config.PatternProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @date: 2023/11/20 15:48
 * @author: LovelyCoder
 * @remark:
 */
@RestController
//@RefreshScope
public class UserController {

    //获取配置文件参数
//    @Value("${pattern.dateformat}")
//    String dateformat;

    @Autowired
    private PatternProperties properties;

    @GetMapping("/getUser/{id}")
    public String getUser(HttpServletRequest request, @PathVariable("id") int orderId) {
        String address = request.getLocalAddr();
        int serverPort = request.getLocalPort();
        System.out.println("address=" + address + ",serverPort=" + serverPort + ",");
        return System.currentTimeMillis() + new Random().nextLong() + "";
    }

    @GetMapping("/getDate")
    public String getDate(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(properties.getDateformat()));
    }
}
