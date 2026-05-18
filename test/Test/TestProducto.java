/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Dao.ProductoDaoImpl;
import Interface.IProducto;
import Model.Productos;
import java.util.List;

/**
 *
 * @author LAB 2
 */
public class TestProducto {

    public static IProducto dao = new ProductoDaoImpl();

    public static void main(String[] args) {
        TestProducto t = new TestProducto();
        t.insertar();
        t.listar();
    }

    public static void listar() {
        List<Productos> lista = dao.lista();

        if (lista != null && !lista.isEmpty()) {
            System.out.println("ID\tNombre\tPrecio\tStock");
            for (Productos p : lista) {
                System.out.println(p.getId_producto()
                        + "\t" + p.getNombre() + "\t$"
                        + p.getPrecio() + "\t" + p.getStock());
            }
        } else {
            System.out.println("no hay productos");
        }
    }
    
    public static void insertar(){
        Productos p = new Productos();
        p.setNombre("MOuse Mecanico");
        p.setDescripcion("Retroiluminado");
        p.setPrecio(20.99);
        p.setStock(20);
        p.setImagen("/resouces/img/teclado.jpg");
        boolean result = dao.insert(p);
        if (result) {
            System.out.println("Producto insertado");
        }else{
            System.out.println("Error");
        }  
    }
    
    
    
}


