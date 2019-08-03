### Java Variables

-------

A variable is a container which holds the value while the java program is executed. A variable is assigned with a datatype.

Variable is a name of memory location. There are three types of variables in java: local, instance and static.

There are two types of data types in java: primitive and non-primitive.

-------

#### Variable

Variable is name of reserved area allocated in memory. In other words, it is a name of memory location. It is a combination of "vary + able" that means its value can be changed.

![variable](https://static.javatpoint.com/core/images/variable.png)

-------
    int data=50;//Here data is variable  
--------

### Types of Variables

There are three types of variables in java:

    ->  local variable
    -> instance variable
    -> static variable

![typesofvariables](https://static.javatpoint.com/core/images/types-of-variables1.png)

------

##### 1) Local Variable

A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.

A local variable cannot be defined with "static" keyword.

##### 2) Instance Variable

A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.

It is called instance variable because its value is instance specific and is not shared among instances.

##### 3) Static variable

A variable which is declared as static is called static variable. It cannot be local. You can create a single copy of static variable and share among all the instances of the class. Memory allocation for static variable happens only once when the class is loaded in the memory. 


-------

#### Java Stack and Heap: Java Memory Allocation Tutorial

##### What is Stack Memory?

Stack in java is a section of memory which contains methods, local variables, and reference variables. Stack memory is always referenced in Last-In-First-Out order. Local variables are created in the stack.
##### What is Heap Memory?

Heap is a section of memory which contains Objects and may also contain reference variables. Instance variables are created in the heap
Memory Allocation in Java

##### The JVM divided the memory into following sections.

   - Heap
   - Stack
   - Code
   - Static

##### This division of memory is required for its effective management.

   - The code section contains your bytecode.
   - The Stack section of memory contains methods, local variables, and reference variables.
   - The Heap section contains Objects (may also contain reference variables).
   - The Static section contains Static data/methods.
   
 ------
 
 