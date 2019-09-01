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
   //defining a method  
   void run(){System.out.println("Vehicle is running");}  
 }  
 //Creating a child class  
 class Bike2 extends Vehicle{  
   //defining the same method as in the parent class  
   void run(){System.out.println("Bike is running safely");}  
   
   public static void main(String args[]){  
   Bike2 obj = new Bike2();//creating object  
   obj.run();//calling method  
   }  
 }  
```


Example
```java
class Bank{  
int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  
//Test class to create objects and call the methods  
class Test2{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
} 
```

-------

##### Can we override static method?
No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.

##### Why can we not override static method?
It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area. 

