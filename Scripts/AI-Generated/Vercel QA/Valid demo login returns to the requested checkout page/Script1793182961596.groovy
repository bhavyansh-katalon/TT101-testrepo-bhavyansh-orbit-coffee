import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Vercel_QA.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1124, 836)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-demo-shop.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on link cart -> Navigate to page '/cart'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_home/link_cart'))

"Step 3: Click on link shop -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_shop'))

"Step 4: Click on button addToCart (addToCartDarjeelingFirstFlush)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid, 'button_addToCart_css_value_1': button_addToCart_css_value]))

"Step 5: Click on button addToCart (addToCartSenchaGreen)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_1, 'button_addToCart_css_value_1': button_addToCart_css_value_1]))

"Step 6: Click on link cartTwo -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart', ['link_cart_InternalRoleLinkName_1': link_cart_InternalRoleLinkName, 'link_cart_css_value_1': link_cart_css_value]))

"Step 7: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_goToCheckout'))

"Step 8: Click on link logOut -> Navigate to page '/index'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/link_logOut'))

"Step 9: Click on link logIn -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_index/link_logIn'))

"Step 10: Login into Application"

TrueTestScripts.login()

"Step 11: Click on link cartTwo -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart', ['link_cart_InternalRoleLinkName_1': link_cart_InternalRoleLinkName_1, 'link_cart_css_value_1': link_cart_css_value_1]))

"Step 12: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_goToCheckout'))

"Step 13: Double-click on input email"

WebUI.doubleClick(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_email'))

"Step 14: Click on input email"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_email'))

"Step 15: Click on button placeOrder -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/button_placeOrder'))

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('Valid demo login returns to the requested checkout page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}