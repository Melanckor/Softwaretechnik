import java.util.ArrayList;

public class TeamComposite implements OlymipicsTeams 
{public ArrayList<OlymipicsTeams> childTeams;
public String name;

public TeamComposite( String Name) {
	childTeams = new  ArrayList<OlymipicsTeams>();
	
	this.name= Name;
	// TODO Auto-generated constructor stub
}

	@Override
	public void printTeamInfo() {
		System.out.println(name+": ");
		for(OlymipicsTeams t : childTeams) {
			
            t.printTeamInfo();
			
		}
		
	}
	public void addTeam(OlymipicsTeams t) {
		childTeams.add(t);
		
	}
}
