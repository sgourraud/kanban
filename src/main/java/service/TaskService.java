package service;

import java.util.Collection;

import domain.Task;

public interface TaskService {
	public Collection<Task> findAllTask();
	public Task findTask(Long id);
	public Task moveRightTask(Task task);
	public Task moveLeftTask(Task task);
}
