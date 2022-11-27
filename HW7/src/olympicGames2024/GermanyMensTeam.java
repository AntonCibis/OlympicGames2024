package olympicGames2024;

public class GermanyMensTeam {

	private String name = "Germany Mens";
	private int NumberOfAthlethes;
	private int NumberOfGoldMedals;
	TableTennis tableTennis;
	Football football;

	public GermanyMensTeam() {
		this.football = new Football(18, 0);
		this.tableTennis = new TableTennis(5, 0);

	}

	public String getName() {
		return this.name;

	}

	public int getNumberOfAthlethes() {
		return this.NumberOfAthlethes;
	}

}

