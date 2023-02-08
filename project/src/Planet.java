public class Planet {
    private String population;
    private String race;
    private String name;
    private City[] cities;
    private String geography;
    private String climate;
    private String[] necessaryDocumentsForEntry;
    private int entryFee;
    private String currency;
    private String atmosphere;
    private int maxRadioactivity;
    private int maxCargo;
    private String[] bannedShips;
    private String[] bannedWeapons;
    private String[] bannedRaces;
    private String[] bannedCriminalRecord;
    private boolean hornsAreBanned;
    private int minIntelligence;

    public Planet(String population, String race,String name,City[] cities, String geography, String climate, String[] necessaryDocumentsForEntry, int entryFee, String currency, 
    String atmosphere, int maxRadioactivity, int maxCargo, String[] bannedShips, String[] bannedWeapons, String[] bannedRaces, String[] bannedCriminalRecord,boolean hornsAreBanned , int minIntelligence) {
        this.population = population;
        this.race = race;
        this.name=name;
        this.cities = cities;
        this.geography = geography;
        this.climate = climate;
        this.necessaryDocumentsForEntry = necessaryDocumentsForEntry;
        this.entryFee = entryFee;
        this.currency = currency;
        this.atmosphere = atmosphere;
        this.maxRadioactivity = maxRadioactivity;
        this.maxCargo = maxCargo;
        this.bannedShips = bannedShips;
        this.bannedWeapons = bannedWeapons;
        this.bannedRaces = bannedRaces;
        this.bannedCriminalRecord = bannedCriminalRecord;
        this.hornsAreBanned = hornsAreBanned;
        this.minIntelligence = minIntelligence;
    }
    public boolean areHornsAreBanned() {
        return hornsAreBanned;
    }
    public String getPopulation() {
        return this.population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City[] getCities() {
        return this.cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getGeography() {
        return this.geography;
    }

    public void setGeography(String geography) {
        this.geography = geography;
    }

    public String getClimate() {
        return this.climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String[] getNecessaryDocumentsForEntry() {
        return this.necessaryDocumentsForEntry;
    }

    public void setNecessaryDocumentsForEntry(String[] necessaryDocumentsForEntry) {
        this.necessaryDocumentsForEntry = necessaryDocumentsForEntry;
    }

    public int getEntryFee() {
        return this.entryFee;
    }

    public void setEntryFee(int entryFee) {
        this.entryFee = entryFee;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAtmosphere() {
        return this.atmosphere;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    public int getMaxRadioactivity() {
        return this.maxRadioactivity;
    }

    public void setMaxRadioactivity(int maxRadioactivity) {
        this.maxRadioactivity = maxRadioactivity;
    }

    public int getMaxCargo() {
        return this.maxCargo;
    }

    public void setMaxCargo(int maxCargo) {
        this.maxCargo = maxCargo;
    }

    public String[] getBannedShips() {
        return this.bannedShips;
    }

    public void setBannedShips(String[] bannedShips) {
        this.bannedShips = bannedShips;
    }

    public String[] getBannedWeapons() {
        return this.bannedWeapons;
    }

    public void setBannedWeapons(String[] bannedWeapons) {
        this.bannedWeapons = bannedWeapons;
    }

    public String[] getBannedRaces() {
        return this.bannedRaces;
    }

    public void setBannedRaces(String[] bannedRaces) {
        this.bannedRaces = bannedRaces;
    }

    public String[] getBannedCriminalRecord() {
        return this.bannedCriminalRecord;
    }

    public void setBannedCriminalRecord(String[] bannedCriminalRecord) {
        this.bannedCriminalRecord = bannedCriminalRecord;
    }

    public int getMinIntelligence() {
        return this.minIntelligence;
    }

    public void setMinIntelligence(int minIntelligence) {
        this.minIntelligence = minIntelligence;
    }
    public String arrayToString(String[] array){
        String mainString = "";
        for (String string : array) {
            if(string != null)mainString += string + " ";
        }
        return mainString;
    }
    public String[] cityArrayToStringArray(City[] cities){
        String[] stringArray = new String[cities.length];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = cities[i].getName();
        }
        return stringArray;
    }
    @Override
    public String toString() {
        return
            "=> Population: " + getPopulation() + "\n" +
            "=> Race: " + getRace() + "\n" +
            "=> Name: " + getName() + "\n" +
            "=> Cities: " + arrayToString(cityArrayToStringArray(getCities())) + "\n" +
            "=> Geography: " + getGeography() + "\n" +
            "=> Climate: " + getClimate() + "\n" +
            "=> Necessary Documents For Entry: " + arrayToString(getNecessaryDocumentsForEntry()) + "\n" +
            "=> Entry Fee: " + getEntryFee() + "\n" +
            "=> Currency: " + getCurrency() + "\n" +
            "=> Atmosphere: " + getAtmosphere() + "\n" +
            "=> Max Radioactivity: " + getMaxRadioactivity() + "\n" +
            "=> Max Cargo: " + getMaxCargo() + "\n" +
            "=> Banned Ships: " + arrayToString(getBannedShips()) + "\n" +
            "=> Banned Weapons: " + arrayToString(getBannedWeapons()) + "\n" +
            "=> Banned Races: " + arrayToString(getBannedRaces()) + "\n" +
            "=> Banned Criminal Record: " + arrayToString(getBannedCriminalRecord()) + "\n" +
            "=> Horns Are Banned: " + areHornsAreBanned() + "\n" +
            "=> Minimum Intelligence Required to Enter: " + getMinIntelligence() + "\n" ;
    }
    
}
