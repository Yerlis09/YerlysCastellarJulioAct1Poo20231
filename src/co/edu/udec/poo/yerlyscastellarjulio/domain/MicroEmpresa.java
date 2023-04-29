package co.edu.udec.poo.yerlyscastellarjulio.domain;

/**
 *
 * @Yerlys Castellar
 */
public class MicroEmpresa {

    private String codigoMicroEmpresa;
    private String especialidad;
    private Cubiculo[] cubiculos;

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

    public Cubiculo[] getCubiculos() {
        return cubiculos;
    }

    public void setCubiculos(Cubiculo[] cubiculos) {
        this.cubiculos = cubiculos;
    }
       
}
