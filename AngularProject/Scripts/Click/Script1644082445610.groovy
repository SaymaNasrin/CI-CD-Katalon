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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://mlbd-starter-angular-ant-design.netlify.app/')
WebUI.maximizeWindow()
WebUI.verifyElementPresent(findTestObject('Object Repository/click/title'), 0)
WebUI.click(findTestObject('Object Repository/click/abt_btn'))
WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('Object Repository/click/abt_title'), 0)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/click/contact_btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/click/contact_title'), 0)

WebUI.delay(3)
WebUI.closeBrowser()