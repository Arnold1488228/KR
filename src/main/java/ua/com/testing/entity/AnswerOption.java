package ua.com.testing.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table("answer_options")
public class AnswerOption {
    @Id
    private Long id;
    private String text;
    private Boolean isCorrect;
    private Long questionId;
}
