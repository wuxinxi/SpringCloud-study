package cn.xxstudy.order.orderservice.controller;

import cn.xxstudy.order.orderservice.clients.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @date: 2023/11/20 15:41
 * @author: LovelyCoder
 * @remark:
 */
@RestController
public class OrderController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserClient client;

    @GetMapping("/getOrder/{id}")
    public String getOrder(@PathVariable("id") int orderId) {
//        String url = "http://userservice/getUser/" + orderId;
        String response = client.getUser(orderId);
        return String.format("orderId=%d,response=%s", orderId, response);
    }

}
