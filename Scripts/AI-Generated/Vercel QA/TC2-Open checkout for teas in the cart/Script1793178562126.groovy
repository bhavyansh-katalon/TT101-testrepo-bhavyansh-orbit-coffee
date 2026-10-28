import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Vercel_QA.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1911, 932)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-demo-shop.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on link browseAllTeas -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_home/link_browseAllTeas'))

"Step 3: Click on button addToCart (addToCartAssamMorning)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid, 'button_addToCart_css_value_1': button_addToCart_css_value]))

"Step 4: Click on button addToCart (addToCartDarjeelingFirstFlush)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_1, 'button_addToCart_css_value_1': button_addToCart_css_value_1]))

"Step 5: Click on link cart (cart2) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart', ['link_cart_InternalRoleLinkName_1': link_cart_InternalRoleLinkName, 'link_cart_css_value_1': link_cart_css_value]))

"Step 6: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_goToCheckout'))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Open checkout for teas in the cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}