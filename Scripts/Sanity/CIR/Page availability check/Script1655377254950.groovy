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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Page_It-Right Platform/Username'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Page_It-Right Platform/password'), GlobalVariable.pwd)

WebUI.click(findTestObject('Page_It-Right Platform/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform/span_WelcomeToggler'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_It-Right Platform/div_WelcomeMenu'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_It-Right Platform/span_Collect It Right'), 0)

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform/span_Collect It Right'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Collect It Right/div_Welcome to CIR'), 'Welcome to CIR!')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_Projects_Menu'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_Preliminary Bom_Menu'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_Design Centers_Menu'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_Master File_Menu'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_Contracts_Menu'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Collect It Right/a_DWA Annex_Menu'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_Market Intelligence_Menu'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_Admin_Menu'), 0)

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Admin_Menu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_Users'), 0)

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Projects_Menu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_All Projects_TabName'), 3)

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_CIR_MenuOptions'))

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Preliminary Bom_Menu'))

WebUI.verifyElementPresent(findTestObject('Page_Collect It Right/a_Preliminary BOM_TabName'), 3)

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_CIR_MenuOptions'))

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Design Centers_Menu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_Design Centers_TabName'), 0)

WebUI.click(findTestObject('Page_Collect It Right/a_CIR_MenuOptions'))

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Master File_Menu'))

WebUI.verifyElementPresent(findTestObject('Page_Collect It Right/a_Master File_TabName'), 3)

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_CIR_MenuOptions'))

/*WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Contracts_Menu'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_Collect It Right/a_Contracts_TabName'), 3)

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_CIR_MenuOptions'))
*/

WebUI.click(findTestObject('Page_Collect It Right/a_DWA Annex_Menu'))

WebUI.verifyElementPresent(findTestObject('Page_Collect It Right/a_DWA Annex_TabName'), 0)

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_CIR_MenuOptions'))

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Market Intelligence_Menu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/div_Commodity'), 0)

WebUI.click(findTestObject('Page_Collect It Right/a_CIR_MenuOptions'))

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Admin_Menu'))

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Users'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_All Users_TabName'), 0)

WebUI.click(findTestObject('Page_Collect It Right/a_CIR_MenuOptions'))

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Admin_Menu'))

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Customers_Menu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_All Customers_TabName'), 0)

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_CIR_MenuOptions'))

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Admin_Menu'))

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_AML Alignment_Menu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Collect It Right/a_AML Table_TabName'), 0)

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/span_Welcome Thangasumathy Jayakumar'))

WebUI.click(findTestObject('Object Repository/Page_Collect It Right/a_Logout'))

