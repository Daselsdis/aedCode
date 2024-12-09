package aed.individual6;

import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.set.*;

import java.util.Iterator;

import es.upm.aedlib.graph.*;

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
        reachableFrom2 = reach(g, v2); // TODO: Implement conditional reach
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
            if (i.hasNext())
                res = reachRec(g, current, res);
        }

        return reachRec(g, current, res);
    }

    /**
     * Devuelve un camino (una lista de aristas) que llevan desde from y to,
     * donde la suma de los elementos de las aristas del camino <= limit.
     * Si no existe ningun camino que cumple con esta restriccion se devuelve
     * el valor null.
     */

    public static <V> PositionList<Edge<Integer>> existsPathLess(UndirectedGraph<V, Integer> g, Vertex<V> from,
            Vertex<V> to, int limit) {
        return null;
    }

    public static void main(String[] args) {

        DirectedAdjacencyListGraph<Integer, Boolean> graph = new DirectedAdjacencyListGraph<Integer, Boolean>();
        Vertex<Integer> v_0 = graph.insertVertex(0);
        Vertex<Integer> v_1 = graph.insertVertex(1);
        Vertex<Integer> v_2 = graph.insertVertex(2);
        Vertex<Integer> v_3 = graph.insertVertex(3);
        Vertex<Integer> v_4 = graph.insertVertex(4);
        Vertex<Integer> v_5 = graph.insertVertex(5);
        Vertex<Integer> v_6 = graph.insertVertex(6);
        graph.insertDirectedEdge(v_6, v_6, false);
        graph.insertDirectedEdge(v_5, v_5, true);
        graph.insertDirectedEdge(v_5, v_6, true);
        graph.insertDirectedEdge(v_4, v_4, true);
        graph.insertDirectedEdge(v_4, v_5, true);
        graph.insertDirectedEdge(v_3, v_4, true);
        graph.insertDirectedEdge(v_3, v_6, true);
        graph.insertDirectedEdge(v_2, v_4, true);
        graph.insertDirectedEdge(v_1, v_3, true);
        graph.insertDirectedEdge(v_1, v_4, true);
        graph.insertDirectedEdge(v_0, v_0, true);
        graph.insertDirectedEdge(v_0, v_6, true);
        reachableFromBoth(graph, v_3, v_3);
    }

}
