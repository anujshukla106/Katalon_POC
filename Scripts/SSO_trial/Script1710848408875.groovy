import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser("")
WebUI.navigateToUrl('https://master-qx3.cba.qa.alight.com/safe/')

//Reloading the opened webpage 
//Requires as in cloud it ask for credentials
WebUI.delay(4)
WebUI.navigateToUrl('https://master-qx3.cba.qa.alight.com/safe/')

//WebUI.refresh()

//WebUI.delay(6)
//
// Entering the username and password to login 

WebUI.setText(findTestObject('Object Repository/login_username'), "anuj.shukla@alight.com")

WebUI.setEncryptedText(findTestObject('Object Repository/login_password'), "F4bfzrtDwopXClm5dSGoNg==")


	
WebUI.click(findTestObject('Object Repository/login_btn'))
