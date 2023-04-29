package co.edu.udec.poo.yerlyscastellarjulio.domain;

/**
 *
 * @Yerlys Castellar
 */
class Servicio {

    private String codigoServicio;
    private String nombre;
    private double precioVenta;
    private double porcentIva;
    private double valorCorreIva;
    private double precioMasValorIva;
    private double valorTotalCorres;
    private double descuento;

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
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

}
