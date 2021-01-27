public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int steps = 0;
        int currRow = 0;
        int currCol = 0;
        double dist = Math.abs(currCol-0) + Math.abs(currRow-0);
        System.out.println("(" + currRow + ", " + currCol + ")");
        if (r != 0) {
            do {
                double randValue =  Math.random();
                if (randValue <= 0.25) {
                    // move up
                    currRow--;
                } else if (randValue <= 0.5) {
                    // move down
                    currRow++;
                } else if (randValue <= 0.75) {
                    // move left
                    currCol--;
                } else {
                    // move right
                    currCol++;
                }
                System.out.println("(" + currRow + ", "+ currCol + ")");
                steps++;
                dist = Math.abs(currCol-0) + Math.abs(currRow-0);
            } while (dist < r);
        }
        System.out.println("steps = " + steps);
    }
}