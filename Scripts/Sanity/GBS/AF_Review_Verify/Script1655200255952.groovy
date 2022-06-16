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

WebUI.delay(2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/button_Technical Sourcing'))

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/span_Flex_Organization'))

WebUI.selectOptionByValue(findTestObject('Page_DIR_GBS/GBS Project/select_Organization'), 'FLEX', true)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_DIR_GBS/GBS Project/i_Project-folder-open'), 2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/i_Project-folder-open'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/a_Back to Projects'), 2)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/a_PIR-TEST-0005'), 2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/i_MPNoptionsMain'))

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/a_Review'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_ReviewPage/h3_Parts Review'), 2)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_ReviewPage/span_PIR-TEST-0005'), 0)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_ReviewPage/button_Select product category'))

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_ReviewPage/div_Select product category'), 2)

WebUI.setText(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_ReviewPage/input_Select product category'), 'cer')

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_ReviewPage/span_Ceramic Capacitor'))

WebUI.selectOptionByValue(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_ReviewPage/select_Commodity'), 'Ceramic Capacitor', 
    true)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_ReviewPage/i_return-arrow'))

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/a_Back to Projects'), 2)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/a_PIR-TEST-0005'), 2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/span_Welcome Thangasumathy Jayakumar'))

WebUI.click(findTestObject('Page_DIR_GBS/a_Logout'))

