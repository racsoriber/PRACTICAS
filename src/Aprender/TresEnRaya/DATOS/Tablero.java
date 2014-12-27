/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aprender.TresEnRaya.DATOS;

/**
 *
 * @author Leo
 */
public class Tablero {

    private static final int max = 10;
    private String[][] tablero;
    private int fila;
    private int columna;
    private int dimension; // por matriz cuadrada 

    public Tablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public Tablero() {
        tablero = new String[max][max];
        dimension = 0;
    }

    public Tablero(int fila, int columna) {
        tablero = new String[this.fila][this.columna];
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void CargarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = "p";
            }
        }

    }

    public void MostrarTablero() {
        String texto = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                texto += "\t " + tablero[i][j];

            }
            texto += "\n";
        }
        System.out.println(texto);
    }

    public void ColocarDatoEnTablero(int fila, int columna, String dato) {
        tablero[fila][columna]=dato;
    }
    
    
}
