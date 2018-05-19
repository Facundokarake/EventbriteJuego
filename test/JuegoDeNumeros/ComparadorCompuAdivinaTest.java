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
public class ComparadorCompuAdivinaTest {
    
    public ComparadorCompuAdivinaTest() {
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
     * Test of getIntentosCompu method, of class ComparadorCompuAdivina.
     */
    @Test
    //pruebo el metodo get
    public void testGetIntentosCompu() {
        System.out.println("getIntentosCompu");
        ComparadorCompuAdivina instance = new ComparadorCompuAdivina();
        int expResult = 29;
        instance.setIntentosCompu(expResult);
        int result = instance.getIntentosCompu();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of setIntentosCompu method, of class ComparadorCompuAdivina.
     */
    @Test
    //pruebo el metodo set
    public void testSetIntentosCompu() {
        System.out.println("setIntentosCompu");
        int IntentosCompu = 17;
        ComparadorCompuAdivina instance = new ComparadorCompuAdivina();
        instance.setIntentosCompu(IntentosCompu);
        assertEquals(IntentosCompu, instance.getIntentosCompu());

    }

    /**
     * Test of getNumCompu method, of class ComparadorCompuAdivina.
     */
    @Test
    public void testGetNumCompu() {
        System.out.println("getNumCompu");
        ComparadorCompuAdivina instance = new ComparadorCompuAdivina();
        int expResult = 68;
       instance.setNumCompu(expResult);
        int result = instance.getNumCompu();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNumCompu method, of class ComparadorCompuAdivina.
     */
    @Test
    public void testSetNumCompu() {
        System.out.println("setNumCompu");
        int numCompu = 0;
        ComparadorCompuAdivina instance = new ComparadorCompuAdivina();
        instance.setNumCompu(numCompu);
        assertEquals(numCompu, instance.getNumCompu());
        
    }

    /**
     * Test of menos method, of class ComparadorCompuAdivina.
     */
    @Test
    public void testMenos() {
        System.out.println("menos");
        ComparadorCompuAdivina instance = new ComparadorCompuAdivina();
        int numCompuu= 43;
        instance.setNumCompu(numCompuu);
        instance.menos();
        assertEquals(numCompuu-1, instance.getVarMax());
        
        
    }

    /**
     * Test of mas method, of class ComparadorCompuAdivina.
     */
    @Test
    // pruebo el metodo test mas ingresando el numero 43 y viendo que setee correctamente el valor minimo
    public void testMas() {
        System.out.println("mas");
        ComparadorCompuAdivina instance = new ComparadorCompuAdivina();
         int numCompuu= 43;
         instance.setNumCompu(numCompuu);
         instance.mas();
         assertEquals(numCompuu+1, instance.getVarMenor());
         
         
         
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    //Pruebo el metodo mas si el numero aletorio que crea esta entre 1 y 100
    public void testMasAletorio() {
        System.out.println("masAletorio");
        ComparadorCompuAdivina instance = new ComparadorCompuAdivina();
        instance.mas();
        assertTrue(instance.getNumCompu()<=100 && instance.getNumCompu() >=1);
         
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
     public void testMenosAletorio() {
        System.out.println("menosAletorio");
        ComparadorCompuAdivina instance = new ComparadorCompuAdivina();
        instance.menos();
        assertTrue(instance.getNumCompu()<=100 && instance.getNumCompu() >=1);
         
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
