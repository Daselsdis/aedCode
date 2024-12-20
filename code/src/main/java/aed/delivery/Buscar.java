package aed.delivery;

import java.util.Iterator;

import es.upm.aedlib.Pair;
import es.upm.aedlib.positionlist.*;

public class Buscar { // Still on it

    public static Pair<String, PositionList<Direccion>> busca(Laberinto laberinto) {
        boolean done = false;
        PositionList<Direccion> path = new NodePositionList<Direccion>();
        while (!done) {
            System.out.println(laberinto.printPuntos());
            if(laberinto.tieneRegalo()){
                return new Pair<>(laberinto.getRegalo(),path);
            }

            switch(direccionesPosiblesAmmount(laberinto)){
                case 1:
                    path.addLast(laberinto.direccionesPosibles().iterator().next());
                    laberinto.marcaSueloConTiza();
                    laberinto.moverHacia(laberinto.direccionesPosibles().iterator().next());
                default:
                return null;
                
            }
        }
        return null;
    }

    private static int direccionesPosiblesAmmount(Laberinto lab) {
        int acc;
        Iterator<Direccion> i = lab.direccionesPosibles().iterator();
        for (acc = 0; i.hasNext(); acc++, i.next()) {
        }
        return acc;
    }

}
