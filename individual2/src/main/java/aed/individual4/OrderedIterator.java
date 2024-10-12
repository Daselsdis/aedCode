package aed.individual4;

import java.util.Iterator;
import java.util.NoSuchElementException;

import es.upm.aedlib.Position;

import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class OrderedIterator implements Iterator<Integer> {

    PositionList<Integer> list = new NodePositionList<Integer>();
    Position<Integer> cursor = null;

    public OrderedIterator(PositionList<Integer> list) {
        // We treat list like an iterator
        Iterator<Integer> it = list.iterator();

        // Instead of checking each round of the while loop for the first iteration, we
        // account for the first iteration on a coditional beforehand. We also
        // initialize the cursor.
        if (it.hasNext()) {
            this.list.addFirst(it.next());
            cursor = this.list.first();
        }

        // General while loop to add to this.list the appropiate values.
        while (it.hasNext()) {
            Integer val = it.next();
            if (this.list.last().element().compareTo(val) <= 0) // We take advantage of the compareTo in Integers.
                this.list.addLast(val); // Add to the end of the list if it passes.

        }
    }

    @Override
    public boolean hasNext() {// Is the current cursor pointing to anything?
        return null != cursor;
    }

    @Override
    public Integer next() {
        // I chose to do a cursor == null instead of a !hasnext() to save up on a
        // function call.
        if (cursor == null)
            throw new NoSuchElementException();

        // If the cursor is not null, we advance it and pass the previous value.
        Integer ret = cursor.element();
        cursor = list.next(cursor);
        return ret;
    }
}
