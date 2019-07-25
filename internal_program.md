### What happens at compile time?

-------

At compile time, java file is compiled by Java Compiler (It does not interact with OS) and converts the java code into bytecode.

![Complier](https://static.javatpoint.com/images/core/javacodecompile.png)

---------

### What happens at runtime?

--------

At runtime, following steps are performed:

![phases](https://static.javatpoint.com/images/java-runtime-processing.png)

#### Classloader:
is the subsystem of JVM that is used to load class files.
#### Bytecode Verifier:
 checks the code fragments for illegal code that can violate access right to objects.
#### Interpreter:
 read bytecode stream then execute the instructions.
-------

