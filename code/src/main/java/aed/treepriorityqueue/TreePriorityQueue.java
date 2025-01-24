package aed.treepriorityqueue;

import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.Entry;
import es.upm.aedlib.EntryImpl;
import es.upm.aedlib.tree.*;

public class TreePriorityQueue<K extends Comparable<K>, V> implements PriorityQueue<K, V> {

    public BinaryTree<Entry<K, V>> t;
    private Position<Entry<K, V>> lastPos;

    public TreePriorityQueue() {
        t = new LinkedBinaryTree<>();
        lastPos = null;
    }

    public int size() {
        return t.size();

    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Entry<K, V> first() throws EmptyPriorityQueueException {
        return t.root().element();
    }

    private Position<Entry<K, V>> insertLeftmost(Entry<K, V> in) {
        Position<Entry<K, V>> n = lastPos;
        Position<Entry<K, V>> p = null;
        boolean done = false;
        if (t.root().equals(lastPos)) {
            t.insertLeft(n, in);
            n = t.left(n);
            done = true;
        }
        while (!done) {
            p = t.parent(n);
            if (t.hasRight(p) && t.right(p).equals(n)) { // der
                // introducir nueva capa
                if (t.root().equals(p)) {
                    n = t.root();
                    while (t.hasLeft(n)) {
                        n = t.left(n);
                    }
                    t.insertLeft(n, in);
                    n = t.left(n);
                    done = true;
                }
            } else {// izq
                if (!t.hasRight(p)) {
                    t.insertRight(p, in);
                    n = t.right(p);
                    done = true;
                } else {
                    n = t.right(p);
                    while (t.hasLeft(n)) {
                        n = t.left(n);
                    }
                    t.insertLeft(n, in);
                    n = t.left(n);
                    done = true;
                }
            }
        }

        return n;
    }

    public void swap() { // Intercambia nodos cuando se viola la up-head bubbling property
        Position<Entry<K, V>> pos = lastPos;
        Position<Entry<K, V>> p = null;
        boolean done = false;

        while (!done) {
            p = t.parent(pos);
            if (pos.element().getKey().compareTo(p.element().getKey()) < 0) {
                t.set(p, pos.element());
                t.set(pos, p.element());
            } else {
                done = true;
            }
        }

    }

    public void enqueue(K k, V v) {
        Entry<K, V> intro = new EntryImpl<K, V>(k, v);
        if (t.isEmpty()) {
            t.addRoot(intro);
            lastPos = t.root();
        } else {
            lastPos = insertLeftmost(intro);
            swap();
        }
    }

    private void downbubbling() {
        Position<Entry<K, V>> n = t.root();
        Position<Entry<K, V>> n1 = null;
        Position<Entry<K, V>> n2 = null;
        K sonVal = null;
        boolean hijo1;

        boolean done = false;
        while (!done) {

            Iterator<Position<Entry<K, V>>> it = t.children(n).iterator();
            if (it.hasNext())
                n1 = it.next();
            if (it.hasNext())
                n2 = it.next();

            if (n1 == null && n2 == null) {
                done = true;
            }

            if (n1.element().getKey().compareTo(n2.element().getKey()) < 0) { // n1<n2
                sonVal = n1.element().getKey();
                hijo1 = true;
            } else {
                sonVal = n2.element().getKey();
                hijo1 = false;
            }

            if (n.element().getKey().compareTo(sonVal) > 0) {
                if (hijo1) {
                    t.set(n, n1.element());
                    n = n1;
                    n1 = null;
                    n2 = null;
                } else {
                    t.set(n, n2.element());
                    n = n2;
                    n1 = null;
                    n2 = null;
                }
            } else {
                done = true;
            }

        }
    }

    private Position<Entry<K, V>> setnewLastPos() {
        Position<Entry<K, V>> n = lastPos;
        Position<Entry<K, V>> p = null;

        boolean done = false;

        while (!done) {
            if (!n.equals(t.root()))
                p = t.parent(n);
            else {
                n = t.left(n);
                while (t.hasRight(n))
                    n = t.right(n);
                done = true;
                continue;
            }
            if (n.equals(t.right(t.parent(n)))) { // der
                n = t.left(p);
                while (t.hasRight(n))
                    n = t.right(n);
                done = true;
            } else { // izq
                if (!n.equals(t.root())) {
                    n = p;
                }
            }
        }
        return n;
    }

    public Entry<K, V> dequeue() throws EmptyPriorityQueueException {
        if (t.isEmpty())
            throw new EmptyPriorityQueueException();

        Entry<K, V> res = t.root().element();
        Entry<K, V> temp = lastPos.element();
        Position<Entry<K, V>> newLastPos = setnewLastPos();
        t.remove(lastPos);
        lastPos = newLastPos;
        t.set(t.root(), temp);
        downbubbling();
        return res;
    }

    public String toString() {
        return t.toString();
    }

    public Iterator<Entry<K, V>> iterator() {
        return t.iterator();
    }

    public static void main(String[] args) {
        TreePriorityQueue<Integer, String> t_0 = new TreePriorityQueue<>();
        t_0.enqueue(26, "Perez");
        t_0.enqueue(66, "Marin");
        try {
            t_0.dequeue();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}