package ua.com.testing.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table("user_test_results")
public class UserTestResult {
    @Id
    private Long id;
    private Long userId;
    private Long testId;
    private Integer score;
}
