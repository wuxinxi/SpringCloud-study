package cn.xxstudy.order.orderservice;

import cn.xxstudy.order.orderservice.config.FeignClientConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients(defaultConfiguration = FeignClientConfiguration.class )
@EnableFeignClients(defaultConfiguration = FeignClientConfiguration.class )
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }


//    @Bean
//    @LoadBalanced //负载均衡
//    public RestTemplate template() {
//        return new RestTemplate();
//    }
}
