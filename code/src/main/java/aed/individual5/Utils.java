package aed.individual5;

import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.tree.*;
import es.upm.aedlib.fifo.*;

public class Utils {

    public static <E> PositionList<Position<E>> longestPath(Tree<E> t) {
        if (t.isEmpty()) {
            return new NodePositionList<>();
        }
        return bsImpl(t);
    }

    private static <E> PositionList<Position<E>> bsImpl(Tree<E> t) {
        Position<E> bottom;
        int maxdepth = 0;
        int currentdepth = 0;

        FIFOList<Position<E>> visited = new FIFOList<Position<E>>();
        visited.enqueue(t.root());

        boolean done = false;

        while (!done) {
            Position<E> head = visited.first();
            if (!t.isExternal(head)) {
                Iterator<Position<E>> a = t.children(head).iterator();
                Position<E> last = a.next();
                while (a.hasNext()) {
                    visited.enqueue(last);
                    last = a.next();
                }
                visited.enqueue(last);
                bottom = last;
                currentdepth++;
            } else {
                visited.dequeue();
                currentdepth--;
            }
            if(currentdepth>maxdepth){
                maxdepth=currentdepth;
            }
            done = visited.isEmpty();
        }
        return null;
    }

}
