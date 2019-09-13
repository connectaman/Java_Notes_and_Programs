### Encapsulation in Java

Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
encapsulation in java

We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

The Java Bean class is the example of a fully encapsulated class.

##### Advantage of Encapsulation in Java

By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.

It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.

It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.

The encapsulate class is easy to test. So, it is better for unit testing.

The standard IDE's are providing the facility to generate the getters and setters. So, it is easy and fast to create an encapsulated class in Java.

##### Simple Example of Encapsulation in Java
Student.java
```java
    //A Java class which is a fully encapsulated class.  
    //It has a private data member and getter and setter methods.  
    package com.javatpoint;  
    public class Student{  
    //private data member  
    private String name;  
    //getter method for name  
    public String getName(){  
    return name;  
    }  
    //setter method for name  
    public void setName(String name){  
    this.name=name  
    }  
    }  
```
Test.java
```java
package com.javatpoint;  
class Test{  
public static void main(String[] args){  
//creating instance of the encapsulated class  
Student s=new Student();  
//setting value in the name member  
s.setName("vijay");  
//getting value of the name member  
System.out.println(s.getName());  
}  
} 
```

Output
```
vijay
```

----------

##### Read-Only class
```java
//A Java class which has only getter methods.  
public class Student{  
//private data member  
private String college="AKG";  
//getter method for college  
public String getCollege(){  
return college;  
}  
} 
```

##### Write-Only class

```java
    //A Java class which has only setter methods.  
    public class Student{  
    //private data member  
    private String college;  
    //getter method for college  
    public void setCollege(String college){  
    this.college=college;  
    }  
    }  
```