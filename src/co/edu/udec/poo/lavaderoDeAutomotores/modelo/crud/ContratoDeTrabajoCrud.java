/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.ContratoDeTrabajo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ContratoDeTrabajoCrud {

    private static ArrayList<ContratoDeTrabajo> collecContratoDeTrabajo = new ArrayList<>();

    public static ContratoDeTrabajo consultarContratoDeTrabajo(ContratoDeTrabajo contratoDeTrabajo) throws Exception {
        try {
            int indice = buscarIndiceContratoDeTrabajo(contratoDeTrabajo);
            return collecContratoDeTrabajo.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarContratoDeTrabajo(ContratoDeTrabajo contratoDeTrabajo) throws Exception {
        try {
            int indice = buscarIndiceContratoDeTrabajo(contratoDeTrabajo);
            if (indice == -1 || contratoDeTrabajo.getCodigoContrato() != collecContratoDeTrabajo.get(indice).getCodigoContrato()) {
                collecContratoDeTrabajo.add(contratoDeTrabajo);
                System.out.println("El ContratoDeTrabajo se registro correctamente");
            } else {
                System.out.println("El ContratoDeTrabajo ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarContratoDeTrabajo(ContratoDeTrabajo contratoDeTrabajo1) throws Exception {
        try {
            int indice = buscarIndiceContratoDeTrabajo(contratoDeTrabajo1);
            collecContratoDeTrabajo.set(indice, contratoDeTrabajo1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceContratoDeTrabajo(ContratoDeTrabajo contratoDeTrabajo) throws Exception {
        try {
            int indice = collecContratoDeTrabajo.indexOf(contratoDeTrabajo);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarContratoDeTrabajo(ContratoDeTrabajo contratoDeTrabajo) throws Exception {
        try {
            int indice = buscarIndiceContratoDeTrabajo(contratoDeTrabajo);
            collecContratoDeTrabajo.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static List<ContratoDeTrabajo> listarTodo() throws Exception {
        try {
            return collecContratoDeTrabajo;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarContratoDeTrabajo() throws Exception {
        try {
            return collecContratoDeTrabajo.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
