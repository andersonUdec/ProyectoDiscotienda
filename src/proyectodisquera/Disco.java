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
public class Disco {
    private String artNombre;
    private String discNombre;
    private int precio;

    public Disco(String artNombre, String discNombre, int precio) {
        this.artNombre = artNombre;
        this.discNombre = discNombre;
        this.precio = precio;
    }

    public String getArtNombre() {
        return artNombre;
    }

    public void setArtNombre(String artNombre) {
        this.artNombre = artNombre;
    }


    public String getDiscNombre() {
        return discNombre;
    }

    public void setDiscNombre(String canNombre) {
        this.discNombre = canNombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
