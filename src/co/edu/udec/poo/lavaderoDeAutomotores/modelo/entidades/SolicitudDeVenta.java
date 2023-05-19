package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.sql.Timestamp;

/**
 *
 * @Yerlys Castellar
 */
public class SolicitudDeVenta {

    private static string contadorSolicitudDeVenta;
    private int consecutivo;
    private int codigoServicio;
    private String nombre;
    private double precioDeVenta;
    private double porcentajeDeIva;
    private double valorCorreIva;
    private double precioMasValorIva;
    private double valorTotalCorrespo;
    private double descuento;
    private double precioTotalPagarPorServicio;
    private String descripcionServicio;
    private Timestamp fechaYhoraInicio;
    private Timestamp fechaYhorafin;
    private String inlcuyeTipoSP;
    private double precioTotalPorServicio;
    private String descripServicioApliAuto;
    private Timestamp fechaHoraInicio;
    private Timestamp fechaHoraFin;
    private int cantidad;
    private double total;
    private String tiempoServicio;

    public SolicitudDeVenta(int consecutivo, String nombre, double precioDeVenta, double porcentajeDeIva, double valorCorreIva, double precioMasValorIva, double valorTotalCorrespo, double descuento, double precioTotalPagarPorServicio, String descripcionServicio, Timestamp fechaYhoraInicio, Timestamp fechaYhorafin, String inlcuyeTipoSP, double precioTotalPorServicio, String descripServicioApliAuto, Timestamp fechaHoraInicio, Timestamp fechaHoraFin, int cantidad, double total, String tiempoServicio) {
        this();
        this.consecutivo = consecutivo;
        this.nombre = nombre;
        this.precioDeVenta = precioDeVenta;
        this.porcentajeDeIva = porcentajeDeIva;
        this.valorCorreIva = valorCorreIva;
        this.precioMasValorIva = precioMasValorIva;
        this.valorTotalCorrespo = valorTotalCorrespo;
        this.descuento = descuento;
        this.precioTotalPagarPorServicio = precioTotalPagarPorServicio;
        this.descripcionServicio = descripcionServicio;
        this.fechaYhoraInicio = fechaYhoraInicio;
        this.fechaYhorafin = fechaYhorafin;
        this.inlcuyeTipoSP = inlcuyeTipoSP;
        this.precioTotalPorServicio = precioTotalPorServicio;
        this.descripServicioApliAuto = descripServicioApliAuto;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.cantidad = cantidad;
        this.total = total;
        this.tiempoServicio = tiempoServicio;
    }

    public SolicitudDeVenta() {
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

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

    public double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public double getPorcentajeDeIva() {
        return porcentajeDeIva;
    }

    public void setPorcentajeDeIva(double porcentajeDeIva) {
        this.porcentajeDeIva = porcentajeDeIva;
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

    public double getValorTotalCorrespo() {
        return valorTotalCorrespo;
    }

    public void setValorTotalCorrespo(double valorTotalCorrespo) {
        this.valorTotalCorrespo = valorTotalCorrespo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioTotalPagarPorServicio() {
        return precioTotalPagarPorServicio;
    }

    public void setPrecioTotalPagarPorServicio(double precioTotalPagarPorServicio) {
        this.precioTotalPagarPorServicio = precioTotalPagarPorServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public Timestamp getFechaYhoraInicio() {
        return fechaYhoraInicio;
    }

    public void setFechaYhoraInicio(Timestamp fechaYhoraInicio) {
        this.fechaYhoraInicio = fechaYhoraInicio;
    }

    public Timestamp getFechaYhorafin() {
        return fechaYhorafin;
    }

    public void setFechaYhorafin(Timestamp fechaYhorafin) {
        this.fechaYhorafin = fechaYhorafin;
    }

    public String getInlcuyeTipoSP() {
        return inlcuyeTipoSP;
    }

    public void setInlcuyeTipoSP(String inlcuyeTipoSP) {
        this.inlcuyeTipoSP = inlcuyeTipoSP;
    }

    public double getPrecioTotalPorServicio() {
        return precioTotalPorServicio;
    }

    public void setPrecioTotalPorServicio(double precioTotalPorServicio) {
        this.precioTotalPorServicio = precioTotalPorServicio;
    }

    public String getDescripServicioApliAuto() {
        return descripServicioApliAuto;
    }

    public void setDescripServicioApliAuto(String descripServicioApliAuto) {
        this.descripServicioApliAuto = descripServicioApliAuto;
    }

    public Timestamp getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Timestamp fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Timestamp getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(Timestamp fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoServicio(String tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    @Override
    public String toString() {
        return "SolicitudDeVenta{" + "consecutivo=" + consecutivo + ", codigoServicio=" + codigoServicio + ", nombre=" + nombre + ", precioDeVenta=" + precioDeVenta + ", porcentajeDeIva=" + porcentajeDeIva + ", valorCorreIva=" + valorCorreIva + ", precioMasValorIva=" + precioMasValorIva + ", valorTotalCorrespo=" + valorTotalCorrespo + ", descuento=" + descuento + ", precioTotalPagarPorServicio=" + precioTotalPagarPorServicio + ", descripcionServicio=" + descripcionServicio + ", fechaYhoraInicio=" + fechaYhoraInicio + ", fechaYhorafin=" + fechaYhorafin + ", inlcuyeTipoSP=" + inlcuyeTipoSP + ", precioTotalPorServicio=" + precioTotalPorServicio + ", descripServicioApliAuto=" + descripServicioApliAuto + ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoraFin=" + fechaHoraFin + ", cantidad=" + cantidad + ", total=" + total + ", tiempoServicio=" + tiempoServicio + '}';
    }
}
