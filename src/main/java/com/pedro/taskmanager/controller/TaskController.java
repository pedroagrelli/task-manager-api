package com.pedro.taskmanager.controller;

import com.pedro.taskmanager.model.Task;
import com.pedro.taskmanager.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return repository.save(task);
    }

    @GetMapping
    public List<Task> getTasks() {
        return repository.findAll();
    }
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        Task task = repository.findById(id).orElseThrow();

        task.setTitle(updatedTask.getTitle());
        task.setCompleted(updatedTask.isCompleted());

        return repository.save(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
    }
}