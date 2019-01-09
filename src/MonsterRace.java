public enum MonsterRace {
    LOUP("Loup","Chien méchant"),
    BICHE("Orque","Au bon lait de brebiche"),
    CERF("Elfe", "Chopper en plus grand"),
    ENDERMAN("Asura", "Bonhomme noirs qui se téléporte"),
    COCHON("Charr", "Passent au dessus des murs"),
    ZOMBIE("Sylvari", "Mort-vivants cannibal"),
    POLO92I("Polo", "Polo le duc"),
    POKEMON("Globlin", "Petits monstres ou pas");

    private String race;

    private String des;

    MonsterRace(String race, String des) {
        this.race = race;
        this.des = des;
    }

    public String getRace(){
        return this.race;
    }
}
