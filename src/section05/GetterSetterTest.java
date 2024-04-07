package section05;

public class GetterSetterTest {
    public static void main(String[] args) {
        Score score1 = new Score();
        System.out.println(score1.getScore());

        score1.setScore(5);
        System.out.println(score1.getScore());

        score1.addScore(5);
        System.out.println(score1.getScore());

        int[] vals = { 1, 2, 3, 4, 5 };
        score1.addScore(vals);
        System.out.println(score1.getScore());
    }
}
