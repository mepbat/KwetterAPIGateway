package fontys.ict.kwetter.kwetterapigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/credentials/**")
                        .uri("http://localhost:8081/"))
                .route(r -> r.path("/account/**")
                        .uri("http://localhost:8082/"))
                .route(r -> r.path("/follow/**")
                        .uri("http://localhost:8082/"))
                .route(r -> r.path("/tweet/**")
                        .uri("http://localhost:8083/"))
                .route(r -> r.path("/mention/**")
                        .uri("http://localhost:8083/"))
                .route(r -> r.path("/tag/**")
                        .uri("http://localhost:8083/"))
                .build();
    }
}
