package com.eskl.todoapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "todo")
@CrossOrigin("*")
// cross origin allows everything ("*") to access this back end
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

    @PostMapping(path = "addNew")
    public void addNew(@RequestBody ToDo newToDo){
        toDoService.saveToDo(newToDo);
    }

    @PutMapping(path = "{id}/update")
    public void updateToDo(@PathVariable("id") Long id, @RequestBody ToDo updatedToDo){
        toDoService.updateToDo(id, updatedToDo);
    }

    @DeleteMapping(path = "{id}/delete")
    public void deleteToDo(@PathVariable("id") Long id){
        toDoService.deleteToDo(id);
    }
}
