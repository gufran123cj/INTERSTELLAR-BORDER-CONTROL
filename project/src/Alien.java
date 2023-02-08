public class Alien {
    private String name;
    private int height;
    private int reputation;
    private int intelligence;
    private int strength;
    private int weight;
    private City hometown;
    private int age;
    private String criminalRecord;
    private boolean accepted;
    private String bodyTemperature;
    private String[] knownLanguages;
    private String suitableAtmosphere;
    private Ship ship;
    private String gender;
    private String[] documents;
    private int money;
    private String moneyCurrency;
    public Alien(){
        
    }
    public Alien(String name, int height,    int reputation, int intelligence, int strength, int weight, City hometown, int age, 
    String criminalRecord, boolean accepted, String bodyTemperature, String[] knownLanguages, String suitableAtmosphere, Ship ship, String gender,String[] documents, int money
    ,String moneyCurrency) {
        this.name = name;
        this.height = height;
        this.reputation=reputation;
        this.intelligence = intelligence;
        this.strength = strength;
        this.weight = weight;
        this.hometown = hometown;
        this.age = age;
        this.criminalRecord = criminalRecord;
        this.accepted = accepted;
        this.bodyTemperature = bodyTemperature;
        this.knownLanguages = knownLanguages;
        this.suitableAtmosphere = suitableAtmosphere;
        this.ship = ship;
        this.gender = gender;
        this.documents = documents;
        this.money = money;
        this.moneyCurrency = moneyCurrency;
    }
    public void setMoneyCurrency(String moneyCurrency) {
        this.moneyCurrency = moneyCurrency;
    }
    public String getMoneyCurrency() {
        return moneyCurrency;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
    public String[] getDocuments() {
        return documents;
    }
    public void setDocuments(String[] documents) {
        this.documents = documents;
    }
    public int getReputation() {
        return this.reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public City getHometown() {
        return this.hometown;
    }

    public void setHometown(City hometown) {
        this.hometown = hometown;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCriminalRecord() {
        return this.criminalRecord;
    }

    public void setCriminalRecord(String criminalRecord) {
        this.criminalRecord = criminalRecord;
    }

    public boolean isAccepted() {
        return this.accepted;
    }

    public boolean getAccepted() {
        return this.accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public String getBodyTemperature() {
        return this.bodyTemperature;
    }

    public void setBodyTemperature(String bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public String[] getKnownLanguages() {
        return this.knownLanguages;
    }

    public void setKnownLanguages(String[] knownLanguages) {
        this.knownLanguages = knownLanguages;
    }

    public String getSuitableAtmosphere() {
        return this.suitableAtmosphere;
    }

    public void setSuitableAtmosphere(String suitableAtmosphere) {
        this.suitableAtmosphere = suitableAtmosphere;
    }

    public Ship getShip() {
        return this.ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", height='" + getHeight() + "'" +
            ", reputation='" + getReputation() + "'" +
            ", intelligence='" + getIntelligence() + "'" +
            ", strength='" + getStrength() + "'" +
            ", weight='" + getWeight() + "'" +
            ", hometown='" + getHometown().getName() + "'" +
            ", age='" + getAge() + "'" +
            ", criminalRecord='" + getCriminalRecord() + "'" +
            ", accepted='" + isAccepted() + "'" +
            ", bodyTemperature='" + getBodyTemperature() + "'" +
            ", knownLanguages='" + getKnownLanguages() + "'" +
            ", suitableAtmosphere='" + getSuitableAtmosphere() + "'" +
            ", ship='" + getShip() + "'" +
            ", gender='" + getGender() + "'" +
            ", documents='" + getDocuments() + "'" +
            ", money='" + getMoney() + "'" +
            ", moneyCurrency='" + getMoneyCurrency() + "'" +
            "}";
    }
    
    
}
