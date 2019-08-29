import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\vgmahale\\Downloads\\1BCA_NON_PROD_4.2.7.2.apk', false)

not_run: Mobile.tap(findTestObject('Mobile/android.widget.RadioButton0 - Freelancer'), 0)

not_run: Mobile.setText(findTestObject('Mobile/android.widget.EditText0 - E-mail Address'), findTestData('Mobile login/1BCA login').getValue(
        1, 1), 0)

not_run: Mobile.tap(findTestObject('Mobile/android.widget.Button0 - REGISTER'), 0)

Mobile.setText(findTestObject('Mobile/android.widget.EditText0 - Password'), findTestData('Mobile login/1BCA login').getValue(
        2, 1), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - LOGIN (1)'), 0)

WebUI.delay(GlobalVariable.Delay)

not_run: Mobile.tap(findTestObject('Mobile/android.widget.Button0 - ACCEPT'), 0)

not_run: WebUI.delay(GlobalVariable.Delay)

not_run: Mobile.setText(findTestObject('Mobile/android.widget.EditText0 (2)'), findTestData('Mobile login/1BCA login').getValue(
        3, 1), 0)

not_run: Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - Accept'), 0)

WebUI.delay(GlobalVariable.Delay)

WebUI.delay(GlobalVariable.Delay)

Mobile.tap(findTestObject('Mobile/Text - TO Do List'), 0)

