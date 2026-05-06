----------------------------------CloudComputingTask4---------------------------------------
# StringUtil Project 🛠️

Hey there! 👋 Welcome to the **StringUtil** project. This is a simple and handy Java utility library designed to make common string manipulations a breeze.

Whether you need to reverse a string, check if a word is a palindrome, count how many times a word shows up in a text, or cleanly title-case a sentence, this project has you covered!

## What's Inside? 📦

- **`StringUtil.java`**: The core utility class containing helpful methods like `reverse()`, `isPalindrome()`, `countOccurrences()`, `titleCase()`, and `isNullOrBlank()`.
- **`StringUtilTest.java`**: A suite of unit tests to make sure everything works perfectly.
- **Jenkins CI**: A `Jenkinsfile` is included to automatically build the code and run our tests so we never break anything by accident.

## Prerequisites ⚙️

Before you run this, you'll need a couple of things installed on your machine:
- **Java 11** (or higher)
- **Maven** (for building and testing)

## How to Run & Test 🚀

It's super easy to get started! Open your terminal, navigate to the root of the project, and run these Maven commands:

**1. To compile the code:**
```bash
mvn clean compile
```

**2. To run the unit tests:**
```bash
mvn test
```

All tests should pass with flying colors! 🌈

## Contributing 🤝
Feel free to fork the repository, add some cool new string methods, and submit a PR. Let's make text processing fun!