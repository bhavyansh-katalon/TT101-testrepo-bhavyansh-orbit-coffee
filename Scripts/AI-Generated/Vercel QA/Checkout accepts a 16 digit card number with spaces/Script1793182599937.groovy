import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Vercel_QA.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1252, 836)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-demo-shop.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on link cart -> Navigate to page '/cart'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_home/link_cart'))

"Step 3: Click on link home -> Navigate to page '/index'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_home'))

"Step 4: Click on button addTeaToCart (addAssamMorningToCart)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_index/button_addTeaToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_index/button_addTeaToCart', ['button_addTeaToCart_DataTestid_1': button_addTeaToCart_DataTestid, 'button_addTeaToCart_css_value_1': button_addTeaToCart_css_value]))

"Step 5: Click on button addTeaToCart (addDarjeelingFirstFlushToCart)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_index/button_addTeaToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_index/button_addTeaToCart', ['button_addTeaToCart_DataTestid_1': button_addTeaToCart_DataTestid_1, 'button_addTeaToCart_css_value_1': button_addTeaToCart_css_value_1]))

"Step 6: Click on link cart -> Navigate to page '/cart'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_index/link_cart'))

"Step 7: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_goToCheckout'))

"Step 8: Double-click on input email"

WebUI.doubleClick(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_email'))

"Step 9: Click on input email"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_email'))

"Step 10: Enter input value in input email"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_email'), input_email)

"Step 11: Click on input streetAddress"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'))

"Step 12: Enter input value in input streetAddress"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'), input_streetAddress)

"Step 13: Click on input city"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_city'))

"Step 14: Enter input value in input city"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_city'), input_city)

"Step 15: Click on input pinCode"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'))

"Step 16: Enter input value in input pinCode"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'), input_pinCode)

"Step 17: Click on input cardNumber"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_cardNumber'))

"Step 18: Enter input value in input cardNumber"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_cardNumber'), input_cardNumber)

"Step 19: Click on input fullName"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'))

"Step 20: Enter input value in input fullName"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'), input_fullName)

"Step 21: Click on button placeOrder -> Navigate to page '/confirmation'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/button_placeOrder'))

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('Checkout accepts a 16 digit card number with spaces_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}