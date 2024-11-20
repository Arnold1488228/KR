package ua.com.testing.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.testing.entity.AnswerOption;

@Repository
public interface AnswerOptionRepository extends ReactiveCrudRepository<AnswerOption, Long> {
}
