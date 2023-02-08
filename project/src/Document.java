public class Document {
    private String name;
    private Planet[] approvedPlanets;//planets that you can enter with this document

    public Document(String name, Planet[] approvedPlanets) {
        this.name = name;
        this.approvedPlanets = approvedPlanets;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Planet[] getApprovedPlanets() {
        return this.approvedPlanets;
    }

    public void setApprovedPlanets(Planet[] approvedPlanets) {
        this.approvedPlanets = approvedPlanets;
    }

}
