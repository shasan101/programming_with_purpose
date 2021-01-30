public class RightTriangle {
    public static void main(String[] args) {
        int sideA = Integer.parseInt(args[0]);
        int sideB = Integer.parseInt(args[1]);
        int sideC = Integer.parseInt(args[2]);

            boolean result = ((Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) || (Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2)) || (Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2))) && (sideA > 0) && (sideB > 0) && (sideC > 0);

            System.out.println(result);
    }

}