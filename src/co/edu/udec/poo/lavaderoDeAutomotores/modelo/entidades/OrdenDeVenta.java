package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.util.Date;

/**
 *
 * @Yerlys Castellar
 */
public class OrdenDeVenta {

    private static int contadorOrdenDeVenta;
    private int codigoOrden;
    private Date fechaSolicitud;

    public OrdenDeVenta() {
        this.codigoOrden = ++OrdenDeVenta.contadorOrdenDeVenta;
    }

    public OrdenDeVenta(Date fechaSolicitud) {
        this();
        this.fechaSolicitud = fechaSolicitud;
    }

    public int getCodigoOrden() {
        return codigoOrden;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Override
    public String toString() {
        return "OrdenDeVenta{" + "codigoOrden=" + codigoOrden + ", fechaSolicitud=" + fechaSolicitud + '}';
    }
}
