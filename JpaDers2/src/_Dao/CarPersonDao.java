package _Dao;

import javax.persistence.EntityManager;

import _Model.Car;
import _Model.Person;

public interface CarPersonDao {
	public Car createCar(String modelName);

	public Person createPerson(String name);

	public EntityManager getEntityManager();
}
