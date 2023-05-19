package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class Servicio {

    private static int contadorServicio;
    private int codigoServicio;
    private String nombre;
    private double precioVenta;
    private double porcentIva;
    private double valorCorreIva;
    private double precioMasValorIva;
    private double valorTotalCorres;
    private double descuento;

    public Servicio() {
        this.codigoServicio = ++Servicio.contadorServicio;
    }

    public Servicio(String nombre, double precioVenta, double porcentIva, double valorCorreIva, double precioMasValorIva, double valorTotalCorres, double descuento) {
        this();
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.porcentIva = porcentIva;
        this.valorCorreIva = valorCorreIva;
        this.precioMasValorIva = precioMasValorIva;
        this.valorTotalCorres = valorTotalCorres;
        this.descuento = descuento;
    }

    public int getCodigoServicio() {
        return codigoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPorcentIva() {
        return porcentIva;
    }

    public void setPorcentIva(double porcentIva) {
        this.porcentIva = porcentIva;
    }

    public double getValorCorreIva() {
        return valorCorreIva;
    }

    public void setValorCorreIva(double valorCorreIva) {
        this.valorCorreIva = valorCorreIva;
    }

    public double getPrecioMasValorIva() {
        return precioMasValorIva;
    }

    public void setPrecioMasValorIva(double precioMasValorIva) {
        this.precioMasValorIva = precioMasValorIva;
    }

    public double getValorTotalCorres() {
        return valorTotalCorres;
    }

    public void setValorTotalCorres(double valorTotalCorres) {
        this.valorTotalCorres = valorTotalCorres;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Servicio{" + "codigoServicio=" + codigoServicio + ", nombre=" + nombre + ", precioVenta=" + precioVenta + ", porcentIva=" + porcentIva + ", valorCorreIva=" + valorCorreIva + ", precioMasValorIva=" + precioMasValorIva + ", valorTotalCorres=" + valorTotalCorres + ", descuento=" + descuento + '}';
    }
}
