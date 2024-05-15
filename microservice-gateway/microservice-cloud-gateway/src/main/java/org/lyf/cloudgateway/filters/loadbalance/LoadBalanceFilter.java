package org.lyf.cloudgateway.filters.loadbalance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;

import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_REQUEST_URL_ATTR;
import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_SCHEME_PREFIX_ATTR;

/**
 * @author liyunfei
 **/
@Component
public class LoadBalanceFilter implements GlobalFilter, Ordered {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //discoveryClient.getInstances("")
        URI url = exchange.getAttribute(GATEWAY_REQUEST_URL_ATTR);
        String schemePrefix = exchange.getAttribute(GATEWAY_SCHEME_PREFIX_ATTR);
//        - id: after_route
//        uri: https://www.baidu.com
        // uri后面serviceId
       // discoveryClient.getInstances()
        return null;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
