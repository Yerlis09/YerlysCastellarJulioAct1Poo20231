package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class Categoria {

    private static int contadorCategoria;
    private int codigoCategoria;
    private String nombre;

    public Categoria() {
        this.codigoCategoria = ++Categoria.contadorCategoria;
    }

    public Categoria(String nombre) {
        this();
        this.nombre = nombre;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
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
