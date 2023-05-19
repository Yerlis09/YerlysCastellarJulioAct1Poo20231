/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ClienteCrud {

    private static ArrayList<Cliente> collecCliente = new ArrayList<>();

    public static Cliente consultarCliente(Cliente cliente) throws Exception {
        try {
            int indice = buscarIndiceCliente(cliente);
            return collecCliente.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void registrarCliente(Cliente cliente) throws Exception {
        try {
            int indice = buscarIndiceCliente(cliente);
            if (indice == -1 || cliente.getCodigoCliente() != collecCliente.get(indice).getCodigoCliente()) {
                collecCliente.add(cliente);
                System.out.println("El Cliente se registro correctamente");
            } else {
                System.out.println("El Cliente ya existe");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int actualizarCliente(Cliente cliente1) throws Exception {
        try {
            int indice = buscarIndiceCliente(cliente1);
            collecCliente.set(indice, cliente1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceCliente(Cliente cliente) throws Exception {
        try {
            int indice = collecCliente.indexOf(cliente);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarCliente(Cliente cliente) throws Exception {
        try {
            int indice = buscarIndiceCliente(cliente);
            collecCliente.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static List<Cliente> listarTodo() throws Exception {
        try {
            return collecCliente;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarCliente() throws Exception {
        try {
            return collecCliente.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
