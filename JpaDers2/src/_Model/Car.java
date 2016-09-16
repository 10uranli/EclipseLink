package _Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String modelName;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String modelName) {
		super();
		this.modelName = modelName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", modelName=" + modelName + "]";
	}
	
}
