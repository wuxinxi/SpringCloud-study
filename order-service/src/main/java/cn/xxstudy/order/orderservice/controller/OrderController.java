package cn.xxstudy.order.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @date: 2023/11/20 15:41
 * @author: LovelyCoder
 * @remark:
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getOrder/{id}")
    public String getOrder(@PathVariable("id") int orderId) {
        String url = "http://userservice/getUser/" + orderId;
        String response = restTemplate.getForObject(url, String.class);
        return String.format("orderId=%d,response=%s", orderId, response);
    }

}
