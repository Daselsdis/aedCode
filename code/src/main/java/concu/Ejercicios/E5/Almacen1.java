package concu.Ejercicios.E5;

// TODO: importar la clase de los semáforos.
// 
import java.util.concurrent.Semaphore;

// Almacen concurrente para un dato
public class Almacen1 {
    // Producto a almacenar
    private int almacenado;

    // TODO: declaración e inicialización de los semáforos
    // necesarios
    //
    //

    private Semaphore plazasAcceso = new Semaphore(1);

    public Almacen1() {
    }

    public int extraer() {
        int result;

        // TODO: protocolo de acceso a la sección crítica y código de
        // sincronización para poder extraer.
        //
        try {
            plazasAcceso.acquire(1);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Sección crítica
        result = almacenado;

        // TODO: protocolo de salida de la sección crítica y código de
        // sincronización para poder almacenar.
        //
        plazasAcceso.release(1);

        return result;
    }

    public void almacenar(int producto) {
        // TODO: protocolo de acceso a la sección crítica y código de
        // sincronización para poder almacenar.
        //
        try {
            plazasAcceso.acquire(1);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Sección crítica
        almacenado = producto;

        // TODO: protocolo de salida de la sección crítica y código de
        // sincronización para poder extraer.
        //
        plazasAcceso.release(1);
    }

}