

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double seriesSum = 0;
        for (int i = 1; i <= n; i++) {
            seriesSum += 1.0/Math.pow(i, r);
        }
        System.out.println(seriesSum); 
    }
}