package _Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import _Model.PersonInfo;
import _Model.TeamInfo;

public class PersonTeamImpl implements PersonTeamDao {
	 EntityManagerFactory entityManagerFactory;
	 EntityManager entityManager;
	 EntityTransaction entityTransaction;

	public PersonTeamImpl() {
		entityManagerFactory = Persistence.createEntityManagerFactory("Relation");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	@Override
	public PersonInfo createPerson(String name) {
		PersonInfo personInfo = new PersonInfo(name);
		entityTransaction.begin();
		entityManager.persist(personInfo);
		entityTransaction.commit();
		return personInfo;
	}

	@Override
	public TeamInfo createTeam(String teamName) {
		TeamInfo teamInfo = new TeamInfo(teamName);
		entityTransaction.begin();
		entityManager.persist(teamInfo);
		entityTransaction.commit();
		return teamInfo;
	}
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	
	

}
