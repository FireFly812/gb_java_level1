package lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Sveta
 * @version 24.01.2022
 */
public class TicTacToe {
    final char CHAR_X = 'x';
    final char CHAR_O = 'o';
    final char CHAR_DOT = '.';
    final String VICTORY_MESSAGE = "YOU WON";
    final String DROW_MESSAGE = "Sorry...DRAW";
    Random random;
    Scanner scanner;
    char[][] table;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (checkWin(CHAR_X)) {
                System.out.println(VICTORY_MESSAGE);
                break;
            }
            if (isTableFull()) {
                System.out.println(DROW_MESSAGE);
            }
            turnAl();
            printTable();
            if (checkWin(CHAR_O)) {
                System.out.println(VICTORY_MESSAGE);
                break;
            }
            if (isTableFull()) {
                System.out.println(DROW_MESSAGE);
            }
        }
        printTable();
    }

    void initTable() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                table[x][y] = CHAR_DOT;
            }
        }
    }

    void printTable() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter x y [1..3]:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = CHAR_X;

    }

    void turnAl() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = CHAR_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == CHAR_DOT;
    }

    boolean checkWin(char ch) {
        for (int i = 0; i < 3; i++) {
            if (table[i][0] == ch && table[i][1] == ch && table[i][2] == ch)
                return true;

            if (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch)
                return true;

        }
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch)
            return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)
            return true;
        return false;
      }

    boolean isTableFull() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (table[x][y] == CHAR_DOT) {
                    return false;
                }
            }
        }
        return true;
    }
}
