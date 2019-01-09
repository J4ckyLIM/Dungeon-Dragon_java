import java.util.HashMap;

public class Character {
    private String name;
    private String classe;
    private int level = 1;
    private int strength = 1;
    private int agility = 1;
    private int health = 100;
    private Integer experience = 0;
    private HashMap<String, Integer> carac = new HashMap<>();

/*public Personnage (int level, int strength, int agility, int health, String skill){
    this.level = 20;
    this.strength = 50;
    this.agility = 20;
    this.health = 200;
    this.skill = "Coup d'Bambou";
}**/
    public void setClasse(String newClasse){
        classe = newClasse;
    }
    public String getClasse(){
        return classe;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int newLevel){
        level = newLevel;
    }

    public void setHealth(int newHealth) {
        health = newHealth;
    }
    public int getHealth(){
        return health;
    }
    public int getStrength(){
        return strength;
    }
    public void setStrength(int ForFighter){
        strength = ForFighter;
    }
    public int getAgility(){
        return agility;
    }
    public void setAgility(int ForDps){
        agility = ForDps;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
    public int getLength() {
        return name.length();
    }
    public Integer getExperience(){
        return experience;
    }
    public void setGainExperience(int xp){
        experience += xp;
    }
}


