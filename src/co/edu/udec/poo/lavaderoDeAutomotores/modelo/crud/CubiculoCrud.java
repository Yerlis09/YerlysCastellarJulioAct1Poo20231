/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Cubiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class CubiculoCrud {
    private static ArrayList<Cubiculo> collecCubiculo = new ArrayList<>();

    public static Cubiculo consultarCubiculo(Cubiculo cubiculo) throws Exception {
        try {
            int indice = buscarIndiceCubiculo(cubiculo);
            return collecCubiculo.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static int registrarCubiculo(Cubiculo cubiculo) throws Exception {
        try {
            collecCubiculo.add(cubiculo);
            return 1;
        } catch (Exception e) {
           throw new Exception(e.getMessage()); 
        }
    }

    public static int actualizarCubiculo(Cubiculo cubiculo1) throws Exception {
        try {
            int indice = buscarIndiceCubiculo(cubiculo1);
            collecCubiculo.set(indice, cubiculo1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceCubiculo(Cubiculo cubiculo) throws Exception {
        try {
            int indice = collecCubiculo.indexOf(cubiculo);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarCubiculo(Cubiculo cubiculo) throws Exception {
        try {
            int indice = buscarIndiceCubiculo(cubiculo);
            collecCubiculo.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    public static List<Cubiculo> listarTodo() throws Exception {
        try {
            return collecCubiculo;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarCubiculo() throws Exception{
        try {
            return collecCubiculo.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
