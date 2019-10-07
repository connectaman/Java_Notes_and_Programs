### Java LinkedList class


Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:

Java LinkedList class can contain duplicate elements.

Java LinkedList class maintains insertion order.

Java LinkedList class is non synchronized.

In Java LinkedList class, manipulation is fast because no shifting needs to occur.

Java LinkedList class can be used as a list, stack or queue.


--------

##### Example

```java
import java.util.*;  
public class LinkedList1{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
```
Output
```java
        Ravi
       Vijay
       Ravi
       Ajay
```

---------


```java
import java.util.*;  
public class LinkedList2{  
 public static void main(String args[]){  
 LinkedList<String> ll=new LinkedList<String>();  
           System.out.println("Initial list of elements: "+ll);  
           ll.add("Ravi");  
           ll.add("Vijay");  
           ll.add("Ajay");  
           System.out.println("After invoking add(E e) method: "+ll);  
           //Adding an element at the specific position  
           ll.add(1, "Gaurav");  
           System.out.println("After invoking add(int index, E element) method: "+ll);  
           LinkedList<String> ll2=new LinkedList<String>();  
           ll2.add("Sonoo");  
           ll2.add("Hanumat");  
           //Adding second list elements to the first list  
           ll.addAll(ll2);  
           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  
           LinkedList<String> ll3=new LinkedList<String>();  
           ll3.add("John");  
           ll3.add("Rahul");  
           //Adding second list elements to the first list at specific position  
           ll.addAll(1, ll3);  
           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  
           //Adding an element at the first position  
           ll.addFirst("Lokesh");  
           System.out.println("After invoking addFirst(E e) method: "+ll);  
           //Adding an element at the last position  
           ll.addLast("Harsh");  
           System.out.println("After invoking addLast(E e) method: "+ll);  
             
 }  
}  
```
Output
```
Initial list of elements: []
After invoking add(E e) method: [Ravi, Vijay, Ajay]
After invoking add(int index, E element) method: [Ravi, Gaurav, Vijay, Ajay]
After invoking addAll(Collection<? extends E> c) method: 
[Ravi, Gaurav, Vijay, Ajay, Sonoo, Hanumat]
After invoking addAll(int index, Collection<? extends E> c) method: 
[Ravi, John, Rahul, Gaurav, Vijay, Ajay, Sonoo, Hanumat]
After invoking addFirst(E e) method: 
[Lokesh, Ravi, John, Rahul, Gaurav, Vijay, Ajay, Sonoo, Hanumat]
After invoking addLast(E e) method: 
[Lokesh, Ravi, John, Rahul, Gaurav, Vijay, Ajay, Sonoo, Hanumat, Harsh]
```

-----

##### Java LinkedList Example: Book


```java
import java.util.*;  
class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class LinkedListExample {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<Book> list=new LinkedList<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(Book b:list){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  
```

Output
```
101 Let us C Yashwant Kanetkar BPB 8
102 Data Communications & Networking Forouzan Mc Graw Hill 4
103 Operating System Galvin Wiley 6
```

--------


##### Difference between ArrayList and LinkedList


|No.|ArrayList|	LinkedList|
|---|-----|----------|
|1) |ArrayList internally uses a dynamic array to store the elements.	|LinkedList internally uses a doubly linked list to store the elements.|
|2) |Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory.|	Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.|
|3) |An ArrayList class can act as a list only because it implements List only.|	LinkedList class can act as a list and queue both because it implements List and Deque interfaces.|
|4) |ArrayList is better for storing and accessing data.	|LinkedList is better for manipulating data.|



--------








