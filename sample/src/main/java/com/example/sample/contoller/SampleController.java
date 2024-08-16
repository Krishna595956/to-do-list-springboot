package com.example.sample.contoller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.sample.model.Tasks;
import com.example.sample.repository.SampleRepo;
import com.example.sample.sample.Sampleservice;

@Controller
public class SampleController {
	
	@Autowired
	SampleRepo repo;
	
	@Autowired
	Sampleservice service;
	
	
	@GetMapping("/")
	public String hello() {
		return "dashboard";
	}
	
	@GetMapping("/addtask")
	public String addtask() {
		return "addtask";
	}
	
	@PostMapping("/taskadded")
	public String taskadded(Tasks task,Model model) {
		model.addAttribute("status","Task added successfully");
		repo.save(task);
		return "redirect:/viewtasks";
	}
	
	@GetMapping("/viewtasks")
	public String viewtasks(Model model) {
//		List<Tasks> tasks=repo.findAll();
		model.addAttribute("tasks",repo.findAll());
		return "a";
	}
	
	@GetMapping("/edittask")
	public String editToDoItem(@RequestParam("id") int id, Model model) {
		Tasks task=service.getTaskById(id);
		model.addAttribute("taskname",task.getName());
		model.addAttribute("taskdate",task.getDate());
		model.addAttribute("tasktime",task.getTime());
		model.addAttribute("taskstatus",task.getStatus());
		model.addAttribute("id",id);
		return "edittask";
	}
	
	@PostMapping("/savetask")
	public String editSaveTask(@RequestParam("id") int id,Tasks task, RedirectAttributes redirectAttributes) {
		
		Tasks task1=service.getTaskById(id);
		System.out.print(task.getName());
		task1.setName(task.getName());
		task1.setTime(task.getTime());
		task1.setDate(task.getDate());
		task1.setStatus(task.getStatus());
		repo.save(task1);
		return "redirect:/viewtasks";
	}
		
	@GetMapping("/deletetask")
	public String deleteToDoItem(@RequestParam("id") int id, RedirectAttributes redirectAttributes) {
		if (service.deleteToDoItem(id)) {
			redirectAttributes.addFlashAttribute("message", "Delete Success");
			return "redirect:/viewtasks";
		}
		
		redirectAttributes.addFlashAttribute("message", "Delete Failure");
		return "redirect:/addtask";
	}	
}
	
	
	
	