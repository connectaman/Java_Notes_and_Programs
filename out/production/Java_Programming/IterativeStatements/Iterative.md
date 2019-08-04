### Loops in Java

------

In programming languages, loops are used to execute a set of instructions/functions repeatedly when some conditions become true. There are three types of loops in java.

   - for loop
   - while loop
   - do-while loop
   
![loop](https://static.javatpoint.com/images/java-loops.png)

------

##### For Loop

A simple for loop is the same as C/C++. We can initialize the variable, check condition and increment/decrement value. It consists of four parts:
```
   1- Initialization: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.
   2- Condition: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.
   3- Statement: The statement of the loop is executed each time until the second condition is false.
   4- Increment/Decrement: It increments or decrements the variable value. It is an optional condition.
```
Syntax:
```java
  for(initialization;condition;incr/decr){  
    //statement or code to be executed  
    }  
```

![flowchart for for loop](https://static.javatpoint.com/cpages/images/forloop.png)


 Example

```java
public class ForExample {  
public static void main(String[] args) {  
    //Code of Java for loop  
    for(int i=1;i<=10;i++){  
        System.out.println(i);  
    }  
}  
}  
```
Output:
```java
1
2
3
4
5
6
7
8
9
10
```
  
------

#### Java Nested For Loop

If we have a for loop inside the another loop, it is known as nested for loop. The inner loop executes completely whenever outer loop executes.

Example:
```java
    public class NestedForExample {  
    public static void main(String[] args) {  
    //loop of i  
    for(int i=1;i<=3;i++){  
    //loop of j  
    for(int j=1;j<=3;j++){  
            System.out.println(i+" "+j);  
    }//end of i  
    }//end of j  
    }  
    }  
```

Output
```java
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
```

------

#### Java for-each Loop
     
 The for-each loop is used to traverse array or collection in java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.
     
 It works on elements basis not index. It returns element one by one in the defined variable.
     
 Syntax:
   ``` 
         for(Type var:array){  
         //code to be executed  
         }  
    ```

