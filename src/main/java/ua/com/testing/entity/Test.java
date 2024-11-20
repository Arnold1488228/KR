package ua.com.testing.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter

@AllArgsConstructor
@ToString
@Table("tests")
public class Test {
    @Id
    private Long id;
    private String name;
    private String subject;
    private Long authorId; // Reference to the tutor who created the test
    private Long createdBy; // Additional field for enhanced tracking
}


