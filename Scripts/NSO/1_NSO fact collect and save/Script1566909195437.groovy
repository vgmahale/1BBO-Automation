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

Mobile.startApplication('C:\\Users\\vgmahale\\Downloads\\1BCA_NON_PROD_4.2.7.2.apk', true)

Mobile.tap(findTestObject('Mobile/android.widget.RadioButton0 - Freelancer'), 0)

Mobile.setText(findTestObject('Mobile/android.widget.EditText0 - E-mail Address'), findTestData('Login credentials/Mobile login').getValue(
        1, 1), 0)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - REGISTER'), 0)

Mobile.setText(findTestObject('Mobile/android.widget.EditText0 - Password'), findTestData('Login credentials/Mobile login').getValue(
        2, 1), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - LOGIN (1)'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - ACCEPT'), 0)

WebUI.delay(GlobalVariable.Delay)

Mobile.setText(findTestObject('Mobile/android.widget.EditText0 (2)'), findTestData('Login credentials/Mobile login').getValue(
        3, 1), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - Accept'), 0)

WebUI.delay(GlobalVariable.Delay)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - TO Do List'), 0)

Mobile.tap(findTestObject('Mobile/Click filter'), 0)

Mobile.setText(findTestObject('Mobile/android.widget.EditText0 - ID'), '538458', 0)

Mobile.tap(findTestObject('Mobile/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - 53845881440'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - Start Audit'), 0)

WebUI.delay(GlobalVariable.Delay)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - Store'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 -  9HERSHEYS COOKIESN CREME 6 BARRAS 30 GR CU  180 GR'), 0)

result= Mobile.getText(findTestObject('Mobile/android.widget.TextView0 -  9HERSHEYS COOKIESN CREME 6 BARRAS 30 GR CU  180 GR'), 
    product_name)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - ABARROTES'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - ABARROTES'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - PALLET'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - PALLET'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - BAJO'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - BAJO'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Mobile/android.widget.EditText0 (1)'), findTestData('Login credentials/Collect fact').getValue(
        1, 1), 0)

Mobile.tap(findTestObject('Mobile/android.view.View0'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - SaveValues'), 0)

Mobile.closeApplication()

