/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Proveedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ProveedorCrud {
    private static ArrayList<Proveedor> collecProveedor = new ArrayList<>();

    public static Proveedor consultarProveedor(Proveedor proveedor) throws Exception {
        try {
            int indice = buscarIndiceProveedor(proveedor);
            return collecProveedor.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static int registrarProveedor(Proveedor proveedor) throws Exception {
        try {
            collecProveedor.add(proveedor);
            return 1;
        } catch (Exception e) {
           throw new Exception(e.getMessage()); 
        }
    }

    public static int actualizarProveedor(Proveedor proveedor1) throws Exception {
        try {
            int indice = buscarIndiceProveedor(proveedor1);
            collecProveedor.set(indice, proveedor1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceProveedor(Proveedor proveedor) throws Exception {
        try {
            int indice = collecProveedor.indexOf(proveedor);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarProveedor(Proveedor proveedor) throws Exception {
        try {
            int indice = buscarIndiceProveedor(proveedor);
            collecProveedor.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    public static List<Proveedor> listarTodo() throws Exception {
        try {
            return collecProveedor;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarProveedor() throws Exception{
        try {
            return collecProveedor.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
