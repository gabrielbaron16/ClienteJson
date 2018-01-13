/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

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
public class ServClienteImplTest {
    
    public ServClienteImplTest() {
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
     * Test of Consultar method, of class ServClienteImpl.
     */
    @Test
    public void testConsultar() {
        System.out.println("Consultar");
        String Identificador = "26082804";
        Dao inst = new DaoJson("Clientes.json");
        ServClienteImpl instance = new ServClienteImpl(inst.LeerArchivo());
        Cliente c = instance.Consultar(Identificador);
        assertTrue((c instanceof Cliente)||(c==null));
        // TODO review the generated test code and remove the default call to fail.
        if (!((c instanceof Cliente)||(c==null))){
          fail("Se espera un Objeto Cliente o Nulo");
        }
    }


}
