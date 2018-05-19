/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeNumeros;

import JuegoDeNumeros.Pantallas.Juego;
import JuegoDeNumeros.Pantallas.Principal;

/**
 *
 * @author SISTEMAS
 */
public class Main {

    public static int numComputadora = (int) (Math.random() * 100 + 1);
    private static int Intentos = 1;

    public static int getIntentos() {
        return Intentos;
    }

    public static void setIntentos(int Intentos) {
        Main.Intentos = Intentos;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal principal = new Principal();
        principal.setVisible(true);

        /**
         *
         */
    }

    public static int reset() {
        numComputadora = (int) (Math.random() * 100 + 1);
        Juego.jButton1.setEnabled(true);
        Juego.txtPersona.setText("");
        return numComputadora;

    }
}
