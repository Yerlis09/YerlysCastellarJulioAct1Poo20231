package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.util.Date;

/**
 *
 * @Yerlys Castellar
 */
public class NotaDeCorrecionPedido {

    private static int contadorNotaDeCorrecionPedido;
    private int codigoNotaCPedido;
    private Date fechaEmision;
    private Date fechaMaxConf;
    private Date fechaMaxEntrega;
    private int totalLineas;
    private double totalPreciosUnitCorrect;
    private int totalUnidCorrect;
    private double totalDescCorrect;
    private double totalPreciosUnitaIncorrect;
    private int totalUnidIncorrect;
    private double totalDescIncorrect;
    private double totalDifConRespectTotalPrecioUnitCorrecto;
    private double totalDifConRespTotalUnidCorrect;
    private double totalDifConRespectTotalDescCorrect;

    public NotaDeCorrecionPedido() {
        this.codigoNotaCPedido = ++NotaDeCorrecionPedido.contadorNotaDeCorrecionPedido;
    }

    public NotaDeCorrecionPedido(Date fechaEmision, Date fechaMaxConf, Date fechaMaxEntrega, int totalLineas, double totalPreciosUnitCorrect, int totalUnidCorrect, double totalDescCorrect, double totalPreciosUnitaIncorrect, int totalUnidIncorrect, double totalDescIncorrect, double totalDifConRespectTotalPrecioUnitCorrecto, double totalDifConRespTotalUnidCorrect, double totalDifConRespectTotalDescCorrect) {
        this();
        this.fechaEmision = fechaEmision;
        this.fechaMaxConf = fechaMaxConf;
        this.fechaMaxEntrega = fechaMaxEntrega;
        this.totalLineas = totalLineas;
        this.totalPreciosUnitCorrect = totalPreciosUnitCorrect;
        this.totalUnidCorrect = totalUnidCorrect;
        this.totalDescCorrect = totalDescCorrect;
        this.totalPreciosUnitaIncorrect = totalPreciosUnitaIncorrect;
        this.totalUnidIncorrect = totalUnidIncorrect;
        this.totalDescIncorrect = totalDescIncorrect;
        this.totalDifConRespectTotalPrecioUnitCorrecto = totalDifConRespectTotalPrecioUnitCorrecto;
        this.totalDifConRespTotalUnidCorrect = totalDifConRespTotalUnidCorrect;
        this.totalDifConRespectTotalDescCorrect = totalDifConRespectTotalDescCorrect;
    }

    public int getCodigoNotaCPedido() {
        return codigoNotaCPedido;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaMaxConf() {
        return fechaMaxConf;
    }

    public void setFechaMaxConf(Date fechaMaxConf) {
        this.fechaMaxConf = fechaMaxConf;
    }

    public Date getFechaMaxEntrega() {
        return fechaMaxEntrega;
    }

    public void setFechaMaxEntrega(Date fechaMaxEntrega) {
        this.fechaMaxEntrega = fechaMaxEntrega;
    }

    public int getTotalLineas() {
        return totalLineas;
    }

    public void setTotalLineas(int totalLineas) {
        this.totalLineas = totalLineas;
    }

    public double getTotalPreciosUnitCorrect() {
        return totalPreciosUnitCorrect;
    }

    public void setTotalPreciosUnitCorrect(double totalPreciosUnitCorrect) {
        this.totalPreciosUnitCorrect = totalPreciosUnitCorrect;
    }

    public int getTotalUnidCorrect() {
        return totalUnidCorrect;
    }

    public void setTotalUnidCorrect(int totalUnidCorrect) {
        this.totalUnidCorrect = totalUnidCorrect;
    }

    public double getTotalDescCorrect() {
        return totalDescCorrect;
    }

    public void setTotalDescCorrect(double totalDescCorrect) {
        this.totalDescCorrect = totalDescCorrect;
    }

    public double getTotalPreciosUnitaIncorrect() {
        return totalPreciosUnitaIncorrect;
    }

    public void setTotalPreciosUnitaIncorrect(double totalPreciosUnitaIncorrect) {
        this.totalPreciosUnitaIncorrect = totalPreciosUnitaIncorrect;
    }

    public int getTotalUnidIncorrect() {
        return totalUnidIncorrect;
    }

    public void setTotalUnidIncorrect(int totalUnidIncorrect) {
        this.totalUnidIncorrect = totalUnidIncorrect;
    }

    public double getTotalDescIncorrect() {
        return totalDescIncorrect;
    }

    public void setTotalDescIncorrect(double totalDescIncorrect) {
        this.totalDescIncorrect = totalDescIncorrect;
    }

    public double getTotalDifConRespectTotalPrecioUnitCorrecto() {
        return totalDifConRespectTotalPrecioUnitCorrecto;
    }

    public void setTotalDifConRespectTotalPrecioUnitCorrecto(double totalDifConRespectTotalPrecioUnitCorrecto) {
        this.totalDifConRespectTotalPrecioUnitCorrecto = totalDifConRespectTotalPrecioUnitCorrecto;
    }

    public double getTotalDifConRespTotalUnidCorrect() {
        return totalDifConRespTotalUnidCorrect;
    }

    public void setTotalDifConRespTotalUnidCorrect(double totalDifConRespTotalUnidCorrect) {
        this.totalDifConRespTotalUnidCorrect = totalDifConRespTotalUnidCorrect;
    }

    public double getTotalDifConRespectTotalDescCorrect() {
        return totalDifConRespectTotalDescCorrect;
    }

    public void setTotalDifConRespectTotalDescCorrect(double totalDifConRespectTotalDescCorrect) {
        this.totalDifConRespectTotalDescCorrect = totalDifConRespectTotalDescCorrect;
    }

    @Override
    public String toString() {
        return "NotaDeCorrecionPedido{" + "codigoNotaCPedido=" + codigoNotaCPedido + ", fechaEmision=" + fechaEmision + ", fechaMaxConf=" + fechaMaxConf + ", fechaMaxEntrega=" + fechaMaxEntrega + ", totalLineas=" + totalLineas + ", totalPreciosUnitCorrect=" + totalPreciosUnitCorrect + ", totalUnidCorrect=" + totalUnidCorrect + ", totalDescCorrect=" + totalDescCorrect + ", totalPreciosUnitaIncorrect=" + totalPreciosUnitaIncorrect + ", totalUnidIncorrect=" + totalUnidIncorrect + ", totalDescIncorrect=" + totalDescIncorrect + ", totalDifConRespectTotalPrecioUnitCorrecto=" + totalDifConRespectTotalPrecioUnitCorrecto + ", totalDifConRespTotalUnidCorrect=" + totalDifConRespTotalUnidCorrect + ", totalDifConRespectTotalDescCorrect=" + totalDifConRespectTotalDescCorrect + '}';
    }
}
