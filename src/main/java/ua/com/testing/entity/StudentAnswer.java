package ua.com.testing.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table("student_answers")
public class StudentAnswer {
    @Id
    private Long id;
    private Long userId; // ID студента
    private Long questionId; // ID питання
    private Long answerOptionId; // ID вибраного варіанту відповіді
}
