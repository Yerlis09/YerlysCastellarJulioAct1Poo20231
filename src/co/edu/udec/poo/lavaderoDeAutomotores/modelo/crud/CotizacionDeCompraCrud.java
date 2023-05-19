/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.CotizacionDeCompra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class CotizacionDeCompraCrud {

    private static ArrayList<CotizacionDeCompra> collecCotizacionDeCompra = new ArrayList<>();

    public static CotizacionDeCompra consultarCotizacionDeCompra(CotizacionDeCompra cotizacionDeCompra) throws Exception {
        try {
            int indice = buscarIndiceCotizacionDeCompra(cotizacionDeCompra);
            return collecCotizacionDeCompra.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarCotizacionDeCompra(CotizacionDeCompra cotizacionDeCompra) throws Exception {
        try {
            int indice = buscarIndiceCotizacionDeCompra(cotizacionDeCompra);
            if (indice == -1 || cotizacionDeCompra.getCodigoCotizacion() != collecCotizacionDeCompra.get(indice).getCodigoCotizacion()) {
                collecCotizacionDeCompra.add(cotizacionDeCompra);
                System.out.println("El CotizacionDeCompra se registro correctamente");
            } else {
                System.out.println("El CotizacionDeCompra ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarCotizacionDeCompra(CotizacionDeCompra cotizacionDeCompra1) throws Exception {
        try {
            int indice = buscarIndiceCotizacionDeCompra(cotizacionDeCompra1);
            collecCotizacionDeCompra.set(indice, cotizacionDeCompra1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceCotizacionDeCompra(CotizacionDeCompra cotizacionDeCompra) throws Exception {
        try {
            int indice = collecCotizacionDeCompra.indexOf(cotizacionDeCompra);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarCotizacionDeCompra(CotizacionDeCompra cotizacionDeCompra) throws Exception {
        try {
            int indice = buscarIndiceCotizacionDeCompra(cotizacionDeCompra);
            collecCotizacionDeCompra.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static List<CotizacionDeCompra> listarTodo() throws Exception {
        try {
            return collecCotizacionDeCompra;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarCotizacionDeCompra() throws Exception {
        try {
            return collecCotizacionDeCompra.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
