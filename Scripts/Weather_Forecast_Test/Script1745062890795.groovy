 // TC_Get_WeatherForecast.groovy
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import groovy.json.JsonSlurper as JsonSlurper

// Send Weather Forecast Request
def response = WS.sendRequest(findTestObject('API Request/Get_Weather_Forecast_JakartaSelatan(RawaBarat)'))

// Verify HTTP Status Code
WS.verifyResponseStatusCode(response, 200)

// Verify Response Time
assert response.getElapsedTime() <= 3000 : 'Response time exceeds 3000ms'

// Parse JSON
JsonSlurper slurper = new JsonSlurper()

def jsonResponse = slurper.parseText(response.getResponseText())

// Verify City Name
assert jsonResponse.city.name.equalsIgnoreCase('Rawa Barat') : 'City name mismatch!'

// Verify List Structure
assert jsonResponse.list instanceof List : 'Forecast list is not an array!'

assert jsonResponse.list.size() > 0 : 'Forecast list is empty!'

// Sample Data Check
assert jsonResponse.city.country != null : 'City country code is missing!'

println("Weather Forecast API Test Passed!")