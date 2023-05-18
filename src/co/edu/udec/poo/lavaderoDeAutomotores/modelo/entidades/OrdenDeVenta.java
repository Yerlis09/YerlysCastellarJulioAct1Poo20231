package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.util.Date;

/**
 *
 * @Yerlys Castellar
 */
public class OrdenDeVenta {

    private String codigoOrden;
    private Date fechaSolicitud;

    public OrdenDeVenta() {
    }

    public OrdenDeVenta(String codigoOrden, Date fechaSolicitud) {
        this.codigoOrden = codigoOrden;
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getCodigoOrden() {
        return codigoOrden;
    }

    public void setCodigoOrden(String codigoOrden) {
        this.codigoOrden = codigoOrden;
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
