package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilPage extends ReusableMethods {
    public ProfilPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Ödeme geçmişi bulunmamaktadır.\")")
    public WebElement odemeGecmisiDogrula;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Ödeme - İşlem Geçmişi\")")
    public WebElement odemeGecmisi;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_back")
    public WebElement back_button;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Kişisel bilgiler\")")
    public WebElement kisisel_bilgiler_title;

    @AndroidFindBy(className = "android.widget.EditText")
    public List <WebElement> kisiselBilgiler;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Çıkış Yap\")")
    public WebElement cikisyap;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Evet\")")
    public WebElement evet;


    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/btn_personal_information\")")
    public WebElement kisisel_bilgiler_button;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Bize Ulaşın\")")
    public WebElement bizeUlasin_button;

    @AndroidFindBy(id = "com.abonesepeti.app:id/edtExplanation_text")
    public WebElement açıklama_textbox;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btnContinue")
    public WebElement button_Gonder_Bize_Ulasin;

    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_message_custom_dialog")
    public WebElement GeribildirimMesaji_text;
    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_positive_custom_dialog")
    public WebElement geriBildirimMesaji_Tamam_Button;














}

