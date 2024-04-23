package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

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

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Abonelik Ekle\")")
    public WebElement abonelikEkle ;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Yeni Abonelik\")")
    public WebElement yeniAbonelik;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Kolay İptal\")")
    public WebElement kolayIptal;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Fatura Ödeme\")")
    public WebElement faturaOdeme;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Tüm İşlemler\")")
    public WebElement tumIslemler;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Cebe TL (Yakında)\")")
    public WebElement cebeTLYakinda;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Araç Kirala\")")
    public WebElement aracKirala;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Sigorta Teklifi Al \")")
    public WebElement sigortaTeklifiAl;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Geleceğim\")")
    public WebElement gelecegim;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Kapat\")")
    public WebElement kapat;

    @AndroidFindBy(accessibility = "Abonesepeti")
    public WebElement abonesepetiButton;

    @AndroidFindBy(accessibility = "Abonelikler")
    public WebElement aboneliklerButton;

    @AndroidFindBy(accessibility = "İşlemler")
    public WebElement IslemlerButton;

    @AndroidFindBy(accessibility = "Kampanyalar")
    public WebElement KampanyalarButton;

    @AndroidFindBy(accessibility = "Yönet")
    public WebElement YonetButton;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"55510591258\")")
    public WebElement tc_dogrula;











}

