# Java Demo App

[![Java CI with Maven](https://github.com/YOUR_USERNAME/java-demo-app/actions/workflows/maven.yml/badge.svg)](https://github.com/YOUR_USERNAME/java-demo-app/actions/workflows/maven.yml)

A sample Java 17 Maven project demonstrating GitHub Actions CI/CD pipeline.

## Project Structure

```
java-demo-app/
├── .github/
│   └── workflows/
│       └── maven.yml          # GitHub Actions CI workflow
├── src/
│   ├── main/java/com/demo/
│   │   ├── App.java           # Main entry point
│   │   ├── Calculator.java    # Math utility class
│   │   └── StringUtils.java   # String utility class
│   └── test/java/com/demo/
│       ├── CalculatorTest.java
│       └── StringUtilsTest.java
├── pom.xml
└── README.md
```

## Prerequisites

- Java 17+
- Maven 3.8+

## Build & Run

```bash
# Compile and run tests
mvn clean package

# Run the JAR
java -jar target/java-demo-app-1.0-SNAPSHOT.jar
```

## Run Tests Only

```bash
mvn test
```

## GitHub Actions CI

The workflow triggers on every push and pull request to `main`:
1. Checks out the code
2. Sets up JDK 17 (Temurin)
3. Runs `mvn -B package` (compiles + tests + packages)
4. Submits dependency graph for Dependabot alerts

Replace `YOUR_USERNAME` in the badge URL above with your GitHub username.
