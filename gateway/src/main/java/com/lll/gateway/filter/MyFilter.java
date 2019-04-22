package com.lll.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Slf4j
public class MyFilter implements GatewayFilter, Ordered {

    private static final String REQUEST_TIME_BEGIN = "requestTimeBegin";

    //过滤器逻辑
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("这里是pre类型过滤器");
        return chain.filter(exchange).then(
                Mono.fromRunnable(() -> {
                    log.info("这里是post类型过滤器");
                })
        );

    }


    //给过滤器设定优先级别
    @Override
    public int getOrder() {
        return 0;
    }
}
