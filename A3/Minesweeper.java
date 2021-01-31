public class Minesweeper {
    public static void main(String[] args) {
        int rowSize = Integer.parseInt(args[0]);
        int colSize = Integer.parseInt(args[1]);
        int minesCount = Integer.parseInt(args[2]);

        String[][] grid = new String[rowSize][colSize];
        // Placing Mines
        int randRow, randCol;
        int numMines = 0;
        double randVal;
        while (numMines < minesCount) {
            // randVal = Math.random();
            randCol = (int) (Math.random() * colSize);
            randRow = (int) (Math.random() * rowSize);
            if (grid[randRow][randCol] == "*") {
                continue;
            } else {
                grid[randRow][randCol] = "*";
                numMines++;
            }
        }
        // for (int i=0;i<rowSize;i++) {
        //     for(int j=0;j<colSize;j++) {
        //         System.out.print(grid[i][j] + "  ");
        //     }
        //     System.out.println();
        // }

        int neighborsMinesCount = 0;
        for (int rowIdx = 0; rowIdx < rowSize; rowIdx++) {
            for (int colIdx = 0; colIdx < colSize; colIdx++) {
                // System.out.println(grid[rowIdx][colIdx]);
                if (!(grid[rowIdx][colIdx] == "*")) {
                    int upRow = rowIdx - 1;
                    int upCol = colIdx;
                    int downRow = rowIdx + 1;
                    int downCol = colIdx;
                    int leftRow = rowIdx;
                    int leftCol = colIdx - 1;
                    int rightRow = rowIdx;
                    int rightCol = colIdx + 1;
                    int leftDiagUpRow = rowIdx - 1;
                    int leftDiagUpCol = colIdx - 1;
                    int leftDiagDownRow = rowIdx + 1;
                    int leftDiagDownCol = colIdx - 1;
                    int rightDiagUpRow = rowIdx - 1;
                    int rightDiagUpCol = colIdx + 1;
                    int rightDiagDownRow = rowIdx + 1;
                    int rightDiagDownCol = colIdx + 1;
                    neighborsMinesCount = 0;
                    if (upRow >= 0 && upRow < rowSize && upCol >= 0 && upCol < colSize) {
                        if (grid[upRow][upCol] == "*") {
                            neighborsMinesCount++;
                        }
                    }
                    if (downRow >= 0 && downRow < rowSize && downCol >= 0 && downCol < colSize) {
                        // System.out.println(downRow+ ", "+ downCol);
                        if (grid[downRow][downCol] == "*") {
                            neighborsMinesCount++;
                        }
                    }
                    if (leftRow >= 0 && leftRow < rowSize && leftCol >= 0 && leftCol < colSize) {
                        if (grid[leftRow][leftCol] == "*") {
                            neighborsMinesCount++;
                        }
                    }
                    if (rightRow >= 0 && rightRow < rowSize && rightCol >= 0 && rightCol < colSize) {
                        if (grid[rightRow][rightCol] == "*") {
                            neighborsMinesCount++;
                        }
                    }
                    if (leftDiagUpRow >= 0 && leftDiagUpRow < rowSize && leftDiagUpCol >= 0 && leftDiagUpCol < colSize) {
                        if (grid[leftDiagUpRow][leftDiagUpCol] == "*") {
                            neighborsMinesCount++;
                        }
                    }
                    if (leftDiagDownRow >= 0 && leftDiagDownRow < rowSize && leftDiagDownCol >= 0 && leftDiagDownCol < colSize) {
                        if (grid[leftDiagDownRow][leftDiagDownCol] == "*") {
                            neighborsMinesCount++;
                        }
                    }
                    if (rightDiagUpRow >= 0 && rightDiagUpRow < rowSize && rightDiagUpCol >= 0 && rightDiagUpCol < colSize) {
                        if (grid[rightDiagUpRow][rightDiagUpCol] == "*") {
                            neighborsMinesCount++;
                        }
                    }
                    if (rightDiagDownRow >= 0 && rightDiagDownRow < rowSize && rightDiagDownCol >= 0 && rightDiagDownCol < colSize) {
                        if (grid[rightDiagDownRow][rightDiagDownCol] == "*") {
                            neighborsMinesCount++;
                        }
                    }
                    grid[rowIdx][colIdx] = String.valueOf(neighborsMinesCount);
                }
                if (colIdx == colSize - 1) {
                    System.out.print(grid[rowIdx][colIdx]);
                } else {
                    System.out.print(grid[rowIdx][colIdx] + "  ");
                }
            }
            System.out.println();
        }
    }
}