package olympicGames2024;

public class GermanyTeam {

	private String name = "Germany Team";
	private int NumberOfAthlethes;
	private int NumberOfGoldMedals;
	GermanyMensTeam germanyMensTeam;
	GermanyWomensTeam germanyWomensTeam;

	public GermanyTeam() {
		this.germanyWomensTeam = new GermanyWomensTeam();
		this.germanyMensTeam = new GermanyMensTeam();
	}

	public String getName() {
		return this.name;
	}

}
