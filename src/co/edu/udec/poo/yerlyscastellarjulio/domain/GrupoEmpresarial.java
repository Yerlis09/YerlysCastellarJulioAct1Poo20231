package co.edu.udec.poo.yerlyscastellarjulio.domain;

/**
 *
 * @Yerlys Castellar
 */
public class GrupoEmpresarial {

    private String codigoEmpresa;
    private String nombreEmpresa;
    private MicroEmpresa[] microEmpresa;
    private ContratoDeTrabajo[] contratosDeTrabajo;

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

    public MicroEmpresa[] getMicroEmpresa() {
        return microEmpresa;
    }

    public void setMicroEmpresa(MicroEmpresa[] microEmpresa) {
        this.microEmpresa = microEmpresa;
    }

    public ContratoDeTrabajo[] getContratosDeTrabajo() {
        return contratosDeTrabajo;
    }

    public void setContratosDeTrabajo(ContratoDeTrabajo[] contratosDeTrabajo) {
        this.contratosDeTrabajo = contratosDeTrabajo;
    }

}
