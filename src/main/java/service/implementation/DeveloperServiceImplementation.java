package service.implementation;

import java.util.List;

import domain.Developer;
import repository.DeveloperRepository;

public class DeveloperServiceImplementation {

	private DeveloperRepository developerService;
	
	public List<Developer> findAllDevelopers(){
		return this.developerService.findAll();
	}
}
