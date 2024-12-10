/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

import java.util.ArrayList;
import java.util.Random;
import proyectoprogra.Producto;

/**
 *
 * @author da_he
 */
public class Supermercado {
    static ArrayList<Producto> basket = new ArrayList<Producto>();
    public static Producto[] products = new Producto[20];
    public static String[][] yourProducts = new String[10][2];
    
    
    //genera los productos del super
    public static void productosSuper(){
        //estos son los productos
        String[] nombres = {"Leche", "Arroz", "Pan", "Jabón", "Cereal", "Manzanas", "Carne", "Huevos", "Azúcar", "Papel Higiénico", "Aceite", "Galletas", "Pescado", "Tomates", "Frijoles", "Hotdogs", "Jugo", "Café", "Sal", "Sopa"};
        double[] precios = {1.5, 0.9, 1.2, 3.5, 2.0, 1.8, 3.5, 2.5, 1.1, 0.8, 3.0, 1.6, 3.5, 2.8, 1.0, 2.2, 1.7, 2.9, 0.5, 1.9};
        
        //almacena los productos y los precios en un solo string para despues seleccionar 10
        for (int i=0; i<products.length; i++){
            products[i] = new Producto(nombres[i], precios[i]); //almaceno los nombres y precios en un objeto para poder llamarlos
        }
    }
    
    //llena el almacen del super con 10 objetos al azar, sin repetirlos
    public static void ListaMama() {
        Random rng = new Random();
        ArrayList<Integer> seleccionados = new ArrayList<>(); 
        for (int i = 0; i < yourProducts.length; i++) {
            int random;
            Producto unit;
            do {
                random = rng.nextInt(0, 20);
                unit = products[random];
            } while (seleccionados.contains(random));
            seleccionados.add(random);
            yourProducts[i][0] = unit.getNombre();
            yourProducts[i][1] = String.valueOf(unit.getPrecio());
        }
    }
    //metodo para ver los productos del super
    public static void verProductos() {
        System.out.println("Productos disponibles en el supermercado:");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Producto: " + products[i].getNombre() + " | Precio: $" + products[i].getPrecio());
        }
    }
    //Imprime la lista de lo que quiere mama
    public static void verListaMama() {
        System.out.println("Lista de productos que mamá quiere:");
        for (int i = 0; i < yourProducts.length; i++) {
            System.out.println("Producto: " + yourProducts[i][0] + " | Precio: $" + yourProducts[i][1]);
        }
    }
    
   
    
}
    
    


