package com.telecom.karban;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

import domain.Developer;
import domain.Task;
import service.TaskService;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles(profiles="test")
public class TestTask {
	private TaskService taskService;
	@Test
	public void testAddDeveloperToTask() {
		Developer developer = new Developer();
		Task task = new Task();
		task.addDeveloper(developer);
		Assert.assertEquals(1,task.getDevelopers().size());
	}
	
	@Test
	public void testFindAllTasks() {
		Collection<Task> tasks = this.taskService.findAllTask();
		Assert.assertEquals(1, tasks.size());
	}
	
	@Test
	public void testMoveLeftTask() {
	}
	
	@Test
	public void testMoveRightTask() {
	}
}
