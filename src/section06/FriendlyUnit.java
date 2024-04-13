package section06;

public class FriendlyUnit extends Unit {
    int cost;
    int cooltime;

    FriendlyUnit() {
        super("A", 1, 1, 1);
        this.cost = 1;
        this.cooltime = 1;
    }

    FriendlyUnit(String name, int damage, int defense, int speed, int cost, int cooltime) {
        super(name, damage, defense, speed);
        this.cost = cost;
        this.cooltime = cooltime;
    }

    public void info() {
        super.info();
        System.out.printf("cost: %d\t cooltime: %d\n", cost, cooltime);
    }
}
