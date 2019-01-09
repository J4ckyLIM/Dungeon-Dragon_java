import java.util.ArrayList;
import java.util.Scanner;

public class DnDArenaInitializer {

	private static final String MESSAGE_ACCUEIL = "Bienvenue dans Donjons & Dragons";

	private static Scanner scan = new Scanner(System.in);

	private static ArrayList<DnDCharacter> monsters = new ArrayList<>();

	public static void main(String[] args) {
		afficherMessageAccueil();
		creerPersonnages();
		creerMonstres();
		resumerEquipes();
	}

	private static void resumerEquipes() {
		System.out.println("Voici les équipes : \n");
		afficherListe(DnDCharacterManager.getPlayers(), "Héros");
		System.out.println("\n");
		afficherListe(monsters, "Monstres");
	}

	private static void afficherListe(ArrayList<DnDCharacter> team, String nomTeam) {
		System.out.println(nomTeam + " : ");
		for(DnDCharacter charac : team) {
			System.out.println(charac.toString());
		}
	}

	private static void afficherMessageAccueil() {
		System.out.println(MESSAGE_ACCUEIL);
	}

	private static void creerPersonnages() {
		String reponse;
		System.out.println("Créer un nouveau personnage");
		do {
			// Ajouter à la liste
			DnDCharacterManager.getPlayers().add(creerCharacter());

			System.out.println("Créer un nouveau personnage ? [y/n]");
			reponse = scan.nextLine();
		} while(reponse.equals("y"));
	}

	private static void creerMonstres() {
		String reponse;
		System.out.println("Créer un nouveau monstre");
		do {
			// Ajouter à la liste + ajout de monstre  de race aléatoire
			monsters.add(creerCharacter());
			int selectRace = (int)Math.floor(Math.random()*9);
			MonsterRace.values()[selectRace];

			System.out.println("Créer un nouveau monstre ? [y/n]");
			reponse = scan.nextLine();
		} while(reponse.equals("y"));
	}

	private static DnDCharacter creerCharacter() {
		// Nouveau DnDCharacter
		DnDCharacter character = new DnDCharacter();

		// Remplir les champs
		System.out.print("Nom : ");
		character.setName(scan.nextLine());
		System.out.print("Classe : ");
		character.setClasse(scan.nextLine());
		System.out.print("XP : ");
		character.setExperience(Integer.parseInt(scan.nextLine()));
		System.out.print("HP : ");
		character.setHealth(Integer.parseInt(scan.nextLine()));

		character.setCaracteristic(Caracteristic.FORCE, DiceRoller.rollDice(20, 2));
		character.setCaracteristic(Caracteristic.DEXTERITY, DiceRoller.rollDice(20, 2));
		character.setCaracteristic(Caracteristic.WISDOM, DiceRoller.rollDice(20, 2));

		character.getCaracteristic(Caracteristic.FORCE);



		return character;
	}
}
