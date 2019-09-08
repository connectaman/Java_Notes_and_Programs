### Java Package

A java package is a group of similar types of classes, interfaces and sub-packages.

Package in java can be categorized in two form, built-in package and user-defined package.

There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

Here, we will have the detailed learning of creating and using user-defined packages. 

##### Advantage of Java Package

1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.

2) Java package provides access protection.

3) Java package removes naming collision.

![](https://static.javatpoint.com/images/package.JPG)

### Simple example of java package

```java
package mypack;  
public class Simple{  
 public static void main(String args[]){  
    System.out.println("Welcome to package");  
   }  
}  
```

-----

##### How to access package from another package?

There are three ways to access the package from outside the package.

   1- import package.*;
   
   2- import package.classname;
   
   3- fully qualified name.



-----


