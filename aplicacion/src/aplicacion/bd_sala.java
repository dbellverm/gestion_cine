/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dani_
 */
public class bd_sala {
   Connection conexio=null;
   Statement instruccions=null;
   ResultSet resultat=null;
   
   public bd_sala(){
       
   }
   
   public boolean connectar() {
    try {
	conexio=DriverManager.getConnection("jdbc:mysql://localhost:3306/cines",
				"root","ercros89");
	instruccions=conexio.createStatement();
        return true;
	} catch (SQLException e) {
	      
	return false;
	}   
   }
   
   public boolean desconnectar() {
      try {
	    conexio.close();
            return true;
	  } catch (SQLException e) {
	    // TODO Auto-generated catch block
	    return false;
          }		
   }
   
   
  public int alta(programa p){
      
       String cadenaSQL="INSERT INTO programa VALUES(NULL,'"+p.getIdCine()+"','"+p.e+"')";
   
      
      
       return 0;
  }
  
  public int modificar(programa p){
      
      return 0;
  }
  
  public int elimninar(programa p){
      
      return 0;
  }
   
}
