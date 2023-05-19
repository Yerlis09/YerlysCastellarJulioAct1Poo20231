/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.GrupoEmpresarial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class GrupoEmpresarialCrud {
    private static ArrayList<GrupoEmpresarial> collecGrupoEmpresarial = new ArrayList<>();

    public static GrupoEmpresarial consultarGrupoEmpresarial(GrupoEmpresarial grupoEmpresarial) throws Exception {
        try {
            int indice = buscarIndiceGrupoEmpresarial(grupoEmpresarial);
            return collecGrupoEmpresarial.get(indice);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static int registrarGrupoEmpresarial(GrupoEmpresarial grupoEmpresarial) throws Exception {
        try {
            collecGrupoEmpresarial.add(grupoEmpresarial);
            return 1;
        } catch (Exception e) {
           throw new Exception(e.getMessage()); 
        }
    }

    public static int actualizarGrupoEmpresarial(GrupoEmpresarial grupoEmpresarial1) throws Exception {
        try {
            int indice = buscarIndiceGrupoEmpresarial(grupoEmpresarial1);
            collecGrupoEmpresarial.set(indice, grupoEmpresarial1);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int buscarIndiceGrupoEmpresarial(GrupoEmpresarial grupoEmpresarial) throws Exception {
        try {
            int indice = collecGrupoEmpresarial.indexOf(grupoEmpresarial);
            return indice;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int eliminarGrupoEmpresarial(GrupoEmpresarial grupoEmpresarial) throws Exception {
        try {
            int indice = buscarIndiceGrupoEmpresarial(grupoEmpresarial);
            collecGrupoEmpresarial.remove(indice);
            return 1;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

    public static List<GrupoEmpresarial> listarTodo() throws Exception {
        try {
            return collecGrupoEmpresarial;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static int contarGrupoEmpresarial() throws Exception{
        try {
            return collecGrupoEmpresarial.size();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
