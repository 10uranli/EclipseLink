package _Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import _Model.Boy;
import _Model.Girl;

public class BoyGirlImpl implements BoyGirlDao {
	private EntityManagerFactory ef;
	private EntityManager em;
	private EntityTransaction et;

	public BoyGirlImpl() {
		ef = Persistence.createEntityManagerFactory("Relation");
		em = ef.createEntityManager();
		et = em.getTransaction();
	}

	@Override
	public Girl createGirl(String name) {
		Girl girl = new Girl(name);
		et.begin();
		em.persist(girl);
		et.commit();
		return girl;

	}

	@Override
	public Boy createBoy(String name) {
		Boy boy = new Boy(name);
		et.begin();
		em.persist(boy);
		et.commit();
		return boy;
	}

	@Override
	public EntityManager getEntityManager() {
		return em;
	}

}
