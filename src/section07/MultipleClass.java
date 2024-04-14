package section07;

import java.util.ArrayList;

public class MultipleClass {
    public static void main(String[] args) {
        System.out.printf("1 + 2 = %d\n", Smartphone.Calc.plus(1, 2));

        Smartphone.Memo.write("To Buy List", "사과1, 오렌지2, 바나나3");
        ArrayList<Object> list = new ArrayList<>();
        list.add("samsung");
        list.add("a");
        list.add("300x900");
        Smartphone.Memo.write("systemVariables", list);
        Smartphone.Memo.write("isPowerOn", true);

        Smartphone.storage.get(0).info();
        Smartphone.storage.get(1).info();
        Smartphone.storage.get(2).info();
    }
}
