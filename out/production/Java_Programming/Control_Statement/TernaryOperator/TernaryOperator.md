### Using Ternary Operator

----------


We can also use ternary operator (? :) to perform the task of if...else statement. It is a shorthand way to check the condition. If the condition is true, the result of ? is returned. But, if the condition is false, the result of : is returned.

##### Example:
```java
    public class IfElseTernaryExample {    
    public static void main(String[] args) {    
        int number=13;    
        //Using ternary operator  
        String output=(number%2==0)?"even number":"odd number";    
        System.out.println(output);  
    }    
    }    
```
Output:    odd number
