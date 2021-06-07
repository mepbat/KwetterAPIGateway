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
                .route("path_route", r -> r.path("/credentials/**")
                        .uri("http://kwetter-authentication-service:8080/"))
                .route("path_route", r -> r.path("/account/**")
                        .uri("http://kwetter-account-service:8080/"))
                .route("path_route", r -> r.path("/follow/**")
                        .uri("http://kwetter-account-service:8080/"))
                .route("path_route", r -> r.path("/tweet/**")
                        .uri("http://kwetter-tweet-service:8080/"))
                .route("path_route", r -> r.path("/mention/**")
                        .uri("http://kwetter-tweet-service:8080/"))
                .route("path_route", r -> r.path("/tag/**")
                        .uri("http://kwetter-tweet-service:8080/"))
                .route("path_route", r -> r.path("/trump/**")
                        .uri("http://kwetter-trump-service:8080/"))
                .build();
    }
}
