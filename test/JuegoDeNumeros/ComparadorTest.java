/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeNumeros;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author facun
 */
public class ComparadorTest {
    
    public ComparadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMensaje method, of class Comparador.
     */
    
    public void testGetMensaje() {
        
        }

    /**
     * Test of Traspaso method, of class Comparador.
     */
    
    public void testTraspaso() {
              
    }

    /**
     * Test of Comparar method, of class Comparador.
     */
    @Test
    // pruebo el metodo comparar con el numero de ingreso 26 y dependiendo el numero aletorio tiene 3 posibles salidas correctas
    public void testComparar() {
        System.out.println("Comparar");
        int hum = 26;
        Comparador instance = new Comparador();
        String expResult ="";
        String result = instance.Comparar(hum);
        
        if (hum < Main.numComputadora) {
            expResult ="es menor que el numero a adivinar";
            
        }
        else if (hum > Main.numComputadora) {
                        expResult ="es mayor que el numero a adivinar";
                        
                       
                        }
        else expResult="Ganaste genio,torbellino,maquina,crack" + "\n" + "En tu intento numero " + (Main.getIntentos() - 1);
   
        assertTrue(expResult == result);
    
    }
      
  }
    
    

