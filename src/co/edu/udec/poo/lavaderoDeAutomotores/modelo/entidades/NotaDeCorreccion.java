package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class NotaDeCorreccion {

    private static int contadorNotaDeCorreccion;
    private int codigoCorreccion;
    private NotaDeCorrecionPedido notaDeCorrecionPedido;

    public NotaDeCorreccion() {
        this.codigoCorreccion = ++NotaDeCorreccion.contadorNotaDeCorreccion;
    }

    public NotaDeCorreccion(String codigoCorreccionPedido) {
        this();
    }

    public int getCodigoCorreccion() {
        return codigoCorreccion;
    }

    public void setCodigoCorreccionPedido(int codigoCorreccionPedido) {
        this.codigoCorreccion = codigoCorreccionPedido;
    }

    public NotaDeCorrecionPedido getNotaDeCorrecionPedido() {
        return notaDeCorrecionPedido;
    }

    public void setNotaDeCorrecionPedido(NotaDeCorrecionPedido notaDeCorrecionPedido) {
        this.notaDeCorrecionPedido = notaDeCorrecionPedido;
    }

    @Override
    public String toString() {
        return "NotaDeCorreccion{" + "codigoCorreccionPedido=" + codigoCorreccion + ", notaDeCorrecionPedido=" + notaDeCorrecionPedido + '}';
    }
}
