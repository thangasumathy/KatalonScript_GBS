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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Page_It-Right Platform/Username'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Page_It-Right Platform/password'), GlobalVariable.pwd)

WebUI.click(findTestObject('Page_It-Right Platform/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform/span_WelcomeToggler'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_It-Right Platform/div_WelcomeMenu'), 0)

WebUI.click(findTestObject('Object Repository/Page_DIR/span_GBS Project Request'))

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_To Create Request'), 2)

WebUI.uploadFileWithDragAndDrop(findTestObject('Page_DIR/div_To Create Request'), GlobalVariable.REQAF_File)

WebUI.delay(2)

// WebUI.click(findTestObject('Object Repository/Page_DIR/a_upload it from directory'))
WebUI.verifyElementPresent(findTestObject('Page_DIR/div_Choose Analysis Type'), 2)

WebUI.click(findTestObject('Object Repository/Page_DIR/button_OK'))

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_Project Request Details'), 2)

WebUI.click(findTestObject('Page_DIR/button_Please select site'))

WebUI.click(findTestObject('Page_DIR/span_012 - PCBA KALLANG, SINGAPORE (012)'))

WebUI.click(findTestObject('Page_DIR/button_Customer'))

WebUI.click(findTestObject('Page_DIR/span_3M COMPANY'))

WebUI.click(findTestObject('Page_DIR/input__dueDateRequest'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_DIR/span_MonthRequest'))

WebUI.scrollToElement(findTestObject('Page_DIR/div_DecemberRequest'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_DIR/div_DecemberRequest'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DIR/span_YearRequest'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_DIR/div_2024Request'), 2)

WebUI.click(findTestObject('Page_DIR/div_2024Request'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DIR/div_31Request'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_DIR/textarea_Comments_Request'), 'test rqst')

WebUI.scrollToElement(findTestObject('Page_DIR/select_RequestType'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_DIR/select_RequestType'), 'GBS', true)

WebUI.selectOptionByValue(findTestObject('Page_DIR/select_Application'), 'MILITARY', true)

WebUI.click(findTestObject('Page_DIR/button_CreateRequest'))

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_SuccessProject Request'), 4)

WebUI.click(findTestObject('Object Repository/Page_DIR/button_OK'))

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_AFSelfServiceAlert'), 2)

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_AFSelfServiceEmail'), 2)

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_To Create Request'), 0)

WebUI.click(findTestObject('Page_DIR/span_Welcome Thangasumathy Jayakumar'))

WebUI.click(findTestObject('Page_DIR/a_Logout'))

