import java.util.Scanner;

public class TicTacToe {
    static final int COMPUTER = 1;
    static final int HUMAN = 2;
    static final int SIDE = 3;
    static final char COMPUTERMOVE = 'O';
    static final char HUMANMOVE = 'X';

    static void showBoard(char[][] board) {
        for (int i = 0; i < SIDE; i++) {
            System.out.printf("\t\t\t %c | %c | %c \n", board[i][0], board[i][1], board[i][2]);
            if (i < SIDE - 1) {
                System.out.println("\t\t\t-----------");
            }
        }
        System.out.println();
    }

    static void showInstructions() {
        System.out.println("\nChoose a cell numbered from 1 to 9 as below and play\n");
        System.out.println("\t\t\t 1 | 2 | 3 ");
        System.out.println("\t\t\t-----------");
        System.out.println("\t\t\t 4 | 5 | 6 ");
        System.out.println("\t\t\t-----------");
        System.out.println("\t\t\t 7 | 8 | 9 \n");
    }

    static void initialise(char[][] board) {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                board[i][j] = '*';
            }
        }
    }

    static void declareWinner(int whoseTurn) {
        if (whoseTurn == COMPUTER) {
            System.out.println("COMPUTER has won\n");
        } else {
            System.out.println("HUMAN has won\n");
        }
    }

    static boolean rowCrossed(char[][] board) {
        for (int i = 0; i < SIDE; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '*') {
                return true;
            }
        }
        return false;
    }

    static boolean columnCrossed(char[][] board) {
        for (int i = 0; i < SIDE; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '*') {
                return true;
            }
        }
        return false;
    }

    static boolean diagonalCrossed(char[][] board) {
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '*') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '*') {
            return true;
        }
        return false;
    }

    static boolean gameOver(char[][] board) {
        return rowCrossed(board) || columnCrossed(board) || diagonalCrossed(board);
    }

    static int minimax(char[][] board, int depth, boolean isAI) {
        int score = 0;
        int bestScore = isAI ? -999 : 999;

        if (gameOver(board)) {
            return isAI ? -10 : 10;
        } else {
            if (depth < SIDE * SIDE) {
                for (int i = 0; i < SIDE; i++) {
                    for (int j = 0; j < SIDE; j++) {
                        if (board[i][j] == '*') {
                            board[i][j] = isAI ? COMPUTERMOVE : HUMANMOVE;
                            score = minimax(board, depth + 1, !isAI);
                            board[i][j] = '*';
                            if (isAI) {
                                bestScore = Math.max(score, bestScore);
                            } else {
                                bestScore = Math.min(score, bestScore);
                            }
                        }
                    }
                }
                return bestScore;
            } else {
                return 0;
            }
        }
    }

    static int bestMove(char[][] board, int moveIndex) {
        int x = -1, y = -1;
        int score = 0, bestScore = -999;

        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (board[i][j] == '*') {
                    board[i][j] = COMPUTERMOVE;
                    score = minimax(board, moveIndex + 1, false);
                    board[i][j] = '*';
                    if (score > bestScore) {
                        bestScore = score;
                        x = i;
                        y = j;
                    }
                }
            }
        }
        return x * 3 + y;
    }

    static void playTicTacToe(int whoseTurn) {
        char[][] board = new char[SIDE][SIDE];
        int moveIndex = 0;
        int x = 0, y = 0;

        initialise(board);
        showInstructions();

        while (!gameOver(board) && moveIndex != SIDE * SIDE) {
            int n;
            if (whoseTurn == COMPUTER) {
                n = bestMove(board, moveIndex);
                x = n / SIDE;
                y = n % SIDE;
                board[x][y] = COMPUTERMOVE;
                System.out.printf("COMPUTER has put a %c in cell %d\n\n", COMPUTERMOVE, n + 1);
                showBoard(board);
                moveIndex++;
                whoseTurn = HUMAN;
            } else if (whoseTurn == HUMAN) {
                Scanner sc = new Scanner(System.in);
                System.out.print("You can insert in the following positions: ");
                for (int i = 0; i < SIDE; i++) {
                    for (int j = 0; j < SIDE; j++) {
                        if (board[i][j] == '*') {
                            System.out.print((i * 3 + j) + 1 + " ");
                        }
                    }
                }
                System.out.println("\n\nEnter the position = ");
                n = sc.nextInt() - 1;
                x = n / SIDE;
                y = n % SIDE;

                if (board[x][y] == '*' && n < 9 && n >= 0) {
                    board[x][y] = HUMANMOVE;
                    System.out.printf("\nHUMAN has put a %c in cell %d\n\n", HUMANMOVE, n + 1);
                    showBoard(board);
                    moveIndex++;
                    whoseTurn = COMPUTER;
                } else if (board[x][y] != '*' && n < 9 && n >= 0) {
                    System.out.println("\nPosition is occupied, select any one place from the available places\n\n");
                } else if (n < 0 || n > 8) {
                    System.out.println("Invalid position\n");
                }
            }
        }

        if (!gameOver(board) && moveIndex == SIDE * SIDE) {
            System.out.println("It's a draw\n");
        } else {
            declareWinner(whoseTurn == COMPUTER ? HUMAN : COMPUTER);
        }
    }

    public static void main(String[] args) {
        System.out.println("\n-------------------------------------------------------------------\n\n");
        System.out.println("\t\t\t Tic-Tac-Toe");
        System.out.println("\n-------------------------------------------------------------------\n\n");

        char cont = 'y';
        Scanner sc = new Scanner(System.in);

        do {
            char choice;
            System.out.print("Do you want to start first?(y/n) : ");
            choice = sc.next().charAt(0);

            if (choice == 'n') {
                playTicTacToe(COMPUTER);
            } else if (choice == 'y') {
                playTicTacToe(HUMAN);
            } else {
                System.out.println("Invalid choice\n");
            }

            System.out.print("\nDo you want to quit(y/n) : ");
            cont = sc.next().charAt(0);
        } while (cont == 'n');
    }
}
