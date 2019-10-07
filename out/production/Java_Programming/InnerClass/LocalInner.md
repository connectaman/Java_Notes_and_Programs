### Java Local inner class

##### Java local inner class example

```java
    public class localInner1{  
     private int data=30;//instance variable  
     void display(){  
      class Local{  
       void msg(){System.out.println(data);}  
      }  
      Local l=new Local();  
      l.msg();  
     }  
     public static void main(String args[]){  
      localInner1 obj=new localInner1();  
      obj.display();  
     }  
    }  
```
Output
```
30
```