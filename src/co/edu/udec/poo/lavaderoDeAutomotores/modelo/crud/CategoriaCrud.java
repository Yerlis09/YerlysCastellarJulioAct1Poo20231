/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class CategoriaCrud {

    private static ArrayList<Categoria> collecCategoria = new ArrayList<>();

    public static Categoria consultarCategoria(Categoria categoria) throws Exception {
        try {
            int indice = buscarIndiceCategoria(categoria);
            return collecCategoria.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarCategoria(Categoria categoria) throws Exception {
        try {
            int indice = buscarIndiceCategoria(categoria);
            if (indice == -1 || categoria.getCodigoCategoria() != collecCategoria.get(indice).getCodigoCategoria()) {
                collecCategoria.add(categoria);
                System.out.println("El Categoria se registro correctamente");
            } else {
                System.out.println("El Categoria ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarCategoria(Categoria categoria1) throws Exception {
        try {
            int indice = buscarIndiceCategoria(categoria1);
            collecCategoria.set(indice, categoria1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceCategoria(Categoria categoria) throws Exception {
        try {
            int indice = collecCategoria.indexOf(categoria);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarCategoria(Categoria categoria) throws Exception {
        try {
            int indice = buscarIndiceCategoria(categoria);
            collecCategoria.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static List<Categoria> listarTodo() throws Exception {
        try {
            return collecCategoria;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarCategoria() throws Exception {
        try {
            return collecCategoria.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
