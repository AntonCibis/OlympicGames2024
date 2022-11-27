package olympicGames2024;

public class Taekwondo {
	private String name = "Taekwondo";
	private int NumberOfAthlethes;
	private int NumberOfGoldMedals;

	public Taekwondo(int NumberOfAthlethes, int NumberOfGoldMedals) {
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