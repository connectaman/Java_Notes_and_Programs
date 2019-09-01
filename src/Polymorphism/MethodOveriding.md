### Method Overriding in Java

-------

If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.

##### Usage of Java Method Overriding

   - Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
   - Method overriding is used for runtime polymorphism

##### Rules for Java Method Overriding


   1. The method must have the same name as in the parent class
   2. The method must have the same parameter as in the parent class.
   3. There must be an IS-A relationship (inheritance).
   
![](https://static.javatpoint.com/images/java-rules-for-method-overriding.png)


-----

    //Java Program to demonstrate why we need method overriding  
    //Here, we are calling the method of parent class with child  
    //class object.  
    //Creating a parent class  
```java
 class Vehicle{  
      void run(){System.out.println("Vehicle is running");}  
    }  
    //Creating a child class  
    class Bike extends Vehicle{  
      public static void main(String args[]){  
      //creating an instance of child class  
      Bike obj = new Bike();  
      //calling the method with child class instance  
      obj.run();  
      }  
    } 
```
