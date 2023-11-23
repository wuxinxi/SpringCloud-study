package cn.xxstudy.order.orderservice.clients;

import cn.xxstudy.order.orderservice.config.FeignClientConfiguration;
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
    @GetMapping("user/getUser/{id}")
    String getUser(@PathVariable("id") int id);
}
