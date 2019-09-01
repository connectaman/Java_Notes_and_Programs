### Method Overloading in Java

-----

If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

If we have to perform only one operation, having same name of the methods increases the readability of the program.

Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.

So, we perform method overloading to figure out the program quickly.

Advantage of method overloading
 - Method overloading increases the readability of the program.


There are two ways to overload the method in java

   - By changing number of arguments
   - By changing the data type


------


#### 1) Method Overloading: changing no. of arguments

In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.

In this example, we are creating static methods so that we don't need to create instance for calling methods.

```java
    class Adder{  
    static int add(int a,int b){return a+b;}  
    static int add(int a,int b,int c){return a+b+c;}  
    }  
    class TestOverloading1{  
    public static void main(String[] args){  
    System.out.println(Adder.add(11,11));  
    System.out.println(Adder.add(11,11,11));  
    }
}  
```
Output
```
22
33
```

------

##### 2) Method Overloading: changing data type of arguments



In this example, we have created two methods that differs in data type. The first add method receives two integer arguments and second add method receives two double arguments.

```
class Adder{  
static int add(int a, int b){return a+b;}  
static double add(double a, double b){return a+b;}  
}  
class TestOverloading2{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(12.3,12.6));  
}
}
```
Output
```
22
24.9
```


-------

Q) Why Method Overloading is not possible by changing the return type of method only?

In java, method overloading is not possible by changing the return type of the method only because of ambiguity. Let's see how ambiguity may occur:

```java
class Adder{  
static int add(int a,int b){return a+b;}  
static double add(int a,int b){return a+b;}  
}  
class TestOverloading3{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));//ambiguity  
}
} 
```
Output
```
Compile Time Error: method add(int,int) is already defined in class Adder
System.out.println(Adder.add(11,11)); //Here, how can java determine which sum() method should be called?
```

-------

####  Can we overload java main() method?
Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only. Let's see the simple example: 
```java
class TestOverloading4{  
public static void main(String[] args){System.out.println("main with String[]");}  
public static void main(String args){System.out.println("main with String");}  
public static void main(){System.out.println("main without args");}  
} 
```
Output
```
main with String[]
```

