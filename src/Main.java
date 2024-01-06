import OE.CommonResorce;
import OE.Even;
import OE.Odd;

public class Main {
    public static void main(String[] args) {

        CommonResorce res = new CommonResorce();

        Odd Oo = new Odd(res);
        Thread o = new Thread(Oo);

        Even Ee = new Even(res);
        Thread e = new Thread(Ee);

        o.start();
        e.start();

    }
}