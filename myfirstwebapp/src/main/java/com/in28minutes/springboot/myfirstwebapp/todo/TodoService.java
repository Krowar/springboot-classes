package com.in28minutes.springboot.myfirstwebapp.todo;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {

        todos.add(new Todo(1, "Gerald", "Learn Java", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "Frenchie", "Learn Python", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "frenchie", "Learn Handstand", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(4, "Gerald", "Learn Cooking", LocalDate.now().plusYears(4), false));
    }

    public List<Todo> findByUsername(String name){
        List<Todo> todosToReturn = todos.stream().filter(todo -> todo.getUsername().equalsIgnoreCase(name)).toList();
        return todosToReturn;
    }

    public void addTodo(Todo todo){
        todos.add(todo);
    }


    public void deleteTodo(Todo todo){
        todos.remove(todo);
    }


    public  Todo findById(int todoId) {
         Todo todoToReturn = todos.stream().filter(todo -> todo.getId() == todoId).findAny().orElse(null);
         return todoToReturn;
    }

    public void updateTodo(Todo todo, Todo newTodo) {
        todo.setDescription(newTodo.getDescription());
        todo.setTargetDate(newTodo.getTargetDate());
        todo.setDone(newTodo.getDone());
    }
}
