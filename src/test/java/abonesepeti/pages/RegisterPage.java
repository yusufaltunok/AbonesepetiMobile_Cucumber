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

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"ATLA\")")
    public WebElement atla;

    @AndroidFindBy(id = ("com.abonesepeti.app:id/btn_login_with_google"))
    public WebElement googleIcon;

    @AndroidFindBy(xpath = ("(//android.widget.LinearLayout[@resource-id=\"com.google.android.gms:id/container\"])[1]/android.widget.LinearLayout"))
    public WebElement googleHesapSec;

    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_message_custom_dialog") // Girmiş olduğunuz  telefon numarasına ait üyelik bulunmaktadır.
    public WebElement hataMsg;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_login_with_google")
    public WebElement googleIkon;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_sign_up")
    public WebElement yeniHesapOlustur;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Ad\")")
    public WebElement ad;

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

    @AndroidFindBy(id = "com.abonesepeti.app:id/edt_birthdate")
    public WebElement dogumTarihi;

    @AndroidFindBy(id = "android:id/date_picker_header_year")
    public WebElement header_year_click;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"1988\")")
    public WebElement dogum_yili;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/next\")")
    public WebElement next_month;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"24\")")
    public WebElement select_day;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
    public WebElement click_ok;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.abonesepeti.app:id/btnContinue\")")
    public WebElement kaydet_degisiklikler;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.abonesepeti.app:id/cv_tc_number_container\")")
    public WebElement tc_textbox;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"55510591258\")")
    public WebElement tc_dogrula;

    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_message_custom_dialog")
    public WebElement hataMesaji;    // Eksik veya hatalı bilgi gönderdiniz.

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Tamam\")")
    public WebElement tamam;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Geçerli bir mail adresi giriniz.\")")
    public WebElement gecersizMailMesaji;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Şifre en az 6 en fazla 16 karakterden oluşmalıdır\")")
    public WebElement gecersizSifreMesaji;

    @AndroidFindBy(className = "com.abonesepeti.app:id/txt_message_custom_dialog")
    public WebElement googleHesap;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"BAŞLA\")")
    public WebElement basla;

    @AndroidFindBy(id = "com.abonesepeti.app:id/cb_platform")
    public List <WebElement> baslatKurumCheckbox; // Giriş ekranındaki kurumların checkbox'ları

    @AndroidFindBy(id="com.abonesepeti.app:id/ll_platform")
    public WebElement telefon;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"DEVAM ET\")")
    public WebElement devamEtButton; // Girişte kurum seçtikten sonraki

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"KAYDET\")")
    public WebElement kaydet;

    @AndroidFindBy(id = "com.abonesepeti.app:id/radio_temel")
    public List <WebElement> abonelikPaketleri;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Sonra\")")
    public WebElement bildirimIzniSonra;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"İzin Ver\")")
    public WebElement bildirimIzinVer;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Telefon Numaranız\")")
    public WebElement telefonNumaraniz;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Ad Soyad\")")
    public WebElement adSoyad;  //yeni giriş ekranı

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"E-posta\")")
    public WebElement e_Posta; //yeni giriş ekranı

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Devam Et\")")
    public WebElement DevamEt; //yeni giriş ekranı



}
