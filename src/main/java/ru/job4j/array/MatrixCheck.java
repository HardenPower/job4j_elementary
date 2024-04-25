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
}