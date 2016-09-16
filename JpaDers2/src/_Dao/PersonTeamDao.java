package _Dao;

import javax.persistence.EntityManager;

import _Model.PersonInfo;
import _Model.TeamInfo;

public interface PersonTeamDao {

	public PersonInfo createPerson(String name);
	public TeamInfo createTeam(String teamName);
	public EntityManager getEntityManager();
	
	
}
