### Java If-else Statement

---------

The Java if statement is used to test the condition. It checks boolean condition: true or false. There are various types of if statement in java.

    if statement
    if-else statement
    if-else-if ladder
    nested if statement


-------

##### Java if Statement

The Java if statement tests the condition. It executes the if block if condition is true.

```java
    if(condition){  
    //code to be executed  
    }  
```

![SimpleIf](https://static.javatpoint.com/images/core/if1.png)

------


Cases:
```java
class Test
{
public static void main(String[] args)
{
int i=10;
int j;
if(i==10)
{
j=20;
}
System.out.println(j);
}
}
```

Status: Compilation Error, Variable j might not have been innitialized.
