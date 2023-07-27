package uz.pdp.springmvc.model;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ToDo extends BaseModel{
    private String title;
    private String description;
    private UUID ownerId;
}
