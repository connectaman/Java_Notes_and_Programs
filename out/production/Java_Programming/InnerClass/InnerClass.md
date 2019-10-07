### Java Inner Classes

Java inner class or nested class is a class which is declared inside the class or interface.

We use inner classes to logically group classes and interfaces in one place so that it can be more readable and maintainable.

Additionally, it can access all the members of outer class including private data members and methods.

##### Syntax of Inner class

```java
    class Java_Outer_class{  
     //code  
     class Java_Inner_class{  
      //code  
     }  
    }  
```

##### Advantage of java inner classes

There are basically three advantages of inner classes in java. They are as follows:

1) Nested classes represent a special type of relationship that is it can access all the members (data members and methods) of outer class including private.

2) Nested classes are used to develop more readable and maintainable code because it logically group classes and interfaces in one place only.

3) Code Optimization: It requires less code to write.

-------------

##### Difference between nested class and inner class in Java

Inner class is a part of nested class. Non-static nested classes are known as inner classes.
Types of Nested classes

There are two types of nested classes non-static and static nested classes.The non-static nested classes are also known as inner classes.

  1- Non-static nested class (inner class)
  
        - Member inner class
        - Anonymous inner class
        - Local inner class
   2- Static nested class


----------

|Type|	Description|
|-----|-------|
|Member Inner Class	|A class created within class and outside method.|
|Anonymous Inner Class|	A class created for implementing interface or extending class. Its name is decided by the java compiler.|
|Local Inner Class	|A class created within method.|
|Static Nested Class|	A static class created within class.|
|Nested Interface	|An interface created within class or interface.|


