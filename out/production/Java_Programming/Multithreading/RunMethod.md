### What if we call run() method directly instead start() method?


   - Each thread starts in a separate call stack.
   - Invoking the run() method from main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.
   
---------

```java
    class TestCallRun1 extends Thread{  
     public void run(){  
       System.out.println("running...");  
     }  
     public static void main(String args[]){  
      TestCallRun1 t1=new TestCallRun1();  
      t1.run();//fine, but does not start a separate call stack  
     }  
    }  
```
Output
```
Output:running...
```

![](https://static.javatpoint.com/images/callstack1.JPG)
#####  Problem if you direct call run() method

-------

```java
    class TestCallRun2 extends Thread{  
     public void run(){  
      for(int i=1;i<5;i++){  
        try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
        System.out.println(i);  
      }  
     }  
     public static void main(String args[]){  
      TestCallRun2 t1=new TestCallRun2();  
      TestCallRun2 t2=new TestCallRun2();  
       
      t1.run();  
      t2.run();  
     }  
    }  
```
Output
```
Output:   1
          2
          3
          4
          5
          1
          2
          3
          4
          5
```
