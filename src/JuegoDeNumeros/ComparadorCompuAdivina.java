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

    public int getVarMax() {
        return varMax;
    }

    public void setVarMax(int varMax) {
        this.varMax = varMax;
    }

    public int getVarMenor() {
        return varMenor;
    }

    public void setVarMenor(int varMenor) {
        this.varMenor = varMenor;
    }
    
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
    public String menos() {
//analizo el limite
        if (varMax >= numCompu) {
            varMax = numCompu-1;
        }
// busco un numero aletorio entre los limites establecidos 
        numCompu = (int) (Math.random() * (varMax - varMenor) + (varMenor));
       if (numCompu==0) numCompu=1;
        //subo 1 el acumulador de intentos de la compu
        IntentosCompu = IntentosCompu + 1;
        return ("asi que mas chico entonces es " + numCompu + "\n");
    }
//metodo que analiza cuando el numero a adivinar es mayor al que mostro la compu
    public String mas() {
//Actualizo el limite menor 
        if (varMenor <= numCompu) {
            varMenor = numCompu+1;
        }
// calculo un numero aletorio entre los limites establecidos
        numCompu = (int) (Math.random() * (varMax - varMenor) + (varMenor));
        
        //subo 1 el acumulador de intentos de la compu
        IntentosCompu = IntentosCompu + 1;
        return ("asi que mas grande entonces es " + numCompu + "\n");
    }

}
