package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.util.Date;

/**
 *
 * @Yerlys Castellar
 */
public class OrdenDePedido {

    private static int contadorOrdenDePedido;
    private int codigoOrden;
    private Date fechaEmision;
    private Date fechaMaximaConf;
    private Date fechaMaximaEntrega;
    private String estado;
    private String descripcionPedido;
    private int item;

    public OrdenDePedido() {
        this.codigoOrden = ++OrdenDePedido.contadorOrdenDePedido;
    }

    public OrdenDePedido(Date fechaEmision, Date fechaMaximaConf, Date fechaMaximaEntrega, String estado, String descripcionPedido, int item) {
        this();
        this.fechaEmision = fechaEmision;
        this.fechaMaximaConf = fechaMaximaConf;
        this.fechaMaximaEntrega = fechaMaximaEntrega;
        this.estado = estado;
        this.descripcionPedido = descripcionPedido;
        this.item = item;
    }

    public int getCodigoOrden() {
        return codigoOrden;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaMaximaConf() {
        return fechaMaximaConf;
    }

    public void setFechaMaximaConf(Date fechaMaximaConf) {
        this.fechaMaximaConf = fechaMaximaConf;
    }

    public Date getFechaMaximaEntrega() {
        return fechaMaximaEntrega;
    }

    public void setFechaMaximaEntrega(Date fechaMaximaEntrega) {
        this.fechaMaximaEntrega = fechaMaximaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcionPedido() {
        return descripcionPedido;
    }

    public void setDescripcionPedido(String descripcionPedido) {
        this.descripcionPedido = descripcionPedido;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrdenDePedido{" + "codigoOrden=" + codigoOrden + ", fechaEmision=" + fechaEmision + ", fechaMaximaConf=" + fechaMaximaConf + ", fechaMaximaEntrega=" + fechaMaximaEntrega + ", estado=" + estado + ", descripcionPedido=" + descripcionPedido + ", item=" + item + '}';
    }
}
