package OE;

public class Even implements Runnable {

    private CommonResorce res;

    public Even(CommonResorce res){
        this.res = res;
    }

    @Override
    public void run() {

         while(true){

             try {
                 res.print_Even();
                 Thread.sleep(2000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }

         }

    }
}
