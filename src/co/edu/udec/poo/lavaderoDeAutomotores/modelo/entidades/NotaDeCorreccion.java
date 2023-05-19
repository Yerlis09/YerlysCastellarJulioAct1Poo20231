package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class NotaDeCorreccion {

    private static int contadorNotaDeCorreccion;
    private int codigoCorreccionPedido;
    private NotaDeCorrecionPedido notaDeCorrecionPedido;

    public NotaDeCorreccion() {
        this.codigoCorreccionPedido = ++NotaDeCorreccion.contadorNotaDeCorreccion;
    }

    public NotaDeCorreccion(String codigoCorreccionPedido) {
        this();
    }

    public int getCodigoCorreccionPedido() {
        return codigoCorreccionPedido;
    }

    public void setCodigoCorreccionPedido(int codigoCorreccionPedido) {
        this.codigoCorreccionPedido = codigoCorreccionPedido;
    }

    public NotaDeCorrecionPedido getNotaDeCorrecionPedido() {
        return notaDeCorrecionPedido;
    }

    public void setNotaDeCorrecionPedido(NotaDeCorrecionPedido notaDeCorrecionPedido) {
        this.notaDeCorrecionPedido = notaDeCorrecionPedido;
    }

    @Override
    public String toString() {
        return "NotaDeCorreccion{" + "codigoCorreccionPedido=" + codigoCorreccionPedido + ", notaDeCorrecionPedido=" + notaDeCorrecionPedido + '}';
    }
}
