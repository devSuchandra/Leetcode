class Foo {
    int i = 1;
    Object lock = new Object();

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        while(i <= 3){
            synchronized(lock){
                if(i != 1){
                    lock.wait();
                    continue;
                }
                // printFirst.run() outputs "first". Do not change or remove this line.
                printFirst.run();
                i++;
                lock.notifyAll();
            }
        }
        
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(i <= 3){
            synchronized(lock){
                if(i != 2){
                    lock.wait();
                    continue;
                }
                // printSecond.run() outputs "second". Do not change or remove this line.
                printSecond.run();
                i++;
                lock.notifyAll();
            }
        }
        
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(i <= 3){
            synchronized(lock){
                if(i != 3){
                    lock.wait();
                    continue;
                }
                // printThird.run() outputs "third". Do not change or remove this line.
                printThird.run();
                i++;
                lock.notifyAll();
            }
        }
        
    }
}