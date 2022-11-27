package olympicGames2024;

public class ChinaTeam {

	private String name = "China Team";
	private int NumberOfAthlethes;
	private int NumberOfGoldMedals;
	ChinaMensTeam mensTeam;
	ChinaWomensTeam womensTeam;

	public ChinaTeam() {

		this.mensTeam = new ChinaMensTeam();
		this.womensTeam = new ChinaWomensTeam();

	}

	public String getName() {
		return this.name;

	}
  
}
