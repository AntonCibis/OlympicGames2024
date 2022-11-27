package olympicGames2024;

public class GermanyWomensTeam {

	private String name = "Germany Womens";
	private int NumberOfAthlethes;
	private int NumberOfGoldMedals;
	Tennis tennis;
	Cycling cycling;

	public GermanyWomensTeam() {
		this.tennis = new Tennis(3, 1);
		this.cycling = new Cycling(8, 3);
	}

	public void printNumberOfGoldMedal() {

	}

}
