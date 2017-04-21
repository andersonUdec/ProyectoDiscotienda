/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodisquera;

/**
 *
 * @author Andres Chila
 */
public class Cancion {
    private String nombre;
    private String duracion;
    private String nomDisco;

    public Cancion(String nomDisco, String nombre, String duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.nomDisco = nomDisco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNomDisco() {
        return nomDisco;
    }

    public void setNomDisco(String nomDisco) {
        this.nomDisco = nomDisco;
    }
    
    
}
