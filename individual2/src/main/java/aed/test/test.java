/*package aed.test;

import es.upm.aedlib.*;
import es.upm.aedlib.positionlist.*;
import java.util.function.*;

import org.junit.gen5.commons.util.FunctionUtils;

public class test {

    private static boolean eqNull(Object o1, Object o2) {
        return o1 == o2 || o1 != null && o1.equals(o2);
    }

    public static <E> boolean allEquals (PositionList<E> list, Predicate<E> pred){
        if(list == null ||list.size()==0){
                return false;
        }

        Position<E> cursor = list.first();
        boolean all = true;
        while( cursor != null &&all){
                if(pred.test(cursor.element())
                        all=false;
                else
                        cursor = list.next(cursor);
        }
        return all;
    }

    public static <E> boolean existsP (PositionList<E> list, Predicate<E> pred){
        if(list ==null||list.size()==0){
                return false;
        }

        Position<E> cursor = list.first();
        while(cursor!=null&& !pred.test(cursor.element()){
                cursor = list.next(cursor);
        }

        return cursor !=null;

    }

    // BiFunction<PositionList<String>, Integer, Boolean> air =
    // (list,n)->allAirBBLow(list,n);
    public static <E,F> PositionList<F> map(PositionList<E> list, Function<E,F> f){
        if(list == null || list.size()==0){
            return new NodePositionList<F>();
        }
        PositionList<E> result = new NodePositionList<E>();
        return null;



    }

    public static <E> PositionList<E> aplicar(PositionList<Function<PositionList<E>,PositionList<E>>> transformation, PositionList<E> list){
        PositionList<E> res = list;
        Position<Function<PositionList<E>,PositionList<E>>> cursor = transformation.first();
        while (cursor!=null) {
            res = cursor.element().apply(res);
            cursor = transformation.next(cursor);
        }
        
        return res;
    }
}
*/