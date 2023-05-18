package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.util.List;

/**
 *
 * @Yerlys Castellar
 */
public class GrupoEmpresarial {

    private String codigoEmpresa;
    private String nombreEmpresa;
    private List<MicroEmpresa> microEmpresa;
    private List<ContratoDeTrabajo> contratosDeTrabajo;

    public GrupoEmpresarial() {
    }

    public GrupoEmpresarial(String codigoEmpresa, String nombreEmpresa, List<MicroEmpresa> microEmpresa, List<ContratoDeTrabajo> contratosDeTrabajo) {
        this.codigoEmpresa = codigoEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.microEmpresa = microEmpresa;
        this.contratosDeTrabajo = contratosDeTrabajo;
    }

    
    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public List<MicroEmpresa> getMicroEmpresa() {
        return microEmpresa;
    }

    public void setMicroEmpresa(List<MicroEmpresa> microEmpresa) {
        this.microEmpresa = microEmpresa;
    }

    public List<ContratoDeTrabajo> getContratosDeTrabajo() {
        return contratosDeTrabajo;
    }

    public void setContratosDeTrabajo(List<ContratoDeTrabajo> contratosDeTrabajo) {
        this.contratosDeTrabajo = contratosDeTrabajo;
    }

    @Override
    public String toString() {
        return "GrupoEmpresarial{" + "codigoEmpresa=" + codigoEmpresa + ", nombreEmpresa=" + nombreEmpresa + ", microEmpresa=" + microEmpresa + ", contratosDeTrabajo=" + contratosDeTrabajo + '}';
    }
}
