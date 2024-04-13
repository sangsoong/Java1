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
        System.out.printf("name: %s\t damage: %d\t defense: %d\t speed: %d\n", name, damage, defense, speed);
    }
}