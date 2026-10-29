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

"Step 2: Click on link browseAllTeas -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_home/link_browseAllTeas'))

"Step 3: Click on button addToCart (addToCartAssamMorning)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid, 'button_addToCart_css_value_1': button_addToCart_css_value]))

"Step 4: Click on button addToCart (addToCartDarjeelingFirstFlush)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_1, 'button_addToCart_css_value_1': button_addToCart_css_value_1]))

"Step 5: Click on button addToCart (addToCartSenchaGreen)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_2, 'button_addToCart_css_value_1': button_addToCart_css_value_2]))

"Step 6: Click on button addToCart (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_3, 'button_addToCart_css_value_1': button_addToCart_css_value_3]))

"Step 7: Click on link shop"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart', ['link_cart_InternalRoleLinkName_1': link_cart_InternalRoleLinkName, 'link_cart_css_value_1': link_cart_css_value]))

"Step 8: Click on link leafAndKettle -> Navigate to page '/index'"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart', ['link_cart_InternalRoleLinkName_1': link_cart_InternalRoleLinkName_1, 'link_cart_css_value_1': link_cart_css_value_1]))

"Step 9: Click on link browseAllTeas -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_index/link_browseAllTeas'))

"Step 10: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_4, 'button_addToCart_css_value_1': button_addToCart_css_value_4]))

"Step 11: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_5, 'button_addToCart_css_value_1': button_addToCart_css_value_5]))

"Step 12: Click on button addToCart (addToCart4)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_6, 'button_addToCart_css_value_1': button_addToCart_css_value_6]))

"Step 13: Click on button addToCart (addToCartMasalaChai)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_7, 'button_addToCart_css_value_1': button_addToCart_css_value_7]))

"Step 14: Click on button addToCart (addToCart4)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_8, 'button_addToCart_css_value_1': button_addToCart_css_value_8]))

"Step 15: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_9, 'button_addToCart_css_value_1': button_addToCart_css_value_9]))

"Step 16: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_10, 'button_addToCart_css_value_1': button_addToCart_css_value_10]))

"Step 17: Click on main teaShop -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_shop/main_teaShop'))

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('Homepage displays featured teas and browse all teas navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}