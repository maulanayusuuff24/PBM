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

Mobile.startApplication('C:\\Users\\Maulana Yusuf\\Downloads\\Pijar Belajar Develop v1.0.1-develop 12-12-2022 11.48.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Regist New/android.view.ViewGroup - Next 2'), 0)

Mobile.tap(findTestObject('Object Repository/Regist New/android.view.ViewGroup - Next 1'), 0)

Mobile.tap(findTestObject('Object Repository/Regist New/android.view.ViewGroup - Masuk'), 0)

Mobile.setText(findTestObject('Object Repository/Regist New/android.widget.EditText - Masukkan nomor handphoneemail kamu'), 
    'picuppy12@yopmail.com', 0)

Mobile.tap(findTestObject('Object Repository/Regist New/android.widget.TextView - Lanjutkan'), 30)

Mobile.setText(findTestObject('Object Repository/Regist New/android.widget.EditText -otp'), '', 60)

Mobile.setText(findTestObject('Object Repository/Regist New/android.widget.EditText - Masukkan nama lengkap (1)'), 'picuppy', 
    0)

Mobile.tap(findTestObject('Object Repository/Regist New/android.widget.TextView - Lanjutkan isi profil'), 0)

Mobile.tap(findTestObject('Object Repository/Regist New/android.view.ViewGroup - Close popup banner'), 0)

Mobile.tap(findTestObject('Object Repository/Regist New/android.widget.TextView - Kelas 9'), 0)

Mobile.tap(findTestObject('Object Repository/Regist New/android.widget.TextView - Simpan'), 0)

Mobile.getText(findTestObject('Object Repository/Regist New/android.widget.TextView - Mau belajar apa hari ini'), 0)

