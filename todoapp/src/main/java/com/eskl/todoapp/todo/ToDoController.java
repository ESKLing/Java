package com.eskl.todoapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "todo")
public class ToDoController {

    private final ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping
    public List<ToDo> getToDos(){
        return toDoService.getToDos();
    }

    @GetMapping(value = "addNew")
    public void addNew(){
        ToDo makeLunch = new ToDo("Make Lunch");
        toDoService.createToDo(makeLunch);
    }
}
