/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomundial.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import proyectomundial.model.Sesion;
import proyectomundial.util.BasedeDatos;

/**
 *
 * @author LAB205BPC02
 */
public class SesionDAO {
    
    public SesionDAO() {
        BasedeDatos.conectar();
    }   
    
    
    public List<Sesion> getSesion(String usuario, String contraseña) {
        
        String sql = "SELECT * from poo.users u";
        List<Sesion> selecciones = new ArrayList<Sesion>();
        
        try {
            ResultSet result = BasedeDatos.ejecutarSQL(sql);
            
            if(result != null) {
            
                while (result.next()) { 
                    Sesion seleccion = new Sesion(result.getString("username"), result.getString("password"));
                    selecciones.add(seleccion);
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Error consultando sesion");
        }
        
        return selecciones;
    }
}
