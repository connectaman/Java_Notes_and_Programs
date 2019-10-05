### Sleep method in java

The sleep() method of Thread class is used to sleep a thread for the specified amount of time.

##### Syntax of sleep() method in java

The Thread class provides two methods for sleeping a thread:

   - public static void sleep(long miliseconds)throws InterruptedException
   - public static void sleep(long miliseconds, int nanos)throws InterruptedException
   
--------

##### Example of sleep method in java

```java
    class TestSleepMethod1 extends Thread{  
     public void run(){  
      for(int i=1;i<5;i++){  
        try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
        System.out.println(i);  
      }  
     }  
     public static void main(String args[]){  
      TestSleepMethod1 t1=new TestSleepMethod1();  
      TestSleepMethod1 t2=new TestSleepMethod1();  
       
      t1.start();  
      t2.start();  
     }  
    }  
```
Output
```
       1
       1
       2
       2
       3
       3
       4
       4

```



##### Can we start a thread twice

No. After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown. In such case, thread will run once but for second time, it will throw exception.

Let's understand it by the example given below:

```java


    public class TestThreadTwice1 extends Thread{  
     public void run(){  
       System.out.println("running...");  
     }  
     public static void main(String args[]){  
      TestThreadTwice1 t1=new TestThreadTwice1();  
      t1.start();  
      t1.start();  
     }  
    }  
```
Output
```
 running
 Exception in thread "main" java.lang.IllegalThreadStateException
```