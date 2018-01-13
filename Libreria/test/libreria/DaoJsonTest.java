/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GABRIEL BARON
 */
public class DaoJsonTest {
    
    public DaoJsonTest() {
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
     * Test of LeerArchivo method, of class DaoJson.
     */
    @Test
    public void testLeerArchivo() {
       System.out.println("LeerArchivo");
       Dao instance = new DaoJson("Clientes.json");
        int result = instance.LeerArchivo().size();
        assertTrue(result>0); //Se espera una lista con Clientes
        // TODO review the generated test code and remove the default call to fail.
        if (result==0){
         fail("No se espera una lista vacia");
        }
    }

    /**
     * Test of Registrar method, of class DaoJson.
     */
    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        List<Cliente> clientes = null;
        DaoJson instance = new DaoJson("Clientes.json");
        clientes = instance.LeerArchivo();
        boolean registro = instance.Registrar(clientes);
        assertTrue(registro);
        // TODO review the generated test code and remove the default call to fail.
        if (!registro){
          fail("Se espera escribir en un archivo json que exista");
        }
    }
}
