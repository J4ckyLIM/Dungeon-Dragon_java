

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le nom de votre personnage:");
        String line = scan.nextLine();
        Personnage perso1 = new Personnage();
        perso1.setName(line);
        System.out.println(perso1.getName()+ ", 3 rôles s'offrent à vous: DPS, TANK, Combattant");
        System.out.println("Veuillez écrire le rôle que vous avez choisi");
        String rolechoose = scan.nextLine();
        perso1.setRole(rolechoose);
        switch (perso1.getRole()){
            case "DPS": perso1.setAgility(20);
            break;

            case "Combattant": perso1.setStrength(20);
            break;

            case "TANK": perso1.setHealth(300);
            break;

            default: System.out.println("Veuillez choisir un rôle parmis les 3 proposés.");
           }
        System.out.println("Voici les caractéristiques de:"+ perso1.getName());
        System.out.println("Rôle:"+ perso1.getRole());
        System.out.println("Santé:"+ perso1.getHealth());
        System.out.println("Force:"+ perso1.getStrength());
        System.out.println("Agilité:"+ perso1.getAgility());
        System.out.println("Niveau:"+ perso1.getLevel());
        System.out.println("Expérience:"+ perso1.getExperience());
    }
}

