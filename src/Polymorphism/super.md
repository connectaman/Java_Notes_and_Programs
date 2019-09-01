### Super Keyword in Java

---

The super keyword in Java is a reference variable which is used to refer immediate parent class object.

Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.


##### Usage of Java super Keyword


   1- super can be used to refer immediate parent class instance variable.
   2- super can be used to invoke immediate parent class method.
   3- super() can be used to invoke immediate parent class constructor.
   

![](https://static.javatpoint.com/images/usage-of-java-super.jpg)


##### 1) super is used to refer immediate parent class instance variable.
```java
class Animal{  
String color="white";  
}  
class Dog extends Animal{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class TestSuper1{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
}
}
```


##### 2) super can be used to invoke parent class method

The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.

```java
    class Animal{  
    void eat(){System.out.println("eating...");}  
    }  
    class Dog extends Animal{  
    void eat(){System.out.println("eating bread...");}  
    void bark(){System.out.println("barking...");}  
    void work(){  
    super.eat();  
    bark();  
    }  
    }  
    class TestSuper2{  
    public static void main(String args[]){  
    Dog d=new Dog();  
    d.work();  
    }
}  
```

##### 3) super is used to invoke parent class constructor.

```java
class Animal{  
Animal(){System.out.println("animal is created");}  
}  
class Dog extends Animal{  
Dog(){  
super();  
System.out.println("dog is created");  
}  
}  
class TestSuper3{  
public static void main(String args[]){  
Dog d=new Dog();  
}
} 
```

Note
```
Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
```

Example
Another example of super keyword where super() is provided by the compiler implicitly.
```java
class Animal{  
Animal(){System.out.println("animal is created");}  
}  
class Dog extends Animal{  
Dog(){  
System.out.println("dog is created");  
}  
}  
class TestSuper4{  
public static void main(String args[]){  
Dog d=new Dog();  
}
} 
```

-------


