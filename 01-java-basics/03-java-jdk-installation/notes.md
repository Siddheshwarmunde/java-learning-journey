# Lesson 3: Java JDK Installation and Configuration

## 1. What is JDK installation?

JDK stands for Java Development Kit.

JDK is a software package that provides the tools required to develop Java applications.

### Important JDK tools

- `javac` – Java compiler.
- `java` – Java application launcher.
- `javadoc` – Documentation generator.
- `jar` – Tool for creating Java archive files.
- Java runtime components and libraries.

---

## 2. What is JAVA_HOME?

JAVA_HOME is a Windows environment variable that stores the location of the JDK installation directory.

### Example

```text
JAVA_HOME =
C:\Program Files\Eclipse Adoptium\jdk-21.0.12.101-hotspot
```

### Why is JAVA_HOME used?

- Helps development tools locate the JDK.
- Used by Maven and Gradle.
- Helps configure Java development environments.

### Important

JAVA_HOME should point to the main JDK folder, not directly to its bin folder.

---

## 3. What is PATH?

PATH is a Windows environment variable containing directories where Windows searches for executable commands.

For Java, we add the JDK bin directory.

### Example

```text
%JAVA_HOME%\bin
```

This allows us to execute Java commands from Command Prompt.

Examples:

```cmd
java -version
javac -version
```

---

## 4. Difference between JAVA_HOME and PATH

| JAVA_HOME | PATH |
|---|---|
| Stores the JDK installation location | Stores executable search directories |
| Points to the JDK root folder | Includes the JDK bin folder |
| Helps tools locate Java | Helps Windows find Java commands |

---

## 5. My Java installation details

Operating system: Windows 11

Java distribution: Eclipse Adoptium Temurin

Java version: 21.0.12.1

Java release: LTS

Architecture: 64-bit

### JDK installation directory

```text
C:\Program Files\Eclipse Adoptium\jdk-21.0.12.101-hotspot
```

### Java executable

```text
C:\Program Files\Eclipse Adoptium\jdk-21.0.12.101-hotspot\bin\java.exe
```

### Java compiler

```text
C:\Program Files\Eclipse Adoptium\jdk-21.0.12.101-hotspot\bin\javac.exe
```

---

## 6. Practical 1: Check JAVA_HOME

Command:

```cmd
echo %JAVA_HOME%
```

Output:

```text
C:\Program Files\Eclipse Adoptium\jdk-21.0.12.101-hotspot\
```

Result: JAVA_HOME is configured correctly.

---

## 7. Practical 2: Check PATH

Command:

```cmd
echo %PATH%
```

Important Java 21 PATH entry:

```text
C:\Program Files\Eclipse Adoptium\jdk-21.0.12.101-hotspot\bin
```

Result: Java 21 bin directory is present in PATH.

Java 21 appears before the other Java installations in the PATH.

---

## 8. Practical 3: Check Java installation location

Commands:

```cmd
where java
```

```cmd
where javac
```

My computer has these Java installations:

- Java 21 – Eclipse Adoptium
- Java 8 – Eclipse Adoptium
- Java 24 – Oracle

Java 21 is selected first through PATH.

---

## 9. Practical 4: Configure JDK in Eclipse

Steps followed:

1. Open Eclipse IDE.
2. Click Window.
3. Select Preferences.
4. Expand Java.
5. Select Installed JREs.
6. Select JDK 21.

### Eclipse configuration

Selected JDK:

```text
jdk-21.0.12.101-hotspot
```

Other installations detected:

- JDK 24
- JDK 8
- Eclipse bundled JRE

JDK 21 is selected as the default JRE in Eclipse.

---

## 10. Configure Java project version

Steps:

1. Right-click the Java project.
2. Select Properties.
3. Open Java Build Path.
4. Select Libraries.

### Project configuration

```text
Project name: java-learning-journey

JRE System Library: JavaSE-21
```

Result: Project is configured to use Java 21.

---

## 11. Important commands learned

| Command | Purpose |
|---|---|
| `java -version` | Check Java runtime version |
| `javac -version` | Check compiler version |
| `where java` | Find Java executable |
| `where javac` | Find compiler executable |
| `echo %JAVA_HOME%` | Display JAVA_HOME |
| `echo %PATH%` | Display PATH |

---

## 12. What I learned in this lesson

- Understood JDK installation.
- Learned about JAVA_HOME.
- Learned about PATH.
- Understood the difference between JAVA_HOME and PATH.
- Checked my Java installation directory.
- Checked my Java compiler location.
- Identified multiple Java versions on my computer.
- Configured Eclipse to use JDK 21.
- Verified my project uses JavaSE-21.

---
