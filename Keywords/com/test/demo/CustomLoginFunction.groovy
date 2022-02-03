package com.test.demo
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class CustomLoginFunction {

	@Keyword
	def login() {


		WebUI.openBrowser('')

		for (int i = 1; i <= findTestData('Data Files/LoginTest/UserCredentials').getRowNumbers(); i++) {

			WebUI.navigateToUrl('https://bstackdemo.com/')

			WebUI.click(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/a_Sign In'))

			WebUI.click(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/div_Select Username'))

			WebUI.setText(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/input_d_react-select-2-input'),
					findTestData('Data Files/LoginTest/UserCredentials').getValue(1, i))

			WebUI.sendKeys(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/input_d_react-select-2-input'),
					Keys.chord(Keys.ENTER))

			WebUI.click(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/div_Select Password'))

			WebUI.setText(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/input_demouser_react-select-3-input'),
					findTestData('Data Files/LoginTest/UserCredentials').getValue(2, i))

			WebUI.sendKeys(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/input_demouser_react-select-3-input'),
					Keys.chord(Keys.ENTER))

			WebUI.click(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/button_Log In'))

			if (i == 4) {
				break
			}

			WebUI.click(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/a_Logout'))
		}

		WebUI.closeBrowser()
	}
}