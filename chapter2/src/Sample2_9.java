import java.util.ArrayList;

public class Sample2_9 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(10); array.add(100);
        //int num = array.get(0); コンパイルエラー
        int num1 = (Integer)array.get(0);
        int num2 = (Integer)array.get(1);
        System.out.println(num1);
        System.out.println(num2);
    }
}
