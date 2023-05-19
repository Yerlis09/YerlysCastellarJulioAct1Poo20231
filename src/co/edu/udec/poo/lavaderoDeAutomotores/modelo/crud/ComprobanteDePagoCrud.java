/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.ComprobanteDePago;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ComprobanteDePagoCrud {

    private static ArrayList<ComprobanteDePago> collecComprobanteDePago = new ArrayList<>();

    public static ComprobanteDePago consultarComprobanteDePago(ComprobanteDePago comprobanteDePago) throws Exception {
        try {
            int indice = buscarIndiceComprobanteDePago(comprobanteDePago);
            return collecComprobanteDePago.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarComprobanteDePago(ComprobanteDePago comprobanteDePago) throws Exception {
        try {
            int indice = buscarIndiceComprobanteDePago(comprobanteDePago);
            if (indice == -1 || comprobanteDePago.getCodigoComprobante() != collecComprobanteDePago.get(indice).getCodigoComprobante()) {
                collecComprobanteDePago.add(comprobanteDePago);
                System.out.println("El Comprobante De Pago se registro correctamente");
            } else {
                System.out.println("El Comprobante De Pago ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarComprobanteDePago(ComprobanteDePago comprobanteDePago1) throws Exception {
        try {
            int indice = buscarIndiceComprobanteDePago(comprobanteDePago1);
            collecComprobanteDePago.set(indice, comprobanteDePago1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceComprobanteDePago(ComprobanteDePago comprobanteDePago) throws Exception {
        try {
            int indice = collecComprobanteDePago.indexOf(comprobanteDePago);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarComprobanteDePago(ComprobanteDePago comprobanteDePago) throws Exception {
        try {
            int indice = buscarIndiceComprobanteDePago(comprobanteDePago);
            collecComprobanteDePago.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static List<ComprobanteDePago> listarTodo() throws Exception {
        try {
            return collecComprobanteDePago;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarComprobanteDePago() throws Exception {
        try {
            return collecComprobanteDePago.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
