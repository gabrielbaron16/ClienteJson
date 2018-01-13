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
public class ServClienteImpl implements ServCliente{
    List<Cliente> clientes;

    public ServClienteImpl(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public Cliente Consultar(String Identificador){
        for(int i = 0; i < this.clientes.size(); i++) {   
          if ((this.clientes.get(i).getCedula().equals(Identificador))||(this.clientes.get(i).getId().equals(Identificador))){
            return this.clientes.get(i);
          }
        }
        return null;
    }
    public boolean Existe(String Identificador){
        for(int i = 0; i < this.clientes.size(); i++) {   
          if ((this.clientes.get(i).getCedula().equals(Identificador))||(this.clientes.get(i).getId().equals(Identificador))){
            return true;
          }
        }
        return false;
    }
    public boolean Crear(Cliente c){
        if (Existe(c.getCedula())){
            System.out.println("Usuario Repetido");
            return false;
        }
        else{
            this.clientes.add(c);
            Dao d = new DaoJson("Clientes.json");
            return d.Registrar(this.clientes);
        }
    }
}
