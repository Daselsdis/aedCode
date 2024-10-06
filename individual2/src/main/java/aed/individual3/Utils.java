package aed.individual3;

import java.util.Iterator;

import es.upm.aedlib.positionlist.NodePositionList;

public class Utils {
    public static boolean isArithmeticSequence(Iterable<Integer> l) {
        Iterator<Integer> itSize = l.iterator();
        boolean isTrue = true;
        int acc = 0;
        int size = 0;
        while (itSize.hasNext()) {
            size++;
            itSize.next();
        }
        if (size <= 2)
            return true;
        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {

            
        }
        // while (it.hasNext()) {

        // }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1 })));
    }
}
