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

    @Override
    public void add(E elem, int n) {
        if (n < 0)
            throw new IllegalArgumentException("Must provide positive quantity to add");

        if(multiplicity(elem))

        elements.addLast(new Pair<>(elem,n));
        size+=n;
    }

    @Override
    public int remove(E elem, int n) {
        // We count the number of elements we can delete
        if(n<multiplicity(elem))
            return 0;
        

        // TODO remember to decrease size
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int multiplicity(E elem) {
        int acc = 0;
        Position<Pair<E,Integer>> cursor = elements.first();
        while (cursor!=null&&acc==0) {
            if(cursor.element().getLeft().equals(elem))
                acc = cursor.element().getRight();
            cursor = elements.next(cursor);
        }
        return acc;

        /*
        int acc = 0;
        Position<Pair<E,Integer>> cursor = elements.first();
        while (cursor!=null) {
            if(cursor.element().getLeft().equals(elem))
                acc += cursor.element().getRight();
            cursor = elements.next(cursor);
        }
        return acc;
        */
    }

    @Override
    public int size() {
        return size;
        /* 
        int acc = 0;
        Position<Pair<E,Integer>> cursor = elements.first();
        while (cursor!=null) {
            acc += cursor.element().getRight();
            cursor = elements.next(cursor);
        }
        return acc;*/
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty()?true:false;
    }

    @Override
    public PositionList<E> elements() {
        PositionList<E> acc = new NodePositionList<E>();
        Position<Pair<E,Integer>> cursor = elements.first();
        while (cursor!=null) {
            boolean contains = false;
            Position<E> cursorAcc = acc.first();
                while (cursorAcc!=null) {
                    contains = cursorAcc.element().equals(cursor.element().getLeft());
                    if(contains)
                        break;
                    cursorAcc = acc.next(cursorAcc);
                }
            
            if(contains)
                acc.addLast(cursor.element().getLeft());
            
            cursor = elements.next(cursor);
        }
        return acc;
    }

    @Override
    public MultiSet<E> sum(MultiSet<E> s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    @Override
    public MultiSet<E> minus(MultiSet<E> s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minus'");
    }

    @Override
    public MultiSet<E> intersection(MultiSet<E> s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intersection'");
    }

    @Override
    public boolean subsetEqual(MultiSet<E> s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subsetEqual'");
    }

    public static void main(String[] args) {
        MultiSet<String> m = new MultiSetList<>();
        m.add("a", 1);
        m.add("b", 2);
        m.add("a", 1);
        m.add("c", 1);
        System.out.println(m.elements());
    }

}
