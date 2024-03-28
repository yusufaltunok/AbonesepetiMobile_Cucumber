package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends ReusableMethods {
    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }

    @AndroidFindBy(id = ("com.abonesepeti.app:id/btnSkip"))
    public WebElement atla;

    @AndroidFindBy(id="com.abonesepeti.app:id/btn_login_with_email")
    public WebElement girisYap;

    @AndroidFindBy(id="com.abonesepeti.app:id/btn_login_with_email")
    public WebElement e_Posta;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"E-posta\")")
    public WebElement e_PostaAdres;

    @AndroidFindBy(id="com.abonesepeti.app:id/btn_login_with_phone")
    public WebElement telefon;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Cep Telefonu\")")
    public WebElement cepTelefonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Şifre\")")
    public WebElement sifre;

    @AndroidFindBy(id="com.abonesepeti.app:id/btn_login")
    public WebElement girisYapButton;

    @AndroidFindBy(id="com.abonesepeti.app:id/btn_forget_password")
    public WebElement sifremiUnuttum;

    @AndroidFindBy(className="android.widget.EditText")
    public List<WebElement> textBoxList; // e-posta ve şifre

    @AndroidFindBy(id="com.abonesepeti.app:id/btndDismissDialog")
    public WebElement tamam;

    @AndroidFindBy(id="com.abonesepeti.app:id/imgProfile")
    public WebElement profil;



    public LoginPage girisYapTelefon (String phone, String password){
        atla.click();
        girisYap.click();
        telefon.click();
        cepTelefonu.sendKeys(phone);
        sifre.sendKeys(password);
        girisYapButton.click();
        if (tamam.isDisplayed()) {
            tamam.click();
        }
        return this;
    }

    public LoginPage girisYapEposta (String mail, String password){
        atla.click();
        girisYap.click();
        e_PostaAdres.sendKeys(mail);
        sifre.sendKeys(password);
        girisYapButton.click();
        if (tamam.isDisplayed()) {
            tamam.click();
        }
        return this;
    }






}
