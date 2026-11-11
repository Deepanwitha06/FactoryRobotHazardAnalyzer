
# Factory Robot Hazard Analyzer

## Overview
A Java application that evaluates factory robot hazard risk based on arm precision, worker density, and machinery state.

## Technologies
- Java 21
- Maven
- JUnit 5
- Git and GitHub

## Concepts
- Object-Oriented Programming
- Custom Exception Handling
- Input Validation
- Modular Design
- Unit Testing

## Hazard Risk Formula
Hazard Risk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor)

## Machinery Risk Factors
- Worn: 1.3
- Faulty: 2.0
- Critical: 3.0
