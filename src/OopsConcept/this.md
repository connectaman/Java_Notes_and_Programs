### this: to refer current class instance variable

----

The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity. 

##### Understanding the problem without this keyword
```java
    class Student{  
    int rollno;  
    String name;  
    float fee;  
    Student(int rollno,String name,float fee){  
    rollno=rollno;  
    name=name;  
    fee=fee;  
    }  
    void display(){System.out.println(rollno+" "+name+" "+fee);}  
    }  
    class TestThis1{  
    public static void main(String args[]){  
    Student s1=new Student(111,"ankit",5000f);  
    Student s2=new Student(112,"sumit",6000f);  
    s1.display();  
    s2.display();  
    }
}  
```
Output
```
0 null 0.0
0 null 0.0
```

##### Solution of the above problem by this keyword

```java
    class Student{  
    int rollno;  
    String name;  
    float fee;  
    Student(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
    }  
    void display(){System.out.println(rollno+" "+name+" "+fee);}  
    }  
      
    class TestThis2{  
    public static void main(String args[]){  
    Student s1=new Student(111,"ankit",5000f);  
    Student s2=new Student(112,"sumit",6000f);  
    s1.display();  
    s2.display();  
    }}  
```
Output
````
111 ankit 5000
112 sumit 6000
````


#### Program where this keyword is not required

```java
    class Student{  
    int rollno;  
    String name;  
    float fee;  
    Student(int r,String n,float f){  
    rollno=r;  
    name=n;  
    fee=f;  
    }  
    void display(){System.out.println(rollno+" "+name+" "+fee);}  
    }  
      
    class TestThis3{  
    public static void main(String args[]){  
    Student s1=new Student(111,"ankit",5000f);  
    Student s2=new Student(112,"sumit",6000f);  
    s1.display();  
    s2.display();  
    }}  
```

Output
```
111 ankit 5000
112 sumit 6000
```

------

