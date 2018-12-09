package guru.springframework.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jt on 2018-12-08.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String email;
}
