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

    public void saveToDo(ToDo newToDo){
        toDoRepository.save(newToDo);
    }

    public void updateToDo(Long id, ToDo updatedToDo) {
        System.out.println(updatedToDo);
        ToDo toDoInDB = toDoRepository.findById(id).get();
        toDoInDB.setName(updatedToDo.getName());
        toDoInDB.setChecked(updatedToDo.getChecked());
        toDoRepository.save(toDoInDB);
        System.out.println(toDoInDB);
    }

    public void deleteToDo(Long id) {
        toDoRepository.deleteById(id);
    }

}
