# Hellocucumber 🥒
[![Java CI with Maven](https://github.com/buritbest123/hellocucumber/actions/workflows/maven.yml/badge.svg)](https://github.com/buritbest123/hellocucumber/actions/workflows/maven.yml)

## 📜 Description
Hellocucumber is a sample project showcasing the use of **Cucumber** for **Behavior-Driven Development (BDD)**. It uses **Gherkin syntax** to define test scenarios and Java for implementing step definitions. This project demonstrates how to write, execute, and automate tests in a collaborative and user-friendly way.

---

## ✨ Features
- 📝 Write test cases in plain English using **Gherkin syntax**.
- 🛠️ Implement step definitions in Java.
- ✅ Validate scenarios to ensure system behavior aligns with user expectations.
- 📂 Includes sample feature files, scenarios, and step definitions.
- 📊 Generates pass/fail reports for automated testing.

---

## 📁 Project Structure
```
hellocucumber/
├── src/
│   ├── main/
│   │   └── java/           # Application source files
│   └── test/
│       ├── java/           # Java test files
│       │   └── hellocucumber/
│       │       ├── StepDefinitions.java  # Step definitions for scenarios
│       │       └── RunCucumberTest.java  # Test runner
│       └── resources/
│           └── hellocucumber/
│               └── is_it_friday_yet.feature  # Gherkin feature file
├── pom.xml                 # Maven configuration file
```

---

## 🛠️ Prerequisites
- ☕ **Java 17** (as specified in the Maven configuration and GitHub Actions workflow)  
- 🛠️ **Maven 3.8.1 or higher** (to ensure compatibility with modern Java versions)  
- 💻 IntelliJ IDEA (or any IDE with Cucumber and Maven support)  

---

## 🚀 Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/hellocucumber.git
   ```
2. Navigate to the project directory:
   ```bash
   cd hellocucumber
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```

---

## 📋 Usage
### Run Tests
1. Open the project in IntelliJ IDEA or your preferred IDE.
2. Navigate to `RunCucumberTest.java`.
3. Right-click and select **Run 'RunCucumberTest'**.
4. View the test results in the console or reports.

### Test Reports
Generated reports can be found in the `target` directory:
- 🖥️ **HTML Report**: `target/cucumber-reports.html`
- ![image](https://github.com/user-attachments/assets/af3403fe-4b7f-4a42-ab45-158c45cc7566)
- 📊 **JSON Report**: `target/cucumber-reports.json`

---

## 🌟 Example Feature
### `is_it_friday_yet.feature`
```gherkin
Feature: Is it Friday yet?

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"
```

### Step Definitions
```java
@Given("today is Sunday")
public void today_is_Sunday() {
    today = "Sunday";
}

@When("I ask whether it's Friday yet")
public void i_ask_whether_it_s_Friday_yet() {
    actualAnswer = IsItFriday.isItFriday(today);
}

@Then("I should be told {string}")
public void i_should_be_told(String expectedAnswer) {
    assertEquals(expectedAnswer, actualAnswer);
}
```
