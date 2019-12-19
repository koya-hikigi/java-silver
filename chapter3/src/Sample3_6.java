public class Sample3_6 {
    public static void main(String[] args) {
        String s = "abcdefa";
        System.out.println("s.charAt(2)        : " + s.charAt(2));
        System.out.println("s.endsWith(\"fa\")   : " + s.endsWith("fa"));
        System.out.println("s.indexOf('c')     : " + s.indexOf('c'));
        System.out.println("s.replace('a','z') : " + s.replace('a','z'));
        System.out.println("s.substring(2)     : " + s.substring(2));
        System.out.println("s.toLowerCase()    : " + s.toLowerCase());
    }
}
