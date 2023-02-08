public class Gagot extends Alien{
    //Gagots are intelligent but weak, they have long lengths and they live long, some gagots can breath air some can't the ones who cant breath air is dumber
    private boolean hasHorn;
    private boolean canBreathAir;
    public Gagot(boolean canBreathAir, boolean hasHorn, String name, int height, int intelligence,int reputation, int strength, int weight, City hometown,
     int age, String criminalRecord, boolean accepted,  String bodyTemperature, String[] knownLanguages, String suitableAtmosphere, Ship ship, String gender,String[] documents,
     int money,String moneyCurrency) {
        super(name, height, reputation, intelligence, strength, weight, hometown, age, criminalRecord, accepted, bodyTemperature, 
        knownLanguages, suitableAtmosphere, ship, gender,documents,money,moneyCurrency);
        this.hasHorn = hasHorn;
        this.canBreathAir = canBreathAir;
    }

    public boolean hasHorn() {
        return this.hasHorn;
    }

    public boolean getHasHorn() {
        return this.hasHorn;
    }

    public void setHasHorn(boolean hasHorn) {
        this.hasHorn = hasHorn;
    }

    public boolean canBreathAir() {
        return this.canBreathAir;
    }
    public void setCanBreathAir(boolean canBreathAir) {
        this.canBreathAir = canBreathAir;
    }
    public String arrayToString(String[] array){
        String mainString = "";
        for (String string : array) {
            if(string != null)mainString += string + " ";
        }
        return mainString;
    }
    @Override
    public String toString() {
        return
            "=> Name: " + getName() + "\n" +
            "=> Race: " + this.getClass().getCanonicalName() + "\n" +
            "=> Height: " + getHeight() + "\n" +
            "=> Intelligence: " + getIntelligence() + "\n" +
            "=> Strength: " + getStrength() + "\n" +
            "=> Weight: " + getWeight() + "\n" +
            "=> Hometown: " + getHometown().getName() + "\n" +
            "=> Age: " + getAge() + "\n" +
            "=> Criminal Record: " + getCriminalRecord() + "\n" +
            "=> Body Temperature: " + getBodyTemperature() + "\n" +
            "=> Known Languages: " + arrayToString(getKnownLanguages()) + "\n" +
            "=> Documents: " + arrayToString(getDocuments()) + "\n" +
            "=> Suitable Atmosphere: " + getSuitableAtmosphere() + "\n" +
            "=> Ship: " + getShip().toString() + "\n" +
            "=> Gender: " + getGender() + "\n" +
            "=> Has Horn: " + hasHorn() + "\n" +
            "=> Can Breath Air: " + canBreathAir() + "\n" + 
            "=> Money: " + getMoney() + "\n";
    }
     
}
