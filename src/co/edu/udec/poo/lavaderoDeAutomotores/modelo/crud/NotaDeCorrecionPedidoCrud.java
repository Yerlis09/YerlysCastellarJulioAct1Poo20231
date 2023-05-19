/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.NotaDeCorrecionPedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class NotaDeCorrecionPedidoCrud {

    private static ArrayList<NotaDeCorrecionPedido> collecNotaDeCorrecionPedido = new ArrayList<>();

    public static NotaDeCorrecionPedido consultarNotaDeCorrecionPedido(NotaDeCorrecionPedido notaDeCorrecionPedido) throws Exception {
        try {
            int indice = buscarIndiceNotaDeCorrecionPedido(notaDeCorrecionPedido);
            return collecNotaDeCorrecionPedido.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarNotaDeCorrecionPedido(NotaDeCorrecionPedido notaCorrecionDePedido) throws Exception {
        try {
            int indice = buscarIndiceNotaDeCorrecionPedido(notaCorrecionDePedido);
            if (indice == -1 || notaCorrecionDePedido.getCodigoNotaCPedido() != collecNotaDeCorrecionPedido.get(indice).getCodigoNotaCPedido()) {
                collecNotaDeCorrecionPedido.add(notaCorrecionDePedido);
                System.out.println("El NotaDeCorrecionPedido se registro correctamente");
            } else {
                System.out.println("El NotaDeCorrecionPedido ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarNotaDeCorrecionPedido(NotaDeCorrecionPedido notaDeCorrecionPedido1) throws Exception {
        try {
            int indice = buscarIndiceNotaDeCorrecionPedido(notaDeCorrecionPedido1);
            collecNotaDeCorrecionPedido.set(indice, notaDeCorrecionPedido1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceNotaDeCorrecionPedido(NotaDeCorrecionPedido notaDeCorrecionPedido) throws Exception {
        try {
            int indice = collecNotaDeCorrecionPedido.indexOf(notaDeCorrecionPedido);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarNotaDeCorrecionPedido(NotaDeCorrecionPedido notaDeCorrecionPedido) throws Exception {
        try {
            int indice = buscarIndiceNotaDeCorrecionPedido(notaDeCorrecionPedido);
            collecNotaDeCorrecionPedido.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static List<NotaDeCorrecionPedido> listarTodo() throws Exception {
        try {
            return collecNotaDeCorrecionPedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarNotaDeCorrecionPedido() throws Exception {
        try {
            return collecNotaDeCorrecionPedido.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
