import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class DnDCharacter {
    private String name;
    private String classe;
    private int level = 1;
    private int health = 100;
    private Integer experience = 0;
    private HashMap<Caracteristic, Integer> caracteristics = new HashMap<>();
    private List<Item> bag;

    public DnDCharacter() {
        this.bag = new ArrayList<>();
    }
    }

    public DnDCharacter(String name, String description, int xp) {
        this.name = name;
        this.classe = description;
        this.experience = xp;
        this.bag = new ArrayList<>();
    }

    public void setCaracteristic(Caracteristic carac, Integer valeur) {
        this.caracteristics.put(carac, valeur);
    }

    public Integer getCaracteristic(Caracteristic carac) {
        return this.caracteristics.get(carac);
    }

    public void addItem(Item item) {
        this.bag.add(item);
    }

    public List<Item> getBag() {
        return bag;
    }

    public void setBag(List<Item> bag) {
        this.bag = bag;
    }

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

    public void setExperience(int newExperience){
        experience = newExperience;
    }

    public void setGainExperience(int xp){
        experience += xp;
    }

    public String toString() {
        String result = this.name + ", level : " + this.level + "\n";
        result += "XP : " + this.experience + ", HP : " + this.health + "\n";
        for(Caracteristic key : caracteristics.keySet()) {
            result += key.getName() + " : " + caracteristics.get(key) + "\n";
        }
        return result;
    }

    public int compareTo(DnDCharacter obj) {
        if(obj.getName().compareTo(this.getName()) > 0) {
            return -1;
        } else {
            return 1;
        }
    }
}


