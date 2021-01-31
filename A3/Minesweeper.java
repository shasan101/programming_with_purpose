public class Minesweeper {
    public static void main(String[] args) {
        int row_size = Integer.parseInt(args[0]);
        int col_size = Integer.parseInt(args[1]);
        int mines_count = Integer.parseInt(args[2]);

        String[][] grid = new String[row_size][col_size];
        // Placing Mines
        int rand_row, rand_col;
        for (int num_mines = 0; num_mines < mines_count; num_mines++) {
            rand_col = (int) (Math.random() * col_size);
            rand_row = (int) (Math.random() * row_size);
            if(grid[rand_row][rand_col] == "*") {
                num_mines--;
            } else {
                grid[rand_row][rand_col] = "*";
            }
        }
        // for (int i=0;i<row_size;i++) {
        //     for(int j=0;j<col_size;j++) {
        //         System.out.print(grid[i][j] + "  ");
        //     }
        //     System.out.println();
        // }

        int neighbors_mines_count = 0;
        for (int row_idx = 0; row_idx < row_size; row_idx++) {
            for (int col_idx = 0; col_idx < col_size; col_idx++) {
                if (!(grid[row_idx][col_idx] == "*")) {
                    int up_row = row_idx - 1; int up_col = col_idx;
                    int down_row = row_idx + 1; int down_col = col_idx;
                    int left_row = row_idx; int left_col = col_idx - 1;
                    int right_row = row_idx; int right_col = col_idx + 1;
                    int left_diag_up_row = row_idx - 1; int left_diag_up_col = col_idx - 1;
                    int left_diag_down_row = row_idx + 1; int left_diag_down_col = col_idx - 1;
                    int right_diag_up_row = row_idx - 1; int right_diag_up_col = col_idx + 1;
                    int right_diag_down_row = row_idx + 1; int right_diag_down_col = col_idx + 1;
                    neighbors_mines_count = 0;
                    if (up_row >= 0 && up_row < row_size && up_col >= 0 && up_col < col_size) {
                        if (grid[up_row][up_col] == "*") {
                            neighbors_mines_count++;
                        }
                    }
                    if (down_row >= 0 && down_row < row_size && down_col >= 0 && down_col < col_size) {
                        // System.out.println(down_row+ ", "+ down_col);
                        if (grid[down_row][down_col] == "*") {
                            neighbors_mines_count++;
                        }
                    }
                    if (left_row >= 0 && left_row < row_size && left_col >= 0 && left_col < col_size) {
                        if (grid[left_row][left_col] == "*") {
                            neighbors_mines_count++;
                        }
                    }
                    if (right_row >= 0 && right_row < row_size && right_col >= 0 && right_col < col_size) {
                        if (grid[right_row][right_col] == "*") {
                            neighbors_mines_count++;
                        }
                    }
                    if (left_diag_up_row >= 0 && left_diag_up_row < row_size && left_diag_up_col >= 0 && left_diag_up_col < col_size) {
                        if (grid[left_diag_up_row][left_diag_up_col] == "*") {
                            neighbors_mines_count++;
                        }
                    }
                    if (left_diag_down_row >= 0 && left_diag_down_row < row_size && left_diag_down_col >= 0 && left_diag_down_col < col_size) {
                        if (grid[left_diag_down_row][left_diag_down_col] == "*") {
                            neighbors_mines_count++;
                        }
                    }
                    if (right_diag_up_row >= 0 && right_diag_up_row < row_size && right_diag_up_col >= 0 && right_diag_up_col < col_size) {
                        if (grid[right_diag_up_row][right_diag_up_col] == "*") {
                            neighbors_mines_count++;
                        }
                    }
                    if (right_diag_down_row >= 0 && right_diag_down_row < row_size && right_diag_down_col >= 0 && right_diag_down_col < col_size) {
                        if (grid[right_diag_down_row][right_diag_down_col] == "*") {
                            neighbors_mines_count++;
                        }
                    }
                    grid[row_idx][col_idx] = String.valueOf(neighbors_mines_count);
                }
                if (col_idx == col_size - 1){
                    System.out.print(grid[row_idx][col_idx]);
                } else {
                    System.out.print(grid[row_idx][col_idx] + "  ");
                }
            }
            System.out.println();
        }
    }
}