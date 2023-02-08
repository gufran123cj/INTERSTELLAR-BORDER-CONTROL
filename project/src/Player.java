public class Player {
    private String name;
    private int money;
    private int income;
    private int erorrs;

    public Player(String name, int money, int income, int erorrs) {
        this.name = name;
        this.money = money;
        this.income = income;
        this.erorrs = erorrs;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getIncome() {
        return this.income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getErorrs() {
        return this.erorrs;
    }

    public void setErorrs(int erorrs) {
        this.erorrs = erorrs;
    }

}
