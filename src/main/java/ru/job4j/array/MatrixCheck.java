package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int indx = 0; indx < board.length; indx++) {
            if (board[row][indx] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int idx = 0; idx < board.length; idx++) {
            if (board[idx][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}