/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author GABRIEL BARON
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dao d = new DaoJson("Clientes.json");
        ServCliente Client = new ServClienteImpl(d.LeerArchivo());
        Cliente cl = Client.Consultar("12345678");
        System.out.println("Nombre: " + cl.getNombre());
        System.out.println("Apellido: " + cl.getApellido());
        System.out.println("Cedula: " + cl.getCedula());
        System.out.println("Fecha de Compra : "+ cl.getFecha());
        System.out.println("ID: " + cl.getId());
        Cliente c = new Cliente("Mario","Gomez","19082804","08/01/2018","887654321");
        Client.Crear(c);
    }
    
}
