# Java Core Concepts Explained

## JDK, JRE, and JVM
* **JDK (Java Development Kit):** The full toolbox for developers. It includes everything needed to write, compile, and run Java programs (includes the JRE and tools like the compiler).
* **JRE (Java Runtime Environment):** The software package needed to *run* Java applications. It includes the JVM and core libraries, but no development tools.
* **JVM (Java Virtual Machine):** The engine that actually executes the Java code. It translates Java instructions into actions your computer's operating system can understand as Java is a platform independent language.

## What is Bytecode?
Bytecode is the intermediate, machine-independent code created when you compile a Java program. Instead of compiling directly into machine code (which only works on one specific type of computer), Java compiles into bytecode, which the JVM can read and execute.

## "Write Once, Run Anywhere" (WORA)
"Write once, run anywhere" means you can write and compile your Java code on one operating system (like Windows), and that exact same compiled code will run flawlessly on any other system (like Mac or Linux) without needing modifications.

This is made possible by bytecode and the JVM. Because the compiler translates your code into universal bytecode, it's up to the platform-specific JVM to translate that bytecode into the local machine's native instructions. As long as a device has a JVM installed, it can run your Java program.