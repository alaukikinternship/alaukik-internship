# Day 20 — Multithreading in Java

## 📚 Theory

Today I learned about Multithreading in Java and how multiple tasks can execute concurrently.

### Topics Covered

- Process vs Thread
- Thread Lifecycle
- Creating Threads using Thread Class
- Runnable Interface
- Thread Synchronization
- Race Condition
- ExecutorService
- Thread Pool

## 💻 Practical

### Project: Multi-threaded File Processor

**Description:**

Developed a simple Java application that processes multiple text files simultaneously using Multithreading.

### Features

- Read multiple text files.
- Create separate threads for different files.
- Use Runnable Interface to define file processing tasks.
- Use Thread Class to execute tasks.
- Count total lines in each file.
- Display file processing results.

### Project Structure

```text
Day-20
│
├── src
│   └── com
│       └── multithreading
│           ├── Main.java
│           └── FileTask.java
│
├── files
│   ├── file1.txt
│   ├── file2.txt
│   └── file3.txt
│
└── README.md
```

### Technologies Used

- Java
- Multithreading
- Runnable Interface
- Thread Class
- File Handling
- BufferedReader

### Concepts Implemented

| Concept | Implementation |
|---|---|
| Runnable | Implemented Runnable interface |
| Thread | Created multiple thread objects |
| start() | Started multiple threads |
| File Handling | Read text files |
| Multithreading | Processed multiple files concurrently |

## 🎯 Learning Outcome

Learned how to create and manage multiple threads using the Thread class and Runnable interface and how to process multiple files concurrently in Java.

---

**Day 20 Completed — Java Multithreading Practice**