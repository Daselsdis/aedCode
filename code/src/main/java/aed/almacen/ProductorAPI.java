package aed.almacen;

/**
 * Metodos que los productores (productores de productos) usan 
   para interactuar con el almacen.
 */
public interface ProductorAPI {

  /**
   * Llega al almacen una cantidad de un producto (identificado por productoId)
   * desde un productor.
   * El metodo debe aumentar la disponibilidad de los productos en el almacen.
   */
  public void reabastecerProducto(String productoId, int cantidad);

}
