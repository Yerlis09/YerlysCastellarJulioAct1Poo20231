package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.util.Date;
import java.util.List;

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
    private List<Producto> productosSolicitados;
    private int totalLineas;
    private double totalPreciosUnitarios;
    private double totalrecioSinIva;
    private double totalPreciosConIva;
    private double totalDescuentos;
    private double totalPreciosConIvaDescuento;

    public CotizacionDeCompra() {
    }

    public CotizacionDeCompra(String codigoCotizacion, Date fechaEmision, Date fechaExpiracion, String tiempoMaximaEntrega, String estadoCotizacion, int item, List<Producto> productosSolicitados, int totalLineas, double totalPreciosUnitarios, double totalrecioSinIva, double totalPreciosConIva, double totalDescuentos, double totalPreciosConIvaDescuento) {
        this.codigoCotizacion = codigoCotizacion;
        this.fechaEmision = fechaEmision;
        this.fechaExpiracion = fechaExpiracion;
        this.tiempoMaximaEntrega = tiempoMaximaEntrega;
        this.estadoCotizacion = estadoCotizacion;
        this.item = item;
        this.productosSolicitados = productosSolicitados;
        this.totalLineas = totalLineas;
        this.totalPreciosUnitarios = totalPreciosUnitarios;
        this.totalrecioSinIva = totalrecioSinIva;
        this.totalPreciosConIva = totalPreciosConIva;
        this.totalDescuentos = totalDescuentos;
        this.totalPreciosConIvaDescuento = totalPreciosConIvaDescuento;
    }
    
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

    public List<Producto> getProductosSolicitados() {
        return productosSolicitados;
    }

    public void setProductosSolicitados(List<Producto> productosSolicitados) {
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

    @Override
    public String toString() {
        return "CotizacionDeCompra{" + "codigoCotizacion=" + codigoCotizacion + ", fechaEmision=" + fechaEmision + ", fechaExpiracion=" + fechaExpiracion + ", tiempoMaximaEntrega=" + tiempoMaximaEntrega + ", estadoCotizacion=" + estadoCotizacion + ", item=" + item + ", productosSolicitados=" + productosSolicitados + ", totalLineas=" + totalLineas + ", totalPreciosUnitarios=" + totalPreciosUnitarios + ", totalrecioSinIva=" + totalrecioSinIva + ", totalPreciosConIva=" + totalPreciosConIva + ", totalDescuentos=" + totalDescuentos + ", totalPreciosConIvaDescuento=" + totalPreciosConIvaDescuento + '}';
    }
}
