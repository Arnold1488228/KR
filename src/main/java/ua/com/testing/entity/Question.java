package ua.com.testing.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table("questions")
public class Question {
    @Id
    private Long id;
    private String text;
    private String type;
    private Long testId;
}
