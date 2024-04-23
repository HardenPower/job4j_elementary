package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int indx = row; indx < board.length; indx++) {
            if (board[row][indx] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }
}