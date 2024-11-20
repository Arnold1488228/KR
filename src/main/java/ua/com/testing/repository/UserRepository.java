package ua.com.testing.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.testing.entity.User;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Long> {
}
