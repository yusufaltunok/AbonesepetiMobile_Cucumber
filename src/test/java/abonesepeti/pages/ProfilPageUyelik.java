package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilPageUyelik extends ReusableMethods {
    public ProfilPageUyelik() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.abonesepeti.app:id/imgProfile")
    public WebElement profil;
    //---------------------------------Profil_Page_Uyelik----------------------------------------//
    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_membership")
    public WebElement uyelik;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Üyelik Planı\")")
    public WebElement uyelikPlaniTitle;
    @AndroidFindBy(id = "com.abonesepeti.app:id/linear_layout_free")
    public WebElement free;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Free\")")
    public WebElement freeYazisi;
    @AndroidFindBy(id = "com.abonesepeti.app:id/btnVector_free")
    public List<WebElement> freeOzellikler;
    @AndroidFindBy(id = "com.abonesepeti.app:id/linear_layout_pro")
    public WebElement proAylik;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pro Aylık\")")
    public WebElement proAylikYazisi;
    @AndroidFindBy(id = "com.abonesepeti.app:id/btnVector_free")
    public List<WebElement> proAylikOzellikler;
    @AndroidFindBy(id = "com.abonesepeti.app:id/linear_layout_plus")
    public WebElement proYillik;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pro Yıllık\")")
    public WebElement proYillikYazisi;
    @AndroidFindBy(id = "com.abonesepeti.app:id/btnVector_free")
    public List<WebElement> proYillikOzellikler;
    @AndroidFindBy(id = "com.abonesepeti.app:id/btnContinue")
    public WebElement satinAl;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Redeem code\")")
    public WebElement redeemCodeButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add credit or debit card\")")
    public WebElement addCreditCardButton;
    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement enterCode;
    @AndroidFindBy(className = "Locate-Yok!")
    public WebElement termsAndCondtions;
    @AndroidFindBy(className = "android.widget.Button")
    public WebElement redeemButton;
















}

