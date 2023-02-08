public class Ship {
    private int cargoWeight;
    private String shipType;
    private String weaponry;

    public Ship(int cargoWeight, String shipType, String weaponry) {
        this.cargoWeight = cargoWeight;
        this.shipType = shipType;
        this.weaponry = weaponry;
    }

    public int getCargoWeight() {
        return this.cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public String getShipType() {
        return this.shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getWeaponry() {
        return this.weaponry;
    }

    public void setWeaponry(String weaponry) {
        this.weaponry = weaponry;
    }

    @Override
    public String toString() {
        return
            "\n-Ship Type: " + getShipType() + "\n" +
            "-Cargo Weight: " + getCargoWeight() + "\n" +
            "-Weaponry: " + getWeaponry();
    }

}
