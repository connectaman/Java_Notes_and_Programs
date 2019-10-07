### Final Keyword In Java

-----

The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:

   1- variable
   2- method
   3- class

The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only. We will have detailed learning of these. Let's first learn the basics of final keyword. 

##### 1) Java final variable

If you make any variable as final, you cannot change the value of final variable(It will be constant).

Example

There is a final variable speedlimit, we are going to change the value of this variable, but It can't be changed because final variable once assigned a value can never be changed.

```java
    class Bike9{  
     final int speedlimit=90;//final variable  
     void run(){  
      speedlimit=400;  
     }  
     public static void main(String args[]){  
     Bike9 obj=new  Bike9();  
     obj.run();  
     }  
    }//end of class  
```
Output
```
Output:Compile Time Error
```

-------

##### 2) Java final method

If you make any method as final, you cannot override it.
```java
class Bike{  
  final void run(){System.out.println("running");}  
}  
     
class Honda extends Bike{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda honda= new Honda();  
   honda.run();  
   }  
}
```
Output
```
Output:Compile Time Error
```

----

##### 3) Java final class

If you make any class as final, you cannot extend it.

```java
    final class Bike{}  
      
    class Honda1 extends Bike{  
      void run(){System.out.println("running safely with 100kmph");}  
        
      public static void main(String args[]){  
      Honda1 honda= new Honda1();  
      honda.run();  
      }  
    }  
```
Output
```
Output:Compile Time Error
```

