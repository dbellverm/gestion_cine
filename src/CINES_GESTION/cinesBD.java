/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CINES_GESTION;
    import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dani Bellver
 */
public class cinesBD {

    static private Connection conBD;
    static private Statement insBD;
    static private ResultSet resBD;
    private String ruta;
    
   public cinesBD(){
       
       conBD=null;
       
      
   } 

    /**
     * @param aConBD the conBD to set
     */
    public static void setConBD(String ruta,String user,String pass) {
        String urlc="jdbc:mysql:"+ruta;
        
        
        try {
            conBD =DriverManager.getConnection(urlc, user, pass) ;
            insBD=conBD.createStatement();
        } catch (SQLException ex) {
           System.out.print("No se ha podido establecer la conexion, intentelo de nuevo.");        }
    }

    /**
     * @return the ResBD
     */
  

    /**
     * @param aResBD the ResBD to set
     */
    public static void altacine(cines cine1) {
       String SQL="INSERT INTO usuaris VALUES(NULL,'"+cine1.getNombre()+"','"+cine1.getPoblacion()+"')";
        try {
            int files=insBD.executeUpdate(SQL);
        } catch (SQLException ex) {
           System.out.print("No se ha podido ejectutar las secuencia SQL");
        }
        
    }
    
    public static void bajacine(int codi){
           String SQL="DELETE FROM cines WHERE codi="+codi;
           try {
            int files=insBD.executeUpdate(SQL);
        } catch (SQLException ex) {
           System.out.print("No se ha podido ejectutar las secuencia SQL");
        }
        
        
        
    }
    
    public static void modcine(cines cine1){
         String SQL="update cines set nombre="+cine1.getNombre()+",poblacion="+cine1.getPoblacion()+
                 "where codi="+cine1.getCodi();
           try {
            int files=insBD.executeUpdate(SQL);
        } catch (SQLException ex) {
           System.out.print("No se ha podido ejectutar las secuencia SQL");
        }
        
        
    }
    
    public ArrayList<cines> consultaMultiple() {
   int idUsuari;
   cines cine1=null;
   ArrayList<cines> listarcines=new ArrayList<cines>();
   String codi,nom,poblacion;
   int icodi;
       try{
       resBD=insBD.executeQuery("SELECT * FROM cines "
       + "WHERE ");
       while(resBD.next()) {
	  icodi=resBD.getInt(1);
	  nom=resBD.getString(2);
	  poblacion=resBD.getString(3);
	  
          cine1=new cines();
          cine1.setCodi(icodi);
          cine1.setNombre(nom);
          cine1.setPoblacion(poblacion);
          listarcines.add(cine1);
          }
       return listarcines;
      }
      catch(SQLException e) {
	return null;
      }    
       
   }

 
   
    
    
}

