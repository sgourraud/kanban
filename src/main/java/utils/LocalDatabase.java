package utils;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import domain.Developer;
import domain.TaskStatus;
import domain.TaskType;
import lombok.extern.slf4j.Slf4j;
import repository.DeveloperRepository;
import repository.TaskRepository;
import repository.TaskStatusRepository;
import repository.TaskTypeRepository;

@Configuration
@Slf4j
public class LocalDatabase {

		@Bean
		@Profile("!test")
		CommandLineRunner initDatabase(DeveloperRepository developerRepository,
										TaskRepository taskRepository,
										TaskStatusRepository taskStatusRepository,
										TaskTypeRepository taskTypeRepository) {
			return args -> {
				initTaskStatusAndTypes(taskStatusRepository, taskTypeRepository);
				
				initDevelopers(developerRepository);
			};
		}
		
		private void initTaskStatusAndTypes(TaskStatusRepository taskStatusRepository,
				TaskTypeRepository taskTypeRepository) {
			// TODO Auto-generated method stub
			TaskStatus todo = new TaskStatus("to do");
			taskStatusRepository.save(todo);
			
			TaskStatus finished = new TaskStatus("finished");
			taskStatusRepository.save(finished);
			
			TaskStatus test = new TaskStatus("test");
			taskStatusRepository.save(test);
			
			TaskType type1 = new TaskType("type 1");
			taskTypeRepository.save(type1);
			
			TaskType type2 = new TaskType("type 2");
			taskTypeRepository.save(type2);
			
		}

		private void initDevelopers(DeveloperRepository developerRepository) {
			Developer dev1 = new Developer();
			dev1.setEmail("simon.gourraud@gmail.com");
			dev1.setFirstname("Simon");
			dev1.setLastname("Gourraud");
			dev1.setPassword("mdp");
			dev1.setStartContract(LocalDate.of(2021, Month.NOVEMBER, 1));
			developerRepository.save(dev1);
			
		}
}
