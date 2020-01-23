### Exception Handling in Java

The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained.

In this page, we will learn about Java exceptions, its type and the difference between checked and unchecked exceptions.

```
statement 1;  
statement 2;  
statement 3;  
statement 4;  
statement 5;//exception occurs  
statement 6;  
statement 7;  
statement 8;  
statement 9;  
statement 10;  
```

--------

##### Hierarchy of Java Exception classes

![](https://static.javatpoint.com/images/throwable.png)

---------

##### Types of Java Exceptions

There are mainly two types of exceptions: checked and unchecked. Here, an error is considered as the unchecked exception. According to Oracle, there are three types of exceptions:

1- Checked Exception

2- Unchecked Exception

3- Error


-----------


Difference between Checked and Unchecked Exceptions
##### 1) Checked Exception
The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.

##### 2) Unchecked Exception
The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

##### 3) Error
Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.


-----

##### Java Exception Keywords

There are 5 keywords which are used in handling exceptions in Java.

|Keyword	| Description|
|----------|--------------|
|try	|The "try" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone.|
|catch	|The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.|
|finally	|The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.|
|throw|	The "throw" keyword is used to throw an exception.|
|throws	|The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.|

-------------

### Java Exception Handling Example


```java
public class JavaExceptionExample{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
      int data=100/0;  
   }catch(ArithmeticException e){System.out.println(e);}  
   //rest code of the program   
   System.out.println("rest of the code...");  
  }  
}  
```
Output
```
Exception in thread main java.lang.ArithmeticException:/ by zero
rest of the code...
```

------

##### Common Scenarios of Java Exceptions
There are given some scenarios where unchecked exceptions may occur. They are as follows:
```
1) A scenario where ArithmeticException occurs
If we divide any number by zero, there occurs an ArithmeticException.

int a=50/0;//ArithmeticException  
2) A scenario where NullPointerException occurs
If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.

String s=null;  
System.out.println(s.length());//NullPointerException  
3) A scenario where NumberFormatException occurs
The wrong formatting of any value may occur NumberFormatException. Suppose I have a string variable that has characters, converting this variable into digit will occur NumberFormatException.

String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException  
4) A scenario where ArrayIndexOutOfBoundsException occurs
If you are inserting any value in the wrong index, it would result in ArrayIndexOutOfBoundsException as shown below:

int a[]=new int[5];  
a[10]=50; //ArrayIndexOutOfBoundsException
```


-------

```java
public class TryCatchExample2 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  
```
Output
```
java.lang.ArithmeticException: / by zero
rest of the code
```  


--------

```java
public class TryCatchExample3 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
                         // if exception occurs, the remaining statement will not exceute  
        System.out.println("rest of the code");  
        }  
             // handling the exception   
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
          
    }  
      
}  
```
Output
```
java.lang.ArithmeticException: / by zero
```

```java
public class TryCatchExample8 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
  
        }  
            // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  
```
Output
```
Exception in thread "main" java.lang.ArithmeticException: / by zero
```

-----------

```java
public class MultipleCatchBlock1 {  
  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                a[5]=30/0;    
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  
```
Output
```
Arithmetic Exception occurs
rest of the code
```

---------

```java
public class MultipleCatchBlock2 {  
  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                
                System.out.println(a[10]);  
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  
```
Output
```
ArrayIndexOutOfBounds Exception occurs
rest of the code
```

-----------


```java
class Excep6{  
 public static void main(String args[]){  
  try{  
    try{  
     System.out.println("going to divide");  
     int b =39/0;  
    }catch(ArithmeticException e){System.out.println(e);}  
   
    try{  
    int a[]=new int[5];  
    a[5]=4;  
    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
     
    System.out.println("other statement);  
  }catch(Exception e){System.out.println("handeled");}  
  
  System.out.println("normal flow..");  
 }  
}  
```


----------


### Finally Block

Finally block in java can be used to put "cleanup" code such as closing a file, closing connection etc

```java
class TestFinallyBlock{  
  public static void main(String args[]){  
  try{  
   int data=25/5;  
   System.out.println(data);  
  }  
  catch(NullPointerException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}  
```
Output
```
Output:5
       finally block is always executed
       rest of the code...
```

-----------

```java
class TestFinallyBlock1{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(NullPointerException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}  
```
Output
```
Output:finally block is always executed
       Exception in thread main java.lang.ArithmeticException:/ by zero
```

-----------

### Java throw exception

```
throw new IOException("sorry device error);  
```


```java
public class TestThrow1{  
   static void validate(int age){  
     if(age<18)  
      throw new ArithmeticException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
   public static void main(String args[]){  
      validate(13);  
      System.out.println("rest of the code...");  
  }  
}  
```
Output
```
Exception in thread main java.lang.ArithmeticException:not valid
```

------------

### Java throws keyword

The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained.

Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as NullPointerException, it is programmers fault that he is not performing check up before the code being used.

```java
import java.io.IOException;  
class Testthrows1{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  
```
Output
```
exception handled
normal flow...
```
