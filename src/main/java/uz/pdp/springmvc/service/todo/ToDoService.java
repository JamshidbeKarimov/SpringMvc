package uz.pdp.springmvc.service.todo;

import org.springframework.stereotype.Service;
import uz.pdp.springmvc.model.ToDo;

import java.util.List;
import java.util.UUID;

public interface ToDoService {

    ToDo save(ToDo toDo);
    ToDo getById(UUID id);

    void deleteById(UUID id);

    List<ToDo> getUserToDos(UUID ownerId);


}
