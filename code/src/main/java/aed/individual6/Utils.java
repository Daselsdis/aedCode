package aed.individual6;

import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.set.*;

import java.util.Iterator;

import es.upm.aedlib.graph.*;
import es.upm.aedlib.map.HashTableMap;

public class Utils {

    /**
     * Devuelve un conjunto con todos los vertices alcanzables desde AMBOS
     * v1 y v2.
     */
    public static <V> Set<Vertex<V>> reachableFromBoth(DirectedGraph<V, Boolean> g, Vertex<V> v1, Vertex<V> v2) {
        HashTableMapSet<Vertex<V>> reachableFrom1 = new HashTableMapSet<>();
        HashTableMapSet<Vertex<V>> reachableFrom2 = new HashTableMapSet<>();
        HashTableMapSet<Vertex<V>> res = new HashTableMapSet<>();

        reachableFrom1 = reach(g, v1);
        reachableFrom2 = reach(g, v2);
        Iterator<Vertex<V>> i = reachableFrom1.iterator();
        Vertex<V> current = null;
        while (i.hasNext()) {
            current = i.next();
            if (reachableFrom2.contains(current))
                res.add(current);
        }

        return res;
    }

    private static <V> HashTableMapSet<Vertex<V>> reach(DirectedGraph<V, Boolean> g, Vertex<V> v) {
        HashTableMapSet<Vertex<V>> res = new HashTableMapSet<>();
        res.add(v);
        return reachRec(g, v, res);
    }

    private static <V> HashTableMapSet<Vertex<V>> reachRec(DirectedGraph<V, Boolean> g, Vertex<V> v,
            HashTableMapSet<Vertex<V>> res) {
        HashTableMapSet<Vertex<V>> temp = new HashTableMapSet<>();
        for (Edge<Boolean> e : g.outgoingEdges(v)) {
            Vertex<V> vert = g.endVertex(e);
            if (e.element() && !res.contains(vert) && !vert.equals(v)) {
                res.add(vert);
                temp.add(vert);
            }
        }
        if (temp.isEmpty()) {
            return res;
        }
        Iterator<Vertex<V>> i = temp.iterator();
        Vertex<V> current = null;
        while (i.hasNext()) {
            current = i.next();
            res = reachRec(g, current, res);
        }

        return res;
    }

    /**
     * Devuelve un camino (una lista de aristas) que llevan desde from y to,
     * donde la suma de los elementos de las aristas del camino <= limit.
     * Si no existe ningun camino que cumple con esta restriccion se devuelve
     * el valor null.
     */

    public static <V> PositionList<Edge<Integer>> existsPathLess(UndirectedGraph<V, Integer> g, Vertex<V> from,
            Vertex<V> to, int limit) {

        PositionList<Edge<Integer>> path = new NodePositionList<Edge<Integer>>(); // acts as lifo
        if (to.equals(from)) {
            return path;
        }

        HashTableMap<Vertex<V>, Integer> dist = new HashTableMap<Vertex<V>, Integer>();
        HashTableMap<Vertex<V>, Edge<Integer>> prevEdge = new HashTableMap<Vertex<V>, Edge<Integer>>();
        HashTableMapSet<Vertex<V>> unvisited = new HashTableMapSet<>();

        for (Vertex<V> v : g.vertices()) {
            unvisited.add(v);
            dist.put(v, Integer.MAX_VALUE);
        }

        dist.put(from, 0);

        Vertex<V> currentVert;
        int currentDist;
        int auxDist;

        while (!unvisited.isEmpty()) {

            currentDist = Integer.MAX_VALUE;
            currentVert = null;
            // closest vert
            for (Vertex<V> v : unvisited) {
                auxDist = dist.get(v);
                if (auxDist < currentDist) {
                    currentVert = v;
                    currentDist = auxDist;
                }
            }

            if (currentVert == null) {
                break; // we've reached the end and not returned previously, they must be disconnected
                // or too far away. Return null
            }
            unvisited.remove(currentVert);
            if (currentVert.equals(to) && currentDist < limit) { // Found a path, construct it and send it back
                Vertex<V> temp = to;
                while (temp != from) {
                    Edge<Integer> edge = prevEdge.get(temp);
                    path.addFirst(edge);
                    temp = g.opposite(temp, edge);
                }
                return path;
            } else { // Update current distances to from for every vert adj to currentVert
                Vertex<V> neigh;
                int newDist;
                for (Edge<Integer> e : g.edges(currentVert)) {
                    neigh = g.opposite(currentVert, e);
                    newDist = currentDist + e.element();
                    if (newDist < dist.get(neigh)) {
                        dist.put(neigh, newDist);
                        prevEdge.put(neigh, e);
                    }

                }

            }

        }
        return null;
    }
}
