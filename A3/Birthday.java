public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int birthday = 0;
        long[] entering_people_counts = new long[100];
        double[] ratio_of_count_or_less = new double[100];
        for (int idx = 0; idx < trials; idx++) {
            // System.out.println("Experiment# " + idx);
            int no_of_people = 0;
            int dates_idx = 0;
            boolean found = false;
            int[] birthdays_collection = new int[n];
            while (!found) {
                birthday = (int)(Math.random() * (n-1));
                found = false;
                for(int search_idx = 0; search_idx < dates_idx; search_idx++){
                    // System.out.println("comparing birthday: " + birthday + " with idx: " + search_idx + " having val: " + birthdays_collection[search_idx]);
                    if (birthday == birthdays_collection[search_idx]) {
                        found = true;
                        entering_people_counts[no_of_people] += 1;
                        // System.out.println("Repeating birthday: "+ birthday + " at idx: " + search_idx);
                        break;
                    }
                }
                no_of_people++;
                birthdays_collection[dates_idx] = birthday;
                dates_idx++;
                dates_idx = dates_idx % n;
                if (found) {
                    break;
                }

            }
        }
        // for (int i = 1; i <= 100; i++) {
        //     System.out.println(i + "  " + entering_people_counts[i-1]);
        // }
        int ratio_idx = -1;
        int temp;
        do {
            ratio_idx++;
            for (int i = 0; i <= ratio_idx; i++){
                ratio_of_count_or_less[ratio_idx] += entering_people_counts[i];
            }
            temp = ratio_idx + 1;
            ratio_of_count_or_less[ratio_idx] /= trials;
            System.out.println(temp + "     " + entering_people_counts[ratio_idx] + "     " + ratio_of_count_or_less[ratio_idx]);
        } while (ratio_of_count_or_less[ratio_idx] < 0.5 );
    }
}