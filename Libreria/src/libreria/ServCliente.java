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
public interface ServCliente {
    public Cliente Consultar(String Identificador);
    public boolean Existe(String Identificador);
    public boolean Crear(Cliente c);
}
