package _Test;

import javax.persistence.EntityTransaction;
import javax.persistence.JoinColumn;

import _Dao.BoyGirlImpl;
import _Model.Boy;
import _Model.Girl;

public class Test2 {
	public static void main(String[] args) {
			BoyGirlImpl impl = new BoyGirlImpl();
			Boy boy1 = impl.createBoy("Onur");
			Boy boy2 = impl.createBoy("Ali");
			
			Girl girl1 = impl.createGirl("Ayþe");
			Girl girl2 = impl.createGirl("Merve");
			
			EntityTransaction et = impl.getEntityManager().getTransaction();
			
//			et.begin(); 1
//			boy1.setGirl(girl2); @JoinColumn(name = "girl_ID", unique =  true) dan dolayý hata verir.Olmazsa hata vermez eclipselinkte
//			boy2.setGirl(girl2);
//			et.commit();
//			22222
//			et.begin();
//		
//			girl1.setBoy(boy1);
//			girl2.setBoy(boy2);
//			boy1.setGirl(girl1);
//			boy2.setGirl(girl2);
//			et.commit();
//			
			et.begin(); 
			boy1.setGirl(girl1);
			boy2.setGirl(girl2);
			girl1.setBoy(boy1);
			girl2.setBoy(boy2);
			et.commit();
			
			System.out.println(boy1);
			System.out.println(boy2);
			
	}
}
