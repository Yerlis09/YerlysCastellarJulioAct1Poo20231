/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.NotaDeCorreccion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class NotaDeCorreccionCrud {

    private static ArrayList<NotaDeCorreccion> collecNotaDeCorreccion = new ArrayList<>();

    public static NotaDeCorreccion consultarNotaDeCorreccion(NotaDeCorreccion notaDeCorrecion) throws Exception {
        try {
            int indice = buscarIndiceNotaDeCorreccion(notaDeCorrecion);
            return collecNotaDeCorreccion.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarNotaDeCorreccion(NotaDeCorreccion notaDeCorreccion) throws Exception {
        try {
            int indice = buscarIndiceNotaDeCorreccion(notaDeCorreccion);
            if (indice == -1 || notaDeCorreccion.getCodigoCorreccion() != collecNotaDeCorreccion.get(indice).getCodigoCorreccion()) {
                collecNotaDeCorreccion.add(notaDeCorreccion);
                System.out.println("El NotaDeCorreccion se registro correctamente");
            } else {
                System.out.println("El NotaDeCorreccion ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarNotaDeCorreccion(NotaDeCorreccion notaDeCorrecion1) throws Exception {
        try {
            int indice = buscarIndiceNotaDeCorreccion(notaDeCorrecion1);
            collecNotaDeCorreccion.set(indice, notaDeCorrecion1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceNotaDeCorreccion(NotaDeCorreccion notaDeCorrecion) throws Exception {
        try {
            int indice = collecNotaDeCorreccion.indexOf(notaDeCorrecion);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarNotaDeCorreccion(NotaDeCorreccion notaDeCorrecion) throws Exception {
        try {
            int indice = buscarIndiceNotaDeCorreccion(notaDeCorrecion);
            collecNotaDeCorreccion.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static List<NotaDeCorreccion> listarTodo() throws Exception {
        try {
            return collecNotaDeCorreccion;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarNotaDeCorreccion() throws Exception {
        try {
            return collecNotaDeCorreccion.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
