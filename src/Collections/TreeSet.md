### Java TreeSet class

Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface. The objects of the TreeSet class are stored in ascending order.

The important points about Java TreeSet class are:

- Java TreeSet class contains unique elements only like HashSet.
- Java TreeSet class access and retrieval times are quiet fast.
- Java TreeSet class doesn't allow null element.
- Java TreeSet class is non synchronized.
- Java TreeSet class maintains ascending order.

----------



```java
import java.util.*;  
class TreeSet1{  
 public static void main(String args[]){  
  //Creating and adding elements  
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
```
Output
```
   Ajay
   Ravi
   Vijay
```

---------

```java
import java.util.*;  
class TreeSet4{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
         System.out.println("Initial Set: "+set);  
           
         System.out.println("Reverse Set: "+set.descendingSet());  
           
         System.out.println("Head Set: "+set.headSet("C", true));  
          
         System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
           
         System.out.println("TailSet: "+set.tailSet("C", false));  
 }  
}  
```
Output
```
Initial Set: [A, B, C, D, E]
Reverse Set: [E, D, C, B, A]
Head Set: [A, B, C]
SubSet: [B, C, D, E]
TailSet: [D, E]
```

-------

