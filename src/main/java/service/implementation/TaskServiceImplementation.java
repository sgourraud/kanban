package service.implementation;

import java.util.Collection;

import domain.Task;
import repository.TaskRepository;

public class TaskServiceImplementation {
	
	private TaskRepository taskRepository;
	
	public Collection<Task> findAllTasks(){
		return this.taskRepository.findAll();
	}
	
	public Task findTask(Long id) {
		return this.taskRepository.findById(id).orElse(null);
	}
	
	public Task moveRightTask(Task task) {
        
        String status = task.getStatus().getLabel();
        
        if(status.equals("to do")) {
            task.setStatus(null);
            
        }else if (status.equals("test")) {
            task.setStatus(null);
        }
        return taskRepository.save(task);
    }

    public Task moveLeftTask(Task task) {
        
        String status = task.getStatus().getLabel();
        
        if(status.equals("test")) {
            task.setStatus(null);
        }else if (status.equals("finished")) {
            task.setStatus(null);
        }
        return taskRepository.save(task);

    }
}
