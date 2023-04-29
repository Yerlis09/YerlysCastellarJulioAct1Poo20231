package co.edu.udec.poo.yerlyscastellarjulio.domain;

/**
 *
 * @Yerlys Castellar
 */
public class Cubiculo {

    private String codigoCubiculos;
    private String nombre;
    private String area;
    private String estado;
    private String turnoDisponible;

    public String getCodigoCubiculos() {
        return codigoCubiculos;
    }

    public void setCodigoCubiculos(String codigoCubiculos) {
        this.codigoCubiculos = codigoCubiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTurnoDisponible() {
        return turnoDisponible;
    }

    public void setTurnoDisponible(String turnoDisponible) {
        this.turnoDisponible = turnoDisponible;
    }
}
