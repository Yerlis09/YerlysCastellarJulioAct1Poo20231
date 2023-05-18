package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.util.List;

/**
 *
 * @Yerlys Castellar
 */
public class MicroEmpresa {

    private String codigoMicroEmpresa;
    private String especialidad;
    private List<Cubiculo> cubiculos;

    public MicroEmpresa() {
    }

    public MicroEmpresa(String codigoMicroEmpresa, String especialidad, List<Cubiculo> cubiculos) {
        this.codigoMicroEmpresa = codigoMicroEmpresa;
        this.especialidad = especialidad;
        this.cubiculos = cubiculos;
    }

    public String getCodigoMicroEmpresa() {
        return codigoMicroEmpresa;
    }

    public void setCodigoMicroEmpresa(String codigoMicroEmpresa) {
        this.codigoMicroEmpresa = codigoMicroEmpresa;
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
