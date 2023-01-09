package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String showTodos(ModelMap model){
        List<Todo> todos = this.todoService.findByUsername("Gerald");
        model.addAttribute("todos", todos);
        return "todoList";
    }

    @RequestMapping(value="todo", method= RequestMethod.GET)
    public String todo(ModelMap model){
        return "todo";
    }

    @RequestMapping(value="todo", method= RequestMethod.POST)
    public String addTodo(@RequestParam String author, @RequestParam String description , @RequestParam String targetDate,
                          ModelMap model){

        List<Todo> todos = this.todoService.findByUsername("Gerald");
        this.todoService.addTodo(new Todo(todos.size()+1, author, description, LocalDate.now().plusYears(4), false));
        List<Todo> newTodos = this.todoService.findByUsername("Gerald");
        model.addAttribute("todos", newTodos);
        return "todoList";
    }

}
