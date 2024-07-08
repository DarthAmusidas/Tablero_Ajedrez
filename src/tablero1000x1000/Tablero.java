/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablero1000x1000;

/**
 *
 * @author Mariano
 */
public class Tablero {
    public static void printBoard(char[][] board, int limit) {
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
