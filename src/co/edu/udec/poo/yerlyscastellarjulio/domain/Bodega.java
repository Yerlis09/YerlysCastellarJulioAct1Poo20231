package co.edu.udec.poo.yerlyscastellarjulio.domain;

/**
 *
 * @Yerlys Castellar
 */
public class Bodega {

    private String codigoBodega;
    private double PrecioUnitActualMenosPrecioUnitarioAnt;
    private double nuevoPrecioVentaProducto;
    private int stock;

    public String getCodigoBodega() {
        return codigoBodega;
    }

    public void setCodigoBodega(String codigoBodega) {
        this.codigoBodega = codigoBodega;
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

}
