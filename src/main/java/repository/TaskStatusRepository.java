package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.TaskStatus;

@Repository
public interface TaskStatusRepository extends JpaRepository<TaskStatus, Long>{

}
