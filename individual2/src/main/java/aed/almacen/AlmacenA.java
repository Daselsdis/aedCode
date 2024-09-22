package aed.almacen;

import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.indexedlist.ArrayIndexedList;


/**
 * Implementa la logica del almacen.
 */
public class AlmacenA implements ClienteAPI, AlmacenAPI, ProductorAPI {

  // Compras (sin ningun orden especial)
  private ArrayIndexedList<Compra> compras;
  // Productos ordenados ascendamente usando el productoId de un Product.
  private ArrayIndexedList<Producto> productos;

  // No es necesario cambiar el constructor
  /**
   * Crea un almacen.
   */
  public AlmacenA() {
    this.compras = new ArrayIndexedList<>();
    this.productos = new ArrayIndexedList<>();
  }
  

@Override
public void reabastecerProducto(String productoId, int cantidad) {
	int n=0;
	boolean finalizar=false;
	Producto nuevore= new Producto(productoId, cantidad);
	int i=0;
	while((this.productos.size()<i||i==0)&&finalizar==false) {
	  if(i==0) {
		  
	  }else {
		if(this.productos.get(i).compareTo(nuevore)==0) {
			finalizar=true;
			//nuevore= new Producto(productoId,cantidad+ productoId.getCantidadDisponible());
			this.productos.set(i, nuevore);
		}
	i++;
	}
	}
	if(finalizar ==false) {
		this.productos.add(0, nuevore);
		n++;
	}
	
			
			
		
		
		
		
	
}

@Override
public Producto getProducto(String productoId) {
	boolean completado=false;
	Producto nuevopro= new Producto(productoId, 0);
	for(int i=0;this.productos.size()<i;i++) {
		if(this.productos.get(i).compareTo(nuevopro)==0) {
			completado=true;
			nuevopro=this.productos.get(i);
			
		}
	}
	if(completado==true) {
		return nuevopro;
	} else{
		return null;
	}
		
	
}

@Override
public Compra getCompra(Integer compraId) {
	
	return null;
}

@Override
public IndexedList<Producto> getProductos() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public IndexedList<Compra> getCompras() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public IndexedList<Compra> comprasCliente(String clienteId) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public IndexedList<Compra> comprasProducto(String productoId) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Integer pedir(String clienteId, String productoId, int cantidad) {
	// TODO Auto-generated method stub
	return null;
}

	public static void main(String[] args) {
	AlmacenA a= new AlmacenA();
	//a.reabastecerProducto("champu", 4);
	//a.reabastecerProducto("coco", 4);
	//a.reabastecerProducto("champu", 4);
	//System.out.print(a.getProducto("champu"));
//		System.out.print(this.productos.size());
	}
}