package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HizmetAlPage {

    public HizmetAlPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.abonesepeti.app:id/profile_fragment_container\")")
    public WebElement hizmetAl;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.abonesepeti.app:id/my_future\")")
    public WebElement anadoluHayatGelecegim;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.LinearLayout\").instance(24)")
    public WebElement cocugumIcinEgitimSigortasi;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ScrollView\")")
    public WebElement cocukEgitimiBilgileri;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.abonesepeti.app:id/btnContinue\")")
    public WebElement satinAl_egitim;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"ahe-logo\")")
    public WebElement anadoluHayatEmeklilik;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Geleceğim\")")
    public WebElement gelecegim;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Genç Emeklilik Planı\")")
    public WebElement gencEmeklilikPlani;

    @AndroidFindBy(id="com.abonesepeti.app:id/txt_title")
    public WebElement gencEmeklilikPlaniDogrula;

    @AndroidFindBy(id="com.abonesepeti.app:id/btnContinue")
    public WebElement satinAlGencEmeklilik;




}
