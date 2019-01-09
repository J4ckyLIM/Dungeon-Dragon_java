package codingfactory.dndarena.characters;

public enum Caracteristic {

	FORCE("name"),
	DEXTERITY("Dexterity"),
	CONSTITUTION("Constitution"),
	INTELLIGENCE("Intelligence"),
	WISDOM("Wisdom"),
	CHARISMA("Charisma"),
	SKILL("Skill");

	private String name;

	Caracteristic(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
