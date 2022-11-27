package olympicGames2024;

public class EuropeTeam {

	private String name = "Europe Team";
	private int NumberOfAthlethes;
	private int NumberOfGoldMedals;
	GermanyTeam germanyTeam;

	public EuropeTeam() {
		this.germanyTeam = new GermanyTeam();
	}

	public String getName() {
		return this.name;

	}

}
