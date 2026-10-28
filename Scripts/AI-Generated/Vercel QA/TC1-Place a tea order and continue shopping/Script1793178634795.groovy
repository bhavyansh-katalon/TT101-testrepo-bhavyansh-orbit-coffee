import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Vercel_QA.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1793, 181)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-demo-shop.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on link leafAndKettle -> Navigate to page '/index'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_home/link_leafAndKettle'))

"Step 3: Click on link browseAllTeas -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_index/link_browseAllTeas'))

"Step 4: Click on button addToCart (addToCartAssamMorning)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid, 'button_addToCart_css_value_1': button_addToCart_css_value]))

"Step 5: Click on button addToCart (addToCartDarjeelingFirstFlush)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_1, 'button_addToCart_css_value_1': button_addToCart_css_value_1]))

"Step 6: Click on article teaProduct (chamomileCalm)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/article_teaProduct"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/article_teaProduct', ['article_teaProduct_DataTestid_1': article_teaProduct_DataTestid, 'article_teaProduct_css_value_1': article_teaProduct_css_value]))

"Step 7: Click on button addToCart (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_2, 'button_addToCart_css_value_1': button_addToCart_css_value_2]))

"Step 8: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_3, 'button_addToCart_css_value_1': button_addToCart_css_value_3]))

"Step 9: Click on link logIn -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart', ['link_cart_InternalRoleLinkName_1': link_cart_InternalRoleLinkName, 'link_cart_css_value_1': link_cart_css_value]))

"Step 10: Login into Application"

TrueTestScripts.login()

"Step 11: Click on button addToCart (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_4, 'button_addToCart_css_value_1': button_addToCart_css_value_4]))

"Step 12: Click on article teaProduct (tulsiGinger)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/article_teaProduct"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/article_teaProduct', ['article_teaProduct_DataTestid_1': article_teaProduct_DataTestid_1, 'article_teaProduct_css_value_1': article_teaProduct_css_value_1]))

"Step 13: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCart', ['button_addToCart_DataTestid_1': button_addToCart_DataTestid_5, 'button_addToCart_css_value_1': button_addToCart_css_value_5]))

"Step 14: Click on link cart (cart) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart', ['link_cart_InternalRoleLinkName_1': link_cart_InternalRoleLinkName_1, 'link_cart_css_value_1': link_cart_css_value_1]))

"Step 15: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_goToCheckout'))

"Step 16: Click on input fullName"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'))

"Step 17: Enter input value in input fullName"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'), input_fullName)

"Step 18: Enter input value in input streetAddress"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'), input_streetAddress)

"Step 19: Enter input value in input city"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_city'), input_city)

"Step 20: Enter input value in input pinCode"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'), input_pinCode)

"Step 21: Enter input value in input pinCode"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'), input_pinCode_1)

"Step 22: Click on input cardNumber"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_cardNumber'))

"Step 23: Enter input value in input cardNumber"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_cardNumber'), input_cardNumber)

"Step 24: Click on button placeOrder -> Navigate to page '/confirmation'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/button_placeOrder'))

"Step 25: Click on link continueShopping -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_confirmation/link_continueShopping'))

"Step 26: Click on link leafAndKettle -> Navigate to page '/index'"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cart', ['link_cart_InternalRoleLinkName_1': link_cart_InternalRoleLinkName_2, 'link_cart_css_value_1': link_cart_css_value_2]))

"Step 27: Click on section teaCollection"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Page_index/section_teaCollection"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_index/section_teaCollection', ['section_teaCollection_nameRedacted': section_teaCollection_nameRedacted]))

"Step 28: Click on span userGreeting -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_index/span_userGreeting'))

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Place a tea order and continue shopping_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}