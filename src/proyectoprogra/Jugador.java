/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

import java.util.ArrayList;

/**
 *
 * @author da_he
 */
public class Jugador {
    private String nombre;
    private double dinero;
    private ArrayList<Producto> tuCarrito;
    
    
    //constructor
    public Jugador(String nombre, double dinero, ArrayList<Producto> tuCarrito) {    
        this.nombre = nombre;
        this.dinero = dinero;
        this.tuCarrito = tuCarrito;
    }

    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getTuCarrito() {
        return tuCarrito;
    }

    public void setTuCarrito(ArrayList<Producto> tuCarrito) {
        this.tuCarrito = tuCarrito;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    
    
    
    
}
