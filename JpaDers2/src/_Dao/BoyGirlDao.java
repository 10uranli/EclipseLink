package _Dao;

import javax.persistence.EntityManager;

import _Model.Boy;
import _Model.Girl;

public interface BoyGirlDao {
	public Girl createGirl(String name);
	public Boy createBoy(String name);
	public EntityManager getEntityManager();
}
