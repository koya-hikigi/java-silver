import java.util.ArrayList;

public class Sample2_7 {
    public static void main(String[] args) {

        //ArrayList<int> array = new ArrayList<int>();
        // コンパイルエラー
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(10); array.add(20); array.add(30);
        System.out.println(array.get(0) + " " + array.get(1) + " " + array.get(2));

    }
}
