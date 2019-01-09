package codingfactory.dndarena.utils;

import java.util.Random;

public class DiceRoller {

	public static int rollDice(int nbFaces, int nbDice) {
		int result = 0;
		for(int i = 0; i < nbDice; i++) {
			Random rand = new Random();
			result += (rand.nextInt(nbFaces) + 1);
		}
		return result;
	}
}
