public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int num_of_as = args.length;
        int[] sum_of_inputs = new int[num_of_as];
        for (int count = 1; count < num_of_as; count++) {
            sum_of_inputs[count] += Integer.parseInt(args[count]) + sum_of_inputs[count - 1];
        }
        for(int count_of_m = 0; count_of_m < m; count_of_m++) {
            double r = Math.random() * (sum_of_inputs[num_of_as - 1] - 1);
            for(int idx = num_of_as - 1; idx > 0; idx--) {
                if(r >= sum_of_inputs[idx - 1] && r < sum_of_inputs[idx]) {
                    System.out.print(idx + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}