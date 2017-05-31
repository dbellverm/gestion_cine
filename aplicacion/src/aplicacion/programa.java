/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.sql.Time;

/**
 *
 * @author dani_
 */
public class programa {
    /**
     Inicio
     Atributos de programa
     */
    
    private int 
    idSessio,
    idCine,
    idSala,
    duracio;
    private String pelicula;
    private Time horainici;

    /**
     * @return the idSessio
     */
    public int getIdSessio() {
        return idSessio;
    }

    /**
     * @param idSessio the idSessio to set
     */
    public void setIdSessio(int idSessio) {
        this.idSessio = idSessio;
    }

    /**
     * @return the idCine
     */
    public int getIdCine() {
        return idCine;
    }

    /**
     * @param idCine the idCine to set
     */
    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    /**
     * @return the idSala
     */
    public int getIdSala() {
        return idSala;
    }

    /**
     * @param idSala the idSala to set
     */
    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    /**
     * @return the duracio
     */
    public int getDuracio() {
        return duracio;
    }

    /**
     * @param duracio the duracio to set
     */
    public void setDuracio(int duracio) {
        this.duracio = duracio;
    }

    /**
     * @return the pelicula
     */
    public String getPelicula() {
        return pelicula;
    }

    /**
     * @param pelicula the pelicula to set
     */
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * @return the horainici
     */
    public Time getHorainici() {
        return horainici;
    }

    /**
     * @param horainici the horainici to set
     */
    public void setHorainici(Time horainici) {
        this.horainici = horainici;
    }
    /**
     Fin
     Atributos de programa
     */
    
    
    
}
