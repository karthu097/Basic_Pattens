package NestedLoopa;

public class Nqueens {


    static int N = 4;

    public static void main(String[] args) {
        char[][] board = new char[N][N];

        // Fill board with '.'
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0);
    }

    // Backtracking function
    static boolean solve(char[][] board, int row) {

        // If all queens placed
        if (row == N) {
            printBoard(board);
            return true;
        }

        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';   // Place queen

                if (solve(board, row + 1)) {
                    return true; // stop after first solution
                }

                board[row][col] = '.';   // Backtrack
            }
        }
        return false;
    }

    // Check if safe
    static boolean isSafe(char[][] board, int row, int col) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Print board
    static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

