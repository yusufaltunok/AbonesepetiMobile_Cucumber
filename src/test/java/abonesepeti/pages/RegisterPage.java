package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.abonesepeti.app:id/btnNext")
    public WebElement devamEt;

    @AndroidFindBy(id = ("com.abonesepeti.app:id/btnSkip"))
    public WebElement atla;

    @AndroidFindBy(id = ("com.abonesepeti.app:id/btn_login_with_google"))
    public WebElement googleIcon;

    @AndroidFindBy(xpath = ("(//android.widget.LinearLayout[@resource-id=\"com.google.android.gms:id/container\"])[1]/android.widget.LinearLayout"))
    public WebElement googleHesapSec;

    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_message_custom_dialog") // Girmiş olduğunuz  telefon numarasına ait üyelik bulunmaktadır.
    public WebElement hataMsg;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_sign_up")
    public WebElement yeniHesapOlustur;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement ad; // ad, soyad, cep telefonu, e-posta, şifre

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Soyad\")")
    public WebElement soyad;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Cep Telefonu\")")
    public WebElement cepTelefonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"E-Posta\")")
    public WebElement ePosta;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Şifre\")")
    public WebElement sifre;

    @AndroidFindBy(id = "com.abonesepeti.app:id/cb_terms")
    public WebElement sozlesmeCheckBox;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_login_with_google")
    public WebElement gmailIkon;

    @AndroidFindBy(id = "com.google.android.gms:id/continue_button")
    public WebElement gmailOlarakDevamEt;


}
