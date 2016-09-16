package _Model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PersonInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "Team_Id")//foreign key isimlendir
	private TeamInfo teamInfo;

	public PersonInfo() {
		super();
	}
	
	public PersonInfo(String name) {
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

	public TeamInfo getTeamInfo() {
		return teamInfo;
	}

	public void setTeamInfo(TeamInfo teamInfo) {
		this.teamInfo = teamInfo;
	}

	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", name=" + name + ", teamInfo=" + teamInfo + "]";
	}
	
}
