package ua.com.testing.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import ua.com.testing.handler.TestHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class TestRouter {
    @Bean
    public RouterFunction<ServerResponse> testRoutes(TestHandler testHandler) {
        return route(GET("/tests"), testHandler::getAllTests)
                .andRoute(POST("/tests"), testHandler::addTest);
    }
}