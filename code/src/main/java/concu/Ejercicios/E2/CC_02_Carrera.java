package concu.Ejercicios.E2;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class CC_02_Carrera {
    public static void main(String[] args) {
        PositionList<Integer> nums = new NodePositionList<Integer>();
        int limit = 150;
        Thread imparesThread = new Thread(new producers(1, 1, limit, nums));
        Thread paresThread = new Thread(new producers(2, 2, limit, nums));
        Thread lector = new Thread(new consumer(3, limit, nums));
        imparesThread.start();
        paresThread.start();
        lector.start();
        // This runs into multiple race conditions given that it can collide in asking
        // for the last element while this isn't yet initialized by whichever producer
        // thread, the threads can also overlap and the list of numbers as a general
        // rule don't come out ordered. lastly, even it these problems don't collide,
        // often the consumer only shows a couple of reading instead of one after each
        // added entry.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Position<Integer> cursor = nums.next(nums.first());
        Boolean ordered = true;
        while (cursor != null && ordered) {
            ordered = cursor.element().equals(nums.prev(cursor).element() + 1);
            cursor = nums.next(cursor);
        }
        if (ordered)
            System.out.println("It was ordered");
        else
            System.out.println("It wasn't ordered");
    }
}

class consumer implements Runnable {
    int id;
    int num = 0;
    int limit;
    PositionList<Integer> list;

    consumer(int id, int limit, PositionList<Integer> list) {
        this.id = id;
        this.limit = limit;
        this.list = list;
    }

    public void run() {
        while (num < limit) {
            num = list.last().element();
            System.out.println("Last added number: " + num + ". The current list is:\n" + list.toString());
        }
    }
}

class producers implements Runnable {
    int id;
    int num;
    int limit;
    PositionList<Integer> list;

    producers(int id, int num, int limit, PositionList<Integer> list) {
        this.id = id;
        this.num = num;
        this.limit = limit;
        this.list = list;
    }

    public void run() {
        while (num <= limit) {
            list.addLast(num);
            // System.out.println("Thread "+id+" has added number "+num+" to the list. The
            // current list is:\n"+list.toString());
            num += 2;
        }
    }
}