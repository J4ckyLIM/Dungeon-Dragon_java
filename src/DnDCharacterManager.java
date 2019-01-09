package codingfactory.dndarena.characters;

import java.util.ArrayList;

public class DnDCharacterManager {

	private static ArrayList<DndCharacter> players = new ArrayList<>();

	public static ArrayList<DndCharacter> getPlayers() {
		return  players;
	}
}
