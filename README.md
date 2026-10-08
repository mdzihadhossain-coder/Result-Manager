<div align="center">

# 🎓 RESULT MANAGER
### *A Clean, Object-Oriented Java Performance Tracker*

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![GitHub repo size](https://img.shields.io/github/repo-size/mdzihadhossain-coder/Result_Manager?style=for-the-badge&color=brightgreen)](https://github.com/mdzihadhossain-coder)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)
[![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)]()

<p align="center">
  A streamlined console application engineered in Java to record academic records, display formatted rosters, track class toppers, and compute statistical aggregates in real-time.
</p>

[Key Features](#-key-features) • [System Architecture](#-system-architecture) • [Getting Started](#-getting-started) • [Terminal Preview](#-terminal-preview)

---

</div>

## ✨ Key Features

| Feature | Description | Status |
| :--- | :--- | :---: |
| 📋 **Interactive Data Ingestion** | Dynamic console scanning with buffer handling for seamless multi-line inputs. | `Done` |
| 🗃️ **OOP Domain Model** | Modular `Student` object structure keeping data and display logic clean. | `Done` |
| 🏆 **Topper Identification Engine** | Single-pass $O(N)$ comparison algorithm to identify highest rank. | `Done` |
| 📊 **Batch Analytics** | Automated total tally and precise class average calculation. | `Done` |

---

## 🏛️ System Architecture

```text
Result_Manager/
│
├── 📁 src/
│   ├── 📄 Main.java          # Core controller: execution loop, scanners & calculations
│   └── 📄 Student.java       # Entity class: fields (name, id, mark) & display methods
│
├── 📄 .gitignore             # Standard IDE and bytecode filters
└── 📄 README.md              # Project documentation
