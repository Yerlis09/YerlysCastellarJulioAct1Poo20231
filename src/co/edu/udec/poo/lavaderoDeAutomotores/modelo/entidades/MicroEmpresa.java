package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.util.List;

/**
 *
 * @Yerlys Castellar
 */
public class MicroEmpresa {

    private static int contadorMicroEmpresa;
    private int codigoMicroEmpresa;
    private String especialidad;
    private List<Cubiculo> cubiculos;

    public MicroEmpresa() {
        this.codigoMicroEmpresa = ++MicroEmpresa.contadorMicroEmpresa;
    }

    public MicroEmpresa(String especialidad, List<Cubiculo> cubiculos) {
        this();
        this.especialidad = especialidad;
        this.cubiculos = cubiculos;
    }

    public int getCodigoMicroEmpresa() {
        return codigoMicroEmpresa;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Cubiculo> getCubiculos() {
        return cubiculos;
    }

    public void setCubiculos(List<Cubiculo> cubiculos) {
        this.cubiculos = cubiculos;
    }

    @Override
    public String toString() {
        return "MicroEmpresa{" + "codigoMicroEmpresa=" + codigoMicroEmpresa + ", especialidad=" + especialidad + ", cubiculos=" + cubiculos + '}';
    }
}
