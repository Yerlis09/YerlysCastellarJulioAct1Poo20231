package co.edu.udec.poo.yerlyscastellarjulio.domain;

import java.util.Date;

/**
 *
 * @Yerlys Castellar
 */
public class ComprobanteDePago {

    private String codigoComprobante;
    private double valorPagarProveedor;
    private String codigoUnicoTransaccion;
    private Date fechaPago;
    private double valorPagar;
    private int numeroCtaBancariaEmpresa;

    public String getCodigoComprobante() {
        return codigoComprobante;
    }

    public void setCodigoComprobante(String codigoComprobante) {
        this.codigoComprobante = codigoComprobante;
    }

    public double getValorPagarProveedor() {
        return valorPagarProveedor;
    }

    public void setValorPagarProveedor(double valorPagarProveedor) {
        this.valorPagarProveedor = valorPagarProveedor;
    }

    public String getCodigoUnicoTransaccion() {
        return codigoUnicoTransaccion;
    }

    public void setCodigoUnicoTransaccion(String codigoUnicoTransaccion) {
        this.codigoUnicoTransaccion = codigoUnicoTransaccion;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public int getNumeroCtaBancariaEmpresa() {
        return numeroCtaBancariaEmpresa;
    }

    public void setNumeroCtaBancariaEmpresa(int numeroCtaBancariaEmpresa) {
        this.numeroCtaBancariaEmpresa = numeroCtaBancariaEmpresa;
    }

}
