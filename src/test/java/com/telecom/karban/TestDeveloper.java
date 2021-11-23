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
import service.DeveloperService;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles(profiles="test")
public class TestDeveloper {
	
	private DeveloperService developerService;
	public void testFindAllDevelopers() {
		Collection<Developer> developers = this.developerService.findAllDevelopers();
		Assert.assertEquals(1, developers.size());
	}
}
