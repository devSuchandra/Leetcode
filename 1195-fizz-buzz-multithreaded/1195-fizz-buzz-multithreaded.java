class FizzBuzz {
    private int n;
     int i = 1;
    Object lock = new Object();

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while(i <= n){
            synchronized(lock){
                if(i % 3 != 0 || i % 5 == 0){
                    lock.wait();
                    continue;
                }
                printFizz.run();
                i = i + 1;
                lock.notifyAll();  
            }
        }
             
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(i <= n){
            synchronized(lock){
                if(i % 3 == 0 || i % 5 != 0){
                    lock.wait();
                    continue;
                }
                printBuzz.run();
                i = i + 1;
                lock.notifyAll();  
            }
        }
        
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(i <= n){
            synchronized(lock){
                if(i % 15 != 0){
                    lock.wait();
                    continue;
                }
                printFizzBuzz.run();
                i = i + 1;
                lock.notifyAll();  
            }
        }
        
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while(i <= n){
            synchronized(lock){
                if(i % 3 == 0 || i % 5 == 0){
                    lock.wait();
                    continue;
                }
                printNumber.accept(i);
                i = i + 1;
                lock.notifyAll(); 
            }
        }
         
    }
}