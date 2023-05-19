/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.MicroEmpresa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class MicroEmpresaCrud {

    private static ArrayList<MicroEmpresa> collecMicroEmpresa = new ArrayList<>();

    public static MicroEmpresa consultarMicroEmpresa(MicroEmpresa microEmpresa) throws Exception {
        try {
            int indice = buscarIndiceMicroEmpresa(microEmpresa);
            return collecMicroEmpresa.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarMicroEmpresa(MicroEmpresa microEmpresa) throws Exception {
        try {
            int indice = buscarIndiceMicroEmpresa(microEmpresa);
            if (indice == -1 || microEmpresa.getCodigoMicroEmpresa() != collecMicroEmpresa.get(indice).getCodigoMicroEmpresa()) {
                collecMicroEmpresa.add(microEmpresa);
                System.out.println("El MicroEmpresa se registro correctamente");
            } else {
                System.out.println("El MicroEmpresa ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarMicroEmpresa(MicroEmpresa microEmpresa1) throws Exception {
        try {
            int indice = buscarIndiceMicroEmpresa(microEmpresa1);
            collecMicroEmpresa.set(indice, microEmpresa1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceMicroEmpresa(MicroEmpresa microEmpresa) throws Exception {
        try {
            int indice = collecMicroEmpresa.indexOf(microEmpresa);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarMicroEmpresa(MicroEmpresa microEmpresa) throws Exception {
        try {
            int indice = buscarIndiceMicroEmpresa(microEmpresa);
            collecMicroEmpresa.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static List<MicroEmpresa> listarTodo() throws Exception {
        try {
            return collecMicroEmpresa;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarMicroEmpresa() throws Exception {
        try {
            return collecMicroEmpresa.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
