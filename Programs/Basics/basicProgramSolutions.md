### Solutions

-----

1- Java Program to Add Two Integers

```java
    public class AddTwoIntegers {
        public static void main(String[] args) {
            
            int first = 10;
            int second = 20;
            int sum = first + second;
            System.out.println("The sum is: " + sum);
        }
    }
```

Output
```
Enter two numbers: 10 20
The sum is: 30
```

-----

2- Swap two numbers using temporary variable

```java
    public class SwapNumbers {
        public static void main(String[] args) {
            float first = 1.20f, second = 2.45f;
            System.out.println("--Before swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
            // Value of first is assigned to temporary
            float temporary = first;
            // Value of second is assigned to first
            first = second;
            // Value of temporary (which contains the initial value of first) is assigned to second
            second = temporary;
            System.out.println("--After swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
        }
    }
```

Output
```
--Before swap--
First number = 1.2
Second number = 2.45
--After swap--
First number = 2.45
Second number = 1.2
```

------

3- Java Program to Multiply two Floating Point Numbers

```java
    public class MultiplyTwoNumbers {
        public static void main(String[] args) {
            float first = 1.5f;
            float second = 2.0f;
            float product = first * second;
            System.out.println("The product is: " + product);
        }
    }
```
Output
```
The product is: 3.0
```

-----

