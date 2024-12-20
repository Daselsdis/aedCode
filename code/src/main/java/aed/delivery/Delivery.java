package aed.delivery;

import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.graph.DirectedAdjacencyListGraph;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.indexedlist.ArrayIndexedList;
import es.upm.aedlib.graph.Edge;

public class Delivery<V> {
    DirectedAdjacencyListGraph<V, Integer> graph = new DirectedAdjacencyListGraph<>();

    // Construct a graph out of a series of vertices and an adjacency matrix.
    // There are 'len' vertices. A null means no connection. A non-negative
    // number represents distance between nodes.
    public Delivery(V[] places, Integer[][] gmat) {
        ArrayIndexedList<Vertex<V>> verts = new ArrayIndexedList<Vertex<V>>();
        for (int i = 0; i < places.length; i++)
            verts.add(i, graph.insertVertex(places[i]));

        for (int i = 0; i < gmat.length; i++)
            for (int j = 0; j < gmat.length; j++)
                if (gmat[i][j] != null && gmat[i][j] >= 0)
                    graph.insertDirectedEdge(verts.get(i), verts.get(j), gmat[i][j]);

    }

    // Just return the graph that was constructed
    public DirectedGraph<V, Integer> getGraph() {
        return graph;
    }

    // Return a Hamiltonian path for the stored graph, or null if there is none.
    // The list containts a series of vertices, with no repetitions (even if the
    // path can be expanded to a cycle).
    public PositionList<Vertex<V>> tour() {
        PositionList<Vertex<V>> path = new NodePositionList<Vertex<V>>();
        PositionList<Vertex<V>> vertices = new NodePositionList<Vertex<V>>();
        graph.vertices().forEach(vertices::addLast);
        for (Vertex<V> v : vertices) {
            path.addLast(v);
            if (tourIter(path, vertices))
                return path;
            path = new NodePositionList<Vertex<V>>();
        }
        return null;
    }

    private boolean tourIter(PositionList<Vertex<V>> path, PositionList<Vertex<V>> vertices) {
        if (path.size() == graph.numVertices())
            return true;
        Position<Vertex<V>> cursor = vertices.first();
        while (cursor != null) {
            if (validConnection(path, cursor.element())) {
                path.addLast(cursor.element());
                if (tourIter(path, vertices))
                    return true;
                path.remove(path.last());
            }
            cursor = vertices.next(cursor);
        }
        return false;
    }

    private boolean validConnection(PositionList<Vertex<V>> path, Vertex<V> candidato) {
        for (Vertex<V> v : path) {
            if (v.equals(candidato))
                return false;
        }
        for (Edge<Integer> v : graph.outgoingEdges(path.last().element())) {
            if (graph.endVertex(v).equals(candidato))
                return true;
        }

        return false;
    }

    public int length(PositionList<Vertex<V>> path) {
        int len = 0;
        Position<Vertex<V>> cursor = path.first();
        Vertex<V> pastVer = cursor.element();
        cursor = path.next(cursor);
        Iterable<Edge<Integer>> it = graph.outgoingEdges(pastVer);
        Edge<Integer> connectingEdge = null;
        while (cursor != null) {
            for (Edge<Integer> e : it)
                if (graph.endVertex(e).equals(cursor.element())) {
                    connectingEdge = e;
                    break;
                }
            if (connectingEdge != null) {
                len += connectingEdge.element();
                connectingEdge = null;
            }
            pastVer = cursor.element();
            cursor = path.next(cursor);
            it = graph.outgoingEdges(pastVer);
        }
        return len;
    }

    public String toString() {
        return "Delivery";
    }
}
