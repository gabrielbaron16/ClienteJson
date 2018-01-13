/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.List;

/**
 *
 * @author GABRIEL BARON
 */
public interface Dao {
    public List<Cliente> LeerArchivo();
    public boolean Registrar(List<Cliente> clientes);
    
}
