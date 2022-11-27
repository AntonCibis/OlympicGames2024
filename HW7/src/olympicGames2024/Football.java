package olympicGames2024;

public class Football {
	
	private String name ="Football";
	private int NumberOfAthlethes;
	private int NumberOfGoldMedals;

	public Football(int NumberOfAthlethes, int NumberOfGoldMedals) {
		this.NumberOfAthlethes = NumberOfAthlethes;
		this.NumberOfGoldMedals = NumberOfGoldMedals;

	}

	public String getName() {
		return this.name;

	}

	public int getNumberOfAthlethes() {
		return this.NumberOfAthlethes;
	}

	public int getNumberOfGoldMedals() {
		return this.NumberOfGoldMedals;
	}
}
