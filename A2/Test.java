



public class Test {
    public static void main(String[] args) {
        int n = 123456789;
        int m = 0;
        while (n != 0)
        {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        String a = "abc";
        String b = "xyz";
        String c = a-b;
        System.out.println(m);
    }
}