package co.edu.udec.poo.yerlyscastellarjulio.domain;

import java.util.Date;

/**
 *
 * @Yerlys Castellar
 */
public class Funcionario {

    private String codigoFuncionario;
    private String tipoDeId;
    private String numeroDeId;
    private Date fechaDeExpedicion;
    private String lugarDeExpedicion;
    private String nombres;
    private String apellidos;
    private Date fechaDeNacimiento;
    private String genero;
    private String email;
    private String direccion;
    private String telefono;

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getTipoDeId() {
        return tipoDeId;
    }

    public void setTipoDeId(String tipoDeId) {
        this.tipoDeId = tipoDeId;
    }

    public String getNumeroDeId() {
        return numeroDeId;
    }

    public void setNumeroDeId(String numeroDeId) {
        this.numeroDeId = numeroDeId;
    }

    public Date getFechaDeExpedicion() {
        return fechaDeExpedicion;
    }

    public void setFechaDeExpedicion(Date fechaDeExpedicion) {
        this.fechaDeExpedicion = fechaDeExpedicion;
    }

    public String getLugarDeExpedicion() {
        return lugarDeExpedicion;
    }

    public void setLugarDeExpedicion(String lugarDeExpedicion) {
        this.lugarDeExpedicion = lugarDeExpedicion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
