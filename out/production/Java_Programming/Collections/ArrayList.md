### Java ArrayList class

Java ArrayList class uses a dynamic array for storing the elements. It inherits AbstractList class and implements List interface.

The important points about Java ArrayList class are:

   - Java ArrayList class can contain duplicate elements.
   - Java ArrayList class maintains insertion order.
   - Java ArrayList class is non synchronized.
   - Java ArrayList allows random access because array works at the index basis.
   - In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed from the array list.
   
----------

```java
    import java.util.*;  
     class ArrayList1{  
     public static void main(String args[]){  
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
          list.add("Ravi");//Adding object in arraylist    
          list.add("Vijay");    
          list.add("Ravi");    
          list.add("Ajay");    
          //Invoking arraylist object   
          System.out.println(list);  
      }  
     }  
    }  
```
Output
```
       [Ravi, Vijay, Ravi, Ajay]
```

--------

```java
import java.util.*;  
class ArrayList2{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Ravi");//Adding object in arraylist  
  list.add("Vijay");  
  list.add("Ravi");  
  list.add("Ajay");  
  //Traversing list through Iterator  
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
} 
```
Output
```
       Ravi
       Vijay
       Ravi
       Ajay
```

-------

```java
import java.util.*;  
class ArrayList3{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
   //Traversing list through for-each loop  
  for(String obj:al)  
    System.out.println(obj);  
 }  
} 
```
Output
```
       Ravi
       Vijay
       Ravi
       Ajay
```

--------


