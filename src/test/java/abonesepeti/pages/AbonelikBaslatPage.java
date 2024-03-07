package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class AbonelikBaslatPage {
    public AbonelikBaslatPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

}
