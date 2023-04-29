package co.edu.udec.poo.yerlyscastellarjulio.domain;

/**
 *
 * @Yerlys Castellar
 */
public class DetalleProductNoCorres {

    private String codigoDetalle;
    private String codigoProductoErrado;
    private int unidades;
    private double precioErrado;
    private double valorDifConRespPrecioCorre;
    private int unidadesErradas;
    private double cantUnidDiferConUniCorr;
    private double valorDifeConRespDescCorrrect;
    private double precioTotalDiferencia;

    public String getCodigoDetalle() {
        return codigoDetalle;
    }

    public void setCodigoDetalle(String codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }

    public String getCodigoProductoErrado() {
        return codigoProductoErrado;
    }

    public void setCodigoProductoErrado(String codigoProductoErrado) {
        this.codigoProductoErrado = codigoProductoErrado;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioErrado() {
        return precioErrado;
    }

    public void setPrecioErrado(double precioErrado) {
        this.precioErrado = precioErrado;
    }

    public double getValorDifConRespPrecioCorre() {
        return valorDifConRespPrecioCorre;
    }

    public void setValorDifConRespPrecioCorre(double valorDifConRespPrecioCorre) {
        this.valorDifConRespPrecioCorre = valorDifConRespPrecioCorre;
    }

    public int getUnidadesErradas() {
        return unidadesErradas;
    }

    public void setUnidadesErradas(int unidadesErradas) {
        this.unidadesErradas = unidadesErradas;
    }

    public double getCantUnidDiferConUniCorr() {
        return cantUnidDiferConUniCorr;
    }

    public void setCantUnidDiferConUniCorr(double cantUnidDiferConUniCorr) {
        this.cantUnidDiferConUniCorr = cantUnidDiferConUniCorr;
    }

    public double getValorDifeConRespDescCorrrect() {
        return valorDifeConRespDescCorrrect;
    }

    public void setValorDifeConRespDescCorrrect(double valorDifeConRespDescCorrrect) {
        this.valorDifeConRespDescCorrrect = valorDifeConRespDescCorrrect;
    }

    public double getPrecioTotalDiferencia() {
        return precioTotalDiferencia;
    }

    public void setPrecioTotalDiferencia(double precioTotalDiferencia) {
        this.precioTotalDiferencia = precioTotalDiferencia;
    }

}
