package olympicGames2024;

public class OlympicsTeams implements Visitor {

	private String name = "Olypmpics Teams";
	private int NumberOfAthlethes;
	private int NumberOfGoldMedals;
	EuropeTeam europeTeam;
	AsiaTeams asiaTeam;

	public OlympicsTeams() {
		europeTeam = new EuropeTeam();
		asiaTeam = new AsiaTeams();
	}

// prints out Name of the Teams and Number
//	of Athletes of Germany Men’s Team
	public void AthlethesGermanyMensTeam(OlympicsTeams o) {
		System.out.println(o.europeTeam.germanyTeam.germanyMensTeam.getName());
		System.out.println("Team : Mens Football, Number of Athlethes: "
				+ o.europeTeam.germanyTeam.germanyMensTeam.football.getNumberOfAthlethes());
		System.out.println("Team : Mens TableTennis, Number of Athlethes: "
				+ o.europeTeam.germanyTeam.germanyMensTeam.tableTennis.getNumberOfAthlethes());

	}

	// Name of the Teams and Number
	// of Gold Medals of Germany
	public void GoldMedalsGermany(OlympicsTeams o) {
		System.out.println(o.europeTeam.germanyTeam.getName());
		System.out.println("Team : Mens Football, Number of Gold Medals: "
				+ o.europeTeam.germanyTeam.germanyMensTeam.football.getNumberOfGoldMedals());
		System.out.println("Team : Mens TableTennis, Number of Gold Medals: "
				+ o.europeTeam.germanyTeam.germanyMensTeam.tableTennis.getNumberOfGoldMedals());
		System.out.println("Team : Womens Cycling, Number of Gold Medals: "
				+ o.europeTeam.germanyTeam.germanyWomensTeam.cycling.getNumberOfGoldMedals());
		System.out.println("Team : Womens Tennis, Number of Gold Medals: "
				+ o.europeTeam.germanyTeam.germanyWomensTeam.tennis.getNumberOfGoldMedals());

	}

	// prints Name of the Teams and Number
	// of Gold Medals of Asia’s Team

	public void GoldMedalsAsia(OlympicsTeams o) {

		System.out.println(o.asiaTeam.getName());
		System.out.println("Team : China Mens Shooting, Number of Gold Medals "
				+ o.asiaTeam.c.mensTeam.shooting.getNumberOfGoldMedals());
		System.out.println("Team: China Womens ArtisticGymnastics, Number of Gold Medals  "
				+ o.asiaTeam.c.womensTeam.artisticGymnastics.getNumberOfGoldMedals());
		System.out.println("Team: China Womens Taekwondo, Number of Gold Medals  "
				+ o.asiaTeam.c.womensTeam.taekwondo.getNumberOfGoldMedals());
		System.out.println("Team: China Womens WaterPolo, Number of Gold Medals  "
				+ o.asiaTeam.c.womensTeam.waterpolo.getNumberOfGoldMedals());

	}
	// prints Name and Number
	// of athletes of teams in the Olympic 2024!

	public void NumberOfAthletesOlympics2024(OlympicsTeams o) {
		System.out.println(o.getName());
		System.out.println(o.asiaTeam.getName() + "\n" + o.asiaTeam.c.getName());
		System.out.println("Team: China Mens Shooting, Number of Atheletes: "
				+ o.asiaTeam.c.mensTeam.shooting.getNumberOfAthlethes());
		System.out.println("Team: China Womens ArtisticGymanstics, Number of Atheletes:"
				+ o.asiaTeam.c.womensTeam.artisticGymnastics.getNumberOfAthlethes());
		System.out.println("Team: China Womens Taekwondo, Number of Atheletes: "
				+ o.asiaTeam.c.womensTeam.taekwondo.getNumberOfAthlethes());
		System.out.println("Team: China Womens Waterpolo, Number of Atheletes: "
				+ o.asiaTeam.c.womensTeam.waterpolo.getNumberOfAthlethes());
		System.out.println(o.europeTeam.getName() + "\n" + o.europeTeam.germanyTeam.getName());
		System.out.println("Team: Germany Mens Football, Number of Atheletes: "
				+ o.europeTeam.germanyTeam.germanyMensTeam.football.getNumberOfAthlethes());
		System.out.println("Team: Germany Mens TableTennis, Number of Atheletes: "
				+ o.europeTeam.germanyTeam.germanyMensTeam.tableTennis.getNumberOfAthlethes());
		System.out.println("Team: Germany Womens Cycling, , Number of Atheletes: "
				+ o.europeTeam.germanyTeam.germanyWomensTeam.cycling.getNumberOfAthlethes());
		System.out.println("Team Germany Womens Tennis, Number of Atheletes: "
				+ o.europeTeam.germanyTeam.germanyWomensTeam.tennis.getNumberOfAthlethes());
	}

	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		EuropeTeam e = new EuropeTeam();
		AsiaTeams a = new AsiaTeams();
		OlympicsTeams o = new OlympicsTeams();

		o.AthlethesGermanyMensTeam(o);
		o.GoldMedalsGermany(o);
		o.GoldMedalsAsia(o);
		o.NumberOfAthletesOlympics2024(o);

	}

}
