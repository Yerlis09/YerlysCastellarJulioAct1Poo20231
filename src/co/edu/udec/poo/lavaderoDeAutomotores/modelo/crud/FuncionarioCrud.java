/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class FuncionarioCrud {
    private static ArrayList<Funcionario> collecFuncionario = new ArrayList<>();

    public static Funcionario consultarFuncionario(Funcionario funcionario) throws Exception {
        try {
            int indice = buscarIndiceFuncionario(funcionario);
            return collecFuncionario.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static int registrarFuncionario(Funcionario funcionario) throws Exception {
        try {
            collecFuncionario.add(funcionario);
            return 1;
        } catch (Exception e) {
           throw new Exception(e.getMessage()); 
        }
    }

    public static int actualizarFuncionario(Funcionario funcionario1) throws Exception {
        try {
            int indice = buscarIndiceFuncionario(funcionario1);
            collecFuncionario.set(indice, funcionario1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceFuncionario(Funcionario funcionario) throws Exception {
        try {
            int indice = collecFuncionario.indexOf(funcionario);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarFuncionario(Funcionario funcionario) throws Exception {
        try {
            int indice = buscarIndiceFuncionario(funcionario);
            collecFuncionario.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    public static List<Funcionario> listarTodo() throws Exception {
        try {
            return collecFuncionario;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarFuncionario() throws Exception{
        try {
            return collecFuncionario.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
