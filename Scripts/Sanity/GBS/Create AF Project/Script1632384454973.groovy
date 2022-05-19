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

WebUI.click(findTestObject('Page_It-Right Platform/span_GBS'))

WebUI.delay(9)

WebUI.click(findTestObject('Page_DIR/button_Technical Sourcing'))

WebUI.click(findTestObject('Page_DIR/span_Flex_Organization'))

WebUI.selectOptionByValue(findTestObject('Page_DIR/select_Organization'), 'FLEX', true)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_To Create Project   Drop GBS project'), 0)

WebUI.uploadFileWithDragAndDrop(findTestObject('Page_DIR/div_To Create Project   Drop GBS project'), GlobalVariable.GBSAF_File)

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_Choose Analysis Type'), 3)

WebUI.click(findTestObject('Page_DIR/button_OK'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_Create Project'), 3)

WebUI.click(findTestObject('Page_DIR/input__dueDate'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_DIR/span_Month'))

WebUI.scrollToElement(findTestObject('Page_DIR/span_December (1)'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_DIR/span_December (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DIR/span_Year'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_DIR/span_2024 (1)'), 2)

WebUI.click(findTestObject('Page_DIR/span_2024 (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DIR/div_31'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_DIR/textarea_Comments_comments'), 'Test')

WebUI.scrollToElement(findTestObject('Page_DIR/button_Create'), 2)

WebUI.click(findTestObject('Page_DIR/button_Create'))

WebUI.delay(7)

WebUI.waitForElementPresent(findTestObject('Page_DIR/div_Project success msg'), 3)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_DIR/div_Project success msg'), 3)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_DIR/td_FileName_Dummy'), 2)

WebUI.verifyElementAttributeValue(findTestObject('Page_DIR/td_FileName_Dummy'), 'text', GlobalVariable.GBSAF_FileName, 3)

WebUI.click(findTestObject('Page_DIR/span_Welcome Thangasumathy Jayakumar'))

WebUI.click(findTestObject('Page_DIR/a_Logout'))

