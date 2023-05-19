package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class Automotor {

    private static int contadorAutomotor;
    private int codigoAutomotor;
    private String planta;
    private String marca;
    private String tipo;
    private String color;

    public Automotor() {
        this.codigoAutomotor = ++Automotor.contadorAutomotor;
    }

    public Automotor(String planta, String marca, String tipo, String color) {
        this();
        this.planta = planta;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
    }

    public int getCodigoAutomotor() {
        return codigoAutomotor;
    }

//    public void setCodigoAutomotor(int codigoAutomotor) { Importante: en esta segunda actividad de POO estare trabajando con el este set comentado, ya que no ocupo utilizarlo por el momento
//        this.codigoAutomotor = codigoAutomotor;
//    }

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
