package ua.com.testing.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.testing.entity.Test;

@Repository
public interface TestRepository extends ReactiveCrudRepository<Test, Long> {
}