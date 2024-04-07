package section06;

public class FriendlyUnit extends Unit {
    FriendlyUnit() {
        super(0, 0, 0, 0);
    }

    @Override
    public void info() {
        System.out.println();
    }
}
