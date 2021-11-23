package domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TaskStatus {
	
	private @Id Long id;
	private String label;
	
	public TaskStatus(String label) {
		this.label = label;
	}
}
