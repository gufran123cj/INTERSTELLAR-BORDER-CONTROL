public class Argonian extends Alien {
    //Creatures that can live both on land and in water,lizard-like creatures, other than that they don't have much
    private boolean canSpeak;   
    Argonian(String name, int height, int intelligence, int strength, int weight,int reputation, City hometown, int age, String criminalRecord, boolean accepted, 
    String bodyTemperature, String[] knownLanguages, String suitableAtmosphere, Ship ship, String gender, boolean canSpeak,String[] documents, int money,
    String moneyCurrency){
        super(name, height, reputation, intelligence, strength, weight, hometown, age, criminalRecord, accepted, bodyTemperature, knownLanguages, suitableAtmosphere,
         ship, gender,documents,money,moneyCurrency);
        this.canSpeak = canSpeak;
    }

    public boolean isCanSpeak() {
        return this.canSpeak;
    }

    public boolean getCanSpeak() {
        return this.canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
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
            "=> Can Speak: " + isCanSpeak() + "\n" +
            "=> Money: " + getMoney() + "\n";
    }

}
