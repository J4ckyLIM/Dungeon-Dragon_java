public enum PlayerRace {

    HUMAIN("Humain","Race de merde"),
    ORQUE("Orque","Pur kikoo"),
    ELFE("Elfe", "Pur kikoo avec grandes oreilles"),
    ASURA("Asura", "Petits bonhomme blanc, race de mage"),
    CHARR("Charr", "Ceux qui aiment les combattants kikoo"),
    SYLVARI("Sylvari", "Sagesse legendaire, race pour Etres nobles"),
    POLOKAARIS("Polo", "Polo TCHOIN"),
    GOBLIN("Globlin", "Petits monstres verts voleurs sur Clash of Clan");

    private String race;
    private String des;

    PlayerRace(String race, String des) {
        this.race = race;
        this.des = des;
    }

    public String getRace(){
        return this.race;
    }

    public String getDes(){
        return this.des;
    }
}
