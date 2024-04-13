package section06;

public class EnemyUnit extends Unit {
    EnemyUnit() {
        super("B", 1, 1, 1);
    }

    EnemyUnit(String name, int damage, int defense, int speed) {
        super(name, damage, defense, speed);
    }

    @Override
    public void info() {
        super.info();
    }
}
