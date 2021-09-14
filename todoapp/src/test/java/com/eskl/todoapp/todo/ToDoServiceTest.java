package com.eskl.todoapp.todo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

// initialises the mocks (in this case the repository), closes the resource after the test etc.
@ExtendWith(MockitoExtension.class)
class ToDoServiceTest {

    // mocks the repository rather than calling to the actual DB
    @Mock
    private ToDoRepository toDoRepository;
    private ToDoService toDoService;

    @BeforeEach
    void setUp() {
        toDoService = new ToDoService(toDoRepository);
    }

    @Test
    void canGetToDos() {
        // when
        toDoService.getToDos();
        // then - to check that the below method (find all) on the repository is invoked
        verify(toDoRepository).findAll();
    }

    @Test
    void canSaveToDo() {
        // given
        ToDo toDo = new ToDo("Example");

        // when
        toDoService.saveToDo(toDo);

        // then
        ArgumentCaptor<ToDo> toDoArgumentCaptor = ArgumentCaptor.forClass(ToDo.class);
            // verify that the saved method was invoked on the repository and capture the value (to do) that was passed into this save method
        verify(toDoRepository).save(toDoArgumentCaptor.capture());
        ToDo capturedToDo = toDoArgumentCaptor.getValue();
            // check that the to do passed into the repository save method is the same to do as above
        assertThat(capturedToDo).isEqualTo(toDo);
    }

    @Test
    @Disabled
    void deleteToDo() {
    }
}