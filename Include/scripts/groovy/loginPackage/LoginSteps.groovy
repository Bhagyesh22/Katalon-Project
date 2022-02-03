package loginPackage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.junit.After
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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When






class LoginSteps {

	@Given("User navigates to Login Page")
	def NavigatetologinPage() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://bstackdemo.com/')

		WebUI.click(findTestObject('Object Repository/Locked User Test/Page_StackDemo/button_Log In'))
	}

	@When("Enters (.*) And (.*)")
	def EnterCredentials(String Username, String Password) {

		WebUI.click(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/div_Select Username'))

		WebUI.setText(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/input_d_react-select-2-input'),
				Username)

		WebUI.sendKeys(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/input_d_react-select-2-input'),
				Keys.chord(Keys.ENTER))

		WebUI.click(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/div_Select Password'))

		WebUI.setText(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/input_demouser_react-select-3-input'),
				Password)

		WebUI.sendKeys(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/input_demouser_react-select-3-input'),
				Keys.chord(Keys.ENTER))
	}

	@And("Click On Login Button")
	def ClickLoginButton() {

		WebUI.click(findTestObject('Object Repository/Locked User Test/Page_StackDemo/button_Log In'))

		WebUI.delay(2)
	}

	@Then("He should be directed to HomePage")
	def Logout(){


		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/a_Logout'), 2, FailureHandling.OPTIONAL)) {

			System.out.println("Inside Block 1")
			WebUI.click(findTestObject('Object Repository/Login Using Different Credentials/Page_StackDemo/a_Logout'))
		}

		else {

			System.out.println("Inside Block 2")
			WebUI.closeBrowser()

			return null;
		}


		WebUI.closeBrowser()
	}
}