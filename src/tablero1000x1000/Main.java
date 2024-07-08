/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablero1000x1000;

/**
 *
 * @author Mariano
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1000;
        char[][] board = new char[n][n];

        // Pinta el tablero desplazando los colores en cada fila
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][(j + i) % n] = 'R'; // Rojo
                } else {
                    board[i][(j + i) % n] = 'A'; // Azul
                }
            }
        }

        // Imprimir una parte del tablero para verificar (por ejemplo, los primeros 10x10)
        Tablero.printBoard(board, 100);
    }
}

