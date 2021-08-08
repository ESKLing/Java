package com.eskl.todoapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private final ToDoRepository toDoRepository;

    @Autowired
    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> getToDos(){
        return toDoRepository.findAll();
    }

    public void createToDo(ToDo toDoEx){
        toDoRepository.save(toDoEx);
    }

    public void deleteToDo(Long id) {
        toDoRepository.deleteById(id);
    }
}
