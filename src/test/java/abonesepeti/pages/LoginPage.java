package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }


    @AndroidFindBy(id="com.abonesepeti.app:id/btn_login_with_email")
    public WebElement girisYap;

    @AndroidFindBy(id="com.abonesepeti.app:id/btn_login_with_email")
    public WebElement e_Posta;

    @AndroidFindBy(id="com.abonesepeti.app:id/btn_login_with_phone")
    public WebElement telefon;

    @AndroidFindBy(id="com.abonesepeti.app:id/btn_login")
    public WebElement girisYapButton;

    @AndroidFindBy(id="com.abonesepeti.app:id/btn_forget_password")
    public WebElement sifremiUnuttum;

    @AndroidFindBy(className="android.widget.EditText")
    public List<WebElement> textBoxList; // e-posta ve şifre

    @AndroidFindBy(id="com.abonesepeti.app:id/btndDismissDialog")
    public WebElement tamam;



}
