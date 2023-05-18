package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.util.Date;

/**
 *
 * @Yerlys Castellar
 */
public class ContratoDeTrabajo {

    private String codigoContrato;
    private Date fechaDeTrabajo;
    private double sueldoBase;
    private String tipoCargo;
    private String horarioDeTrabajo;
    private String funcion;

    public ContratoDeTrabajo() {
    }

    public ContratoDeTrabajo(String codigoContrato, Date fechaDeTrabajo, double sueldoBase, String tipoCargo, String horarioDeTrabajo, String funcion) {
        this.codigoContrato = codigoContrato;
        this.fechaDeTrabajo = fechaDeTrabajo;
        this.sueldoBase = sueldoBase;
        this.tipoCargo = tipoCargo;
        this.horarioDeTrabajo = horarioDeTrabajo;
        this.funcion = funcion;
    } 
    
    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public Date getFechaDeTrabajo() {
        return fechaDeTrabajo;
    }

    public void setFechaDeTrabajo(Date fechaDeTrabajo) {
        this.fechaDeTrabajo = fechaDeTrabajo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(String tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    public String getHorarioDeTrabajo() {
        return horarioDeTrabajo;
    }

    public void setHorarioDeTrabajo(String horarioDeTrabajo) {
        this.horarioDeTrabajo = horarioDeTrabajo;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "ContratoDeTrabajo{" + "codigoContrato=" + codigoContrato + ", fechaDeTrabajo=" + fechaDeTrabajo + ", sueldoBase=" + sueldoBase + ", tipoCargo=" + tipoCargo + ", horarioDeTrabajo=" + horarioDeTrabajo + ", funcion=" + funcion + '}';
    }
}
