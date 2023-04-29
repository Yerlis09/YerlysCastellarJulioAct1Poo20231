package co.edu.udec.poo.yerlyscastellarjulio.domain;

import java.util.Date;

/**
 *
 * @Yerlys Castellar
 */
public class CotizacionDeCompra {

    private String codigoCotizacion;
    private Date fechaEmision;
    private Date fechaExpiracion;
    private String tiempoMaximaEntrega;
    private String estadoCotizacion;
    private int item;
    private Producto[] productosSolicitados;
    private int totalLineas;
    private double totalPreciosUnitarios;
    private double totalrecioSinIva;
    private double totalPreciosConIva;
    private double totalDescuentos;
    private double totalPreciosConIvaDescuento;

    public String getCodigoCotizacion() {
        return codigoCotizacion;
    }

    public void setCodigoCotizacion(String codigoCotizacion) {
        this.codigoCotizacion = codigoCotizacion;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getTiempoMaximaEntrega() {
        return tiempoMaximaEntrega;
    }

    public void setTiempoMaximaEntrega(String tiempoMaximaEntrega) {
        this.tiempoMaximaEntrega = tiempoMaximaEntrega;
    }

    public String getEstadoCotizacion() {
        return estadoCotizacion;
    }

    public void setEstadoCotizacion(String estadoCotizacion) {
        this.estadoCotizacion = estadoCotizacion;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Producto[] getProductosSolicitados() {
        return productosSolicitados;
    }

    public void setProductosSolicitados(Producto[] productosSolicitados) {
        this.productosSolicitados = productosSolicitados;
    }

    public int getTotalLineas() {
        return totalLineas;
    }

    public void setTotalLineas(int totalLineas) {
        this.totalLineas = totalLineas;
    }

    public double getTotalPreciosUnitarios() {
        return totalPreciosUnitarios;
    }

    public void setTotalPreciosUnitarios(double totalPreciosUnitarios) {
        this.totalPreciosUnitarios = totalPreciosUnitarios;
    }

    public double getTotalrecioSinIva() {
        return totalrecioSinIva;
    }

    public void setTotalrecioSinIva(double totalrecioSinIva) {
        this.totalrecioSinIva = totalrecioSinIva;
    }

    public double getTotalPreciosConIva() {
        return totalPreciosConIva;
    }

    public void setTotalPreciosConIva(double totalPreciosConIva) {
        this.totalPreciosConIva = totalPreciosConIva;
    }

    public double getTotalDescuentos() {
        return totalDescuentos;
    }

    public void setTotalDescuentos(double totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }

    public double getTotalPreciosConIvaDescuento() {
        return totalPreciosConIvaDescuento;
    }

    public void setTotalPreciosConIvaDescuento(double totalPreciosConIvaDescuento) {
        this.totalPreciosConIvaDescuento = totalPreciosConIvaDescuento;
    }

}
