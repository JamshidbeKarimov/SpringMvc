package uz.pdp.springmvc.service.todo;


import org.springframework.stereotype.Service;
import uz.pdp.springmvc.model.ToDo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class ToDoServiceImpl implements ToDoService {
    private ArrayList<ToDo> toDos = new ArrayList<>();

    @Override
    public ToDo save(ToDo toDo) {
        toDos.add(toDo);
        return toDo;
    }

    @Override
    public ToDo getById(UUID id) {
        for (ToDo toDo : toDos) {
            if(toDo.getId().equals(id)) {
                return toDo;
            }
        }
        return null;
    }

    @Override
    public void deleteById(UUID id) {
        for (ToDo toDo : toDos) {
            if(toDo.getId().equals(id)) {
                toDos.remove(toDo);
                return;
            }
        }
    }

    @Override
    public List<ToDo> getUserToDos(UUID ownerId) {
        List<ToDo> userToDos = new ArrayList<>();
        for (ToDo toDo : toDos) {
            if(toDo.getOwnerId().equals(ownerId)) {
                userToDos.add(toDo);
            }
        }
        return userToDos;
    }
}
