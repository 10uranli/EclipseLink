package _Test;

import javax.persistence.EntityTransaction;

import _Dao.CarPersonImpl;
import _Model.Car;
import _Model.Person;

public class Test3 {
	public static void main(String[] args) {
		CarPersonImpl �mpl = new CarPersonImpl();
		Person person1 = �mpl.createPerson("Onur");
		Person person2 = �mpl.createPerson("Ali");
		
		Car car1 = �mpl.createCar("Audi");
		Car car2 = �mpl.createCar("Bmw");
		
		EntityTransaction et = �mpl.getEntityManager().getTransaction();
		et.begin();
		person1.getCar().add(car1);
		person1.getCar().add(car2);
		person2.getCar().add(car1);
		person2 .getCar().add(car2);
		et.commit();

		System.out.println(person1);
		System.out.println(person2);
		
	}
}
