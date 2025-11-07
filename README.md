# Creational Design Patterns in Java

This repository demonstrates **six key Creational Design Patterns** in Java, implemented with clear and simple examples.  
Each pattern is illustrated through a mini-program that highlights its **purpose, structure, and behavior** — along with output screenshots for better understanding.

---

## 1. Singleton Pattern

**Goal:**  
Allow only one instance of a class (e.g., `Logger`) throughout the application.

**Implementation Highlights:**
- Uses a **private static instance variable**.
- Provides a **getInstance()** method for global access.
- Demonstrates that multiple variables refer to the **same instance**.

**Output:**
![Singleton Output]<img width="1365" height="723" alt="1" src="https://github.com/user-attachments/assets/536ac006-e484-4a99-932c-68c22156e781" />

---

## 2. Lazy Singleton Pattern

**Goal:**  
Create the Singleton instance **only when needed**, improving startup performance.

**Implementation Highlights:**
- Checks if the instance is `null` before creating it.
- Supports **thread-safe initialization** (can be enhanced using synchronized blocks).

**Output:**
![Lazy Singleton Output]<img width="1361" height="723" alt="2" src="https://github.com/user-attachments/assets/d77a87ab-44e7-4a3d-8aa8-fea67a279f4e" />
---

## 3. Factory Method Pattern

**Goal:**  
Define an interface for creating objects, but let subclasses decide which class to instantiate.

**Implementation Highlights:**
- Interface: `Shape` with a `draw()` method.  
- Concrete classes: `Circle`, `Rectangle`, `Square`.  
- Factory: `ShapeFactory` determines which shape to create.

**Output:**
![Factory Method Output]<img width="1364" height="720" alt="3" src="https://github.com/user-attachments/assets/6a2cf998-31cc-4b59-b666-078b41a2c6ca" />

---

## 4. Builder Pattern

**Goal:**  
Construct complex objects step-by-step using a builder class.

**Implementation Highlights:**
- `Computer` class with fields: `CPU`, `RAM`, `storage`, `graphicsCard`.  
- Nested static `Builder` class with **method chaining** for clarity and flexibility.

**Output:**
![Builder Pattern Output]<img width="1365" height="724" alt="4" src="https://github.com/user-attachments/assets/fa9ee44c-88b8-4dfc-89cd-ee1920e063fd" />
---

## 5. Prototype Pattern

**Goal:**  
Clone objects instead of creating them from scratch.

**Implementation Highlights:**
- Implements `Cloneable` and overrides `clone()`.  
- Demonstrates **deep copying** — changes in the clone don’t affect the original object.

**Output:**
![Prototype Pattern Output]<img width="1365" height="718" alt="5" src="https://github.com/user-attachments/assets/f8f19c0a-a02c-4769-81f5-46c33083ca1b" />
---

## 6. Abstract Factory Pattern

**Goal:**  
Provide an interface for creating **families of related or dependent objects** without specifying their concrete classes.

**Implementation Highlights:**
- Interfaces: `Button`, `Checkbox`.  
- Factories: `LightThemeFactory`, `DarkThemeFactory`.  
- Ensures consistent **UI themes** (Light/Dark) across components.

**Output:**
![Abstract Factory Output]<img width="1365" height="719" alt="6" src="https://github.com/user-attachments/assets/80d08152-4250-4a13-8d70-adb3388b0fe4" />
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
