import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }
        };
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameRunning = true;

        System.out.println("Welcome to Tic-Tac-Toe!");
        printBoard(board);

        while (gameRunning) {
            System.out.println("\nPlayer " + currentPlayer + ", enter your move (row and column: 1-3): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            // Check if the move is valid
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer; // Place the player's mark
                printBoard(board);

                // Check if the current player wins
                if (checkWin(board, currentPlayer)) {
                    System.out.println("\nPlayer " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (checkDraw(board)) {
                    System.out.println("\nIt's a draw!");
                    gameRunning = false;
                } else {
                    // Switch players
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }

    // Function to print the Tic-Tac-Toe board
    public static void printBoard(char[][] board) {
        System.out.println("  1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + " " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("  ---+---+---");
            }
        }
    }

    // Function to check if a player has won
    public static boolean checkWin(char[][] board, char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            // Check columns
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    // Function to check if the game is a draw
    public static boolean checkDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // At least one empty cell, not a draw
                }
            }
        }
        return true;
    }
}
