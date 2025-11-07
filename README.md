# Creational Design Patterns in Java

This repository demonstrates **six key Creational Design Patterns** in Java, implemented with clear and simple examples.  
Each pattern is illustrated through a mini-program that highlights its **purpose, structure, and behavior**.

---

## 1. Singleton Pattern

**Goal:**  
Allow only one instance of a class (e.g., `Logger`) throughout the application.

**Implementation Highlights:**
- Uses a **private static instance variable**.
- Provides a **getInstance()** method for global access.
- Demonstrates that multiple variables refer to the **same instance**.

---

## 2. Lazy Singleton Pattern

**Goal:**  
Create the Singleton instance **only when needed**, improving startup performance.

**Implementation Highlights:**
- Checks if the instance is `null` before creating it.
- Supports **thread-safe initialization** (can be enhanced using synchronized blocks).

---

## 3. Factory Method Pattern

**Goal:**  
Define an interface for creating objects, but let subclasses decide which class to instantiate.

**Implementation Highlights:**
- Interface: `Shape` with a `draw()` method.  
- Concrete classes: `Circle`, `Rectangle`, `Square`.  
- Factory: `ShapeFactory` determines which shape to create.

---

## 4. Builder Pattern

**Goal:**  
Construct complex objects step-by-step using a builder class.

**Implementation Highlights:**
- `Computer` class with fields: `CPU`, `RAM`, `storage`, `graphicsCard`.  
- Nested static `Builder` class with **method chaining** for clarity and flexibility.

---

## 5. Prototype Pattern

**Goal:**  
Clone objects instead of creating them from scratch.

**Implementation Highlights:**
- Implements `Cloneable` and overrides `clone()`.  
- Demonstrates **deep copying** — changes in the clone don’t affect the original object.

---

## 6. Abstract Factory Pattern

**Goal:**  
Provide an interface for creating **families of related or dependent objects** without specifying their concrete classes.

**Implementation Highlights:**
- Interfaces: `Button`, `Checkbox`.  
- Factories: `LightThemeFactory`, `DarkThemeFactory`.  
- Ensures consistent **UI themes** (Light/Dark) across components.

---

## 🧰 Technologies Used

- **Java Version:** 24 (OpenJDK)  
- **IDE:** IntelliJ IDEA 2025.2.4  
- **Concepts Covered:** Creational Design Patterns  
- **Language Level:** Java 17+

---

## 💡 Bonus: Thread-Safe Singleton Options

For a **thread-safe Singleton**, you can:
- Use **lazy initialization** with a `synchronized` block, or  
- Implement an **enum-based Singleton** (simpler and inherently thread-safe).

---

## 👤 Author

**Azeez Ahamed**

---



> “Design patterns simplify code creation and maintenance by providing proven solutions for common problems.”
