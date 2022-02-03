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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bstackdemo.com/')

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/a_Sign In'))

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/div_Select Username'))

WebUI.setText(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/input_d_react-select-2-input'), 
    'demouser')

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/div_demouser'))

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/div_Select Password'))

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/div_testingisfun99'))

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/button_Log In'))

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/span_Apple'))

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/span_Samsung'))

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/div_Add to cart'))

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/div_Add to cart'))

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/div_Add to cart'))

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/div_Checkout'))

WebUI.setText(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/input_First Name_firstNameInput'), 
    'Bhagyesh')

WebUI.setText(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/input_Last Name_lastNameInput'), 
    'Nanwani')

WebUI.setText(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/input_Address_addressLine1Input'), 
    'Dummy Address')

WebUI.setText(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/input_StateProvince_provinceInput'), 
    'Mumbai')

WebUI.setText(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/input_Postal Code_postCodeInput'), 
    '401105')

WebUI.click(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/End To End Test BrowserStack/Page_StackDemo/Asset text'), 'Your Order has been successfully placed.')

