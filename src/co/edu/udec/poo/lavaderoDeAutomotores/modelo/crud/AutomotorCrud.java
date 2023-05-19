package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Automotor;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class AutomotorCrud {

    private static ArrayList<Automotor> collecAutomotor = new ArrayList<>();

    public static Automotor consultarAutomotor(int codigoAutomotor) throws Exception {
        try {
            for (Automotor auto : collecAutomotor) {
                if (codigoAutomotor == auto.getCodigoAutomotor()) {
                    return auto;
                }
            }

        } catch (Exception e) {
            throw new Exception(e);
        }
        return null;
    }

    public static void registrarAutomotor(Automotor automotor) throws Exception {
        try {
            collecAutomotor.add(automotor);
        } catch (Exception e) {
        }
    }

    public static int actualizarAutomotor(Automotor automotor1) {
        try {
            for (Automotor auto : collecAutomotor) {
                if (auto.getCodigoAutomotor() == automotor1.getCodigoAutomotor()) {
                    auto.setColor("byyyy");
                    auto.setMarca(automotor1.getMarca());
                    auto.setPlanta(automotor1.getPlanta());
                    auto.setTipo(automotor1.getTipo());
                    System.out.println("El automotor fue actualizado correctamente" + auto);
                }
            }
        } catch (Exception e) {
        }
        return -1;
    }

    public static void eliminarAutomotor(int codigoAtomotor) {
        for (Automotor auto : collecAutomotor) {
            if (auto.getCodigoAutomotor() == codigoAtomotor) {
                collecAutomotor.remove(auto);
                System.out.println("El automotor fue eliminado correctamente" + collecAutomotor);
            }
        }
    }

    public static List<Automotor> listarTodo() {
        collecAutomotor.forEach(auto -> {
            System.out.println(auto);
        });
        return null;
    }

    public static int contarAutomotor() {
        return collecAutomotor.size();

    }
}
