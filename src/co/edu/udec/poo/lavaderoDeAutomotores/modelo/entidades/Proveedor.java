package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class Proveedor {

    private static int contadorProveedor;
    private int codigoProveedor;
    private String nombre;
    private String email;
    private String telefono;
    private String nombreBanco;
    private int numeroCuenta;
    private String tipoCuenta;

    public Proveedor() {
        this.codigoProveedor = ++Proveedor.contadorProveedor;
    }

    public Proveedor(String nombre, String email, String telefono, String nombreBanco, int numeroCuenta, String tipoCuenta) {
        this();
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.nombreBanco = nombreBanco;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "codigoProveedor=" + codigoProveedor + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + ", nombreBanco=" + nombreBanco + ", numeroCuenta=" + numeroCuenta + ", tipoCuenta=" + tipoCuenta + '}';
    }
}
