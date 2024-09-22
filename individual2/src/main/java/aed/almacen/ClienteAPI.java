package aed.almacen;

/**
 * Metodos que clientes usan para interactuar con el almacen.
 */
public interface ClienteAPI {

  /**
   * Un cliente identificado por clienteId realiza una compra
   * de cantidad productos identificados por el productoId, si hay suficientes
   * articulos disponibles.
   * Devuelve la compraId de la compra (o null si no hay suficientes articulos disponibles).
   * Debe cambiar (reducir) el numero de productos disponibles.
   */
  public Integer pedir(String clienteId, String productoId, int cantidad);

}

                             
