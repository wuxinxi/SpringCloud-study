package com.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 * @date: 2023/11/20 15:48
 * @author: LovelyCoder
 * @remark:
 */
@RestController
public class UserController {

    @GetMapping("/getUser/{id}")
    public String getUser(HttpServletRequest request, @PathVariable("id") int orderId) {

        String address = request.getLocalAddr();
        int serverPort = request.getLocalPort();
        System.out.println("address=" + address + ",serverPort=" + serverPort + ",");
        return System.currentTimeMillis() + new Random().nextLong() + "";
    }
}
