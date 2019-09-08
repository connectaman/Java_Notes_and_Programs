### Interface in Java

-----

An interface in java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also represents the IS-A relationship.

It cannot be instantiated just like the abstract class.

Since Java 8, we can have default and static methods in an interface.

Since Java 9, we can have private methods in an interface.


##### Why use Java interface?

There are mainly three reasons to use interface. They are given below.

   - It is used to achieve abstraction.
   - By interface, we can support the functionality of multiple inheritance.
   - It can be used to achieve loose coupling.
   
----

![](https://static.javatpoint.com/interview/images/why-use-java-interface.jpg)

----

##### How to declare an interface?

An interface is declared by using the interface keyword. It provides total abstraction; means all the methods in an interface are declared with the empty body, and all the fields are public, static and final by default. A class that implements an interface must implement all the methods declared in the interface.

```java
    interface <interface_name>{  
          
        // declare constant fields  
        // declare methods that abstract   
        // by default.  
    }  
```


#### Internal addition by the compiler

The Java compiler adds public and abstract keywords before the interface method. Moreover, it adds public, static and final keywords before data members.

In other words, Interface fields are public, static and final by default, and the methods are public and abstract.

![](https://static.javatpoint.com/images/interface.png)

------

##### The relationship between classes and interfaces

As shown in the figure given below, a class extends another class, an interface extends another interface, but a class implements an interface.

![](https://static.javatpoint.com/images/core/interfacerelation.jpg)

##### Java Interface Example

```java
    interface printable{  
    void print();  
    }  
    class A6 implements printable{  
    public void print(){System.out.println("Hello");}  
      
    public static void main(String args[]){  
    A6 obj = new A6();  
    obj.print();  
     }  
    }  
```
Output
```
Hello
```

----

##### Java Interface Example: Drawable

In this example, the Drawable interface has only one method. Its implementation is provided by Rectangle and Circle classes. In a real scenario, an interface is defined by someone else, but its implementation is provided by different implementation providers. Moreover, it is used by someone else. The implementation part is hidden by the user who uses the interface.

```java
//Interface declaration: by first user  
interface Drawable{  
void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  
//Using interface: by third user  
class TestInterface1{  
public static void main(String args[]){  
Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw();  
}} 
```
Output
```
drawing circle
```

----

##### Java Interface Example: Bank

Let's see another example of java interface which provides the implementation of Bank interface.

```java
    interface Bank{  
    float rateOfInterest();  
    }  
    class SBI implements Bank{  
    public float rateOfInterest(){return 9.15f;}  
    }  
    class PNB implements Bank{  
    public float rateOfInterest(){return 9.7f;}  
    }  
    class TestInterface2{  
    public static void main(String[] args){  
    Bank b=new SBI();  
    System.out.println("ROI: "+b.rateOfInterest());  
    }}  
```
Output
```
ROI: 9.15
```

----

##### Multiple inheritance in Java by interface

If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.

![](https://static.javatpoint.com/images/core/multipleinheritance.jpg)

-------

Example
```java
    interface Printable{  
    void print();  
    }  
    interface Showable{  
    void show();  
    }  
    class A7 implements Printable,Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
    A7 obj = new A7();  
    obj.print();  
    obj.show();  
     }  
    }  
```
Output
```
Hello
Welcome
```

-----

##### Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?

As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class. For example:

```java
    interface Printable{  
    void print();  
    }  
    interface Showable{  
    void print();  
    }  
      
    class TestInterface3 implements Printable, Showable{  
    public void print(){System.out.println("Hello");}  
    public static void main(String args[]){  
    TestInterface3 obj = new TestInterface3();  
    obj.print();  
     }  
    }  
```
Output
```
Hello
```

-----

##### Interface inheritance
```java
    interface Printable{  
    void print();  
    }  
    interface Showable extends Printable{  
    void show();  
    }  
    class TestInterface4 implements Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
    TestInterface4 obj = new TestInterface4();  
    obj.print();  
    obj.show();  
     }  
    }  
```
Output
```
Hello
Welcome
```