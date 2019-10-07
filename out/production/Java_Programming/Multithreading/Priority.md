### Priority of a Thread (Thread Priority):

Each thread have a priority. Priorities are represented by a number between 1 and 10. In most cases, thread schedular schedules the threads according to their priority (known as preemptive scheduling). But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.

#### 3 constants defined in Thread class:


   1- public static int MIN_PRIORITY
   
   2- public static int NORM_PRIORITY
   
   3- public static int MAX_PRIORITY
   
   
---------

##### Example of priority of a Thread:

```java
class TestMultiPriority1 extends Thread{  
 public void run(){  
   System.out.println("running thread name is:"+Thread.currentThread().getName());  
   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
  
  }  
 public static void main(String args[]){  
  TestMultiPriority1 m1=new TestMultiPriority1();  
  TestMultiPriority1 m2=new TestMultiPriority1();  
  m1.setPriority(Thread.MIN_PRIORITY);  
  m2.setPriority(Thread.MAX_PRIORITY);  
  m1.start();  
  m2.start();  
   
 }  
}    
```
Output
```
        running thread name is:Thread-0
       running thread priority is:10
       running thread name is:Thread-1
       running thread priority is:1
```



   

