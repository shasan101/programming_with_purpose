public class ThueMorse {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        String[][] morse_arr = new String[size][size];
        int row_change = 0;
        int col_change = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // System.out.println("Value at index: "+ row + "," + col + " is: " + morse_arr[row][col]);
                if (row == 0 && col == 0) { morse_arr[row][col] = "+"; }
                else if (col == 0){
                    if (morse_arr[row][col] == null){
                        // start magic
                        row_change = row - 1;
                        for (int inner_idx = 0; inner_idx < row; inner_idx++){
                            row_change++;
                            if (row_change >= size) {
                                break;
                            }
                            if (morse_arr[inner_idx][col].equals("+")) {
                                morse_arr[row_change][col] = "-";
                            } else {
                                morse_arr[row_change][col] = "+";
                            }
                        }
                    }
                }
                else {
                        if (morse_arr[row][col] == null){
                            // start magic
                            col_change = col - 1;
                            for (int inner_idx = 0; inner_idx < col; inner_idx++){
                                col_change++;
                                if (col_change >= size) {
                                    break;
                                }
                                if (morse_arr[row][inner_idx].equals("+")) {
                                    morse_arr[row][col_change] = "-";
                                } else {
                                    morse_arr[row][col_change] = "+";
                                }
                            }
                        }
                }
                // System.out.print(row+ ","+col +"  ");
                System.out.print(morse_arr[row][col] + "  ");
            }
            System.out.println();
        }

        // System.out.println();

        // for (int row = 0; row < size; row++) {
        //     for (int col = 0; col < size; col++) {
        //         System.out.print(morse_arr[row][col] + "  ");
        //     }
        //     System.out.println();
        // }
    }
}
