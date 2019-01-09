import java.util.Random;

public class DnDMonsterManager {
    public static DnDMonster generateMonster(){
        DnDMonster monstre = new DnDMonster();
        Random rand = new Random();
        MonsterRace race = MonsterRace.values(){rand.nextInt(MonsterRace.values().length)};
    }
}
