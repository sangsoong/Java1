package section07;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++)
            try {
                if (i == 0) {
                    int divZero = 3 / 0;
                } else if (i == 1) {
                    int[] outOfBound = { 1, 2, 3 };
                    int oob = outOfBound[3];
                } else if (i == 2) {
                    String none = null;
                    System.out.println(none.toString());
                }
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열의 범위를 벗어났습니다.");
            } catch (NullPointerException e) {
                System.out.println("Null타입 변수의 멤버를 가져올 수 없습니다.");
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}
