package _Test;

import javax.persistence.EntityTransaction;

import _Dao.CarPersonImpl;
import _Model.Car;
import _Model.Person;

public class Test3 {
	public static void main(String[] args) {
		CarPersonImpl ýmpl = new CarPersonImpl();
		Person person1 = ýmpl.createPerson("Onur");
		Person person2 = ýmpl.createPerson("Ali");
		
		Car car1 = ýmpl.createCar("Audi");
		Car car2 = ýmpl.createCar("Bmw");
		
		EntityTransaction et = ýmpl.getEntityManager().getTransaction();
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
