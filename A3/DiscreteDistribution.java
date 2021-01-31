public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int numOfAs = args.length;
        int[] sumOfInputs = new int[numOfAs];
        for (int count = 1; count < numOfAs; count++) {
            sumOfInputs[count] += Integer.parseInt(args[count]) + sumOfInputs[count - 1];
        }
        // for (int i = 0; i < numOfAs; i++) {
        //     System.out.println(sumOfInputs[i]);
        // }
        for (int countOfM = 0; countOfM < m; countOfM++) {
            double r = Math.random() * (sumOfInputs[numOfAs - 1]);
            for (int idx = numOfAs - 1; idx >= 0; idx--) {
                if (r >= sumOfInputs[idx - 1] && r < sumOfInputs[idx]) {
                    System.out.print(idx + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}