public class Sample3_8 {
    public static void main(String[] args) {
        int i1 = 100;   int i2 = 100;   int i3 = 10;
        byte b = 10;    char c = 'a';
        float f = 10.0f;   double d = 10.0;
        boolean b1 = true;

        System.out.println("i1 == i2       : " + (i1 == i2));
        System.out.println("b  == i3       : " + (b == i3));
        System.out.println("f  == d        : " + (f == d));
        System.out.println("c  == 'a'      : " + (c == 'a'));
        System.out.println("b1 == true     : " + (b1 == true));
        System.out.println("b1 == false    : " + (b1 == false));
    }
}
