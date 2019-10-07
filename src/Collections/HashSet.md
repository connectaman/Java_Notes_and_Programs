### Java HashSet



##### The important points about Java HashSet class are:

- HashSet stores the elements by using a mechanism called hashing.
- HashSet contains unique elements only.
- HashSet allows null value.
- HashSet class is non synchronized.
- HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
- HashSet is the best approach for search operations.
- The initial default capacity of HashSet is 16, and the load factor is 0.75.


```java
import java.util.*;  
class HashSet1{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  
```
Output
```
Five
One
Four
Two
Three
```

------

```java
import java.util.*;  
class HashSet2{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
  HashSet<String> set=new HashSet<String>();  
  set.add("Ravi");  
  set.add("Vijay");  
  set.add("Ravi");  
  set.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}
```

Output
```
        Ajay
       Vijay
       Ravi
```

---------

```java
import java.util.*;  
class HashSet3{  
 public static void main(String args[]){  
  HashSet<String> set=new HashSet<String>();  
           set.add("Ravi");  
           set.add("Vijay");  
           set.add("Arun");  
           set.add("Sumit");  
           System.out.println("An initial list of elements: "+set);  
           //Removing specific element from HashSet  
           set.remove("Ravi");  
           System.out.println("After invoking remove(object) method: "+set);  
           HashSet<String> set1=new HashSet<String>();  
           set1.add("Ajay");  
           set1.add("Gaurav");  
           set.addAll(set1);  
           System.out.println("Updated List: "+set);  
           //Removing all the new elements from HashSet  
           set.removeAll(set1);  
           System.out.println("After invoking removeAll() method: "+set);  
           //Removing elements on the basis of specified condition  
           set.removeIf(str->str.contains("Vijay"));    
           System.out.println("After invoking removeIf() method: "+set);  
           //Removing all the elements available in the set  
           set.clear();  
           System.out.println("After invoking clear() method: "+set);  
 }  
} 
```
Output
```
An initial list of elements: [Vijay, Ravi, Arun, Sumit]
After invoking remove(object) method: [Vijay, Arun, Sumit]
Updated List: [Vijay, Arun, Gaurav, Sumit, Ajay]
After invoking removeAll() method: [Vijay, Arun, Sumit]
After invoking removeIf() method: [Arun, Sumit]
After invoking clear() method: []
```

