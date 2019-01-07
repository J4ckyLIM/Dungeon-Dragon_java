public class Personnage {
    private String name = "Boubou";
    private String role = "Tank";
    private int level = 1;
    private int strength = 1;
    private int agility = 1;
    private int health = 100;
    private Integer experience = 0;
    private String skill = "Coup d'boule";

/*public Personnage (int level, int strength, int agility, int health, String skill){
    this.level = 20;
    this.strength = 50;
    this.agility = 20;
    this.health = 200;
    this.skill = "Coup d'Bambou";
}**/
    public void setRole(String newRole){
        role = newRole;
    }
    public String getRole(){
        return role;
    }
    public int getLevel() {
        return level;
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


