package uz.pdp.springmvc.model;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User extends BaseModel{
    private String name;
    private Integer age;
    private String username;
    private String password;
}
