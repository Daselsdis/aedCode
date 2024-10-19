package aed.almacen;

/**
 * Guarda informacion sobre una compra realizada.
 */
public class Compra implements Comparable<Compra> {

  private int compraIdContador = 1;

  // La identidad de la compra (asignado automaticamente por el constructor).
  private Integer compraId;
  // La identidad del cliente (comprador).
  private String clienteId;
  // La identidad del producto comprado.
  private String productoId;
  // La cantidad de productos comprados.
  private int cantidad;

  /**
   * Constructor para construir una compra; asigna un identificador
   * de compra compraId automaticamente.
   */
  public Compra(String clienteId, String productoId, int cantidad) {
    this.compraId = compraIdContador++;
    this.clienteId = clienteId;
    this.productoId = productoId;
    this.cantidad = cantidad;
  }

  /**
   * Constructor para USO INTERNO solo.
   */
  Compra(Integer compraId, String clienteId, String productoId, int cantidad) {
    this.compraId = compraId;
    this.clienteId = clienteId;
    this.productoId = productoId;
    this.cantidad = cantidad;
  }

  /**
   * Devuelve la identidad de la compra.
   */
  public Integer getCompraId() {
    return compraId;
  }

  /**
   * Devuelve la identidad del comprador (cliente).
   */
  public String getClienteId() {
    return clienteId;
  }

  /**
   * Devuelve la identidad del producto comprado.
   */
  public String getProductoId() {
    return productoId;
  }

  /**
   * Devuelve la cantidad de productos comprados.
   */
  public int getCantidad() {
    return cantidad;
  }

  /**
   * Compara dos compras usando sus identidades (compraId).
   */
  @Override
  public int compareTo(Compra p) {
    return getCompraId().compareTo(p.getCompraId());
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Compra) {
      Compra a = (Compra) o;
      return
        compraId == null ? a.getCompraId() == null : compraId.equals(a.getCompraId())
        && (clienteId == null ? a.getClienteId()==null : clienteId.equals(a.getClienteId()))
        && (productoId == null ? a.getProductoId()==null : productoId.equals(a.getProductoId()))
        && cantidad == a.getCantidad();
    } else return false;
  }

  @Override
  public int hashCode() {
    return this.getCompraId().hashCode();
  }

  @Override
  public String toString() {
    return "Compra("+toString(getCompraId())+","+toString(getClienteId())+","+toString(getProductoId())+","+getCantidad()+")";
  }

  private String toString(Object obj) {
    if (obj == null) return "";
    else return obj.toString();
  }

}
