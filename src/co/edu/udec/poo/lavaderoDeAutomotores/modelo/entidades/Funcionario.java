package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.util.Date;

/**
 *
 * @Yerlys Castellar
 */
public class Funcionario {

    private static int contadorFuncionario;
    private int codigoFuncionario;
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

    public Funcionario() {
        this.codigoFuncionario = ++Funcionario.contadorFuncionario;
    }

    public Funcionario(String tipoDeId, String numeroDeId, Date fechaDeExpedicion, String lugarDeExpedicion, String nombres, String apellidos, Date fechaDeNacimiento, String genero, String email, String direccion, String telefono) {
        this();
        this.tipoDeId = tipoDeId;
        this.numeroDeId = numeroDeId;
        this.fechaDeExpedicion = fechaDeExpedicion;
        this.lugarDeExpedicion = lugarDeExpedicion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
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

    @Override
    public String toString() {
        return "Funcionario{" + "codigoFuncionario=" + codigoFuncionario + ", tipoDeId=" + tipoDeId + ", numeroDeId=" + numeroDeId + ", fechaDeExpedicion=" + fechaDeExpedicion + ", lugarDeExpedicion=" + lugarDeExpedicion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaDeNacimiento=" + fechaDeNacimiento + ", genero=" + genero + ", email=" + email + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
}
