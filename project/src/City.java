public class City {
    private String name;
    private int population;
    private int developmentLevel;
    private String planet;

    public City(String name ,int population, int developmentLevel, String planet) {
        this.name = name;
        this.population = population;
        this.developmentLevel = developmentLevel;
        this.planet = planet;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getDevelopmentLevel() {
        return this.developmentLevel;
    }

    public void setDevelopmentLevel(int developmentLevel) {
        this.developmentLevel = developmentLevel;
    }

    public String getPlanet() {
        return this.planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

}
