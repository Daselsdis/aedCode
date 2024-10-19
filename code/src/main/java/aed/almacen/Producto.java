package aed.almacen;

/**
 * Guarda informacion sobre un producto en el almacen.
 */
public class Producto implements Comparable<Producto> {

  // Identidad del producto.
  private String productoId;

  // Numero de productos disponible para venta en almacen.
  private int cantidadDisponible;


  /**
   * Crea un producto.
   */
  public Producto(String productoId, int cantidad) {
    this.productoId = productoId;
    this.cantidadDisponible = cantidad;
  }

  /**
   * Devuelve la identidad del producto.
   */
  public String getProductoId() {
    return this.productoId;
  }

  /**
   * Devuelve la cantidad disponible del producto.
   */
  public int getCantidadDisponible() {
    return this.cantidadDisponible;
  }

  /**
   * Cambia el numero de productos disponible en el almacen.
   */
  public void setCantidadDisponible(int cantidad) {
    this.cantidadDisponible = cantidad;
  }

  /**
   * Compara dos compras usando sus identidades (productoId).
   */
  @Override
  public int compareTo(Producto a) {
    return getProductoId().compareTo(a.getProductoId());
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Producto) {
      Producto a = (Producto) o;
      return
        (productoId == null ? a.getProductoId() == null : productoId.equals(a.getProductoId()))
        && cantidadDisponible == a.getCantidadDisponible();
    } else return false;
  }

  @Override
  public int hashCode() {
    return this.getProductoId().hashCode();
  }

  @Override
  public String toString() {
    return "Producto("+toString(getProductoId())+","+cantidadDisponible+")";
  }

  private String toString(Object obj) {
    if (obj == null) return "";
    else return obj.toString();
  }

}

