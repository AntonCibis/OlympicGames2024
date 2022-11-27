package olympicGames2024;

public class ChinaWomensTeam {

	private String name = "China Womens";
	private int NumberOfAthlethes;
	private int NumberOfGoldMedals;
	WaterPolo waterpolo;
	Taekwondo taekwondo;
	ArtisticGymnastics artisticGymnastics;

	public ChinaWomensTeam() {
		this.waterpolo = new WaterPolo(11, 0);
		this.taekwondo = new Taekwondo(4, 1);
		this.artisticGymnastics = new ArtisticGymnastics(7, 3);
	}

	public void printNumberOfGoldMedal() {

	}

}
