public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int birthday = 0;
        long[] enteringPeopleCounts = new long[100];
        double[] ratioOfCountOrLess = new double[100];
        boolean toExit = false;
        if (n <= 1) {
            System.out.println(1 + "    " + 0 + "   " + 0.0);
            toExit = true;
        }
        for (int idx = 0; idx < trials; idx++) {
            // System.out.println("Experiment# " + idx);
            if (toExit) {
                break;
            }
            int noOfPeople = 0;
            int datesIdx = 0;
            boolean found = false;
            int[] birthdaysCollection = new int[n];
            while (!found) {
                birthday = (int) (Math.random() * (n));
                found = false;
                for (int searchIdx = 0; searchIdx < datesIdx; searchIdx++) {
                    // System.out.println("comparing birthday: " + birthday + " with idx: " + searchIdx + " having val: " + birthdaysCollection[searchIdx]);
                    if (birthday == birthdaysCollection[searchIdx]) {
                        found = true;
                        enteringPeopleCounts[noOfPeople] += 1;
                        // System.out.println("Repeating birthday: "+ birthday + " at idx: " + searchIdx);
                        break;
                    }
                }
                if (found) {
                    break;
                }
                noOfPeople++;
                birthdaysCollection[datesIdx] = birthday;
                datesIdx++;
                datesIdx = datesIdx % n;

            }
        }
        // for (int i = 1; i <= n; i++) {
        //     System.out.println(i + "  " + enteringPeopleCounts[i-1]);
        // }
        int ratioIdx = -1;
        int temp;
        do {
            if (toExit) {
                break;
            }
            ratioIdx++;
            for (int i = 0; i <= ratioIdx; i++) {
                ratioOfCountOrLess[ratioIdx] += enteringPeopleCounts[i];
            }
            temp = ratioIdx + 1;
            ratioOfCountOrLess[ratioIdx] /= trials;
            System.out.println(temp + "     " + enteringPeopleCounts[ratioIdx] + "     " + ratioOfCountOrLess[ratioIdx]);
        } while (ratioOfCountOrLess[ratioIdx] < 0.5);
    }
}