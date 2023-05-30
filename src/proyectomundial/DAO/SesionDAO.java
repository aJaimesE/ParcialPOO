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
    
    
   public String[] getSesion() {
        String sql = "SELECT * from poo.users u";
        String resultado[] = new String[2];
              
        try {
            ResultSet result = BasedeDatos.ejecutarSQL(sql);
            
            if(result.next()) {
                resultado[0] = result.getString("username");
                resultado[1]= result.getString("password");
            }
            
            
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Error de sesion");
        }
        
        return resultado;
   }
   
   
}
