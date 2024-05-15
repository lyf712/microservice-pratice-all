package org.lyf.cloudgateway.filters.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/**
 * @author liyunfei
 **/
@Component
public class LogFilter implements GlobalFilter, Ordered {

    private final static Logger logger = LoggerFactory.getLogger(LogFilter.class);

    private final AtomicInteger id = new AtomicInteger(0);

    @Override
    public int getOrder() {
        return 0;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        AccessLog<ServerHttpRequest> accessLog = new AccessLog<>();
        accessLog.setContent(request);
        accessLog.setId("ID:" + id.getAndIncrement());

        logger.info("test log :{} ,{}", accessLog, request.getPath());
        if ("/baidu".equals(request.getPath().toString())) {
            //  mutate     return new DefaultServerHttpRequestBuilder(this);
            exchange = exchange.mutate().request(request.mutate().path("/").build()).build();
        }
        return chain.filter(exchange).filter(new Predicate<Void>() {
            @Override
            public boolean test(Void unused) {
                return true;
            }
        });
    }
}
