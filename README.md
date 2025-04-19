OpenWeatherMap API Automation - Katalon Studio for Technical Test QA Automation ADL Indonesia

🌐 Overview

Automated testing project for OpenWeatherMap API using Katalon Studio.

Covers two scenarios:

1. 5-Day Weather Forecast for Jakarta Selatan (Rawa Barat)

2. Current Air Pollution Data for Jakarta Selatan (Rawa Barat)

📦 Project Structure

    Technical Test QA Automation ADL Indonesia/
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

1. Download and install Katalon Studio.

Clone this repo.

🚀 How To Run

1. Open the project file in Katalon Studio.

2. Run Technical_Test_QA_Automation_ADL_Indonesia_TestSuite.

3. Reports will be generated in the Reports/ folder in HTML, PDF, and CSV formats.

⚙️ Assertions

For each test:

1. Verify HTTP Status Code = 200

2. Check Response Time ≤ 3000ms

3. Validate key fields via Groovy assertions

4. Critical attributes like city.name, aqi, and pollutant components are checked.

💡 Notes

1. Jakarta Selatan Latitude: -6.2673  | Longitude: 106.8106

2. Delay was added to the test suites for limited API testing free tier.

📋 Reporting

All test execution results can be found in:

    Reports/yyyymmdd_xxxx/yourtestsuitename

You can export to:

1. HTML

2. PDF

3. CSV

If you use Katalon for free, you can open the report from your computer file explorer.

Made by: Yehezkiel Suryo C N
