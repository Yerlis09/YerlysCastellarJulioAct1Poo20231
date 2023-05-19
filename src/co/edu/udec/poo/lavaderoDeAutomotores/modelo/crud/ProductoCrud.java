package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ProductoCrud {

    private static ArrayList<Producto> collecProducto = new ArrayList<>();

    public static Producto consultarProducto(Producto producto) throws Exception {
        try {
            int indice = buscarIndiceProducto(producto);
            return collecProducto.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarProducto(Producto producto) throws Exception {
        try {
            int indice = buscarIndiceProducto(producto);
            if (indice == -1 || producto.getCodigoProducto() != collecProducto.get(indice).getCodigoProducto()) {
                collecProducto.add(producto);
                System.out.println("El Producto se registro correctamente");
            } else {
                System.out.println("El Producto ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarProducto(Producto producto) throws Exception {
        try {
            int indice = buscarIndiceProducto(producto);
            collecProducto.set(indice, producto);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceProducto(Producto producto) throws Exception {
        try {
            int indice = collecProducto.indexOf(producto);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarProducto(Producto producto) throws Exception {
        try {
            int indice = buscarIndiceProducto(producto);
            collecProducto.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static List<Producto> listarTodo() throws Exception {
        try {
            return collecProducto;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarProducto() throws Exception {
        try {
            return collecProducto.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
