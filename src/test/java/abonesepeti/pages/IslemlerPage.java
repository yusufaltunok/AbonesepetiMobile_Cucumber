package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IslemlerPage {
    public IslemlerPage () {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }


    @AndroidFindBy(xpath = "//*[@text='İşlemler']")
    public WebElement islemler;

    @AndroidFindBy(xpath = "//*[@text='Başvurularım']")
    public WebElement basvurularim;

    @AndroidFindBy(xpath = "//*[@text='Kolay İptal']")
    public WebElement kolayIptai;

    @AndroidFindBy(xpath = "//*[@text='Yeni Abonelik']")
    public WebElement yeniAbonelik;

    @AndroidFindBy(id = "com.abonesepeti.app:id/user_request_item_container")
    public List<WebElement> abonelikListesi;
}
