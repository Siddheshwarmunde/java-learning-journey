# Lesson 2: JDK, JRE and JVM

## 1. What is JVM?

**JVM stands for Java Virtual Machine.**

JVM is responsible for executing Java bytecode.

When we write Java code, it is first compiled into bytecode. The JVM executes that bytecode.

### Responsibilities of JVM
- Executes Java bytecode.
- Manages memory.
- Performs garbage collection.
- Provides a runtime environment for Java programs.

**Remember:** JVM = Executes Java bytecode.

---

## 2. What is JRE?

**JRE stands for Java Runtime Environment.**

JRE provides the environment and libraries required to run Java applications.

### Components of JRE
- JVM
- Java class libraries
- Supporting runtime files

**Remember:** JRE = Environment to run Java applications.

---

## 3. What is JDK?

**JDK stands for Java Development Kit.**

JDK provides the tools required to develop Java applications.

### Components and tools
- Java compiler (`javac`)
- Java launcher (`java`)
- JVM and runtime components
- Development tools and libraries

**Remember:** JDK = Develop Java applications.

---

## 4. Relationship between JDK, JRE and JVM

Traditional conceptual relationship:

- JDK contains development tools and runtime components.
- JRE provides the runtime environment.
- JVM executes Java bytecode.

### Easy way to remember

| Component | Purpose |
|---|---|
| JDK | Develop Java programs |
| JRE | Run Java applications |
| JVM | Execute bytecode |

**Note:** Modern Java distributions commonly package runtime components within the JDK. A separate JRE installation is not required for our Java 21 setup.

---

## 5. Difference between JDK, JRE and JVM

| Feature | JDK | JRE | JVM |
|---|---|---|---|
| Full form | Java Development Kit | Java Runtime Environment | Java Virtual Machine |
| Purpose | Development | Running applications | Executing bytecode |
| Compiler | Yes | No | No |
| Executes bytecode | Through JVM | Through JVM | Yes |
| Libraries | Yes | Yes | Uses runtime libraries |

---

## 6. How Java code executes

1. Write Java source code in a `.java` file.
2. Java compiler (`javac`) compiles the source code.
3. Compiler generates bytecode in a `.class` file.
4. JVM executes the bytecode.
5. Program produces output.

### Example

Source file: `Main.java`

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Rahul!");
    }
}
```

Compile:

```bash
javac Main.java
```

Run:

```bash
java Main
```

Output:

```text
Hello Rahul!
```

---

## 7. Java installation practical

### Commands used

Check Java version:

```bash
java -version
```

Check Java compiler version:

```bash
javac -version
```

Find Java executable:

```bash
where java
```

Find Java compiler:

```bash
where javac
```

### My computer's Java details

- Operating system: Windows
- Java distribution: Eclipse Adoptium Temurin
- Java version: 21.0.12.1
- Java release: LTS
- Architecture: 64-bit
- Java compiler: javac 21.0.12.1

### Java installation paths

Java executable:

```text
C:\Program Files\Eclipse Adoptium\jdk-21.0.12.101-hotspot\bin\java.exe
```

Java compiler:

```text
C:\Program Files\Eclipse Adoptium\jdk-21.0.12.101-hotspot\bin\javac.exe
```

Other Java versions were also found on my computer:
- Java 8
- Java 24

Java 21 is currently selected first in my Windows PATH and is our development version.

---

## 8. Important points to remember

1. Java source code uses the `.java` extension.
2. Compiled Java bytecode uses the `.class` extension.
3. `javac` is the Java compiler.
4. `java` launches Java applications.
5. JVM executes Java bytecode.
6. JRE provides the traditional runtime environment.
7. JDK provides Java development tools.

---

## 9. What I learned in this lesson

- Understood JVM, JRE and JDK.
- Learned the difference between JDK, JRE and JVM.
- Understood how Java code is compiled and executed.
- Checked my Java installation.
- Checked my Java compiler.
- Identified my Java installation location.
- Learned basic Java terminal commands.

