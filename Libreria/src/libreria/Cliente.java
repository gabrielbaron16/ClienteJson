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
public class Cliente {
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String Fecha;
    private String Id;

    public Cliente(String Nombre, String Apellido, String Cedula, String Fecha, String Id) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Fecha = Fecha;
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getId() {
        return Id;
    }    
}
