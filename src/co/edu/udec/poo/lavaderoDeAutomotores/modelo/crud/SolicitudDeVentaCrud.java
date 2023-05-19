/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.SolicitudDeVenta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class SolicitudDeVentaCrud {
    private static ArrayList<SolicitudDeVenta> collecSolicitudDeVenta = new ArrayList<>();

    public static SolicitudDeVenta consultarSolicitudDeVenta(SolicitudDeVenta solicitudDeVenta) throws Exception {
        try {
            int indice = buscarIndiceSolicitudDeVenta(solicitudDeVenta);
            return collecSolicitudDeVenta.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static int registrarSolicitudDeVenta(SolicitudDeVenta solicitudDeVenta) throws Exception {
        try {
            collecSolicitudDeVenta.add(solicitudDeVenta);
            return 1;
        } catch (Exception e) {
           throw new Exception(e.getMessage()); 
        }
    }

    public static int actualizarSolicitudDeVenta(SolicitudDeVenta solicitudDeVenta1) throws Exception {
        try {
            int indice = buscarIndiceSolicitudDeVenta(solicitudDeVenta1);
            collecSolicitudDeVenta.set(indice, solicitudDeVenta1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceSolicitudDeVenta(SolicitudDeVenta solicitudDeVenta) throws Exception {
        try {
            int indice = collecSolicitudDeVenta.indexOf(solicitudDeVenta);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarSolicitudDeVenta(SolicitudDeVenta solicitudDeVenta) throws Exception {
        try {
            int indice = buscarIndiceSolicitudDeVenta(solicitudDeVenta);
            collecSolicitudDeVenta.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    public static List<SolicitudDeVenta> listarTodo() throws Exception {
        try {
            return collecSolicitudDeVenta;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarSolicitudDeVenta() throws Exception{
        try {
            return collecSolicitudDeVenta.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
