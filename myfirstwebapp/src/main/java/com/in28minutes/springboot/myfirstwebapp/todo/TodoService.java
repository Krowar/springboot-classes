package com.in28minutes.springboot.myfirstwebapp.todo;


import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        Todo todo1 = new Todo(1, "Gerald", "Learn Java", LocalDate.now().plusYears(1), false);
        Todo todo2 = new Todo(2, "Gerald", "Learn Python", LocalDate.now().plusYears(2), false);
        Todo todo3 = new Todo(2, "Gerald", "Learn OCaml", LocalDate.now().plusYears(3), false);
        Todo todo4 = new Todo(2, "Gerald", "Learn Cooking", LocalDate.now().plusYears(4), false);
        System.out.println(todo1);

        todos.add(new Todo(1, "Gerald", "Learn Java", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "Gerald", "Learn Python", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "Gerald", "Learn Handstand", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(4, "Gerald", "Learn Cooking", LocalDate.now().plusYears(4), false));
    }

    public List<Todo> findByUsername(String name){
        return todos;
    }


}
