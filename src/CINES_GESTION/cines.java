/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CINES_GESTION;

/**
 *
 * @author Dani Bellver
 */
public class cines {
    private int codi;
    private String nombre;
    private String poblacion;

    /**
     * @return the codi
     */
    public int getCodi() {
        return codi;
    }
    
     public void setCodi(int codigo){
         codi=codigo;
     }
    
    
    public String getNombre(){
        return nombre;
        
    }
    
    public void setNombre( String nom){
        nombre=nom;
        
    }
     /**
     * @return the poblacion
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * @param poblacion the poblacion to set
     */
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    
}
