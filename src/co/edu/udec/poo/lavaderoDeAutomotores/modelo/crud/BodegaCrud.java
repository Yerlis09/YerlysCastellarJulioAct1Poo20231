package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Bodega;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class BodegaCrud {

    private static ArrayList<Bodega> collecBodega = new ArrayList<>();

    public static Bodega consultarBodega(Bodega bodega) throws Exception {
        try {
            int indice = buscarIndiceBodega(bodega);
            return collecBodega.get(indice);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void registrarBodega(Bodega bodega) throws Exception {
        try {
            int indice = buscarIndiceBodega(bodega);
            if (indice == -1 || bodega.getCodigoBodega() != collecBodega.get(indice).getCodigoBodega()) {
                collecBodega.add(bodega);
                System.out.println("El Bodega se registro correctamente");
            } else {
                System.out.println("El Bodega ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarBodega(Bodega bodega) throws Exception {
        try {
            int indice = buscarIndiceBodega(bodega);
            collecBodega.set(indice, bodega);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceBodega(Bodega bodega) throws Exception {
        try {
            int indice = collecBodega.indexOf(bodega);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarBodega(Bodega bodega) throws Exception {
        try {
            int indice = buscarIndiceBodega(bodega);
            collecBodega.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static List<Bodega> listarTodo() throws Exception {
        try {
            return collecBodega;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarBodega() throws Exception {
        try {
            return collecBodega.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
