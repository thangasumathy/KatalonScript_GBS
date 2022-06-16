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

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform_GBS/span_GBS'))

WebUI.click(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/div_Technical Sourcing'))

WebUI.click(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/span_Flex'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/select_Technical Sourcing                Flex'), 'FLEX', 
    true)

WebUI.delay(2)
// Export from dashboard page
/*
 WebUI.scrollToElement(findTestObject('Page_DIR_GBS/GBS Project/i_Project file-excel'), 2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/i_Project file-excel'))

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/ul_ExportOptions'), 0)

WebUI.click(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/a_Both'))

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/div_To Create Project   Drop GBS project'), 0)
*/ 

//Export from project main page

WebUI.click(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/i_Project-folder-open'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/a_Back to Projects'), 1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/a_PIR-TEST-0005'), 1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/button_Export'), 1)

WebUI.click(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/button_Export'))

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/ul_Export Options_Project'), 2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/a_Both_Project'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/a_PIR-TEST-0005'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/a_Back to Projects'), 2) 

WebUI.click(findTestObject('Object Repository/Page_DIR_GBS/a_Welcome Thangasumathy Jayakumar'))

WebUI.click(findTestObject('Object Repository/Page_DIR_GBS/a_Logout'))

