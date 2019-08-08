### Java Naming conventions

------

Java naming convention is a rule to follow as you decide what to name your identifiers such as class, package, variable, constant, method, etc.

But, it is not forced to follow. So, it is known as convention not rule. These conventions are suggested by several Java communities such as Sun Microsystems and Netscape.

All the classes, interfaces, packages, methods and fields of Java programming language are given according to the Java naming convention. If you fail to follow these conventions, it may generate confusion or erroneous code.

-----

Advantage of naming conventions in java

By using standard Java naming conventions, you make your code easier to read for yourself and other programmers. Readability of Java program is very important. It indicates that less time is spent to figure out what the code does.

The following are the key rules that must be followed by every identifier:

   - The name must not contain any white spaces.
   - The name should not start with special characters like & (ampersand), $ (dollar), _ (underscore).

Let's see some other rules that should be followed by identifiers.

----

##### Class

  - It should start with the uppercase letter.
  - It should be a noun such as Color, Button, System, Thread, etc.
  - Use appropriate words, instead of acronyms.
    Example: -
```java
    public class Employee  
    {  
    //code snippet  
    }
```  

------

##### Interface

  - It should start with the uppercase letter.
  - It should be an adjective such as Runnable, Remote, ActionListener.
  - Use appropriate words, instead of acronyms.
 Examples: - 
 ```java
    interface Printable  
    {  
    //code snippet  
    }  
```

------

##### Method

   - It should start with lowercase letter.
   - It should be a verb such as main(), print(), println().
   - If the name contains multiple words, start it with a lowercase letter followed by an uppercase letter such as actionPerformed()
   
```java
     class Employee  
    {  
    //method  
    void draw()  
    {  
    //code snippet  
    }  
    }  
```

------

#### Variable

   - It should start with a lowercase letter such as id, name.
   - It should not start with the special characters like & (ampersand), $ (dollar), _ (underscore).
   - If the name contains multiple words, start it with the lowercase letter followed by an uppercase letter such as firstName, lastName.
   - Avoid using one-character variables such as x, y, z.
   - Example :-
   
   ```java
 class Employee  
{  
//variable  
int id;  
//code snippet  
}
```

-----



