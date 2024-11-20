package ua.com.testing.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table("users")
public class User {
    @Id
    private Long id;
    private String name;
    private String role;
    private String username;
    private String password;
}
