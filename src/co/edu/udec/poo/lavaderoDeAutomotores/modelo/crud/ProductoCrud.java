/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ProductoCrud {
    private static ArrayList<Producto> collecProducto = new ArrayList<>();

    public static Producto consultarProducto(Producto producto) throws Exception {
        try {
            int indice = buscarIndiceProducto(producto);
            return collecProducto.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static int registrarProducto(Producto producto) throws Exception {
        try {
            collecProducto.add(producto);
            return 1;
        } catch (Exception e) {
           throw new Exception(e.getMessage()); 
        }
    }

    public static int actualizarProducto(Producto producto1) throws Exception {
        try {
            int indice = buscarIndiceProducto(producto1);
            collecProducto.set(indice, producto1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceProducto(Producto producto) throws Exception {
        try {
            int indice = collecProducto.indexOf(producto);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarProducto(Producto producto) throws Exception {
        try {
            int indice = buscarIndiceProducto(producto);
            collecProducto.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    public static List<Producto> listarTodo() throws Exception {
        try {
            return collecProducto;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarProducto() throws Exception{
        try {
            return collecProducto.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
