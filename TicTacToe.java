import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameWon = false;

        while (!gameWon && !isBoardFull()) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                gameWon = checkWin(currentPlayer);

                if (gameWon) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("This move is not valid");
            }
        }

        if (!gameWon) {
            printBoard();
            System.out.println("The game is a draw!");
        }
        scanner.close();
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
        }
    }

    public static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    
}
