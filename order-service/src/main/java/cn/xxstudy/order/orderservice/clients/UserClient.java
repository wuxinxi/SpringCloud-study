package cn.xxstudy.order.orderservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @date: 2023/11/20 21:11
 * @author: LovelyCoder
 * @remark:
 */
@FeignClient("userservice")
public interface UserClient {
    @GetMapping("getUser/{id}")
    String getUser(@PathVariable("id") int id);
}
