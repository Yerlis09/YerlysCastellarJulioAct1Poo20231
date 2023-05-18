package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class Categoria {

    private String codigoCategoria;
    private String nombre;

    public Categoria() {
    }

    public Categoria(String codigoCategoria, String nombre) {
        this.codigoCategoria = codigoCategoria;
        this.nombre = nombre;
    }

    public String getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(String codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categoria{" + "codigoCategoria=" + codigoCategoria + ", nombre=" + nombre + '}';
    }
}
