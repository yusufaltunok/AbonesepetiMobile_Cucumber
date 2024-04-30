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

//    @AndroidFindBy(id = "com.abonesepeti.app:id/imgProfile")
//    public WebElement profil;
//
//    @AndroidFindBy(id = "com.abonesepeti.app:id/btnNotifications")
//    public WebElement bildirim;
//
//    @AndroidFindBy(id="com.abonesepeti.app:id/btnHomes_1")
//    public List <WebElement> abonelikEkle ;
//
//    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Yeni Abonelik\")")
//    public WebElement yeniAbonelik;
//
//    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Kolay İptal\")")
//    public WebElement kolayIptal;
//
//    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Fatura Ödeme\")")
//    public WebElement faturaOdeme;
//
//    @AndroidFindBy(id="com.abonesepeti.app:id/expandHeaderButtons")
//    public WebElement tumIslemler;
//
//    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Cebe TL (Yakında)\")")
//    public WebElement cebeTLYakinda;
//
//    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Araç Kirala\")")
//    public WebElement aracKirala;
//
//    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Sigorta Teklifi Al \")")
//    public WebElement sigortaTeklifiAl;
//
//    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Geleceğim\")")
//    public WebElement gelecegim;
//
//    @AndroidFindBy(id="com.abonesepeti.app:id/expandHeaderButtons")
//    public WebElement kapat;
//
//    @AndroidFindBy(id = "com.abonesepeti.app:id/manage_fragment_container")
//    public WebElement abonesepetiButton;
//
//    @AndroidFindBy(id = "com.abonesepeti.app:id/home_fragment_container")
//    public WebElement aboneliklerButton;
//
//    @AndroidFindBy(id = "com.abonesepeti.app:id/transactions_fragment_container")
//    public WebElement islemlerButton;
//
//    @AndroidFindBy(id = "com.abonesepeti.app:id/campaigns_fragment_container")
//    public WebElement kampanyalarButton;
//
//    @AndroidFindBy(id = "com.abonesepeti.app:id/profile_fragment_container")
//    public WebElement yonetButton;
//
//    @AndroidFindBy(className = "android.widget.LinearLayout")
//    public List <WebElement> haneler;
//
//    @AndroidFindBy(id = "com.abonesepeti.app:id/imgPhoto")
//    public WebElement kampanyalarResim;

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












}

