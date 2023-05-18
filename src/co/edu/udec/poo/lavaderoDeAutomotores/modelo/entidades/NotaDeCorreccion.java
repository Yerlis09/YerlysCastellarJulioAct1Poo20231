package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class NotaDeCorreccion {

    private String codigoCorreccionPedido;

    public NotaDeCorreccion() {
    }

    public NotaDeCorreccion(String codigoCorreccionPedido) {
        this.codigoCorreccionPedido = codigoCorreccionPedido;
    }

    public String getCodigoCorreccionPedido() {
        return codigoCorreccionPedido;
    }

    public void setCodigoCorreccionPedido(String codigoCorreccionPedido) {
        this.codigoCorreccionPedido = codigoCorreccionPedido;
    }

    @Override
    public String toString() {
        return "NotaDeCorreccion{" + "codigoCorreccionPedido=" + codigoCorreccionPedido + '}';
    }
}
