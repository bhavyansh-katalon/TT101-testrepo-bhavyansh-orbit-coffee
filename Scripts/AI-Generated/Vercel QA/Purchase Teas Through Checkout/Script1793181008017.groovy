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

"Step 2: Click on link browseAllTeas -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_home/link_browseAllTeas'))

"Step 3: Click on button addToCart (addToCartDarjeelingFirstFlush)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid, 'button_addToCart_css_value_1': button_addToCart_css_value]))

"Step 4: Click on button addToCart (addToCartSenchaGreen)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_1, 'button_addToCart_css_value_1': button_addToCart_css_value_1]))

"Step 5: Click on button addToCart (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_2, 'button_addToCart_css_value_1': button_addToCart_css_value_2]))

"Step 6: Click on button addToCart (addToCartAssamMorning)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_3, 'button_addToCart_css_value_1': button_addToCart_css_value_3]))

"Step 7: Click on link cartFour -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart', ['link_cart_InternalRoleLinkName_1': link_cart_InternalRoleLinkName, 'link_cart_css_value_1': link_cart_css_value]))

"Step 8: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_goToCheckout'))

"Step 9: Click on input fullName"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'))

"Step 10: Enter input value in input fullName"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'), input_fullName)

"Step 11: Enter input value in input streetAddress"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'), input_streetAddress)

"Step 12: Enter input value in input city"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_city'), input_city)

"Step 13: Enter input value in input pinCode"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'), input_pinCode)

"Step 14: Enter input value in input pinCode"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'), input_pinCode_1)

"Step 15: Click on input cardNumber"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_cardNumber'))

"Step 16: Enter input value in input cardNumber"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_cardNumber'), input_cardNumber)

"Step 17: Click on button placeOrder -> Navigate to page '/confirmation'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/button_placeOrder'))

"Step 18: Click on link continueShopping -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_confirmation/link_continueShopping'))

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('Purchase Teas Through Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}