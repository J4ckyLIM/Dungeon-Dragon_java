package

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Arena{

    private static final String MESSAGE_ACCEUIL = "Bienvenue dans Dungeon & Dragon";
    private static  Scanner scan = new Scanner (System.in);
    private static ArrayList<Character> players = new ArrayList<>();
    private static ArrayList<Monster> monsters = new ArrayList<>();
    public static void main(String []args ){
        afficherMessageAccueil();
        creerPersonnage();
        creerMonstres();
        resumerEquipes();
    }
    public static void afficherMessageAccueil(){
         System.out.println(MESSAGE_ACCEUIL);
    }
    public static void creerPersonnage(){
        String reponse;
        System.out.println("Créer un nouveau personnage");
        do {
            // Nouveau Character
            Character character = new Character();

            // Remplir les champs
            System.out.println("Nom: ");
            character.setName(scan.nextLine());
            System.out.println("Classe: ");
            character.setClasse(scan.nextLine());
            System.out.println("Niveau: ");
            character.setLevel(scan.nextInt());
            System.out.println("Force: ");
            character.setStrength(scan.nextInt());
            System.out.println("Agilité: ");
            character.setAgility(scan.nextInt());
            System.out.println("HP: ");
            character.setHealth(scan.nextInt());
            //Ajouter à la liste
            players.add(character);
            System.out.println("Créer un nouveau personnage ? (Y/N)" );
            reponse = scan.nextLine();
        }while (reponse.equals('Y'));
        //Nouveau personnage
    }
    private static void creerMonstres(){
        String reponse;
        System.out.println("Créer un nouveau monstre");
        do{
            // Nouveau monstre
            Monster monster = new Monster();

            // Ajouter à la liste
            monsters.add(monster);
            System.out.println("Créer un nouveau monstre? (Y/N)");
            reponse = scan.nextLine();
        }while (reponse.equals('Y'));
    }
}
