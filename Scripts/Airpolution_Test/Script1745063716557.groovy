import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import groovy.json.JsonSlurper as JsonSlurper

// Send Air Pollution Request
def responseAP = WS.sendRequest(findTestObject('API Request/Get_Weather_Airpolution_JakartaSelatan(RawaBarat)'))

// Verify HTTP Status Code
WS.verifyResponseStatusCode(responseAP, 200)

// Verify Response Time
assert responseAP.getElapsedTime() <= 3000 : 'Response time exceeds 3000ms'

// Parse JSON
JsonSlurper slurperAP = new JsonSlurper()

def jsonAP = slurperAP.parseText(responseAP.getResponseText())

// Verify Coordinates
assert jsonAP.coord.lat == -6.2673 : 'Latitude mismatch!'

assert jsonAP.coord.lon == 106.8106 : 'Longitude mismatch!'

// Verify Air Quality Index and Components
assert jsonAP.list[0].main.aqi in 1..5 : "Air Quality Index value is invalid!"
def components = jsonAP.list[0].components
['co', 'no', 'no2', 'o3', 'so2', 'pm2_5', 'pm10', 'nh3'].each { key ->
	assert components.containsKey(key) : "Missing pollutant component: ${key}"
}

println('Air Pollution API Test Passed!')

