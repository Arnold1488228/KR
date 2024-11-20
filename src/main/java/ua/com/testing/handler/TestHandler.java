package ua.com.testing.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import ua.com.testing.entity.Test;
import ua.com.testing.repository.TestRepository;

@Component
public class TestHandler {
    private final TestRepository testRepository;

    public TestHandler(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public Mono<ServerResponse> getAllTests(ServerRequest request) {
        return ServerResponse.ok()
                .body(testRepository.findAll(), Test.class);
    }

    public Mono<ServerResponse> addTest(ServerRequest request) {
        return request.bodyToMono(Test.class)
                .flatMap(testRepository::save)
                .flatMap(savedTest -> ServerResponse.ok().bodyValue(savedTest));
    }
}