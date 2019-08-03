### Conditional Statements in Java

-------

In java, there are two types of conditional Expressions.

#### 1.	Constant Expressions
#### 2.	Variable Expressions


#### 1.	Constant Expressions:

These expressions includes only constants including final variables and these expressions would be evaluated by "Compiler" only, not by JVM.

EX:
```
1.if( 10 == 10){	} ----> Constant Expression

2.if( true ){	} ------> Constant Expression

3.final int i=10;

if( i == 10 ){	} ----> Constant Expression
```
Note: If we declare any variable as final variable with a value then compiler will replace final variables with their values in the remaining program, this process is called "Constant Folding", it is one of the code optimization tech followed by Compiler.

#### 2.	Variable Expressions:

These expressions are including atleast one variable [not including final variables] and these expressions are evaluated by JVM, not by Compiler.

EX:
```
1.int i=10; int j=10; if( i == j ){
} ----> variable expression.

2.int i=10;
if( i == 10 ){
} ----> Variable expression
```

-----

