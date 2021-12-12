
public class Team implements OlymipicsTeams {
private String name;
private int athletes;					
private int gold;		

	public Team( String Name,int Athletes,int Gold) {
		this.athletes = Athletes;
		this.gold = Gold;
		this.name= Name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printTeamInfo() {
		System.out.println(name + ",Number of Athletes : "+ athletes + " , Number of Gold Medals : " +gold);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAthletes() {
		return athletes;
	}

	public void setAthletes(int athletes) {
		this.athletes = athletes;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

}
