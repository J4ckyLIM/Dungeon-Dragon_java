

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        private static Scanner scan = new Scanner(System.in);
        private static ArrayList<Character> characterList = new ArrayList<>();
        private static ArrayList<Monster> monsterList = new ArrayList<>();
        Monster monster = new Monster();
        do {
            //System.out.println("Pour commencer l'aventure vous avez besoin de 3 personnages.");
            //System.out.println("Entrez le nom de votre personnage:");
            String line = scan.nextLine();
            Character perso1 = new Character();
            perso1.setName(line);
            System.out.println(perso1.getName() + ", 3 rôles s'offrent à vous: DPS, TANK, Combattant");
            System.out.println("Veuillez écrire le rôle que vous avez choisi");
            String roleChoose = scan.nextLine();
            perso1.setClasse(roleChoose);
            switch (perso1.getClass()) {
                case "DPS":
                    perso1.setAgility(20);
                    break;

                case "Combattant":
                    perso1.setStrength(20);
                    break;

                case "TANK":
                    perso1.setHealth(300);
                    break;

                default:
                    System.out.println("Veuillez choisir un rôle parmis les 3 proposés.");
                    perso1.setClasse(roleChoose);
                    break;
            }
            System.out.println("Voici les caractéristiques de:" + perso1.getName());
            System.out.println("Rôle:" + perso1.getClass());
            System.out.println("Santé:" + perso1.getHealth());
            System.out.println("Force:" + perso1.getStrength());
            System.out.println("Agilité:" + perso1.getAgility());
            System.out.println("Niveau:" + perso1.getLevel());
            System.out.println("Expérience:" + perso1.getExperience());
            int taillePersonnageList = characterList.size();
            while (taillePersonnageList < 4);
        }
        public static void buildPlayer(){
            System.out.println("Pour commencer l'aventure vous avez besoin de 3 personnages.");
            System.out.println("Entrez le nom de votre personnage:");
            Character perso = new Character();
            String line;
            do {
                characterList.add()
                System.out.println("Veux-tu créer un nouveau personnage ? (Oui/Non");
                line = scan.nextLine();
                System.out.println(line);
            }while (!line.equals("Non"));
        }
        private static Character buildCharacter(Character perso){
            String line;
            System.out.println("Nom du personnage: ");
            line = scan.nextLine();
            perso.setName(line);
            System.out.println("Classe: ");
            perso.setClass(line);
            System.out.println("")
        }
    }
}

