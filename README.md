# 🕵️ Interactive Detective – Case DB (Java MVC Console Project)

An **interactive console-based detective game** built using **Java MVC architecture** and **MySQL**.  
Players investigate cases, interrogate suspects, and solve crimes using logical deduction.  
Admins can dynamically add cases and suspects, making the game replayable and scalable.

---

## 🚀 Features

- 🎮 Menu-driven console interface
- 🧠 Clean **MVC Architecture**
- 🗄️ MySQL database integration
- 🧑‍💼 Admin mode:
  - Add new cases
  - Add suspects to cases
- 🕵️ Player mode:
  - Select a case
  - Interrogate suspects
  - Accuse culprit
- 🏆 Score system for correct deductions
- ♻️ Replayable with unlimited cases

---

## 🏗️ Project Architecture (MVC)

InteractiveDetective/
│
├── src/
│ ├── app/ # Main entry point
│ ├── controller/ # Game, Admin, Play logic
│ ├── model/ # Case, Suspect, Player
│ ├── dao/ # DB access layer
│ ├── db/ # DB connection config
│ ├── view/ # Console UI
│
├── bin/ # Compiled .class files
├── lib/ # MySQL JDBC driver
├── database/ # SQL scripts
├── README.md
└── .gitignore


---

## 🗄️ Database Schema

### `cases`
- id (PK)
- title
- description
- difficulty
- resolved

### `suspects`
- id (PK)
- name
- statement
- guilty
- case_id (FK)

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository

```
git clone https://github.com/your-username/InteractiveDetective.git
cd InteractiveDetective
```

### 2️⃣ Setup MySQL Database

```
CREATE DATABASE detective_db;
USE detective_db;
```

### 3️⃣ Add MySQL Connector

```
Place mysql-connector-j-8.x.x.jar inside the lib/ folder.
```

### 4️⃣ Compile the Project
```
javac -d bin -cp "lib/*" src/app/MainApp.java
```

### 5️⃣ Run the Game
```
java -cp "bin:lib/*" app.MainApp
```
### Output

```
Sample Gameplay Flow
1. Play Case
2. Add New Case (Admin)
3. Add Suspect to Case (Admin)
4. Exit


- Admin adds cases & suspects
- Player selects a case
- Interrogates suspects
- Accuses culprit

```