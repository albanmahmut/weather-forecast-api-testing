# Weather Forecast API Testing Project

## Overview

This project aims to test the functionality and reliability of a weather forecast API using REST Assured. The project includes automated test scripts to validate various aspects of the API, such as endpoint validation, data accuracy, error handling, performance, and security.

## Features

- **Endpoint Validation**: Ensure all API endpoints are accessible and return the expected response codes.
- **Data Accuracy**: Verify the accuracy of weather data returned by the API for different locations and dates.
- **Error Handling**: Test error scenarios to ensure appropriate error responses are returned by the API.
- **Performance Testing**: Measure API response times under different conditions to ensure performance requirements are met.
- **Security Testing**: Validate the security of the API, ensuring sensitive data is transmitted securely and testing for common security vulnerabilities.

## Project Structure

```
weather-forecast-api-testing-project
│
├───src
│   ├───main
│   │   └───java
│   │       └───com
│   │           └───com.weather
│   │               └───weatherapi
│   │                   ├───config
│   │                   ├───model
│   │                   ├───service
│   │                   └───util
│   │
│   └───test
│       ├───java
│       │   └───com
│       │       └───com.weather
│       │           └───weatherapi
│       │               ├───tests
│       │               └───utils
│       │
│       └───resources
│           └───test-data
│
└───reports
    ├───logs
    └───testng-reports

```