# T2T-B3--Creational-Design-Patterns-in-Java

This repository demonstrates five creational design patterns implemented in Java.  
Each pattern is in its own `.java` file, with an optional `Main.java` to run them all together.

---

## 1️⃣ Singleton Pattern
**Intent:** Ensure a class has only one instance and provide a global access point.  
**When to use:** For shared resources such as loggers, caches, or configuration managers.  
**Implementation:** Uses **lazy initialization with double-checked locking** for thread safety.  
An **enum-based singleton** is also provided (thread-safe and serialization-safe).

---

## 2️⃣ Factory Method Pattern
**Intent:** Define an interface for creating objects but let subclasses or factories decide which class to instantiate.  
**When to use:** When client code shouldn’t depend on concrete class names or object creation details.

---

## 3️⃣ Builder Pattern
**Intent:** Construct complex objects step-by-step using a fluent API.  
**When to use:** When there are many optional parameters or combinations that would make constructors cumbersome.

---

## 4️⃣ Prototype Pattern
**Intent:** Create new objects by cloning existing ones instead of instantiating from scratch.  
**When to use:** When object creation is expensive or when you need snapshot copies.  
**Implementation:** Performs a **deep copy** of mutable fields to avoid shared references.

---

## 5️⃣ Abstract Factory Pattern
**Intent:** Provide an interface to create families of related or dependent objects without specifying their concrete classes.  
**When to use:** When you want to switch entire “families” of products — for example, light/dark UI themes.

---

## ⚙️ How to Compile and Run

```bash
# Compile everything
javac *.java

# run a single demo
java SingletonDemo
java FactoryMethodDemo
java BuilderDemo
java PrototypeDemo
java AbstractFactoryDemo light
java AbstractFactoryDemo dark
