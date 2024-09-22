package aed.almacen;

import es.upm.aedlib.Pair;
import es.upm.aedlib.indexedlist.IndexedList;


/**
 * Metodos para examinar los datos del almacen.
 */
public interface AlmacenAPI {

  /**
   * Devuelve un producto que esta en el almacén (o null si no esta).
   */
  public Producto getProducto(String productoId);

  /**
   * Devuelve una compra (o null si no existe).
   */
  public Compra getCompra(Integer compraId);

  /**
   * Todos los productos conocidos, ordenados por productoId en orden ascendente.
   * Notad que la lista devuelta tiene que ser nueva, es decir, no se puede
   * devolver la lista que contiene el atributo productos dentro la clase Almacen.
   */
  public IndexedList<Producto> getProductos();

  /**
   * Devuelve todas las compras (sin ningun orden en especial).
   * Notad que la lista devuelta tiene que ser nueva, es decir, no se puede
   * devolver la lista que contiene el atributo compras dentro la clase Almacen.
   */
  public IndexedList<Compra> getCompras();

  /**
   * Devuelve las compras de un cliente (sin ningun orden en especial).
   */
  public IndexedList<Compra> comprasCliente(String clienteId);

  /**
   * Devuelve las compras de un producto (sin ningun orden en especial).
   */
  public IndexedList<Compra> comprasProducto(String productoId);

}
