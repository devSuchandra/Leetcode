class ZeroEvenOdd {
    private int n;
    private int state = 0;
    private int i = 1;
    Object lock = new Object();
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while(i <= n){
            synchronized(lock){
                if(state != 0){
                    lock.wait();
                    continue;
                }
                printNumber.accept(0);
                state = i % 2 == 0 ? 2 : 1;
                lock.notifyAll();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while(i <= n){
            synchronized(lock){
                if(state != 2){
                    lock.wait();
                    continue;
                }
                printNumber.accept(i);
                i++;
                state = 0;
                lock.notifyAll();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
         while(i <= n){
            synchronized(lock){
                if(state != 1){
                    lock.wait();
                    continue;
                }
                printNumber.accept(i);
                i++;
                state = 0;
                lock.notifyAll();
            }
        }
        
    }
}