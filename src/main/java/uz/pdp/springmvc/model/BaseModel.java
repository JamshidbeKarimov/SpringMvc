package uz.pdp.springmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class BaseModel {
    {
        this.id = UUID.randomUUID();
        this.createdDate = LocalDateTime.now();
        this.updatedDate = this.createdDate;
    }

    private UUID id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
