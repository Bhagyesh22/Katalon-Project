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

WebUI.openBrowser('https://bstackdemo.com/')

WebUI.click(findTestObject('Page_StackDemo/SignInButton'))

WebUI.click(findTestObject('Page_StackDemo/UserNameTextField'))

WebUI.sendKeys(findTestObject('Page_StackDemo/TextFieldSendKeys'), 'demouser')

WebUI.sendKeys(findTestObject('Page_StackDemo/TextFieldSendKeys'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_StackDemo/Page_StackDemo/PasswordField'))

WebUI.sendKeys(findTestObject('Page_StackDemo/PasswordText'), 'testingisfun99')

WebUI.sendKeys(findTestObject('Page_StackDemo/PasswordText'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Page_StackDemo/Page_StackDemo/Login/button_Log In'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_StackDemo/Page_StackDemo/Login/a_Logout'))

