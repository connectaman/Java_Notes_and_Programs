### Solution

---

1- Java Program to Check Whether a Number is Even or Odd

```java
    import java.util.Scanner;
    public class EvenOdd {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = reader.nextInt();
            if(num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
    }
```
Output
```
Enter a number: 12
12 is even
```

-------

2- Java Program to Check Whether an Alphabet is Vowel or Consonant

```java
    public class VowelConsonant {
        public static void main(String[] args) {
            char ch = 'i';
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                System.out.println(ch + " is vowel");
            else
                System.out.println(ch + " is consonant");
        }
    }
```
Output
```
i is vowel
```

-----

3- Java Program to Find the Largest Among Three Numbers

```java
    public class Largest {
        public static void main(String[] args) {
            double n1 = -4.5, n2 = 3.9, n3 = 2.5;
            if( n1 >= n2 && n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else if (n2 >= n1 && n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
    }
```

Output

```
3.9 is the largest number.
```

-----

4- Java Program to Check Leap Year 

```java
    public class LeapYear {
        public static void main(String[] args) {
            int year = 1900;
            boolean leap = false;
            if(year % 4 == 0)
            {
                if( year % 100 == 0)
                {
                    // year is divisible by 400, hence the year is a leap year
                    if ( year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }
                else
                    leap = true;
            }
            else
                leap = false;
            if(leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
        }
    }
```
Output
```
1900 is not a leap year.
```

------

5- Java Program to Make a Simple Calculator Using switch...case

```java
    import java.util.Scanner;
    public class Calculator {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            // nextDouble() reads the next double from the keyboard
            double first = reader.nextDouble();
            double second = reader.nextDouble();
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = reader.next().charAt(0);
            double result;
            switch(operator)
            {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    result = first / second;
                    break;
                // operator doesn't match any case constant (+, -, *, /)
                default:
                    System.out.printf("Error! operator is not correct");
                    return;
            }
            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
        }
    }
```
Output
```
Enter two numbers: 1.5
4.5
Enter an operator (+, -, *, /): *
1.5 * 4.5 = 6.8
```

----

