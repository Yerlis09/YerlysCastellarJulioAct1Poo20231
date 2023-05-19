/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.OrdenDeVenta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class OrdenDeVentaCrud {
    private static ArrayList<OrdenDeVenta> collecOrdenDeVenta = new ArrayList<>();

    public static OrdenDeVenta consultarOrdenDeVenta(OrdenDeVenta ordenDeVenta) throws Exception {
        try {
            int indice = buscarIndiceOrdenDeVenta(ordenDeVenta);
            return collecOrdenDeVenta.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static int registrarOrdenDeVenta(OrdenDeVenta ordenDeVenta) throws Exception {
        try {
            collecOrdenDeVenta.add(ordenDeVenta);
            return 1;
        } catch (Exception e) {
           throw new Exception(e.getMessage()); 
        }
    }

    public static int actualizarOrdenDeVenta(OrdenDeVenta ordenDeVenta1) throws Exception {
        try {
            int indice = buscarIndiceOrdenDeVenta(ordenDeVenta1);
            collecOrdenDeVenta.set(indice, ordenDeVenta1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceOrdenDeVenta(OrdenDeVenta ordenDeVenta) throws Exception {
        try {
            int indice = collecOrdenDeVenta.indexOf(ordenDeVenta);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarOrdenDeVenta(OrdenDeVenta ordenDeVenta) throws Exception {
        try {
            int indice = buscarIndiceOrdenDeVenta(ordenDeVenta);
            collecOrdenDeVenta.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    public static List<OrdenDeVenta> listarTodo() throws Exception {
        try {
            return collecOrdenDeVenta;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarOrdenDeVenta() throws Exception{
        try {
            return collecOrdenDeVenta.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
