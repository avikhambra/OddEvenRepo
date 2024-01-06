package OE;

public class CommonResorce {

    private int val;

    public CommonResorce(){
        val = 1;
    }

    public synchronized void print_Even() throws InterruptedException {

        if(val % 2 == 1){
            wait();
        }

        System.out.println(val + " is Even.");
        val++;
        notify();

    }

    public synchronized void print_Odd() throws InterruptedException {

        if(val % 2 == 0){
            wait();
        }

        System.out.println(val + " is Odd.");
        val++;
        notify();

    }


}

// More Qus ->  https://leetcode.com/tag/concurrency/
