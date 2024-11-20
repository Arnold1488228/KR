package ua.com.testing.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.testing.entity.Question;

@Repository
public interface QuestionRepository extends ReactiveCrudRepository<Question, Long> {
}
