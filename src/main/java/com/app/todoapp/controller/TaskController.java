package com.app.todoapp.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import com.app.todoapp.models.Task;
import com.app.todoapp.services.TaskService;


@Controller
public class TaskController {
	
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping
	public String getTasks(Model model) {
		List<Task> tasks = taskService.getAllTasks();
		// make sure you correct import 
		model.addAttribute("tasks",tasks); // this model is used for tasks list in tasks template
		return "tasks";
	}
	
	@PostMapping
	public String createTask(@RequestParam String title) {
		taskService.createTask(title);
		// whenever we add the task it will redirect to the root url
		return "redirect:/";
	}
	
	@GetMapping("/{id}/delete")
	public String deleteTask(@PathVariable Long id) {
		taskService.deleteTask(id);
		return "redirect:/";
	}
	
	@GetMapping("/{id}/toggle")
	public String toggleTasks(@PathVariable Long id) {
		taskService.toggleTask(id);
		return "redirect:/";
	}
}
