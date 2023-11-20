package cn.xxstudy.order.orderservice.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @date: 2023/11/20 22:04
 * @author: LovelyCoder
 * @remark:
 */
public class FeignClientConfiguration {
    @Bean
    public Logger.Level getLoggerLevel() {
        return Logger.Level.FULL;
    }
}
