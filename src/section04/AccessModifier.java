package section04;

public class AccessModifier {
    public static int sttMem = 10;
    public int instMem = 0;

    public AccessModifier(int instMem) {
        this.instMem = instMem;
    }

    public static void sttMthd() {
        System.out.println("Hello World!");
    }

    public void instMthd() {
        System.out.println(instMem);
    }
}
