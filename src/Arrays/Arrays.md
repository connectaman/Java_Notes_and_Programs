### Java Arrays

Normally, an array is a collection of similar type of elements which have a contiguous memory location.

Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.

Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.

Unlike C/C++, we can get the length of the array using the length member. In C/C++, we need to use the sizeof operator.

In Java, array is an object of a dynamically generated class. Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces. We can store primitive values or objects in an array in Java. Like C/C++, we can also create single dimentional or multidimentional arrays in Java.

Moreover, Java provides the feature of anonymous arrays which is not available in C/C++.

![](https://www.javatpoint.com/images/core/array.gif)

##### Advantages

   - Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
   - Random access: We can get any data located at an index position.

##### Disadvantages

   - Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. To solve this problem, collection framework is used in Java which grows automatically.


##### Types of Array in java

There are two types of array.

   - Single Dimensional Array
   - Multidimensional Array
   
-------

#### Example of Java Array

```java
//Java Program to illustrate how to declare, instantiate, initialize  
//and traverse the Java array.  
class Testarray{  
public static void main(String args[]){  
int a[]=new int[5];//declaration and instantiation  
a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
}
} 
```
Ourput
```
    10
   20
   70
   40
   50
```


-------

##### Declaration, Instantiation and Initialization of Java Array

```java
    int a[]={33,3,4,5};//declaration, instantiation and initialization  
```
Let's see the simple example to print this array.
```java
//Java Program to illustrate the use of declaration, instantiation   
//and initialization of Java array in a single line  
class Testarray1{  
public static void main(String args[]){  
int a[]={33,3,4,5};//declaration, instantiation and initialization  
//printing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
}
}
```
Output
```
33
3
4
5
```

--------

##### For-each Loop for Java Array

We can also print the Java array using for-each loop. The Java for-each loop prints the array elements one by one. It holds an array element in a variable, then executes the body of the loop.

The syntax of the for-each loop is given below:
```java
    for(data_type variable:array){  
    //body of the loop  
    }  
```
Let us see the example of print the elements of Java array using the for-each loop.
```java
class Testarray1{  
public static void main(String args[]){  
int arr[]={33,3,4,5};  
//printing array using for-each loop  
for(int i:arr)  
System.out.println(i);  
}
}  
```
Output
```
   33
   3
   4
   5
```

------

##### Passing Array to a Method in Java
```java
//Java Program to demonstrate the way of passing an array  
   //to method.  
   class Testarray2{  
   //creating a method which receives an array as a parameter  
   static void min(int arr[]){  
   int min=arr[0];  
   for(int i=1;i<arr.length;i++)  
    if(min>arr[i])  
     min=arr[i];  
     
   System.out.println(min);  
   }  
     
   public static void main(String args[]){  
   int a[]={33,3,4,5};//declaring and initializing an array  
   min(a);//passing array to method  
   }
} 
```
Output
```
3
```


------

##### Anonymous Array in Java

Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.

```java
    //Java Program to demonstrate the way of passing an anonymous array  
    //to method.  
    public class TestAnonymousArray{  
    //creating a method which receives an array as a parameter  
    static void printArray(int arr[]){  
    for(int i=0;i<arr.length;i++)  
    System.out.println(arr[i]);  
    }  
      
    public static void main(String args[]){  
    printArray(new int[]{10,22,44,66});//passing anonymous array to method  
    }
}  
```

Output
```
10
22
44
66
```

------

##### Returning Array from the Method

```java
//Java Program to return an array from the method  
class TestReturnArray{  
//creating method which returns an array  
static int[] get(){  
return new int[]{10,30,50,90,60};  
}  
  
public static void main(String args[]){  
//calling method which returns an array  
int arr[]=get();  
//printing the values of an array  
for(int i=0;i<arr.length;i++)  
System.out.println(arr[i]);  
}} 
```
Output
```
10
30
50
90
60
```

-----

##### ArrayIndexOutOfBoundsException

```java
    //Java Program to demonstrate the case of   
    //ArrayIndexOutOfBoundsException in a Java Array.  
    public class TestArrayException{  
    public static void main(String args[]){  
    int arr[]={50,60,70,80};  
    for(int i=0;i<=arr.length;i++){  
    System.out.println(arr[i]);  
    }  
    }
}  
```
Output
```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
	at TestArrayException.main(TestArrayException.java:5)
50
60
70
80
```

#### Multidimensional Array in Java

In such case, data is stored in row and column based index (also known as matrix form).

Syntax to Declare Multidimensional Array in Java

```
    dataType[][] arrayRefVar; (or)  
    dataType [][]arrayRefVar; (or)  
    dataType arrayRefVar[][]; (or)  
    dataType []arrayRefVar[];   
```

```java
    int[][] arr=new int[3][3];//3 row and 3 column  
```
Example to initialize Multidimensional Array in Java
```java
    arr[0][0]=1;  
    arr[0][1]=2;  
    arr[0][2]=3;  
    arr[1][0]=4;  
    arr[1][1]=5;  
    arr[1][2]=6;  
    arr[2][0]=7;  
    arr[2][1]=8;  
    arr[2][2]=9;  
```

#### Example of Multidimensional Java Array
```java
    //Java Program to illustrate the use of multidimensional array  
    class Testarray3{  
    public static void main(String args[]){  
    //declaring and initializing 2D array  
    int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
    //printing 2D array  
    for(int i=0;i<3;i++){  
     for(int j=0;j<3;j++){  
       System.out.print(arr[i][j]+" ");  
     }  
     System.out.println();  
    }  
    }
}  
```
Output
```
1 2 3
2 4 5
4 4 5

```


