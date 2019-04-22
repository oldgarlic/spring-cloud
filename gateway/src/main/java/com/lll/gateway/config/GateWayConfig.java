package com.lll.gateway.config;

import com.lll.gateway.filter.MyFilter;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.GatewayFilterSpec;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.UriSpec;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class GateWayConfig {
    //这个是局部的
    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/provider/**")
                        .filters(f -> f.filter(new MyFilter())
                                .stripPrefix(1))
                        .uri("lb://SERVER-PROVIDER")
                        .order(0)
                        .id("provider-routes")
                )
                .build();
    }
}
