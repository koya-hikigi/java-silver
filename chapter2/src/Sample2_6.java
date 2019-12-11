import java.util.ArrayList;

public class Sample2_6 {
    public static void main(String[] args) {
        // 配列を使用した場合
        /*
        String[] array;
        array = new String[1];
        array[0] = "引木";
        String name = array[0];
        System.out.println(name + " : " + array.length);
        出力結果　引木 : 1  */

        // ArrayListクラスを使用した場合
        ArrayList<String> array;
        array = new ArrayList<String>(3);
        array.add("引木");
        String name = array.get(0);
        System.out.println(name + " : " + array.size());
    }
}
