package ua.com.testing.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.testing.entity.UserTestResult;

@Repository
public interface UserTestResultRepository extends ReactiveCrudRepository<UserTestResult, Long> {
}
