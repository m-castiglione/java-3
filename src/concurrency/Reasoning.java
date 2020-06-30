package concurrency;

class Reasoning extends Thread{
    //set up this class so it can become a valid thread. 
    void distinguish() {
        //print to the console the difference between a thread and a process
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.
        System.out.println("A process is any program in execution. A thread is a segment of a process");
        System.out.println("Using the run method will use the current thread and run it while start creates a new thread and runs it");
    }

    @Override
    public void run() {
        distinguish();
    }
}

