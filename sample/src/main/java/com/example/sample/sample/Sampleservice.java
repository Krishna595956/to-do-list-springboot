package com.example.sample.sample;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.model.Tasks;
//import com.example.sample.model.Registrationdetails;
import com.example.sample.repository.SampleRepo;

@Service
public class Sampleservice {

	@Autowired
	SampleRepo repo;
	    
    public Tasks getTaskById(int id) {
		return repo.findById(id).get();
	}

	public boolean deleteToDoItem(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
		if (repo.findById(id).isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	public boolean saveOrUpdateTask(int id,Tasks task) {
		Tasks existingTask = repo.findById(id).orElse(null);
	    if (existingTask != null) {
	        // Update existing task properties
	        existingTask.setName(task.getName()); // Update other properties as needed
	        existingTask.setDate(task.getDate());  // Update other properties as needed
	        existingTask.setTime(task.getTime());  // Update other properties as needed

	        // Save the updated task
	        repo.save(existingTask);
	        return true;
	    } else {
	        // Task not found, consider handling this case (e.g., throw an exception)
	        return false;
	    }
	}

	
}
