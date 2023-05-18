package co.edu.udec.poo.lavaderoDeAutomotores.modelo.entidades;

import java.util.List;

/**
 *
 * @Yerlys Castellar
 */
public class Catalogo {
    private String codigoCatalogo;
    private double precio;
    private String descripcion;
    private String estado;
    private String tipo;
    private List<Producto> productos;
    private List<Servicio> servicios;

    public Catalogo() {
    }

    public Catalogo(String codigoCatalogo, double precio, String descripcion, String estado, String tipo, List<Producto> productos, List<Servicio> servicios) {
        this.codigoCatalogo = codigoCatalogo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipo = tipo;
        this.productos = productos;
        this.servicios = servicios;
    }

    public String getCodigoCatalogo() {
        return codigoCatalogo;
    }

    public void setCodigoCatalogo(String codigoCatalogo) {
        this.codigoCatalogo = codigoCatalogo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "codigoCatalogo=" + codigoCatalogo + ", precio=" + precio + ", descripcion=" + descripcion + ", estado=" + estado + ", tipo=" + tipo + ", productos=" + productos + ", servicios=" + servicios + '}';
    } 
}
