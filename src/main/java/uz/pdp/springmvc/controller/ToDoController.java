package uz.pdp.springmvc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.pdp.springmvc.model.ToDo;
import uz.pdp.springmvc.service.todo.ToDoService;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/to-dos")
@RequiredArgsConstructor
public class ToDoController {
    private final ToDoService toDoService;

//    public ToDoController(ToDoService toDoService) {
//        this.toDoService = toDoService;
//    }

    @RequestMapping("/{userId}")
    public String getUserToDos(
            @PathVariable UUID userId,
            Model model
    ) {
        List<ToDo> userToDos = toDoService.getUserToDos(userId);
        model.addAttribute("toDos", userToDos);
        model.addAttribute("userId", userId);
        return "to-dos";
    }

//    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @PostMapping("/add")
    public String addToDo(
            @ModelAttribute ToDo toDo,
            Model model
    ) {
        ToDo save = toDoService.save(toDo);
        model.addAttribute("toDos", toDoService.getUserToDos(toDo.getOwnerId()));
        model.addAttribute("userId", toDo.getOwnerId());
        return "to-dos";
    }
}

