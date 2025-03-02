

# TAsk01. Java Basics & Core Concepts 


## **1. Introduction to Java**  


### **Java Features**  
Java is a popular, object-oriented programming language known for its:  
- **Platform Independence** – Write once, run anywhere (WORA) using JVM.  
- **Object-Oriented** – Supports concepts like encapsulation, inheritance, and polymorphism.  
- **Simple & Secure** – Automatic memory management (Garbage Collection) and security features.  
- **Multithreading** – Supports concurrent programming.  
- **Robust & Reliable** – Exception handling and strong memory management.  
- **High Performance** – Uses Just-In-Time (JIT) compiler for execution optimization.  

### **JDK, JRE, and JVM**  
- **JDK (Java Development Kit)**: Contains JRE + Development tools (compiler, debugger, etc.).  
- **JRE (Java Runtime Environment)**: Includes JVM + Libraries required to run Java applications.  
- **JVM (Java Virtual Machine)**: Converts bytecode into machine code for execution.  

### **Setting Up Java & Running a Program**  
1. Install JDK from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).  
2. Set up environment variables (`JAVA_HOME`, `PATH`).  
3. Write a Java program (`.java` file).  
4. Compile using `javac filename.java`.  
5. Run using `java filename`.  

**Example Java Program:**  
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```  

---

## **2. Basic Syntax & Data Types**  

### **Variables, Constants, and Data Types**  
- **Variables**: Named memory locations storing values.  
- **Constants**: Fixed values declared using `final`.  
- **Data Types in Java**:  

| Data Type  | Size  | Default Value  | Range  | Example  |
|------------|-------|---------------|--------|----------|
| byte       | 1 byte  | 0  | -128 to 127 | byte b = 100; |
| short      | 2 bytes | 0  | -32,768 to 32,767 | short s = 1000; |
| int        | 4 bytes | 0  | -2,147,483,648 to 2,147,483,647 | int num = 10; |
| long       | 8 bytes | 0L | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | long l = 100000L; |
| float      | 4 bytes | 0.0f | ±3.4E-38 to ±3.4E+38 | float f = 10.5f; |
| double     | 8 bytes | 0.0 | ±1.7E-308 to ±1.7E+308 | double d = 20.99; |
| char       | 2 bytes | '\u0000' | 0 to 65,535 (Unicode) | char c = 'A'; |
| boolean    | 1 bit | false | true/false | boolean flag = true; |

### **Operators in Java**  
1. **Arithmetic Operators**: `+`, `-`, `*`, `/`, `%`  
2. **Relational Operators**: `==`, `!=`, `>`, `<`, `>=`, `<=`  
3. **Logical Operators**: `&&`, `||`, `!`  
4. **Bitwise Operators**: `&`, `|`, `^`, `~`, `<<`, `>>`  

**Example:**  
```java
int a = 10, b = 5;
System.out.println("Sum: " + (a + b)); // Arithmetic
System.out.println(a > b); // Relational
System.out.println((a > 5) && (b < 10)); // Logical
```

---

## **3. Control Flow**  

### **Conditional Statements**  
- **if-else:** Executes code based on a condition.  
- **switch-case:** Used for multi-way branching.  

**Example (if-else):**  
```java
int num = 10;
if (num > 0) {
    System.out.println("Positive");
} else {
    System.out.println("Negative");
}
```

**Example (switch-case):**  
```java
int day = 2;
switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other day");
}
```

### **Loops in Java**  
1. **for loop** – Executes a block multiple times.  
2. **while loop** – Executes while condition is true.  
3. **do-while loop** – Executes at least once, then checks condition.  

**Example (for loop):**  
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

**Example (while loop):**  
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

**Example (do-while loop):**  
```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---

## **4. Methods & Functions**  

### **Defining and Calling Methods**  
Methods in Java are reusable blocks of code.  
- **Syntax:**  
```java
returnType methodName(parameters) {
    // method body
    return value;
}
```

**Example:**  
```java
public class Example {
    static void greet() {
        System.out.println("Hello, Java!");
    }
    public static void main(String[] args) {
        greet(); // Method call
    }
}
```

### **Method Overloading**  
- **Same method name but different parameters.**  

**Example:**  
```java
class MathOperations {
    int sum(int a, int b) {
        return a + b;
    }
    double sum(double a, double b) {
        return a + b;
    }
}
```

### **Passing Parameters (Call by Value)**  
- Java **always** uses **call by value**, meaning changes inside a method do not affect the original variable.  

**Example:**  
```java
class Test {
    void change(int num) {
        num = num + 10;
    }
    public static void main(String[] args) {
        int a = 5;
        Test obj = new Test();
        obj.change(a);
        System.out.println(a); // Output: 5 (No change)
    }
}
```

---

### **Conclusion**  
These are the **core Java basics** needed for writing and understanding Java programs. Mastering these concepts forms the foundation for **Object-Oriented Programming (OOP)** and advanced topics like **Collections, Multithreading, and Frameworks**.

