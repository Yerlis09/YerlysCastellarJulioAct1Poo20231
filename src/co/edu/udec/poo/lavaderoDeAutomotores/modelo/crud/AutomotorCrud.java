package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Automotor;

import java.util.List;
import java.util.ArrayList;

public class AutomotorCrud {

    private static ArrayList<Automotor> collecAutomotor = new ArrayList<>();

    public static Automotor consultarAutomotor(Automotor automotor) throws Exception {
        try {
            int indice = buscarIndiceAutomotor(automotor);
            return collecAutomotor.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarAutomotor(Automotor automotor) throws Exception {
        try {
            int indice = buscarIndiceAutomotor(automotor);
            if (indice == -1 || automotor.getCodigoAutomotor() != collecAutomotor.get(indice).getCodigoAutomotor()) {
                collecAutomotor.add(automotor);
                System.out.println("El automotor se registro correctamente");
            } else {
                System.out.println("El automotor ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarAutomotor(Automotor automotor1) throws Exception {
        try {
            int indice = buscarIndiceAutomotor(automotor1);
            collecAutomotor.set(indice, automotor1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceAutomotor(Automotor automotor) throws Exception {
        try {
            int indice = collecAutomotor.indexOf(automotor);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarAutomotor(Automotor automotor) throws Exception {
        try {
            int indice = buscarIndiceAutomotor(automotor);
            collecAutomotor.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static List<Automotor> listarTodo() throws Exception {
        try {
            return collecAutomotor;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarAutomotor() throws Exception {
        try {
            return collecAutomotor.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
