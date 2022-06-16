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

WebUI.setText(findTestObject('Page_It-Right Platform_GBS/Username'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Page_It-Right Platform_GBS/password'), GlobalVariable.pwd)

WebUI.click(findTestObject('Page_It-Right Platform_GBS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform_GBS/span_WelcomeToggler'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_It-Right Platform_GBS/div_WelcomeMenu'), 0)

WebUI.click(findTestObject('Object Repository/Page_DIR_GBS/GBS_Request/span_GBS Project Request'))

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS_Request/div_To Create Request'), 2)

WebUI.uploadFileWithDragAndDrop(findTestObject('Page_DIR_GBS/GBS_Request/div_To Create Request'), GlobalVariable.REQAF_File)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS_Request/div_Choose Analysis Type_Request'), 2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS_Request/button_OK_Request'))

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS_Request/div_Project Request Details'), 2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/button_Please select site'))

WebUI.click(findTestObject('Page_DIR_GBS/GBS_Request/span_012 - PCBA KALLANG, SINGAPORE (012)'))

WebUI.click(findTestObject('Page_DIR_GBS/GBS_Request/button_Customer'))

WebUI.click(findTestObject('Page_DIR_GBS/GBS_Request/span_3M COMPANY'))

WebUI.click(findTestObject('Page_DIR_GBS/GBS_Request/input__dueDateRequest'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_DIR_GBS/GBS_Request/span_MonthRequest'))

WebUI.scrollToElement(findTestObject('Page_DIR_GBS/GBS_Request/div_DecemberRequest'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_DIR_GBS/GBS_Request/div_DecemberRequest'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS_Request/span_YearRequest'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_DIR_GBS/GBS_Request/div_Year2024Request'), 2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS_Request/div_Year2024Request'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS_Request/div_Date31Request'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_DIR_GBS/GBS_Request/textarea_Comments_Request'), 'Please Ignore. Test file created by DIR support team for testing purpose')

WebUI.scrollToElement(findTestObject('Page_DIR_GBS/GBS_Request/select_RequestType'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_DIR_GBS/GBS_Request/select_RequestType'), 'GBS', true)

WebUI.selectOptionByValue(findTestObject('Page_DIR_GBS/GBS_Request/select_Application'), 'MILITARY', true)

WebUI.click(findTestObject('Page_DIR_GBS/GBS_Request/button_CreateRequest'))

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS_Request/div_SuccessProject Request'), 4)

WebUI.click(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/button_OK'))

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS_Request/div_AFSelfServiceAlert'), 2)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS_Request/div_AFSelfServiceEmail'), 2)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS_Request/div_To Create Request'), 0)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/span_Welcome Thangasumathy Jayakumar'))

WebUI.click(findTestObject('Page_DIR_GBS/a_Logout'))

