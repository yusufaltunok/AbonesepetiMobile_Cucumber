package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilPage extends ReusableMethods {
    public ProfilPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.abonesepeti.app:id/imgProfile")
    public WebElement profil;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btnNotifications")
    public WebElement bildirim;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btnNotifications")
    public WebElement hane1;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Abonelik Ekle\")")
    public WebElement abonelikEkle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Yeni Abonelik\")")
    public WebElement yeniAbonelik;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Kolay İptal\")")
    public WebElement kolayIptal;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Fatura Ödeme\")")
    public WebElement faturaOdeme;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tüm İşlemler\")")
    public WebElement tumIslemler;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Cebe TL (Yakında)\")")
    public WebElement cebeTLYakinda;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Araç Kirala\")")
    public WebElement aracKirala;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"tester yusuf \")")
    public WebElement ad_dogrula;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"altunok\")")
    public WebElement soyad_dogrula;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"55510591258\")")
    public WebElement tc_dogrula;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"salvatore@12345.hkh\")")
    public WebElement email_dogrula;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.abonesepeti.app:id/edt_birthdate\")")
    public WebElement dogumtarihi_dogrula;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"(505) 677 16 25\")")
    public WebElement tlfn_dogrula;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(4)")
    public WebElement kisisel_bilgiler;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Kişisel bilgiler\")")
    public WebElement kisisel_bilgiler_title;
}