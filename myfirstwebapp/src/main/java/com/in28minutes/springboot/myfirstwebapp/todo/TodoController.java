package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("show-todos")
    public String showTodos(ModelMap model){
        List<Todo> todos = this.todoService.findByUsername("Gerald");
        model.addAttribute("todos", todos);
        return "todoList";
    }
}
