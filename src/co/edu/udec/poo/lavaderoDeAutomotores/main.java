package co.edu.udec.poo.lavaderoDeAutomotores;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud.AutomotorCrud;
import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Automotor;

public class main {

    private AutomotorCrud automotorCrud;

    public static void main(String[] args) {
        try {
            Automotor automotor1 = new Automotor("prueba1", "Prueba1", "prueba1", "prueba1");
            Automotor automotor22 = new Automotor("prueba1", "Prueba1", "prueba1", "prueba1");
            Automotor automotor2 = new Automotor("prueba2", "Prueba2", "prueba2", "prueba2");
            Automotor automotor3 = new Automotor("prueba3", "Prueba3", "prueba3", "prueba3");
            Automotor automotor4 = new Automotor("prueba4", "Prueba4", "prueba4", "prueba4");
            Automotor automotor5 = new Automotor("prueba5", "Prueba5", "prueba5", "prueba5");

            AutomotorCrud.registrarAutomotor(automotor1);
            AutomotorCrud.registrarAutomotor(automotor2);
            AutomotorCrud.registrarAutomotor(automotor3);
            AutomotorCrud.registrarAutomotor(automotor4);
            AutomotorCrud.registrarAutomotor(automotor5);
            System.out.println("--Consultar---");
            System.out.println(AutomotorCrud.consultarAutomotor(automotor1));
            System.out.println("--Actualizar---");
            AutomotorCrud.actualizarAutomotor(automotor1);
            System.out.println("--ListarTodo---");
            AutomotorCrud.listarTodo();
            System.out.println("--Contar---");
            System.out.println(AutomotorCrud.contarAutomotor());
            System.out.println("--Eliminar---");
            AutomotorCrud.eliminarAutomotor(automotor1);
            
        } catch (Exception e) {
        }
    }
}
