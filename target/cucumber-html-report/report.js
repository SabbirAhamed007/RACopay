$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Actemra_Patient.feature");
formatter.feature({
  "line": 1,
  "name": "Actemra patient enrollment test feature",
  "description": "",
  "id": "actemra-patient-enrollment-test-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Actemra patient enrollment scenario",
  "description": "",
  "id": "actemra-patient-enrollment-test-feature;actemra-patient-enrollment-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open Actemra site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on apply now button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Apply as Patient",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Apply the eligibility QN",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I complete the patient info",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Insurance Info",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Doctor information",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verified the info",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click on confirm button",
  "keyword": "And "
});
formatter.match({
  "location": "Actemra_PatientTest.i_open_Actemra_site()"
});
formatter.result({
  "duration": 12667819700,
  "status": "passed"
});
formatter.match({
  "location": "Actemra_PatientTest.click_on_apply_now_button()"
});
formatter.result({
  "duration": 66038600,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca class\u003d\"button enroll\" href\u003d\"https://racopay.com/actemra/enroll\"\u003e...\u003c/a\u003e is not clickable at point (751, 537). Other element would receive the click: \u003cdiv class\u003d\"onetrust-pc-dark-filter fade-in\" style\u003d\"z-index:2147483645\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d84.0.4147.89)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-C3UG4MO\u0027, ip: \u0027192.168.1.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\ubox0\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 84.0.4147.89, webStorageEnabled: true}\nSession ID: 177184231948df13b8880765386ec218\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sTEPDefInation.Actemra_PatientTest.click_on_apply_now_button(Actemra_PatientTest.java:37)\r\n\tat ✽.And Click on apply now button(Actemra_Patient.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Actemra_PatientTest.apply_as_Patient()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Actemra_PatientTest.apply_the_eligibility_QN()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Actemra_PatientTest.i_complete_the_patient_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Actemra_PatientTest.insurance_Info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Actemra_PatientTest.doctor_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Actemra_PatientTest.i_verified_the_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Actemra_PatientTest.click_on_confirm_button()"
});
formatter.result({
  "status": "skipped"
});
});