package _Test;

import javax.persistence.EntityTransaction;

import _Dao.PersonTeamDao;
import _Dao.PersonTeamImpl;
import _Model.PersonInfo;
import _Model.TeamInfo;

public class Test {

	public static void main(String[] args) {
		PersonTeamDao service = new PersonTeamImpl();

		PersonInfo person1 = service.createPerson("Onur");
		PersonInfo person2 = service.createPerson("Onur2");
		PersonInfo person3 = service.createPerson("Ömer");
		PersonInfo person4 = service.createPerson("Ahmet");

		TeamInfo team1 = service.createTeam("Galatasaray");
		TeamInfo team2 = service.createTeam("Fenerbahçe");
		TeamInfo team3 = service.createTeam("Beþiktaþ");

		EntityTransaction et = service.getEntityManager().getTransaction();

		et.begin();
		person1.setTeamInfo(team1);
		person2.setTeamInfo(team1);
		person3.setTeamInfo(team2);
		person4.setTeamInfo(team3);
		et.commit();
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);

	}

}
