
class SharedData
{
    private int n;
    private boolean semaphore=true;
    
    //wait() and notify() or notifyall(); onlu work in Critical Section, if not used in CS JVM will throw an exception
    //logically set() belongs to producer and and get() belongs to consumer
    //here producer and consumer refer set() and get()
    public synchronized void set(int n)throws InterruptedException// we could also Handle Exception here
    {
        if(semaphore==false)//if producer wants to execute again before consumer execution 
          wait();// wait producer let consumer consume firct 
            this.n=n;
        System.out.println("Produced:"+n);
        semaphore=false;
        notify();
    }
    public synchronized int get()throws InterruptedException
    {
        if(semaphore==true)//if producer not yet started execution
          wait();//Consumer Thread get into waiting state
        // wait() ko Comsumer Thread chala raha ha
        System.out.println("Consumed:"+n);
        semaphore=true;
        notify();
        return n;
    }
    
    
}
class Producer extends Thread
{
    SharedData d;
    Producer(SharedData d)
    {
        this.d=d;
    }     
    public void run()
    {
        try{
        for(int i=1;i<=10;i++)
        d.set(i);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
class Consumer extends Thread
{  SharedData d;
    Consumer(SharedData d)
    {
        this.d=d;
    }
    public void run()//since we cannot change prototype of overriden method we cannot write THROWS HERE, so we have to handle exception here
    {
       try{
        int x;
        int sum=0;
        do
        {
            x=d.get();
            sum=sum+x;
        
        }while(x!=10);
        System.out.println("Sum is:"+sum);
       }catch(Exception e)
       {
           System.out.println(e);
       }
    }
}

public class ProducerConsumer {

   
    public static void main(String[] args) {
        
        SharedData d=new SharedData();
        Producer p=new Producer(d);
        Consumer c=new Consumer(d);
        p.start();
        c.start();
    }
    
}
