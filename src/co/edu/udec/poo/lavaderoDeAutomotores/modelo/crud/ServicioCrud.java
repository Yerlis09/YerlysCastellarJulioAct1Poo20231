/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Servicio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ServicioCrud {
    private static ArrayList<Servicio> collecServicio = new ArrayList<>();

    public static Servicio consultarServicio(Servicio servicio) throws Exception {
        try {
            int indice = buscarIndiceServicio(servicio);
            return collecServicio.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static int registrarServicio(Servicio servicio) throws Exception {
        try {
            collecServicio.add(servicio);
            return 1;
        } catch (Exception e) {
           throw new Exception(e.getMessage()); 
        }
    }

    public static int actualizarServicio(Servicio servicio1) throws Exception {
        try {
            int indice = buscarIndiceServicio(servicio1);
            collecServicio.set(indice, servicio1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceServicio(Servicio servicio) throws Exception {
        try {
            int indice = collecServicio.indexOf(servicio);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarServicio(Servicio servicio) throws Exception {
        try {
            int indice = buscarIndiceServicio(servicio);
            collecServicio.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    public static List<Servicio> listarTodo() throws Exception {
        try {
            return collecServicio;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarServicio() throws Exception{
        try {
            return collecServicio.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
