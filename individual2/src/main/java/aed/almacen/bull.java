package aed.almacen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import es.upm.aedlib.indexedlist.ArrayIndexedList;
import es.upm.aedlib.indexedlist.IndexedList;

/**
 * Implementa la logica del almacen.
 */
public class bull implements ClienteAPI, AlmacenAPI, ProductorAPI {

    // Compras (sin ningun orden especial)
    private ArrayIndexedList<Compra> compras;
    // Productos ordenados ascendamente usando el productoId de un Product.
    private ArrayIndexedList<Producto> productos;

    // No es necesario cambiar el constructor
    /**
     * Crea un almacen.
     */
    public bull() {
        this.compras = new ArrayIndexedList<>();
        this.productos = new ArrayIndexedList<>();
    }

    @Override
    public void reabastecerProducto(String productoId, int cantidad) {
        int index= buscarbinProd(productoId);
        if(index!=-1&&productos.get(index).getProductoId().equals(productoId)){
            int cant_disp=productos.get(index).getCantidadDisponible();
            productos.get(index).setCantidadDisponible(cantidad+cant_disp);
        }
        else{
            Producto nuevo = new Producto(productoId, cantidad);
            productos.add(productos.size(), nuevo);
        }
    }

    public int buscarbinProd(String id) {
        int low = 0;
        int high = productos.size() - 1;
        boolean done = false;
        int res = 0;

        while (low <= high && !done) {
            int mid = (low + high) / 2;
            Producto midObj = productos.get(mid);

            int comp = midObj.getProductoId().compareTo(id);

            if (comp == 0) {
                res = mid;
                done = true;
            } else if (comp < 0)
                low = mid + 1;
            else if (comp > 0)
                high = mid - 1;
        }
        if (!done)
            res = high;

        return res;
    }

    public int buscarbincompra(int id) {
        int low = 0;
        int high = compras.size() - 1;
        boolean done = false;
        int res = -1;

        while (low <= high && !done) {
            int mid = (low + high) / 2;
            Compra midObj = compras.get(mid);

            int comp = midObj.getCompraId().compareTo(id);

            if (comp == 0) {
                res = mid;
                done = true;
            } else if (comp < 0)
                low = mid + 1;
            else if (comp > 0)
                high = mid - 1;
        }
        if (!done)
            res = high;

        return res;
    }

    // public int buscarbin(String id, IndexedList lista){
    // int low = 0;
    // int high = lista.size() -1;
    // boolean done = false;
    // int res = -1;
    //
    // while(low<=high&&!done){
    // int mid = (low+high)/2;
    // Object midObj = lista.get(mid);
    //
    // int comp = midObj(Compra)
    // }
    // return 0;
    // }

    @Override
    public Producto getProducto(String productoId) {
        int id = buscarbinProd(productoId);
        System.out.println(id);
        if (id == -1)
            return null;
        else
            return productos.get(id);
    }

    @Override
    public Compra getCompra(Integer compraId) {
        int id = buscarbincompra(compraId);
        if (id == -1)
            return null;
        else
            return compras.get(id);
    }

    @Override
    public IndexedList<Producto> getProductos() {
        List<Producto> ordList = new ArrayList<>();
        for (int i = 0; i < productos.size(); i++) {
            ordList.add(productos.get(i));
        }

        Collections.sort(ordList);

        ArrayIndexedList<Producto> resList = new ArrayIndexedList<>();

        for (int i = 0; i < productos.size(); i++) {
            resList.add(resList.size(), ordList.get(i));
        }

        return resList;
    }

    @Override
    public IndexedList<Compra> getCompras() {
        return new ArrayIndexedList<>(compras);
    }

    @Override
    public IndexedList<Compra> comprasCliente(String clienteId) {

        IndexedList<Compra> res = new ArrayIndexedList<>();

        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getClienteId().equals( clienteId)) {
                res.add(res.size(), compras.get(i));
            }
        }
        return res;
    }

    @Override
    public IndexedList<Compra> comprasProducto(String productoId) {

        IndexedList<Compra> res = new ArrayIndexedList<>();

        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getProductoId() == productoId) {
                res.add(res.size(), compras.get(i));
            }
        }
        return res;

    }

    @Override
    public Integer pedir(String clienteId, String productoId, int cantidad) {
        if (buscarbinProd(productoId) == -1)
            return null;
        if (productos.get(buscarbinProd(productoId)).getCantidadDisponible() < cantidad)
            return null;

        Compra compra = new Compra(clienteId, productoId, cantidad);
        compras.add(compras.size(), compra);
        getProducto(productoId).setCantidadDisponible(getProducto(productoId).getCantidadDisponible() - cantidad);

        return compra.getCompraId();

    }

    public static void main(String[] args) {
        bull a = new bull();
        a.reabastecerProducto("t-shirt", 1);
        a.reabastecerProducto("t-shirt", 1);
        a.reabastecerProducto("movil", 2);
        for(int i=0;i<a.productos.size();i++){
            System.out.println("-"+a.getProductos().get(i));
        }
        System.out.println(a.getProducto("movil"));
        System.out.println(a.getProducto("t-shirt"));
    }

}