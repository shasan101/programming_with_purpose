public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double meanRadius = 6371.0;

        double x1Radians = Math.toRadians(x1);
        double y1Radians = Math.toRadians(y1);
        double x2Radians = Math.toRadians(x2);
        double y2Radians = Math.toRadians(y2);

        double sinThetaXSquared = Math.pow(Math.sin((x2Radians - x1Radians)/2), 2);
        double productOfCos = Math.cos(x1Radians) * Math.cos(x2Radians);
        double sinThetaYSquared = Math.pow(Math.sin((y2Radians-y1Radians)/2), 2);

        double sqrt = Math.sqrt(sinThetaXSquared + productOfCos * sinThetaYSquared);

        double greaterCircleDistance = 2 * meanRadius * Math.asin(sqrt);

        System.out.println(greaterCircleDistance + " kilometers");

    }
}