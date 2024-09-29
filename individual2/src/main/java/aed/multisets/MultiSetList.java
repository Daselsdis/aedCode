package aed.multisets;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;

/**
 * Una implementacion de un multiset (multiconjunto) a traves de una lista
 * de posiciones.
 */
public class MultiSetList<E> implements MultiSet<E> {

    /**
     * La estructura de datos que guarda los elementos del multiset.
     */
    private PositionList<Pair<E, Integer>> elements;

    /**
     * El tamaño del multiset.
     */
    private int size;

    /**
     * Construye un multiset vacio.
     */
    public MultiSetList() {
        this.elements = new NodePositionList<Pair<E, Integer>>();
        this.size = 0;
    }

    private void modElem(E elem, int n) {
        boolean done = false;
        Position<Pair<E, Integer>> cursor = elements.first();
        while (cursor != null && !done) {
            if (cursor.element().getLeft().equals(elem)) {
                cursor.element().setRight(cursor.element().getRight() + n);
                if (cursor.element().getRight() == 0) // Only for remove
                    elements.remove(cursor);
                done = true; // TODO can I not use a break??????
            }
            if (!done)
                cursor = elements.next(cursor);

        }
        size += n;
    }

    @Override
    public void add(E elem, int n) {
        if (n < 0)
            throw new IllegalArgumentException("Must provide positive quantity to add");

        if (multiplicity(elem) == 0) {
            if (n != 0)
                elements.addLast(new Pair<>(elem, n));
        } else {
            modElem(elem, n);
        }
    }

    @Override
    public int remove(E elem, int n) {
        if (n < 0)
            throw new IllegalArgumentException("Must provide positive quantity to add");

        if (n > multiplicity(elem))
            return 0;
        else {
            modElem(elem, -n);
            return n;
        }
    }

    @Override
    public int multiplicity(E elem) {
        int acc = 0;
        Position<Pair<E, Integer>> cursor = elements.first();
        while (cursor != null && acc == 0) {
            if (cursor.element().getLeft().equals(elem))
                acc = cursor.element().getRight();
            cursor = elements.next(cursor);
        }
        return acc;

        /*
         * int acc = 0;
         * Position<Pair<E,Integer>> cursor = elements.first();
         * while (cursor!=null) {
         * if(cursor.element().getLeft().equals(elem))
         * acc += cursor.element().getRight();
         * cursor = elements.next(cursor);
         * }
         * return acc;
         */
    }

    @Override
    public int size() {
        return size;
        /*
         * int acc = 0;
         * Position<Pair<E,Integer>> cursor = elements.first();
         * while (cursor!=null) {
         * acc += cursor.element().getRight();
         * cursor = elements.next(cursor);
         * }
         * return acc;
         */
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty() ? true : false;
    }

    @Override
    public PositionList<E> elements() {
        PositionList<E> acc = new NodePositionList<E>();
        Position<Pair<E, Integer>> cursor = elements.first();
        while (cursor != null) {
            acc.addLast(cursor.element().getLeft());
            cursor = elements.next(cursor);
        }
        return acc;
    }

    @Override
    public MultiSet<E> sum(MultiSet<E> s) {
        MultiSet<E> res = new MultiSetList<E>();

        Position<Pair<E, Integer>> cursor = elements.first();
        while (cursor != null) {
            res.add(cursor.element().getLeft(), cursor.element().getRight());
            cursor = elements.next(cursor);
        }

        for (E elem : s.elements()) {
            res.add(elem, s.multiplicity(elem));
        }

        return res;
    }

    @Override
    public MultiSet<E> minus(MultiSet<E> s) {
        MultiSet<E> res = new MultiSetList<E>();

        Position<Pair<E, Integer>> cursor = elements.first();
        while (cursor != null) {
            res.add(cursor.element().getLeft(), cursor.element().getRight());
            cursor = elements.next(cursor);
        }

        for (E elem : s.elements()) {
            res.remove(elem, s.multiplicity(elem));
        }

        return res;
    }

    @Override
    public MultiSet<E> intersection(MultiSet<E> s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intersection'");
    }

    @Override
    public boolean subsetEqual(MultiSet<E> s) {
        boolean res = true;

        Position<Pair<E, Integer>> cursor = elements.first();
        while (cursor != null && res) {
            E elem = cursor.element().getLeft();
            if (s.multiplicity(elem) < cursor.element().getRight())
                res = false;
            cursor = elements.next(cursor);
        }
        return res;

        /*
         * boolean res = true;
         * Position<Pair<E, Integer>> cursor = elements.first();
         * while (cursor != null && res) {
         * boolean touched = false;
         * E elem = cursor.element().getLeft();
         * for (E elemS : s.elements()) {
         * if (elem.equals(elemS)) {
         * 
         * }
         * }
         * // if(cursor.element().getLeft().equals(cursor))
         * cursor = elements.next(cursor);
         * }
         * return res;
         */
    }

    public static void main(String[] args) {
        MultiSet<String> m = new MultiSetList<>();
        m.add("a", 1);
        m.add("b", 2);
        m.add("a", 1);
        m.add("c", 1);
        System.out.println(m.multiplicity("a"));
        System.out.println(m.multiplicity("b"));
        System.out.println(m.multiplicity("c"));
        System.out.println(m.remove("a", 3));
        System.out.println(m.remove("a", 1));
        System.out.println(m.remove("b", 2));
        System.out.println(m.remove("c", 0));

        System.out.println(m.elements());
        System.out.println(m.multiplicity("a"));
        System.out.println(m.multiplicity("b"));
        System.out.println(m.multiplicity("c"));
    }

}
