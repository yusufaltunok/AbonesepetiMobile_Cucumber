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

    @AndroidFindBy(id = "new UiSelector().text(\"Abonelik başlat\")")
    public WebElement abonelikBaslat;
    @AndroidFindBy(id = "com.abonesepeti.app:id/user_request_item_container")
    public List<WebElement> abonelikTipiListesi;
    @AndroidFindBy(id = "com.abonesepeti.app:id/user_request_item_container")
    public WebElement titleTv;
    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_list_title")
    public WebElement sizeOzelFirsatlarListTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.abonesepeti.app:id/star_container_view\").instance(0)")
    public WebElement sizeOzelFirsatlarStarImage;

    @AndroidFindBy(id = "com.abonesepeti.app:id/rv_products")
    public List<WebElement> tvAndYayinList;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_next")
    public  WebElement tvPremium1AylikSatinAlButton;

    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_product_owner_name")
    public  WebElement urunDetayiTV;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_next")
    public  WebElement urunDetayiTvPlusSatinAlButton;
    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_fragment_title")
    public  WebElement yeniAbonelikTitle;
    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_next")
    public  WebElement yeniAbonelikDevamEtButton;





    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Aboneliklerini Sorgula\")")
    public WebElement abonelikleriniSorgula;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Adıma kayıtlı aboneliklerimi nasıl öğrenirim?\")")
    public WebElement abonelikleriniSorgulaDogrulama;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"E-Devlet’e Git\")")
    public WebElement edevlet;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android." +
            "widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.webkit.WebView")
    public WebElement edevletDogrula;

}
