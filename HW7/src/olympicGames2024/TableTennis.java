package olympicGames2024;

public class TableTennis {

	private String name = "Table Tennis";
	private int NumberOfAthlethes;
	private int NumberOfGoldMedals;

	public TableTennis(int NumberOfAthlethes, int NumberOfGoldMedals) {
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
