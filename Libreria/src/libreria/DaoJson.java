
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author GABRIEL BARON
 */
public class DaoJson implements Dao{
    //List<Cliente> clientes;
    String NombreArchivo;

    public DaoJson(String NombreArchivo) {
        this.NombreArchivo = NombreArchivo;
    }
    
    public List<Cliente> LeerArchivo(){
        List<Cliente> clientes = new ArrayList();
        JSONParser parser = new JSONParser();
        try{
        Object obj = parser.parse(new FileReader(this.NombreArchivo));
        JSONObject jsonObject = (JSONObject) obj;
        JSONArray cli = (JSONArray) jsonObject.get("Clientes");
        Iterator<JSONObject> iterator = cli.iterator();
        while (iterator.hasNext()) {
            JSONObject client =  (JSONObject) iterator.next();
            String Nombre = (String) client.get("Nombre");
            String Apellido = (String) client.get("Apellido");
            String Cedula =  (String) client.get("Cedula");
            String Fecha = (String) client.get("Fecha");
            String Id = (String) client.get("id");
            Cliente c = new Cliente(Nombre,Apellido,Cedula,Fecha,Id);
            clientes.add(c);
	}
        } catch (FileNotFoundException e) {
		//manejo de error
	} catch (IOException e) {
		//manejo de error
	} catch (ParseException e) {
	//manejo de error
        }
        return clientes;
    }
    public boolean Registrar(List<Cliente> clientes){
        JSONObject obj = new JSONObject();
        JSONArray list = new JSONArray();
        for(int i = 0; i < clientes.size(); i++) { 
            JSONObject cliente = new JSONObject();
            cliente.put("Nombre",clientes.get(i).getNombre());
            cliente.put("Apellido",clientes.get(i).getApellido());
            cliente.put("Cedula",clientes.get(i).getCedula());
            cliente.put("Fecha",clientes.get(i).getFecha());
            cliente.put("id",clientes.get(i).getId());
            list.add(cliente);
        }
        obj.put("Clientes",list);
        try {
                File f = new File(this.NombreArchivo);
                if (!f.exists()){
                    return false;
                }
		FileWriter file = new FileWriter(this.NombreArchivo);
		file.write(obj.toJSONString());
		file.flush();
		file.close();
	} catch (IOException e) {
	}
        System.out.println(obj);
        return true;
    }
    
}
