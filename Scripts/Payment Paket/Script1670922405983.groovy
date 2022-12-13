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

Mobile.startApplication('C:\\Users\\Maulana Yusuf\\Downloads\\Pijar Belajar Develop v1.0.1-develop 13-12-2022 13.21.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Payment/android.view.ViewGroup - Puchase'), 0)

Mobile.scrollToText('Materi SMP')

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.TextView - Pilih Paket SMP'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.view.ViewGroup - Pilih Metode Pembayaran'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.TextView - BRI Virtual Account'), 0)

Mobile.scrollToText('Total Bayar')

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.TextView - Bayar (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.TextView - Cek Status Pembayaran'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/android.widget.TextView - Menunggu'), 0)

Mobile.closeApplication()

