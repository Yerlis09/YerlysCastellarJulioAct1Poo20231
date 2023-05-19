package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class Cubiculo {

    private static int contadorCubiculo;
    private int codigoCubiculos;
    private String nombre;
    private String area;
    private String estado;
    private String turnoDisponible;

    public Cubiculo() {
        this.codigoCubiculos = ++Cubiculo.contadorCubiculo;
    }

    public Cubiculo(String nombre, String area, String estado, String turnoDisponible) {
        this();
        this.nombre = nombre;
        this.area = area;
        this.estado = estado;
        this.turnoDisponible = turnoDisponible;
    }

    
    public int getCodigoCubiculos() {
        return codigoCubiculos;
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

    @Override
    public String toString() {
        return "Cubiculo{" + "codigoCubiculos=" + codigoCubiculos + ", nombre=" + nombre + ", area=" + area + ", estado=" + estado + ", turnoDisponible=" + turnoDisponible + '}';
    }
}
