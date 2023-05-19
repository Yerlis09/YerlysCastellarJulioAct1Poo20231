package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
public class Bodega {

    private static int contadorBodega;
    private int codigoBodega;
    private double PrecioUnitActualMenosPrecioUnitarioAnt;
    private double nuevoPrecioVentaProducto;
    private int stock;

    public Bodega() {
        this.codigoBodega = ++Bodega.contadorBodega;
    }

    public Bodega(double PrecioUnitActualMenosPrecioUnitarioAnt, double nuevoPrecioVentaProducto, int stock) {
        this();
        this.PrecioUnitActualMenosPrecioUnitarioAnt = PrecioUnitActualMenosPrecioUnitarioAnt;
        this.nuevoPrecioVentaProducto = nuevoPrecioVentaProducto;
        this.stock = stock;
    }

    public int getCodigoBodega() {
        return codigoBodega;
    }

    public double getPrecioUnitActualMenosPrecioUnitarioAnt() {
        return PrecioUnitActualMenosPrecioUnitarioAnt;
    }

    public void setPrecioUnitActualMenosPrecioUnitarioAnt(double PrecioUnitActualMenosPrecioUnitarioAnt) {
        this.PrecioUnitActualMenosPrecioUnitarioAnt = PrecioUnitActualMenosPrecioUnitarioAnt;
    }

    public double getNuevoPrecioVentaProducto() {
        return nuevoPrecioVentaProducto;
    }

    public void setNuevoPrecioVentaProducto(double nuevoPrecioVentaProducto) {
        this.nuevoPrecioVentaProducto = nuevoPrecioVentaProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Bodega{" + "codigoBodega=" + codigoBodega + ", PrecioUnitActualMenosPrecioUnitarioAnt=" + PrecioUnitActualMenosPrecioUnitarioAnt + ", nuevoPrecioVentaProducto=" + nuevoPrecioVentaProducto + ", stock=" + stock + '}';
    }

}
