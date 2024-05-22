package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MevcutAbonelikPage  {
    public MevcutAbonelikPage() { PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);}


    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_home_fragment")
    public WebElement aboneliklerButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Telefon\")")
    public WebElement abonelikListeDogrulama;

}
