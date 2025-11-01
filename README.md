# Sprinkles Bakery Mobile Application

[cite_start]The **Sprinkles Bakery Mobile Application** is a coursework project for the **CSE5011 - Mobile Application Development** module[cite: 334]. [cite_start]It was developed for **Sprinkles Bakery**, a small bakery situated in **Colombo, Sri Lanka**, specializing in a wide range of cupcakes for various occasions[cite: 396, 397].

[cite_start]The primary goal of the application is to enhance customer accessibility and streamline operational processes[cite: 398]. [cite_start]It is designed to cater to two distinct user levels: **Administrators** and **Members**[cite: 399].

---

## Features

The application provides a robust set of features categorized by user role:

### Member Features
* [cite_start]**User Registration & Login:** Members can create user accounts and securely log in [cite: 401, 542, 545] [cite_start]using **Firebase Authentication**[cite: 502].
* [cite_start]**Explore Cupcakes:** Users can browse through various cupcake categories and explore the assortment of cupcakes available[cite: 401, 472].
* [cite_start]**Cart Management:** Select desired cupcakes and quantities, add them to the shopping cart, and proceed to checkout[cite: 473, 551, 554].
* [cite_start]**Order History:** View the status of current and past orders[cite: 556].
* [cite_start]**Contact Us:** Access contact information for the bakery[cite: 369].

### Administrator Features
* [cite_start]**Cupcake Management (CRUD):** Manage the cupcake inventory by adding new cupcake flavors, types, and prices [cite: 400, 557][cite_start], updating existing cupcake information [cite: 400, 560][cite_start], and removing discontinued cupcakes[cite: 562].
* [cite_start]**Category Management:** Create new categories for cupcakes[cite: 400].
* [cite_start]**Order Management:** Manage incoming orders, update order statuses, and track order fulfillment progress[cite: 564].

---

## Technology Stack & Architecture

[cite_start]The application is a **native mobile development** approach (specifically targeting **Android** given the widespread adoption mentioned in the analysis [cite: 434, 459]) and leverages **Google Firebase** for its backend functionality.

* **Platform:** Android
* [cite_start]**Development Strategy:** Native development (Kotlin/Java with Android Studio is the standard IDE [cite: 439])
* **Backend Services (Firebase):**
    * [cite_start]**Authentication:** **Firebase Authentication** is used for secure user and admin login[cite: 502, 508].
    * [cite_start]**User Data:** User information is securely stored in **Firestore** upon successful registration[cite: 504].
    * [cite_start]**Cupcake Inventory:** The application leverages **Firebase's real-time database** to dynamically update and display the list of cupcakes[cite: 514, 519].

### Architectural Design
[cite_start]The application's design is documented using standard UML diagrams[cite: 467, 475, 480]:
* [cite_start]**Use Case Diagram:** Maps the functionalities available to the Admin and User roles, covering features like Register, Login, Add Cupcake, View Cupcakes, and Process Orders[cite: 466].
* [cite_start]**Class Diagram:** Defines the main classes: `Admin`, `User`, `Login`, and `OderCupcake`, establishing a clear class hierarchy and relationships[cite: 474].
* [cite_start]**Activity Diagram:** Meticulously maps the user journey from the authentication process to key activities like `Dashboard`, `View Cupcake`, and `Cart`[cite: 479, 481].

---

## Getting Started

### Prerequisites
* **Android Studio**
* An Android device or emulator
* A **Firebase Project** set up with Authentication and Database services.

### Development Setup (Inferred Steps)
1.  Clone the project repository.
2.  Open the project in **Android Studio**.
3.  Ensure the Firebase configuration file (`google-services.json`) is correctly placed and the project dependencies are set up.
4.  Run **File** -> **Sync Project with Gradle Files**.
5.  Select a target device/emulator and click the **'Run'** button to launch the application.

---

## Testing

[cite_start]The application was tested in compliance with the Software Development Life Cycle (SDLC) principles, primarily utilizing **Acceptance Testing**[cite: 523, 527].

### Test Environment
* [cite_start]**Development Environment:** Windows-MSI Modern 14, AMD RYZEN 5, 8GB RAM, 512GB NVME SSD[cite: 527].
* [cite_start]**Test Device:** Android-POCO X3 NFC, 6GB RAM, 256GB ROM[cite: 527].

### Test Cases Passed
| Test Case ID | Test Case Title | Execution Notes |
| :--- | :--- | :--- |
| **001** | Syncing Gradle | [cite_start]Passed [cite: 529] |
| **002** | Building the project | [cite_start]Passed [cite: 530] |
| **003** | Running Emulator | [cite_start]Passed [cite: 531] |
| **004** | Checking Registration functionality | [cite_start]Passed [cite: 533] |
| **005** | Checking Login functionality | [cite_start]Passed [cite: 534] |
