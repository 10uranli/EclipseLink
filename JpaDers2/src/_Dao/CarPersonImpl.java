package _Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import _Model.Car;
import _Model.Girl;
import _Model.Person;

public class CarPersonImpl implements CarPersonDao {

	private EntityManagerFactory ef;
	private EntityManager em;
	private EntityTransaction et;

	public CarPersonImpl() {
		ef = Persistence.createEntityManagerFactory("Relation");
		em = ef.createEntityManager();
		et = em.getTransaction();
	}

	@Override
	public Car createCar(String modelName) {
		Car car = new Car(modelName);
		et.begin();
		em.persist(car);
		et.commit();
		return car;
	}

	@Override
	public Person createPerson(String name) {
		Person person = new Person(name);
		et.begin();
		em.persist(person);
		et.commit();
		return person;
	}

	@Override
	public EntityManager getEntityManager() {
		return em;
	}

}
