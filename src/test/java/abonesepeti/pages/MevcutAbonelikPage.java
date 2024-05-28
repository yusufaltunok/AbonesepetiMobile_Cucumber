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
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"hasanali\")")
    public WebElement abonelikIsim;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget." +
            "FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget." +
            "ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget." +
            "HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView")
    public WebElement sil;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Aboneliği Sil\")")
    public WebElement abonelikSilDogrula;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Devam Et\")")
    public WebElement devamEt;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Devam Et\")")
    public WebElement iptal;
}
