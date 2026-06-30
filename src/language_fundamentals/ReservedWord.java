package language_fundamentals;

public class ReservedWord {
}


/*

# Core Java Interview Notes

## Topic: Reserved Keywords (Java 7)

### 1. Definition

Reserved words are predefined words reserved by the Java language to represent specific language functionalities. They cannot be used as identifiers.

---

### 2. Total Reserved Words (Java 7)

Total Reserved Words = **53**

They are divided into:

* **50 Reserved Keywords**
* **3 Reserved Literals**

  * true
  * false
  * null

Among the 50 Reserved Keywords:

* **48 Used Keywords**
* **2 Unused Keywords**

  * goto
  * const

---

### 3. Reserved Literals

* true
* false
* null

These are literals because they represent predefined constant values.

---

### 4. Unused Keywords

goto

* Reserved for possible future use.
* Never implemented in Java.

const

* Reserved for possible future use.
* Java uses the `final` keyword instead.

---

### 5. Important Interview Questions & Answers

Q. What are reserved keywords?

Answer:
Reserved keywords are predefined words having a special meaning to the Java compiler. They represent specific language functionalities and cannot be used as identifiers.

---

Q. Why are keywords called reserved?

Answer:
Because Java reserves these words for its own language syntax, preventing programmers from using them as identifiers.

---

Q. How many reserved words are there in Java 7?

Answer:
53 Reserved Words

* 50 Reserved Keywords
* 3 Reserved Literals

---

Q. Can keywords be used as variable names?

Answer:
No. Using a keyword as an identifier results in a compile-time syntax error.

Example:

int class = 10; // Compile-time error

---

Q. Is Java case-sensitive?

Answer:
Yes.

class  -> Keyword

Class  -> Identifier

PUBLIC -> Identifier

public -> Keyword

---

Q. Is String a keyword?

Answer:
No.

String is a predefined class in java.lang.

---

Q. Is System a keyword?

Answer:
No.

System is a predefined class.

---

Q. Is Integer a keyword?

Answer:
No.

Integer is a wrapper class.

---

Q. Is main a keyword?

Answer:
No.

main is simply a method name (identifier).

---

Q. Why are true, false and null not keywords?

Answer:
Because they represent predefined constant values (literals), not language syntax.

---

### Java 7 Interview Traps

❌ String is a keyword.

Correct:
String is a predefined class.

---

❌ Integer is a keyword.

Correct:
Integer is a wrapper class.

---

❌ main is a keyword.

Correct:
main is an identifier.

---

❌ System is a keyword.

Correct:
System is a predefined class.

---

### Java 8+ Updates

No major keyword changes in Java 8.

(Java 9 later reserved the single underscore `_` as a keyword.)

* */