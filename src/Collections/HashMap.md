### Java HashMap class


##### Points to remember

- Java HashMap class contains values based on the key.
- Java HashMap class contains only unique keys.
- Java HashMap class may have one null key and multiple null values.
- Java HashMap class is non synchronized.
- Java HashMap class maintains no order.
- The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.



---------

```java
import java.util.*;  
public class HashMap2 {  
   public static void main(String args[]) {  
    HashMap<Integer,String> map=new HashMap<Integer,String>();          
      map.put(100,"Amit");    
      map.put(101,"Vijay");    
      map.put(102,"Rahul");  
      map.put(103, "Gaurav");  
    System.out.println("Initial list of elements: "+map);  
    //key-based removal  
    map.remove(100);  
    System.out.println("Updated list of elements: "+map);  
    //value-based removal  
    map.remove(101);  
    System.out.println("Updated list of elements: "+map);  
    //key-value pair based removal  
    map.remove(102, "Rahul");  
    System.out.println("Updated list of elements: "+map);  
   }      
}  
```
Output
```
Initial list of elements: {100=Amit, 101=Vijay, 102=Rahul, 103=Gaurav}
Updated list of elements: {101=Vijay, 102=Rahul, 103=Gaurav}
Updated list of elements: {102=Rahul, 103=Gaurav}
Updated list of elements: {103=Gaurav}
```

---------

