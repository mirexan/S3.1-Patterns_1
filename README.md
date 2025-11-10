# S3.1-Patterns-1

## 📄 Description - Exercise Prompts

This project consists of implementing SOLID principles by applying three fundamental creational and behavioral design patterns. 
Each level introduces a new pattern to solve a specific problem, focusing on clean, scalable, and reusable code with low coupling.

---

### Level 1: Singleton Pattern 🙋

**💡Exercise: Implementation of the Singleton pattern with an `Undo` class**

* **Objective:** Implement a class that replicates the basic functionality of the `Undo` command, using the Singleton design pattern to ensure that there is only one shared instance throughout the application.
* **Description:** Create an `Undo` class capable of adding commands to its history, undoing the last command (LIFO), and listing all stored commands.
* **Requirements:**
	* The constructor must be `private`.
	* Access to the instance must be via a static `getInstance()` method.
	* The class must use a `Stack<String>` or `List<String>`.
	* Implement methods: `void addCommand(String command)`, `String undoCommand()`, and `void showHistory()`.
	* The implementation must be demonstrated using **unit tests**.

---

### Level 2: Abstract Factory Pattern 🏭

**💡Exercise: Implementation of an international address and phone number manager**

* **Objective:** Create a contact manager capable of automatically formatting addresses and phone numbers according to the country of origin (e.g., Spain, USA) using the Abstract Factory pattern.
* **Description:** Implement a system that can create families of related objects (addresses, phones) without specifying their concrete classes, allowing new countries to be added easily.
* **Requirements:**
	* **Abstract Products:** `Address`, `Phone`.
	* **Abstract Factory:** `ContactFactory`.
	* **Concrete Factories:** At least two (e.g., `SpainContactFactory`, `USAContactFactory`).
	* **Concrete Products:** Implement country-specific formatting (e.g., Spain: `+34`, USA: `+1`).
	* **Client:** A `Contact` class that receives a factory.
	* The implementation must be demonstrated using **unit tests**.

---

### Level 3: Strategy Pattern ♟️

**💡Exercise: Implementation of the Strategy pattern for a report generation system**

* **Objective:** Build a system that can generate reports in different formats (CSV, JSON, PDF, HTML, XML, Word, Excel) using the Strategy pattern.
* **Description:** Implement a report generation service that is flexible and extensible (Open/Closed Principle) and loosely coupled (Dependency Inversion).
* **Requirements:**
	* **Strategy Interface:** `ReportStrategy`.
	* **Concrete Strategies:** Implement various strategies (e.g., `HtmlReportStrategy`, `JsonReportStrategy`, `PdfReportStrategy`).
	* The demonstration of using the strategies must be done via **unit tests**.

---

## 💻 Technologies Used

* Java (JDK 21)
* JUnit 5
* Maven 

## 📋 Requirements

* Java JDK 21 
* Maven 3.6.0+ (or a compatible Gradle version)

## 🛠️ Installation

1.  Clone this repository:
	```bash
	git clone [https://github.com/mirexan/S3.1-Patterns_1.gitY]
	```
2.  Navigate to the project directory:
	```bash
	cd S3.2-Design-Patterns-1
	```
3.  Install the dependencies (if using Maven):
	```bash
	mvn install
	```

## ▶️ Execution

This project third level is verified using unit tests. To run the tests:

1.  Ensure all dependencies are installed.
2.  Run the test suite from your IDE (e.g., IntelliJ, Eclipse) or via the command line:
	```bash
	mvn test
	```