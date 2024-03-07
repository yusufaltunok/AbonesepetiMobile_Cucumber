package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ProfilPage {
    public ProfilPage (){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }
}
