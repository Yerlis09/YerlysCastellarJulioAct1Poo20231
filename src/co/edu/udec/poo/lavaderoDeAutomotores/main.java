package co.edu.udec.poo.lavaderoDeAutomotores;

import co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud.AutomotorCrud;
import co.edu.udec.poo.lavaderoDeAutomotores.modelo.crud.BodegaCrud;
import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Automotor;
import co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades.Bodega;
import java.util.List;

public class main {

    private static int cantidad = 0;

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("--AUTOMOTOR--");
            Automotor automotor1 = new Automotor("2", "Honda", "Lento", "Amarillo");
            Automotor automotor2 = new Automotor();
            automotor2.setColor("Rojo");
            automotor2.setMarca("Chevrolet");
            automotor2.setPlanta("1");
            automotor2.setTipo("Veloz");

            System.out.println("---Metodo de registrar---");
            if (AutomotorCrud.registrarAutomotor(automotor1) == 1) {
                System.out.println("El automotor fue registrado correctamente");
            } else {
                System.out.println("El automotor no se pudo registrar");
            }
            if (AutomotorCrud.registrarAutomotor(automotor2) == 1) {
                System.out.println("El automotor fue registrado correctamente");
            } else {
                System.out.println("El automotor no se pudo registrar");
            }
            System.out.println("--Metodo Consultar---");
            System.out.println(AutomotorCrud.consultarAutomotor(automotor1));
            System.out.println(AutomotorCrud.consultarAutomotor(automotor2));
            System.out.println("--Metodo Actualizar---");
            automotor2.setMarca("nuevaMarca");
            if (AutomotorCrud.actualizarAutomotor(automotor1) == 1) {
                System.out.println("El automotor fue actualizado correctamente");
            } else {
                System.out.println("El automotos no se pudo actualizar");
            }
            System.out.println("--Metodo Contar---");
            cantidad = AutomotorCrud.contarAutomotor();
            System.out.println("La cantidad de automotores registrado es: " + cantidad);
            System.out.println("--Metodo Eliminar---");
            if (AutomotorCrud.eliminarAutomotor(automotor1) == 1) {
                System.out.println("El automotor fue eliminado correctamente");
            } else {
                System.out.println("el automotor no pudo ser eliminado");
            }
            System.out.println("--Metodo ListarTodo---");
            List<Automotor> listaAutomotor = AutomotorCrud.listarTodo();
            System.out.println("La lista de automotor es la siguiente: " + listaAutomotor);

            System.out.println("--BODEGA--");
            Bodega bodega1 = new Bodega(1.500, 2500, 15);
            Bodega bodega2 = new Bodega();
            bodega2.setPrecioUnitActualMenosPrecioUnitarioAnt(350);
            bodega2.setNuevoPrecioVentaProducto(500);
            bodega2.setStock(5);

            System.out.println("---Metodo de registrar---");
            if (BodegaCrud.registrarBodega(bodega1) == 1) {
                System.out.println("La bodega1 fue registrado correctamente");
            } else {
                System.out.println("La bodega1 no se pudo registrar");
            }
            if (BodegaCrud.registrarBodega(bodega2) == 1) {
                System.out.println("El bodega 2 fue registrado correctamente");
            } else {
                System.out.println("El bodega 2 no se pudo registrar");
            }
            System.out.println("--Metodo Consultar---");
            System.out.println(BodegaCrud.consultarBodega(bodega1));
            System.out.println(BodegaCrud.consultarBodega(bodega2));

            System.out.println("--Metodo Actualizar---");
            bodega1.setStock(2);
            if (BodegaCrud.actualizarBodega(bodega1) == 1) {
                System.out.println("La bodega 1 fue actualizado correctamente");
            } else {
                System.out.println("El bodega 1 no se pudo actualizar");
            }
            System.out.println("--Metodo Contar---");
            cantidad = BodegaCrud.contarBodega();
            System.out.println("La cantidad de bodegas registradas es: " + cantidad);
            System.out.println("--Metodo Eliminar---");
            if (BodegaCrud.eliminarBodega(bodega1) == 1) {
                System.out.println("La bodega fue eliminado correctamente");
            } else {
                System.out.println("el la bodega no pudo ser eliminado");
            }
            System.out.println("--Metodo ListarTodo---");
            List<Bodega> listaBodega = BodegaCrud.listarTodo();
            System.out.println("La lista de bodegas es la siguiente: " + listaBodega);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
