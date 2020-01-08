### String in JAVA

---------

In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string. For example:

```java
char[] ch={'h','e','l','l','o'};  
String s=new String(ch);  
```
is same as:
```java
String s="hello";
```

Java String class provides a lot of methods to perform operations on string such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
![](https://static.javatpoint.com/images/core/string-implements.png)

--------

##### What is String in java

Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.

How to create a string object?
There are two ways to create String object:
  
   1- By string literal
   
   2- By new keyword
   
---------

##### 1) String Literal

Java String literal is created by using double quotes. For Example:
```java
String s="welcome";  
```
Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool. For example:
```java
String s1="Welcome";  
String s2="Welcome";//It doesn't create a new instance  
```
![](https://static.javatpoint.com/images/string.JPG)

In the above example, only one object will be created. Firstly, JVM will not find any string object with the value "Welcome" in string constant pool, that is why it will create a new object. After that it will find the string with the value "Welcome" in the pool, it will not create a new object but will return the reference to the same instance.

-----------

##### 2) By new keyword

```java
String s=new String("Welcome");//creates two objects and one reference variable  
```
In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool. The variable s will refer to the object in a heap (non-pool).

##### Example
```java
public class StringExample{  
public static void main(String args[]){  
String s1="java";//creating string by java string literal  
char ch[]={'s','t','r','i','n','g','s'};  
String s2=new String(ch);//converting char array to string  
String s3=new String("example");//creating java string by new keyword  
System.out.println(s1);  
System.out.println(s2);  
System.out.println(s3);  
}}  
```
Output
```
java
strings
example
```

---------

#### Java String class methods

The java.lang.String class provides many useful methods to perform operations on sequence of char values.

|No|	Method	|Description|
|-------|--------|---------|
|1|	char charAt(int index)	|returns char value for the particular index
|2|	int length()	|returns string length
|3|	static String format(String format, Object... args)	|returns a formatted string.
|4|	static String format(Locale l, String format, Object... args)|	returns formatted string with given locale.
|5|	String substring(int beginIndex)|	returns substring for given begin index.
|6|	String substring(int beginIndex, int endIndex)	|returns substring for given begin index and end index.
|7|	boolean contains(CharSequence s)|	returns true or false after matching the sequence of char value.
|8|	static String join(CharSequence delimiter, CharSequence... elements)	|returns a joined string.
|9|	static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)	|returns a joined string.
|10|	boolean equals(Object another)	|checks the equality of string with the given object.
|11	|boolean isEmpty()|	checks if string is empty.
|12	|String concat(String str)	|concatenates the specified string.
|13	|String replace(char old, char new)	|replaces all occurrences of the specified char value.
|14	|String replace(CharSequence old, CharSequence new)	|replaces all occurrences of the specified CharSequence.
|15	|static String equalsIgnoreCase(String another)	|compares another string. It doesn't check case.
|16	|String[] split(String regex)	|returns a split string matching regex.
|17	|String[] split(String regex, int limit)	|returns a split string matching regex and limit.
|18	|String intern()|	returns an interned string.
|19	|int indexOf(int ch)	|returns the specified char value index.
|20	|int indexOf(int ch, int fromIndex)	|returns the specified char value index starting with given index.
|21	|int indexOf(String substring)	|returns the specified substring index.
|22	|int indexOf(String substring, int fromIndex) |	returns the specified substring index starting with given index.
|23	|String toLowerCase() |	returns a string in lowercase.
|24	|String toLowerCase(Locale l) |	returns a string in lowercase using specified locale.
|25	|String toUpperCase() |	returns a string in uppercase.
|26	|String toUpperCase(Locale l) |	returns a string in uppercase using specified locale.
|27	|String trim() |	removes beginning and ending spaces of this string.
|28	|static String valueOf(int value) | 	converts given type into string. It is an overloaded method.
