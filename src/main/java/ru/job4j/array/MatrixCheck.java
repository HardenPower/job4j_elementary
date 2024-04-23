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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int idx = column; idx < board.length; idx++) {
            if (board[idx][column] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int idx = 0; idx < result.length; idx++) {
            result[idx] = board[idx][idx];
        }
        return result;
    }
}