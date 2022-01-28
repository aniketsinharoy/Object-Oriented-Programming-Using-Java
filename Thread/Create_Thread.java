class Create_Thread extends Thread //use class name and file name as "ThreadMethod"
{
    public void run()
    {
        System.out.println("Thread is running.");
    }
    public static void main(String args[])
    {
        ThreadMethod t1=new ThreadMethod();
        ThreadMethod t2=new ThreadMethod();
        System.out.println("Name of Thread 1: "+t1.getName());
        System.out.println("Name of Thread 2: "+t2.getName());
        System.out.println("Before starting Thread 1: "+t1.isAlive());
        System.out.println("Before starting Thread 2: "+t2.isAlive());
        t1.start();
        t2.start();
        System.out.println("After starting Thread 1: "+t1.isAlive());
        System.out.println("After starting Thread 2: "+t2.isAlive());
        t1.setName("FirstThread");
        t2.setName("SecondThread");
        System.out.println("Name of Thread 1 after change: "+t1.getName());
        System.out.println("Name of Thread 2 after change: "+t2.getName());
    }
}
