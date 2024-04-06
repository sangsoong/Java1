package section05;

import section04.AccessModifier;

public class AccessModifierTest {
    public static void main(String[] args) {
        AccessModifier am1 = new AccessModifier(1);
        AccessModifier am2 = new AccessModifier(2);

        System.out.printf("AccessModifier.sttMem: %d\n", AccessModifier.sttMem);
        System.out.printf("am1.sttMem: %d, am2.sttMem: %d\n", am1.sttMem, am2.sttMem);
        System.out.printf("am1.instMem: %d, am2.instMem: %d\n", am1.instMem, am2.instMem);

        AccessModifier.sttMthd();
        am1.instMthd();
        am2.instMthd();
    }
}
