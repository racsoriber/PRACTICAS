/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aprender.TresEnRaya.NEGOCIO;

import Aprender.TresEnRaya.DATOS.Tablero;

/**
 *
 * @author Leo
 */
public class RNJuego {

    private byte turno; // Para indicar el turno de los juagadores
    private String MarcaX;
    private String MarcaO;
    private boolean error;
    private byte ganador;
    Tablero tablero;

    public RNJuego() {
      turno = 1;
      MarcaX = "X";
      MarcaO = "O";
      error = false;
      ganador = 0;
      tablero = new Tablero();
        
    
    }
}
