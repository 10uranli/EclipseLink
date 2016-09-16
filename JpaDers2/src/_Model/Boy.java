package _Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Boy {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String name;
	@OneToOne
	@JoinColumn(name = "girl_ID", unique =  true)
	private Girl girl;

	public Boy() {
		// TODO Auto-generated constructor stub
	}
	public Boy(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Girl getGirl() {
		return girl;
	}
	public void setGirl(Girl girl) {
		this.girl = girl;
	}
	@Override
	public String toString() {
		return "Boy [id=" + id + ", name=" + name + ", girl=" + girl + "]";
	}
	
}
