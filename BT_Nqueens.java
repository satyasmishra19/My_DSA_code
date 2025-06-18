
public class BT_Nqueens {

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        for (int i = 0; i < 2; i++) {
            nQueens(board, 0, i);
            if (i == 0) {

                System.out.println("Total ways to solve n queens = " + count);
            }
        }
    }

    public static void nQueens(char board[][], int row, int j) {
        //base
        if (j == 0) {
            if (row == board.length) {
                //printBoard(board);
                count++;
                return;
            }
            //column loop
            for (int i = 0; i < board.length; i++) {
                if (isSafe(board, row, i)) {
                    board[row][i] = 'Q';
                    nQueens(board, row + 1, j);//function call
                    board[row][i] = '.';//backtracking step    
                }
            }
        } else {
            if (row == board.length) {
                printBoard(board);
                count++;
                return;
            }
            //column loop
            for (int i = 0; i < board.length; i++) {
                if (isSafe(board, row, i)) {
                    board[row][i] = 'Q';
                    nQueens(board, row + 1, j);//function call
                    board[row][i] = '.';//backtracking step    
                }
            }

        }
    }

    static int count = 0;

    public static void printBoard(char board[][]) {
        System.out.println("---------CHESS BOARD--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
