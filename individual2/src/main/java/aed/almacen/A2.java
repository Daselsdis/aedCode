package aed.almacen;

import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.indexedlist.ArrayIndexedList;


/**
 * Implementa la logica del almacen.
 */
public class A2 implements ClienteAPI, AlmacenAPI, ProductorAPI {

  // Compras (sin ningun orden especial)
  private ArrayIndexedList<Compra> compras;
  // Productos ordenados ascendamente usando el productoId de un Product.
  private ArrayIndexedList<Producto> productos;
  

  // No es necesario cambiar el constructor
  /**
   * Crea un almacen.
   */
  public A2() {
    this.compras = new ArrayIndexedList<>();
    this.productos = new ArrayIndexedList<>();
  }
  

@Override
public void reabastecerProducto(String productoId, int cantidad) {
	
	boolean finalizar=false;
	Producto nuevore= new Producto(productoId, cantidad);
	
	for(int i=0;this.productos.size()>i&&finalizar==false;i++) {
	 
		  if(this.productos.get(i).compareTo(nuevore)==0) {
			finalizar=true;
			nuevore= new Producto(productoId,cantidad+ getProducto(productoId).getCantidadDisponible());
			this.productos.set(i, nuevore);
		}
	
	}
	
	if(finalizar ==false) {
		this.productos.add(productos.size(), nuevore);
		
	}
}

 public int busquedaBiComp(int id) {
	 int low=0;
	 int high=compras.size()-1;
	 boolean hecho=false;
	 int res=-1;
	 
	 while(low<=high && !hecho) {
		 int mid=(low+high) /2;
		 Compra midcomp=compras.get(mid);
		 
		 int comparator=midcomp.getCompraId().compareTo(id);
		 
		 if(comparator==0) {
			 res=mid;
			 hecho=true;
		 }
		 else if(comparator<0) {
			 low=mid+1;	 
			}
		 else {
			 low=mid-1;
		 }
		 
	 }
	 if(!hecho) {
		 res=high;
	 }
	 return res;
 }
 public int busquedaBiProd(String id) {
	 int low=0;
	 int high= productos.size()-1;
	 boolean hecho=false;
	 int res=-1;
	 
	 while(low<=high && !hecho) {
		 int mid=(low+high)/2;
		 Producto midpro=productos.get(mid);
		 
		 int comparator=midpro.getProductoId().compareTo(id);
		 
		 if(comparator==0) {
			 res=mid;
			 hecho=true;
		 }else if(comparator<0){
			low= mid+1; 
			 }
		 
		 else {
			 low=mid-1;
		 }
		 }
		 
	 if(!hecho) {
		 res=high;		 
	 }
	 return res;
			 
 }

@Override
public Producto getProducto(String productoId) {
	int i=busquedaBiProd(productoId);
	if(i==-1) {
		return null;
	}
	return productos.get(busquedaBiProd(productoId));
}

@Override
public Compra getCompra(Integer compraId) {
	int i=busquedaBiComp(compraId);
	if(i==-1) {
		return null;
	}
	return compras.get(busquedaBiComp(compraId));
	
}

@Override
public IndexedList<Producto> getProductos() {
	if(productos.size()==0) {
		return null;
	}
	IndexedList<Producto> res= new ArrayIndexedList<>();
	for(int i=0;i<productos.size();i++) {
		res.set(i, productos.get(i));
	}
	return res;
}

@Override
public IndexedList<Compra> getCompras() {
	if(compras.size()==0) {
		return null;
	}
	IndexedList<Compra> res= new ArrayIndexedList<>();
	for(int i=0;i<compras.size();i++) {
		res.set(i, compras.get(i));
	}
	return res;
}

@Override
public IndexedList<Compra> comprasCliente(String clienteId) {
	IndexedList<Compra> res=new ArrayIndexedList<>();
	for(int i=0;i<compras.size();i++) {
		if(compras.get(i).getClienteId()==clienteId) {
			res.add(res.size(), compras.get(i));
		}
		
	}
	return res;
}

@Override
public IndexedList<Compra> comprasProducto(String productoId) {
	IndexedList<Compra> res=new ArrayIndexedList<>();
	for(int i=0;i<productos.size();i++) {
		if(productos.get(i).getProductoId()==productoId) {
			res.add(res.size(), compras.get(i));
		}
		
	}
	return res;
}

@Override
public Integer pedir(String clienteId, String productoId, int cantidad) {
	if(busquedaBiProd(productoId)==-1) {
		return null;	
	} else if(productos.get(busquedaBiProd(productoId)).getCantidadDisponible()<cantidad) {
	return null;
	}
	Compra compra= new Compra(clienteId,productoId,cantidad);
	
	getProducto(productoId).setCantidadDisponible(getProducto(productoId).getCantidadDisponible()-cantidad);
	compras.add(compras.size(), compra);
	return compra.getCompraId();

}

	

  // Implementa los métodos necesarios aqui ...
}


