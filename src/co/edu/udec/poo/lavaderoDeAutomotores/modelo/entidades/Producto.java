package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

/**
 *
 * @Yerlys Castellar
 */
class Producto {

    private String codigoProducto;
    private String nombre;
    private boolean tieneMarca;
    private String nombreMarca;
    private boolean tienePrecioCompra;
    private double precioCompra;
    private boolean tieneStock;
    private int stock;
    private String tiempoGarantia;
    private double precioUnitario;
    private double descuentoIva;
    private double precioIvaSinDescuento;
    private double precioIvaConDescuento;

    public Producto() {
    }

    public Producto(String codigoProducto, String nombre, boolean tieneMarca, String nombreMarca, boolean tienePrecioCompra, double precioCompra, boolean tieneStock, int stock, String tiempoGarantia, double precioUnitario, double descuentoIva, double precioIvaSinDescuento, double precioIvaConDescuento) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.tieneMarca = tieneMarca;
        this.nombreMarca = nombreMarca;
        this.tienePrecioCompra = tienePrecioCompra;
        this.precioCompra = precioCompra;
        this.tieneStock = tieneStock;
        this.stock = stock;
        this.tiempoGarantia = tiempoGarantia;
        this.precioUnitario = precioUnitario;
        this.descuentoIva = descuentoIva;
        this.precioIvaSinDescuento = precioIvaSinDescuento;
        this.precioIvaConDescuento = precioIvaConDescuento;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTieneMarca() {
        return tieneMarca;
    }

    public void setTieneMarca(boolean tieneMarca) {
        this.tieneMarca = tieneMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public boolean isTienePrecioCompra() {
        return tienePrecioCompra;
    }

    public void setTienePrecioCompra(boolean tienePrecioCompra) {
        this.tienePrecioCompra = tienePrecioCompra;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public boolean isTieneStock() {
        return tieneStock;
    }

    public void setTieneStock(boolean tieneStock) {
        this.tieneStock = tieneStock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(String tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getDescuentoIva() {
        return descuentoIva;
    }

    public void setDescuentoIva(double descuentoIva) {
        this.descuentoIva = descuentoIva;
    }

    public double getPrecioIvaSinDescuento() {
        return precioIvaSinDescuento;
    }

    public void setPrecioIvaSinDescuento(double precioIvaSinDescuento) {
        this.precioIvaSinDescuento = precioIvaSinDescuento;
    }

    public double getPrecioIvaConDescuento() {
        return precioIvaConDescuento;
    }

    public void setPrecioIvaConDescuento(double precioIvaConDescuento) {
        this.precioIvaConDescuento = precioIvaConDescuento;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", tieneMarca=" + tieneMarca + ", nombreMarca=" + nombreMarca + ", tienePrecioCompra=" + tienePrecioCompra + ", precioCompra=" + precioCompra + ", tieneStock=" + tieneStock + ", stock=" + stock + ", tiempoGarantia=" + tiempoGarantia + ", precioUnitario=" + precioUnitario + ", descuentoIva=" + descuentoIva + ", precioIvaSinDescuento=" + precioIvaSinDescuento + ", precioIvaConDescuento=" + precioIvaConDescuento + '}';
    }
}
