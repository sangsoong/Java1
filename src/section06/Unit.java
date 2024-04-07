package section06;

public class Unit {
    String name;
    int damage;
    int defense;
    int speed;

    Unit(String name, int damage, int defense, int speed) {
        this.name = name;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
    }

    public void info() {
        System.out.printf("name: %s", name);
        System.out.printf("name: %d", damage);
        System.out.printf("name: %d", defense);
        System.out.printf("name: %d", speed);
    }
}