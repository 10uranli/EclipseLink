package _Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TeamInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String teamName;
	public TeamInfo() {
		super();
	}

	public TeamInfo(String teamName) {
		super();
		this.teamName = teamName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
}

	@Override
	public String toString() {
		return "TeamInfo [id=" + id + ", teamName=" + teamName + "]";
	}
	

}
