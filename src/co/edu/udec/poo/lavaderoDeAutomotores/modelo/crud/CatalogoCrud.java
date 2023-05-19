/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Catalogo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class CatalogoCrud {

    private static ArrayList<Catalogo> collecCatalogo = new ArrayList<>();

    public static Catalogo consultarCatalogo(Catalogo catalogo) throws Exception {
        try {
            int indice = buscarIndiceCatalogo(catalogo);
            return collecCatalogo.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarCatalogo(Catalogo catalogo) throws Exception {
        try {
            int indice = buscarIndiceCatalogo(catalogo);
            if (indice == -1 || catalogo.getCodigoCatalogo() != collecCatalogo.get(indice).getCodigoCatalogo()) {
                collecCatalogo.add(catalogo);
                System.out.println("El Catalogo se registro correctamente");
            } else {
                System.out.println("El Catalogo ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarCatalogo(Catalogo catalogo1) throws Exception {
        try {
            int indice = buscarIndiceCatalogo(catalogo1);
            collecCatalogo.set(indice, catalogo1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceCatalogo(Catalogo catalogo) throws Exception {
        try {
            int indice = collecCatalogo.indexOf(catalogo);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarCatalogo(Catalogo catalogo) throws Exception {
        try {
            int indice = buscarIndiceCatalogo(catalogo);
            collecCatalogo.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static List<Catalogo> listarTodo() throws Exception {
        try {
            return collecCatalogo;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarCatalogo() throws Exception {
        try {
            return collecCatalogo.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
