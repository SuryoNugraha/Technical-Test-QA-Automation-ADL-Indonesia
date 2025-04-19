# Technical-Test-QA-Automation-ADL-Indonesia
Repository for Technical Test QA Automation ADL Indonesia

OpenWeatherMap API Automation - Katalon Studio for Technical Test QA Automation ADL Indonesia

🌐 Overview

Automated testing project for OpenWeatherMap API using Katalon Studio.

Covers two scenarios:

5-Day Weather Forecast for Jakarta Selatan (Rawa Barat)

Current Air Pollution Data for Jakarta Selatan (Rawa Barat)

📦 Project Structure

WeatherAPIAutomation/
├── Object Repository/
│   └── API Request/
│       ├── Get_Weather_Airpolution_JakartaSelatan(RawaBarat)
│       └── Get_Weather_Forecast_JakartaSelatan(RawaBarat)
├── Test Cases/
│       ├── Airpolution_Test
│       └── Weather_Forecast_Test
├── Test Suites/
│   └── Technical_Test_QA_Automation_ADL_Indonesia_TestSuite
├── Reports/
├── Profiles/
└── README.md

🔑 Setup

Download and install Katalon Studio.

Clone this repo.

🚀 How To Run

Open the project file in Katalon Studio.

Run Technical_Test_QA_Automation_ADL_Indonesia_TestSuite.

Reports will be generated in the Reports/ folder in HTML, PDF, and CSV formats.

⚙️ Assertions

For each test:

Verify HTTP Status Code = 200

Check Response Time ≤ 3000ms

Validate key fields via Groovy assertions

Critical attributes like city.name, aqi, and pollutant components are checked.

💡 Notes

Jakarta Selatan Latitude: -6.2673  | Longitude: 106.8106

Delay was added to the test suites for limited API testing free tier.

📋 Reporting

All test execution results can be found in:

Reports/yyyymmdd_xxxx/yourtestsuitename

You can export to:

HTML

PDF

CSV

If you use Katalon for free, you can open the report from your computer file explorer.

Made by: Yehezkiel Suryo C N
