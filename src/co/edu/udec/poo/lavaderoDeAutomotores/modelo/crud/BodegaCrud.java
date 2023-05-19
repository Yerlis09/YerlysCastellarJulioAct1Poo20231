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

    public static Bodega consultarBodega(int codigoBodega) throws Exception {
        try {
            for (Bodega bodega : collecBodega) {
                if (codigoBodega == bodega.getCodigoBodega()) {
                    return bodega;
                }
            }

        } catch (Exception e) {
            throw new Exception(e);
        }
        return null;
    }

    public static void registrarBodega(Bodega Bodega) throws Exception {
        try {
            collecBodega.add(Bodega);
        } catch (Exception e) {
        }
    }

    public static int actualizarBodega(Bodega Bodega1) {
        try {
            for (Bodega bodega : collecBodega) {
                if (bodega.getCodigoBodega() == Bodega1.getCodigoBodega()) {
                    bodega.setNuevoPrecioVentaProducto(1.50000);
                    bodega.setNuevoPrecioVentaProducto(Bodega1.getNuevoPrecioVentaProducto());
                    bodega.setPrecioUnitActualMenosPrecioUnitarioAnt(Bodega1.getPrecioUnitActualMenosPrecioUnitarioAnt());
                    bodega.setStock(Bodega1.getStock());
                    System.out.println("El Bodega fue actualizado correctamente" + bodega);
                }
            }
        } catch (Exception e) {
        }
        return -1;
    }

    public static void eliminarBodega(int codigoBodega) {
        for (Bodega bodega : collecBodega) {
            if (bodega.getCodigoBodega() == codigoBodega) {
                collecBodega.remove(bodega);
                System.out.println("El Bodega fue eliminado correctamente" + collecBodega);
            }
        }
    }

    public static List<Bodega> listarTodo() {
        collecBodega.forEach(bodega -> {
            System.out.println(bodega);
        });
        return null;
    }

    public static int contarBodega() {
        return collecBodega.size();
    }
}
