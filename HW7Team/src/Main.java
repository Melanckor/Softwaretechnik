
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TeamComposite Africa = new TeamComposite("Africa");
		TeamComposite Europe = new TeamComposite("Europe");
		TeamComposite SouthAmerica = new TeamComposite("SouthAmerica");
		TeamComposite Asia = new TeamComposite("Asia");
		TeamComposite China = new TeamComposite("China");
		TeamComposite Afghanistan = new TeamComposite("Afghanistan");
		TeamComposite Germany = new TeamComposite("Africa");
		TeamComposite Italy = new TeamComposite("Africa");
		TeamComposite ChinaWomen = new TeamComposite("ChinaWomen");
		TeamComposite ChinaMen = new TeamComposite("ChinaMen");
		Team Shooting	 = new Team("Shooting",4,2);
		Team Teakwondo	 = new Team("Teakwondo",15,3);
		Team Waterpolo = new Team("Waterpolo",7,2);
		Team artGym = new Team("artGym",11,2);
		TeamComposite GermanyMen = new TeamComposite("GermanyMen");
		TeamComposite GermanyWomen = new TeamComposite("GermanyWomen");
		TeamComposite ItalyMen = new TeamComposite("ItalyMen");
		TeamComposite ItalyWomen = new TeamComposite("ItalyWomen");
		Team Cycling = new Team("Cycling",15,3);
		Team Tennis = new Team("Tennis",19,6);
		Team TableTennis = new Team("TableTennis",5,1);
		Team FootbalGer = new Team("FootbalGer",7,2);
		Team AlpineSky = new Team("AlpineSky",25,4);
		Team FootbalIt = new Team("FootbalIt",11,4);
		Team SwimmingTeam = new Team("SwimmingTeam ",12,5);
	
		Asia.addTeam(China);Asia.addTeam(Afghanistan);China.addTeam(ChinaWomen);China.addTeam(ChinaMen);ChinaMen.addTeam(Shooting);
		ChinaWomen.addTeam(artGym);		ChinaWomen.addTeam(Teakwondo);		ChinaWomen.addTeam(Waterpolo );		
        Europe.addTeam(Germany);Europe.addTeam(Italy);
        Germany.addTeam(GermanyWomen);Germany.addTeam(GermanyMen);
        Italy.addTeam(ItalyWomen);Italy.addTeam(ItalyMen);
        GermanyWomen.addTeam(Cycling);        GermanyWomen.addTeam(Tennis);
        GermanyMen.addTeam(TableTennis);GermanyMen.addTeam(FootbalGer);
        ItalyWomen.addTeam(AlpineSky);ItalyMen.addTeam(SwimmingTeam);ItalyMen.addTeam(FootbalIt);
        TeamComposite all = new TeamComposite("All Teams");
        all.addTeam(Asia);all.addTeam(Europe);all.addTeam(SouthAmerica);all.addTeam(Africa);

//a
	GermanyMen.printTeamInfo();	
	System.out.println("---------------------------------------------------------------------");
//b	
	Germany.printTeamInfo();
	System.out.println("---------------------------------------------------------------------");

//c	
	Asia.printTeamInfo();
	System.out.println("---------------------------------------------------------------------");

//d		
	all.printTeamInfo();	
		
		
		
		/*
		Team Africa = new Team("Africa",12,4);
		Team Africa = new Team("Africa",12,4);
		Team Africa = new Team("Africa",12,4);
		Team Africa = new Team("Africa",12,4);
		Team Africa = new Team("Africa",12,4);
		Team Africa = new Team("Africa",12,4);
		Team Africa = new Team("Africa",12,4);
		Team Africa = new Team("Africa",12,4);
		*/
		
		
		
		
	}

}
