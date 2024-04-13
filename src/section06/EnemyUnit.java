package section06;

public class EnemyUnit extends Unit {
    int grade;

    EnemyUnit() {
        super("B", 1, 1, 1);
        this.grade = 1;
    }

    EnemyUnit(String name, int damage, int defense, int speed, int grade) {
        super(name, damage, defense, speed);
        this.grade = grade;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("grade:%d\n", grade);
    }
}
