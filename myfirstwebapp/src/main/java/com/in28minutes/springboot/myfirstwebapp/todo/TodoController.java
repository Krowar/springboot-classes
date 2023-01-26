package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.cglib.core.Local;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes("name")
public class TodoController {

    private TodoService todoService;
    private final TodoRepository todoRepository;

    public TodoController(TodoService todoService,
                          TodoRepository todoRepository) {
        super();
        this.todoService = todoService;
        this.todoRepository = todoRepository;
    }

   // @RequestMapping("list-todos")
    public String showTodos(ModelMap model){
        String username = (String) model.get("name");
        List<Todo> todos = todoService.findByUsername(username);
        model.addAttribute("todos", todos);
        return "todoList";
    }

    //@RequestMapping(value="todo", method= RequestMethod.GET)
    public String todo(ModelMap model) {
        Todo todo;
        String username = (String) model.get("name");
        todo = new Todo(0, username, "Default description", LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "todo";
    }

    //@RequestMapping(value="todo", method= RequestMethod.POST)
    public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result){
        //System.out.println((String)model.get("name"));

        if(result.hasErrors()){
            return "todo";
        }
        else{
            String username = getLoggedInUsername(model);
            todo.setUsername(username);
            todoRepository.save(todo);
            List<Todo> todos = todoService.findByUsername((String)model.get("name"));
            todoService.addTodo(new Todo(todos.size()+1, (String)model.get("name"), todo.getDescription(), todo.getTargetDate(), false));
            return "redirect:list-todos";
        }

    }

   // @RequestMapping(value="update-todo", method= RequestMethod.GET)
    public String goToUpdateTodo(ModelMap model, @RequestParam int todoId) {
        Todo todo = todoService.findById(todoId);
        model.put("todo", todo);
        return "todo";
    }

   // @RequestMapping(value="update-todo", method= RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result){
        //System.out.println((String)model.get("name"));

        if(result.hasErrors()){
            return "todo";
        }
        else{
            Todo todoToUpdate = todoService.findById(todo.getId());
            todoService.updateTodo(todoToUpdate, todo);
            return "redirect:list-todos";
        }

    }




   // @RequestMapping("delete-todo")
    public String deleteTodo(ModelMap model, @RequestParam int todoId){
        Todo todo = todoService.findById(todoId);
        todoRepository.delete(todo);
        return "redirect:list-todos";
    }

    private String getLoggedInUsername(ModelMap model) {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

}
