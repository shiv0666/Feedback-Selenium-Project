# 🎓 Student Feedback Automation Project

## 📌 Project Overview

This project is a complete DevOps-based implementation of a **Student Feedback Form** with frontend validation, automated testing using Selenium, and continuous integration using Jenkins.

---

## 🚀 Features

* 🧾 Student Feedback Form (HTML, CSS, JavaScript)
* ✅ Client-side form validation
* 🤖 Automated testing using Selenium (Java)
* 🔁 Continuous Integration using Jenkins
* 📸 Test execution screenshots included

---

## 🛠️ Technologies Used

* HTML5, CSS3, JavaScript
* Java (JDK 21)
* Selenium WebDriver
* Jenkins
* Git & GitHub

---

## 📂 Project Structure

```
DEVOPS CA2/
│
├── index.html
├── style.css
├── script.js
├── screenshots/
│   ├── TC1_Page_Load.png
│   ├── TC2_Submission.png
│   ├── TC3_Validation.png
│   └── ...
```

---

## 🧪 Selenium Test Cases

The following test cases are automated:

1. ✔ Page Load Verification
2. ✔ Valid Form Submission
3. ✔ Empty Field Validation
4. ✔ Email Validation
5. ✔ Mobile Number Validation
6. ✔ Dropdown Selection Check
7. ✔ Reset Button Functionality

---

## ⚙️ Jenkins Integration

* Created a Freestyle Job in Jenkins
* Configured build steps using Windows Batch Commands
* Executed Selenium test cases through Jenkins
* Verified results in Console Output

---

## 📸 Screenshots

Screenshots of test execution are available in the **screenshots/** folder.

---

## ▶️ How to Run Project

### 🔹 Run Frontend

1. Open `index.html`
2. Use Live Server (recommended)
3. Access via:

```
http://127.0.0.1:5500/index.html
```

---

### 🔹 Run Selenium Tests

1. Open project in Eclipse
2. Add Selenium JAR files
3. Run `TestCases.java`

---

### 🔹 Run via Jenkins

1. Create Freestyle Project
2. Add Build Step (Execute Windows Batch Command)
3. Configure classpath with Selenium JARs
4. Click **Build Now**
5. Check **Console Output**

---

## ⚠️ Note

* Selenium JAR files are not uploaded due to size constraints
* Jenkins is configured locally

---

## 👨‍💻 Author

**Shivansh Lohani**

---

## 🎯 Conclusion

This project demonstrates the integration of frontend development, automated testing, and DevOps practices using Jenkins for continuous testing.

---
