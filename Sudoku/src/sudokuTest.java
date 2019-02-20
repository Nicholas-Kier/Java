public class sudokuTest {
    public static void main(String[] args) {
        // Given Sudoku puzzle to validate.
        int grid[][] = new int[][]{
                {1, 8, 4, 9, 6, 3, 7, 2, 5},
                {5, 6, 2, 7, 4, 8, 3, 1, 9},
                {3, 9, 7, 5, 1, 2, 8, 6, 4},
                {2, 3, 9, 6, 5, 7, 1, 4, 8},
                {7, 5, 6, 1, 8, 4, 2, 9, 3},
                {4, 1, 8, 2, 3, 9, 6, 5, 7},
                {9, 4, 1, 3, 7, 6, 5, 8, 2},
                {6, 2, 3, 8, 9, 5, 4, 7, 1},
                {8, 7, 5, 4, 2, 1, 9, 3, 6},
        }; // The two-dimensional array that the program will check.

        if (Sudoku.sudokuCheck(grid)) {
            System.out.println("There is a solution.");
        } else {
            System.out.println("NO SOLUTION.");
        }
    }
}