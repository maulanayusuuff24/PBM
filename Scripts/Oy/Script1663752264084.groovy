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

WebUI.navigateToUrl('https://www.pijarbelajar.id/')

WebUI.click(findTestObject('Object Repository/Blog new/Page_Pijar Belajar/a_Blog'))

WebUI.click(findTestObject('Object Repository/Blog new/Page_Pijar Belajar - Article/p_Sistem Pencernaan Manusia berdasarkan Uru_c2d8fa'))

WebUI.click(findTestObject('Object Repository/Blog new/Page_Sistem Pencernaan Manusia berdasarkan _8dc795/img_Masuk_z-1 pt-2 mdpt-2 cursor-pointer w-_c1f7dd_1'))

WebUI.switchToWindowTitle('Twitter')

WebUI.setText(findTestObject('Object Repository/Blog new/Page_Twitter/input_Phone, email, or username_sessionuser_4e44e8'), 
    'maulana_yus')

WebUI.click(findTestObject('Object Repository/Blog new/Page_Twitter/div_Phone, email, or username_css-1dbjc4n r_655147'))

WebUI.click(findTestObject('Blog new/Page_Twitter/div_Password'))

WebUI.setText(findTestObject('Blog new/Page_Twitter/input_Password_sessionpassword'), 'pororo1')

