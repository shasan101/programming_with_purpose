public class ThueMorse {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        String[][] morseArr = new String[size][size];
        int rowChange = 0;
        int colChange = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // System.out.println("Value at index: "+ row + "," + col + " is: " + morseArr[row][col]);
                if (row == 0 && col == 0) { morseArr[row][col] = "+"; }
                else if (col == 0) {
                    if (morseArr[row][col] == null) {
                        // start magic
                        rowChange = row - 1;
                        for (int innerIdx = 0; innerIdx < row; innerIdx++) {
                            rowChange++;
                            if (rowChange >= size) {
                                break;
                            }
                            if (morseArr[innerIdx][col].equals("+")) {
                                morseArr[rowChange][col] = "-";
                            } else {
                                morseArr[rowChange][col] = "+";
                            }
                        }
                    }
                } else {
                        if (morseArr[row][col] == null) {
                            // start magic
                            colChange = col - 1;
                            for (int innerIdx = 0; innerIdx < col; innerIdx++) {
                                colChange++;
                                if (colChange >= size) {
                                    break;
                                }
                                if (morseArr[row][innerIdx].equals("+")) {
                                    morseArr[row][colChange] = "-";
                                } else {
                                    morseArr[row][colChange] = "+";
                                }
                            }
                        }
                }
                // System.out.print(row+ ","+col +"  ");
                System.out.print(morseArr[row][col] + "  ");
            }
            System.out.println();
        }

        // System.out.println();

        // for (int row = 0; row < size; row++) {
        //     for (int col = 0; col < size; col++) {
        //         System.out.print(morseArr[row][col] + "  ");
        //     }
        //     System.out.println();
        // }
    }
}
