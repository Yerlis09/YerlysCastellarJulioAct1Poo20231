/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.DetalleProductNoCorres;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class DetalleProductNoCorresCrud {
    private static ArrayList<DetalleProductNoCorres> collecDetalleProductNoCorres = new ArrayList<>();

    public static DetalleProductNoCorres consultarDetalleProductNoCorres(DetalleProductNoCorres detalleProductNoCorres) throws Exception {
        try {
            int indice = buscarIndiceDetalleProductNoCorres(detalleProductNoCorres);
            return collecDetalleProductNoCorres.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static int registrarDetalleProductNoCorres(DetalleProductNoCorres detalleProductNoCorres) throws Exception {
        try {
            collecDetalleProductNoCorres.add(detalleProductNoCorres);
            return 1;
        } catch (Exception e) {
           throw new Exception(e.getMessage()); 
        }
    }

    public static int actualizarDetalleProductNoCorres(DetalleProductNoCorres detalleProductNoCorres1) throws Exception {
        try {
            int indice = buscarIndiceDetalleProductNoCorres(detalleProductNoCorres1);
            collecDetalleProductNoCorres.set(indice, detalleProductNoCorres1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceDetalleProductNoCorres(DetalleProductNoCorres detalleProductNoCorres) throws Exception {
        try {
            int indice = collecDetalleProductNoCorres.indexOf(detalleProductNoCorres);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarDetalleProductNoCorres(DetalleProductNoCorres detalleProductNoCorres) throws Exception {
        try {
            int indice = buscarIndiceDetalleProductNoCorres(detalleProductNoCorres);
            collecDetalleProductNoCorres.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    public static List<DetalleProductNoCorres> listarTodo() throws Exception {
        try {
            return collecDetalleProductNoCorres;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarDetalleProductNoCorres() throws Exception{
        try {
            return collecDetalleProductNoCorres.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
