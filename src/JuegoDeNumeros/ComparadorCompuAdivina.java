/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeNumeros;

import JuegoDeNumeros.Pantallas.Compuadivina;

/**
 *
 * @author SISTEMAS
 */
public class ComparadorCompuAdivina {
//declaro las variables
    private int varMax = 100;
    private int varMenor = 0;
    private int IntentosCompu = 0;
    private int numCompu = (int) (Math.random() * 100 + 1);
//creo los gets y sets de las variables privadas
    public int getIntentosCompu() {
        return IntentosCompu;
    }

    public void setIntentosCompu(int IntentosCompu) {
        this.IntentosCompu = IntentosCompu;
    }

    public int getNumCompu() {
        return numCompu;
    }

    public void setNumCompu(int numCompu) {
        this.numCompu = numCompu;
    }
//metodo que analiza cuando el numero a adivinar es menor al que mostro la compu
    public void menos() {
//analizo el limite
        if (varMax >= numCompu) {
            varMax = numCompu;
        }
// busco un numero aletorio entre los limites establecidos 
        numCompu = (int) (Math.random() * (varMax - varMenor) + (varMenor));
        Compuadivina.txtCompu.append("asi que mas chico entonces es " + numCompu + "\n");
                //subo 1 el acumulador de intentos de la compu
        IntentosCompu = IntentosCompu + 1;
    }
//metodo que analiza cuando el numero a adivinar es mayor al que mostro la compu
    public void mas() {
//Actualizo el limite menor 
        if (varMenor <= numCompu) {
            varMenor = numCompu;
        }
// calculo un numero aletorio entre los limites establecidos
        numCompu = (int) (Math.random() * (varMax - varMenor) + (varMenor));
        Compuadivina.txtCompu.append("asi que mas grande entonces es " + numCompu + "\n");
        //subo 1 el acumulador de intentos de la compu
        IntentosCompu = IntentosCompu + 1;
    }

}
