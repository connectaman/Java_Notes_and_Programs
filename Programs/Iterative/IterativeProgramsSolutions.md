### Solution

------

1- Java Program to Calculate the Sum of Natural Numbers

```java
    public class SumNatural {
        public static void main(String[] args) {
            int num = 100, sum = 0;
            for(int i = 1; i <= num; ++i)
            {
                // sum = sum + i;
                sum += i;
            }
            System.out.println("Sum = " + sum);
        }
    }
```
Output
```java
Sum = 5050
```

-------

2- Java Program to Find Factorial of a Number

```java
    public class Factorial {
        public static void main(String[] args) {
            int num = 10;
            long factorial = 1;
            for(int i = 1; i <= num; ++i)
            {
                // factorial = factorial * i;
                factorial *= i;
            }
            System.out.printf("Factorial of %d = %d", num, factorial);
        }
    }
```
Output
```
Factorial of 10 = 3628800
```

-----

3- Java Program to Generate Multiplication Table

```java
    public class MultiplicationTable {
        public static void main(String[] args) {
            int num = 5;
            for(int i = 1; i <= 10; ++i)
            {
                System.out.printf("%d * %d = %d \n", num, i, num * i);
            }
        }
    }
```
Output
```
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
```

-------

4- Java Program to Display Fibonacci Series

```java
    public class Fibonacci {
        public static void main(String[] args) {
            int n = 10, t1 = 0, t2 = 1;
            System.out.print("First " + n + " terms: ");
            for (int i = 1; i <= n; ++i)
            {
                System.out.print(t1 + " + ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }
    }
```
Output
```
0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 
```

-----

5- Java Program to Display Characters from A to Z using loop

```java
    public class Characters {
        public static void main(String[] args) {
            char c;
            for(c = 'A'; c <= 'Z'; ++c)
                System.out.print(c + " ");
        }
    }
```
Output
```
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
```

-------

6- Java Program to Count Number of Digits in an Integer

```java
    public class NumberDigits {
        public static void main(String[] args) {
            int count = 0, num = 3452;
            while(num != 0)
            {
                // num = num/10
                num /= 10;
                ++count;
            }
            System.out.println("Number of digits: " + count);
        }
    }
```
Output
```
Number of digits: 4
```


----


7- Java Program to Reverse a Number

```java
    public class ReverseNumber {
        public static void main(String[] args) {
            int num = 1234, reversed = 0;
            while(num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            System.out.println("Reversed Number: " + reversed);
        }
    }
```
Output
```
Reversed Number: 4321
```

-----

8- Java Program to Check Whether a Number is Palindrome or Not

```java
    public class Palindrome {
        public static void main(String[] args) {
            int num = 121, reversedInteger = 0, remainder, originalInteger;
            originalInteger = num;
            // reversed integer is stored in variable 
            while( num != 0 )
            {
                remainder = num % 10;
                reversedInteger = reversedInteger * 10 + remainder;
                num  /= 10;
            }
            // palindrome if orignalInteger and reversedInteger are equal
            if (originalInteger == reversedInteger)
                System.out.println(originalInteger + " is a palindrome.");
            else
                System.out.println(originalInteger + " is not a palindrome.");
        }
    }
```
Output 
```
121 is a palindrome number.
```

-----


9- Java Program to Check Whether a Number is Prime or Not

```java
    public class Prime {
        public static void main(String[] args) {
            int num = 29;
            boolean flag = false;
            for(int i = 2; i <= num/2; ++i)
            {
                // condition for nonprime number
                if(num % i == 0)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }
```

Output
```
29 is a prime number.
```

-----

10- Write Java program to print the following pattern

```java
import java.io.*; 

// Java code to demonstrate star patterns 
public class GeeksForGeeks 
{ 
	// Function to demonstrate printing pattern 
	public static void printStars(int n) 
	{ 
		int i, j; 

		// outer loop to handle number of rows 
		// n in this case 
		for(i=0; i<n; i++) 
		{ 

			// inner loop to handle number of columns 
			// values changing acc. to outer loop	 
			for(j=0; j<=i; j++) 
			{ 
				// printing stars 
				System.out.print("* "); 
			} 

			// ending line after each row 
			System.out.println(); 
		} 
} 

	// Driver Function 
	public static void main(String args[]) 
	{ 
		int n = 5; 
		printStars(n); 
	} 
} 
```
Output
```
* 
* * 
* * * 
* * * * 
* * * * *
```

-------

11- Write Java program to print the following pattern

```java
import java.io.*; 

// Java code to demonstrate star patterns 
public class GeeksForGeeks 
{ 
	// Function to demonstrate printing pattern 
	public static void printStars(int n) 
	{ 
		int i, j; 

		// outer loop to handle number of rows 
		// n in this case 
		for(i=0; i<n; i++) 
		{ 

			// inner loop to handle number of columns 
			// values changing acc. to outer loop	 
			for(j=0; j<=i; j++) 
			{ 
				// printing stars 
				System.out.print(j+" "); 
			} 

			// ending line after each row 
			System.out.println(); 
		} 
} 

	// Driver Function 
	public static void main(String args[]) 
	{ 
		int n = 5; 
		printStars(n); 
	} 
} 
```
Output
```
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
```

------

