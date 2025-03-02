// using thread class.
// class A extends Thread {
//     public void run() {
//         for (int i = 0; i < 100; i++)
//             System.out.println("Show in A");
//         try {
//             sleep(10);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 0; i < 100; i++)
//             System.out.println("Show in B");
//             try {
//                 sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//     }
// }
// Using Runnable interface.

import javax.crypto.IllegalBlockSizeException;

/**
 * InnerThreads
 */
// class InnerThreads implements Runnable {

// // public void run() {
// // for (int i = 0; i < 100; i++)
// // System.out.println("Hii");
// // }
// }

// class InnerThreads2 implements Runnable {

// // public void run() {
// // for (int i = 0; i < 100; i++)
// // System.out.println("Hello");
// // }
// }


// --- Syncrozation ---
class Counter{
     int count = 0; // shared space.
    public synchronized void  increment()
    {
        count++;
    }
}
public class Threads {
    /*
     * ---Thread---
     * Thread is lightweight process mean's a small unit of a program.
     * when we write a program we do have multiple thread's in that program.
     * so as java is multithreading language we can execute multiple thread's
     * simelteneously, but ya we can'not garrenty that as we are trying to is going
     * to happen because at the cpu scheduler do the work.
     * cpu scheduler is nothing but a machine program which handles the cpu time
     * mean's it handles when and which time, how much to give any process.
     * when we want some thread's need's to execute concrurently that time we can
     * set priority to thread's with the help of Thread class.
     * 
     * --- Thread Class ---
     * Now, the question is what is thread class so thread is class in java by
     * extending we can do multithreading. whichever class we want to be work as
     * thread we can extend it with thread class. although every process already
     * work as thread but with thread class we have option to request to scheduler
     * or we have option to try to optimize the thread execution.
     * 
     * in thread class there are two main method's are available to make a code to a
     * thread and execute it.
     * every thread is start's with start method. and remember Thread.start() method
     * always calls Thread.run() method so u have to make sure that after extending
     * the thread method u have to override the run method as well.
     * As said cpu scheduler decide's the thread execution, it decides it on the
     * thread priority which has three main constraints 1. low ,2. normal ,3. high.
     * it is between 1 to 10.
     * low --> 1 to 4
     * normal --> 5 to 9
     * high --> 10
     * although this is just constraints through which can optimize the thread
     * execution,, we can'not modify because at the end cpu scheduler decide's
     * everything.
     * we can also check thread priortiy oby getPriority method. by default every
     * thread has medium priority.
     * another thing we can also stop thread execution in between by the help of
     * sleep() method. which take's time in milliseconds which denote's for how much
     * time thread has to wait for further execution.
     * 
     * --- Runnable Interface ----
     * Aprat from Thread class we also runnable interface for archivinh
     * multithreading in java as java does not support multiple inheritance there
     * could be chance in which we want multithreading as well as thread so it won't
     * work with normal class right so for those situation we have Runnable
     * interface.
     * The only thing is thaa has to be in mind while working with Runnable we need
     * to have run method in the class but other Thread class method's are not
     * present in the Runnable interface as Thread class it'self implements runnable
     * interface. so for running a thread we could not use start() method this time.
     * in thread class their are plenty of constructor's in which one constructor
     * who accepet runnable class object as parameter through we can create new
     * thread class object or refernce and by the help of that we can do threading
     * with the help of runable interface.
     * remember runnable also functional interface support u can also use the
     * concept of lambda expression here.
     * just onlye thing is reference should be of type runable interface.
     * 
     * assume a situation where multiple thread's working on the same shared space
     * then what should u do if suppose e.g we have bank account of which we have
     * given too credit cards to the use and user has given one of it to the his
     * friend then their could be chances in one go they both trying to withdraw a
     * amount for example user has 10k in ac and both user and his friend is trying
     * to withdraw at same time user is trying to withdraw 7k and user fiend also
     * trying 7k withdrawal it could exceptional case right. as thread's execute
     * simelteneously there could be chances of bothe getting or no one is getting
     * withdrwal. so for stoping this kind of situation we can do race condiyion
     * means we can make a thread to be syncronized which is in shared spcae. so
     * every user can use that space at once.
     */
    public static void main(String[] args) throws InterruptedException {
        // A objA = new A();
        // B objB = new B();
        // objA.start();
        // objB.start();
        // System.out.println(objA.getPriority());
        // objA.setPriority(objA.NORM_PRIORITY);
        // objB.setPriority(objB.MAX_PRIORITY);

        // InnerThreads t1 = new InnerThreads();
        // InnerThreads2 t2 = new InnerThreads2();
        // with lambda expression.
        // Runnable t1 = () -> {
        //     for (int i = 0; i < 100; i++) {
        //         System.out.println("Hello");
        //         try {
        //             Thread.sleep(10);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // };
        // Runnable t2 = () -> {
        //     for (int i = 0; i < 100; i++) {
        //         System.out.println("Bye");
        //         try {
        //             Thread.sleep(10);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // };
        // Thread tt1 = new Thread(t1);
        // Thread tt2 = new Thread(t2);
        // tt1.start();
        // tt2.start();
        Counter inc = new Counter();
        Runnable r1= ()->{
            for(int i = 0; i<10000; i++) inc.increment();;
        };
        Runnable r2= ()->{
            for(int i = 0; i<10000; i++) inc.increment();;
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.join(); //mutation.
        t2.join(); //mutation.
        System.out.println(inc.count);
    }
}