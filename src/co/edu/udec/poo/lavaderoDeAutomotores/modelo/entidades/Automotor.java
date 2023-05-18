package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class Automotor {

    private String codigoAutomotor;
    private String planta;
    private String marca;
    private String tipo;
    private String color;

    public Automotor() {
    }

    public Automotor(String codigoAutomotor, String planta, String marca, String tipo, String color) {
        this.codigoAutomotor = codigoAutomotor;
        this.planta = planta;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
    }

    public String getCodigoAutomotor() {
        return codigoAutomotor;
    }

    public void setCodigoAutomotor(String codigoAutomotor) {
        this.codigoAutomotor = codigoAutomotor;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automotor{" + "codigoAutomotor=" + codigoAutomotor + ", planta=" + planta + ", marca=" + marca + ", tipo=" + tipo + ", color=" + color + '}';
    }

}
