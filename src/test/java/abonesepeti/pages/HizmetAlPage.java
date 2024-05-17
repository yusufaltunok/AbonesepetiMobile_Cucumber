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

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Tüm İşlemler\")")
    public WebElement tumIslemler;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android." +
            "view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget." +
            "LinearLayout[1]/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[4]/android.widget.ImageView")
    public WebElement gelecegimbutton;

    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_fragment_title")
    public WebElement gelecegimdogrulama;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android." +
            "widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android" +
            ".view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget." +
            "LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView")
    public WebElement ustaEmeklilikPlani;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.abonesepeti.app:id/profile_fragment_container\")")
    public WebElement hizmetAl;
    @AndroidFindBy(id = "com.abonesepeti.app:id/btnContinue")
    public WebElement satinAldogrulama;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.abonesepeti.app:id/my_future\")")
    public WebElement anadoluHayatGelecegim;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.LinearLayout\").instance(24)")
    public WebElement cocugumIcinEgitimSigortasi;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.abonesepeti.app:id/category_container_view\").instance(6)")
    public WebElement tamKapsamliHayatSigortasi;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tam Kapsamlı Hayat Sigortası\")")
    public WebElement hayatSigortasiSayfasi;

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
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Ferdi Kaza Sigortası\")")
    public WebElement ferdiKazaSigortasi;

    @AndroidFindBy(id="com.abonesepeti.app:id/txt_title")
    public WebElement gencEmeklilikPlaniDogrula;

    @AndroidFindBy(id="com.abonesepeti.app:id/btnContinue")
    public WebElement satinAlGencEmeklilik;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.LinearLayout\").instance(26)")
    public WebElement StandartKritikHastalikSigortasi;

    @AndroidFindBy(id="com.abonesepeti.app:id/img_header")
    public WebElement StandartKritikHastalikAigortaSayfasi;

    @AndroidFindBy(id="com.abonesepeti.app:id/btnContinue")
    public WebElement SatinAlStandartKritikHastalikSigortasi;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.abonesepeti.app:id/txtTitle\" and @text=\"Kadına Özel Kritik Hastalık Sigortası\"]")
    public WebElement KadinaOzelKritikHastalikSigortasiSekmesi;

    @AndroidFindBy(id="com.abonesepeti.app:id/txt_title")
    public  WebElement KadinaOzelKritikHastalikSigortasiSayfasi;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Ev Hanımları Emeklilik Planı\")")
    public WebElement EvHanimlariEmeklilikPlani;
    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_title")
    public WebElement EvHanimlariEmeklilikPlaniTitle;
    @AndroidFindBy(id = "com.abonesepeti.app:id/btnContinue")
    public WebElement EvHanimlariEmeklilikPlaniSatinAlButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement EvHanimlariEmeklilikMusteriTcNo;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement EvHanimlariEmeklilikSifre;

  @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Çocuğum için BES\")")
  public WebElement cocugumIcinBES;


  @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Geleceğe Yatırım Planı\")")
  public WebElement GelecegeYatırımPlaniSekmesı;

  @AndroidFindBy(id="com.abonesepeti.app:id/txt_title")
  public WebElement GelecegeYatırımPlaniSayfasınıDogrula;

  @AndroidFindBy(id = "com.abonesepeti.app:id/img_header")
  public WebElement cocugumIcinBESDogrula;





}
