package concu.Ejercicios.E1;

public class CC_01_Threads {
    static void spawnThreads(int[] ids, int[] times){
        Thread n= null;

        for (int i = 0; i < ids.length; i++) {
            n = new Thread(new customThread(ids[i], times[i]));
            n.start();
        }
    }
    public static void main(String[] args) {
        int[] ids = new int[]{1,2,3,4};
        int[] times = new int[]{250,750,500,4000};
        spawnThreads(ids, times);
    }
    
}

class customThread implements Runnable{
    int id;
    int sleepMilis;
    customThread(int id, int sleepMilis){
        this.id = id;
        this.sleepMilis = sleepMilis;
    }

    public void run(){
        try {
            Thread.sleep(sleepMilis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I, thread id "+id+" have slept "+sleepMilis+" milliseconds and will now terminate.");
    }
}