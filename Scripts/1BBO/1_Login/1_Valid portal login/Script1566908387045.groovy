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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(5)

WebUI.setText(findTestObject('Web Portal/input_Nielsen Answers Login_USER'), findTestData(
        'Login credentials/Valid login').getValue(1, 1))

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Web Portal/input_Nielsen Answers Login_PASSWORD'), 
    'p4y+y39Ir5N3jo6zvgRWTw==')

WebUI.click(findTestObject('Web Portal/button_Login'))

WebUI.closeBrowser()

Mobile.startApplication('C:\\Users\\vgmahale\\Downloads\\1BCA_NON_PROD_4.2.7.2.apk', true)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - LOGIN'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - Yes'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - OK'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.ImageView0 (1)'), 0)

Mobile.setText(findTestObject('Mobile/android.widget.EditText0 - ID'), '538458', 0)

Mobile.tap(findTestObject('Mobile/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - 53845881440'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - Start Audit'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - Store'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 -  9HERSHEYS COOKIESN CREME 6 BARRAS 30 GR CU  180 GR'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - ABARROTES'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - ABARROTES'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - PALLET'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - PALLET'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - BAJO'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.TextView0 - BAJO'), 0)

Mobile.tap(findTestObject('Mobile/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Mobile/android.widget.EditText0 (1)'), findTestData(null).getValue(1, 1), 0)

Mobile.tap(findTestObject('Mobile/android.view.View0'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/android.widget.Button0 - SaveValues'), 0)

Mobile.closeApplication()

