/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import java.io.Serializable;
/**
 *
 * @author Hector Mamani CC
 */
public class Paises implements Serializable {
    private Integer idcat;
    private String nombre;

    
    public Paises(){}
    
    public Integer getIdcat() {
        return idcat;
    }

    public void setIdcat(Integer idcat) {
        this.idcat = idcat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
    
}
