### The join() method

The join() method waits for a thread to die. In other words, it causes the currently running threads to stop executing until the thread it joins with completes its task.

##### Syntax

public void join()throws InterruptedException
public void join(long milliseconds)throws InterruptedException

```java
    class TestJoinMethod1 extends Thread{  
     public void run(){  
      for(int i=1;i<=5;i++){  
       try{  
        Thread.sleep(500);  
       }catch(Exception e){System.out.println(e);}  
      System.out.println(i);  
      }  
     }  
    public static void main(String args[]){  
     TestJoinMethod1 t1=new TestJoinMethod1();  
     TestJoinMethod1 t2=new TestJoinMethod1();  
     TestJoinMethod1 t3=new TestJoinMethod1();  
     t1.start();  
     try{  
      t1.join();  
     }catch(Exception e){System.out.println(e);}  
      
     t2.start();  
     t3.start();  
     }  
    }  
```
Output
```
       1
       2
       3
       4
       5
       1
       1
       2
       2
       3
       3
       4
       4
       5
       5
```

--------

