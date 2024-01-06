package OE;

public class Odd implements Runnable  {

    private CommonResorce res;
    public Odd(CommonResorce res) {
        this.res = res;
    }

    @Override
    public void run() {

        while(true) {

            try {
                res.print_Odd();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
