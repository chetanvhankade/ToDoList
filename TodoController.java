package com.ToDoList.controller;

import com.ToDoList.model.Todo;
import com.ToDoList.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoRepository todoRepo;

    // GET: /todos
    @GetMapping
    public List<Todo> getAllTodos() {
        return todoRepo.findAll();
    }

    // POST: /todos
    @PostMapping
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {
        Todo savedTodo = todoRepo.save(todo);
        return ResponseEntity.ok(savedTodo);
    }

    // PUT: /todos/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
        return todoRepo.findById(id)
                .map(existing -> {
                    existing.setTitle(todo.getTitle());
                    existing.setStatus(todo.isStatus());
                    Todo updated = todoRepo.save(existing);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE: /todos/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        if (!todoRepo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        todoRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}