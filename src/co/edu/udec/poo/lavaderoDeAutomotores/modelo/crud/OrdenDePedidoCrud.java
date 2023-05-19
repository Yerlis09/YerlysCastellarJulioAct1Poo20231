/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.OrdenDePedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class OrdenDePedidoCrud {

    private static ArrayList<OrdenDePedido> collecOrdenDePedido = new ArrayList<>();

    public static OrdenDePedido consultarOrdenDePedido(OrdenDePedido ordenDePedido) throws Exception {
        try {
            int indice = buscarIndiceOrdenDePedido(ordenDePedido);
            return collecOrdenDePedido.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarOrdenDePedido(OrdenDePedido ordenDePedido) throws Exception {
        try {
            int indice = buscarIndiceOrdenDePedido(ordenDePedido);
            if (indice == -1 || ordenDePedido.getCodigoOrden() != collecOrdenDePedido.get(indice).getCodigoOrden()) {
                collecOrdenDePedido.add(ordenDePedido);
                System.out.println("El OrdenDePedido se registro correctamente");
            } else {
                System.out.println("El OrdenDePedido ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarOrdenDePedido(OrdenDePedido ordenDePedido1) throws Exception {
        try {
            int indice = buscarIndiceOrdenDePedido(ordenDePedido1);
            collecOrdenDePedido.set(indice, ordenDePedido1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceOrdenDePedido(OrdenDePedido ordenDePedido) throws Exception {
        try {
            int indice = collecOrdenDePedido.indexOf(ordenDePedido);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarOrdenDePedido(OrdenDePedido ordenDePedido) throws Exception {
        try {
            int indice = buscarIndiceOrdenDePedido(ordenDePedido);
            collecOrdenDePedido.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static List<OrdenDePedido> listarTodo() throws Exception {
        try {
            return collecOrdenDePedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarOrdenDePedido() throws Exception {
        try {
            return collecOrdenDePedido.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
