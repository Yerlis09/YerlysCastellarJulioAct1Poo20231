package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class DetalleProductNoCorres {

    private static int contadorDetalleProductNoCorres;
    private int codigoDetalleProductNoCorres;
    private String codigoProductoErrado;
    private int unidades;
    private double precioErrado;
    private double valorDifConRespPrecioCorre;
    private int unidadesErradas;
    private double cantUnidDiferConUniCorr;
    private double valorDifeConRespDescCorrrect;
    private double precioTotalDiferencia;

    public DetalleProductNoCorres() {
        this.codigoDetalleProductNoCorres = ++DetalleProductNoCorres.contadorDetalleProductNoCorres;
    }

    public DetalleProductNoCorres(String codigoProductoErrado, int unidades, double precioErrado, double valorDifConRespPrecioCorre, int unidadesErradas, double cantUnidDiferConUniCorr, double valorDifeConRespDescCorrrect, double precioTotalDiferencia) {
        this();
        this.codigoProductoErrado = codigoProductoErrado;
        this.unidades = unidades;
        this.precioErrado = precioErrado;
        this.valorDifConRespPrecioCorre = valorDifConRespPrecioCorre;
        this.unidadesErradas = unidadesErradas;
        this.cantUnidDiferConUniCorr = cantUnidDiferConUniCorr;
        this.valorDifeConRespDescCorrrect = valorDifeConRespDescCorrrect;
        this.precioTotalDiferencia = precioTotalDiferencia;
    }

    public int getCodigoDetalleProductNoCorres() {
        return codigoDetalleProductNoCorres;
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

    @Override
    public String toString() {
        return "DetalleProductNoCorres{" + "codigoDetalle=" + codigoDetalleProductNoCorres + ", codigoProductoErrado=" + codigoProductoErrado + ", unidades=" + unidades + ", precioErrado=" + precioErrado + ", valorDifConRespPrecioCorre=" + valorDifConRespPrecioCorre + ", unidadesErradas=" + unidadesErradas + ", cantUnidDiferConUniCorr=" + cantUnidDiferConUniCorr + ", valorDifeConRespDescCorrrect=" + valorDifeConRespDescCorrrect + ", precioTotalDiferencia=" + precioTotalDiferencia + '}';
    }
}
