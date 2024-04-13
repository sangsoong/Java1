package section06;

public class FriendlyUnit extends Unit {
    FriendlyUnit() {
        super("A", 1, 1, 1);
    }

    FriendlyUnit(String name, int damage, int defense, int speed) {
        super(name, damage, defense, speed);
    }

    @Override
    public void info() {
        super.info();
    }
}
