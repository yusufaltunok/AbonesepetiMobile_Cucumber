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


    @AndroidFindBy(className="android.widget.EditText")
    public List<WebElement> textBoxList;

    @AndroidFindBy(id="com.abonesepeti.app:id/btn_login")
    public WebElement girisYapButton;



}
