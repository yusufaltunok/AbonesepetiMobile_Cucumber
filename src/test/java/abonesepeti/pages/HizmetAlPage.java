package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static abonesepeti.utilities.Driver.driver;

public class HizmetAlPage extends ReusableMethods {
    List<String> konumlar = new ArrayList<>();
    Random random = new Random();
    /*
    KeyEvent enter=new KeyEvent(AndroidKey.ENTER);
    KeyEvent down = new KeyEvent(AndroidKey.DPAD_DOWN);

     */

    public HizmetAlPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tüm İşlemler\")")
    public WebElement tumIslemler;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." + "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android." + "view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget." + "LinearLayout[1]/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[4]/android.widget.ImageView")
    public WebElement gelecegimbutton;

    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_fragment_title")
    public WebElement gelecegimdogrulama;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android." + "widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android" + ".view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget." + "LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView")
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
    @AndroidFindBy(className = "android.webkit.WebView")
    public WebElement anadoluHayatEmeklilikDogrulama;
    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_title")
    public WebElement ferdiKazaSigortasiDogrulama;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Geleceğim\")")
    public WebElement gelecegim;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Genç Emeklilik Planı\")")
    public WebElement gencEmeklilikPlani;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Ferdi Kaza Sigortası\")")
    public WebElement ferdiKazaSigortasi;

    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_title")
    public WebElement gencEmeklilikPlaniDogrula;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btnContinue")
    public WebElement satinAlGencEmeklilik;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.LinearLayout\").instance(26)")
    public WebElement StandartKritikHastalikSigortasi;

    @AndroidFindBy(id = "com.abonesepeti.app:id/img_header")
    public WebElement StandartKritikHastalikAigortaSayfasi;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btnContinue")
    public WebElement SatinAlStandartKritikHastalikSigortasi;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.abonesepeti.app:id/txtTitle\" and @text=\"Kadına Özel Kritik Hastalık Sigortası\"]")
    public WebElement KadinaOzelKritikHastalikSigortasiSekmesi;

    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_title")
    public WebElement KadinaOzelKritikHastalikSigortasiSayfasi;

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
    public WebElement GelecegeYatirimPlaniSekmesi;

    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_title")
    public WebElement GelecegeYatirimPlaniSayfasiniDogrula;

    @AndroidFindBy(id = "com.abonesepeti.app:id/img_header")
    public WebElement cocugumIcinBESDogrula;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.abonesepeti.app:id/txt_header_button\" and @text=\"Sigorta Teklifi \n" + "Al\"]")
    public WebElement SigortaTeklifiAl;

    @AndroidFindBy(xpath="//android.widget.ScrollView[@resource-id=\"com.abonesepeti.app:id/scroll_view\"]/android.widget.LinearLayout")
    public WebElement SigortaKateegorisiSec;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"DASK SİGORTASI\"]")
    public WebElement DaskSigortasiGirisSayfasi;

    @AndroidFindBy(xpath = "//*[@text='Araç Kirala']")
    public WebElement aracKiralaButonu;

    @AndroidFindBy(id = "com.abonesepeti.app:id/car_pick_up")
    public WebElement neredenAlacaksinTextBox;

    @AndroidFindBy(id = "com.abonesepeti.app:id/locationName")
    public WebElement aracAlisKonum;

    @AndroidFindBy(xpath = "//*[@text='Konum ara']")
    public WebElement konumAraTextBox;
    @AndroidFindBy(id = "com.abonesepeti.app:id/cb_item_check_status")
    public WebElement farkliBirYerdeBirakOnayKutusu;

    @AndroidFindBy(id = "com.abonesepeti.app:id/car_drop")
    public WebElement nereyebirakacaksinizTextBox;

    @AndroidFindBy(id = "com.abonesepeti.app:id/locationName")
    public WebElement aracBirakmaKonum;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.abonesepeti.app:id/purchase_date_edit_text\"]")
    public WebElement alisTarihiTextBox;
    @AndroidFindBy(id = "android:id/next")
    public WebElement ayIlerletme;

    @AndroidFindBy(xpath = "//*[@text='SEÇ']")
    public WebElement takvimSecButon;

    @AndroidFindBy(xpath = "//*[@text='Bırakış Tarihi']")
    public WebElement birakistarihiTextBox;


    @AndroidFindBy(id = "com.abonesepeti.app:id/btnContinue")
    public WebElement eniyiFiyatiBulButon;

    public WebElement aracAlisTarihi;
    public WebElement aracBirakisTarihi;
    @AndroidFindBy(id = "com.abonesepeti.app:id/recycler_view")
    public List<WebElement> aracKiralamaListesi;
    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.abonesepeti.app:id/ll_car_details_row\"])[1]")
    public WebElement kiralikAracUrun;
    @AndroidFindBy(id = "com.abonesepeti.app:id/tv_fuel_type")
    public WebElement yakitTipi;

    @AndroidFindBy(id = "com.abonesepeti.app:id/tv_gear_type")
    public WebElement vitesTipi;
    @AndroidFindBy(xpath = "//*[@text='Devam Et']")
    public WebElement urunDevametButon;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_back")
    public WebElement urunIciBackButon;
    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_car_number")
    public WebElement listelenenAracSayisi;

    @AndroidFindBy(xpath = "//*[@text=\"Tester Ali\"]")
    public WebElement surucuAdTextBox;
    @AndroidFindBy(xpath = "//*[@text='Adres bilgileri giriniz']")
    public WebElement surucuAdresiTextBox;
    @AndroidFindBy(xpath = "//*[@text='İl']")
    public WebElement surucuIlTextBox;
    @AndroidFindBy(xpath = "//*[@text='İlçe']")
    public WebElement surucuIlceTextBox;
    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_total_price") //com.abonesepeti.app:id/txt_total_amount
    public WebElement aracKiralamaTutari;
    @AndroidFindBy(id = "com.abonesepeti.app:id/edt_full_name_input")
    public WebElement krediKartiIsim;
    @AndroidFindBy(id = "com.abonesepeti.app:id/edt_card_number")
    public WebElement kartNumarasi;

    @AndroidFindBy(id = "com.abonesepeti.app:id/edt_card_expiration_month")
    public WebElement kartKullanimAy;
    @AndroidFindBy(id = "com.abonesepeti.app:id/edt_card_expiration_year")
    public WebElement kartKullanimYil;
    @AndroidFindBy(id = "com.abonesepeti.app:id/edt_card_cvv")
    public WebElement kartCVVKodu;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btnContinue")
    public WebElement odemeYapButon;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tamam\")")
    public WebElement aracBulunamadiTamamButon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")
    public WebElement kiralikAracTamSayfa;

    @AndroidFindBy(id = "com.abonesepeti.app:id/recycler_view")
    public WebElement aracKiralaTamSayfa;


    public WebElement getAlisTarihiSec(String tarih) {

        alisTarihiTextBox.click();

        while (!Driver.driver.findElement(By.id("android:id/date_picker_header_date")).getText().contains(tarih.substring(3, 6))) {

            ayIlerletme.click();
            Driver.driver.findElement(By.xpath("//*[@text='1']")).click();

        }
        aracAlisTarihi = Driver.driver.findElement(By.xpath("//*[@content-desc='" + tarih + " 2024']"));

        return aracAlisTarihi;

    }


    public WebElement getBirakisTarihiSec(String tarih) {

        birakistarihiTextBox.click();

        while (!Driver.driver.findElement(By.id("android:id/date_picker_header_date")).getText().contains(tarih.substring(3, 6))) {

            ayIlerletme.click();
            Driver.driver.findElement(By.xpath("//*[@text='1']")).click();

        }
        aracBirakisTarihi = Driver.driver.findElement(By.xpath("//*[@content-desc='" + tarih + " 2024']"));
        return aracBirakisTarihi;

    }

    public void kiralikAracGoruntuleme() {

        String listenenAracSayisi = listelenenAracSayisi.getText().replaceAll("\\D","");
        int aracListe = Integer.parseInt(listenenAracSayisi);
        int flag = 0;

        for (int i = 1; i <= 3; i++) {

            Assert.assertTrue(Driver.driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.abonesepeti.app:id/ll_car_details_row\"])[" + i + "]")).isDisplayed());
            flag++;

            if (i % 3 == 0) {

                scrollGesture(driver, kiralikAracTamSayfa, "down", 1, 1500);

                i = 0;
                if (flag >= aracListe) {
                    break;
                }
            }


        }
        System.out.println("Listelenen Arac Sayisi ="+aracListe);
        System.out.println("Flag = "+flag);


        for (int i = 0; i <= aracListe; i++) {
            scrollGesture(driver, aracKiralaTamSayfa, "up", 1, 2000);
            i += 3;


        }


    }


    public void aracSecme(String yakit, String vites) {

        String listenenAracSayisi = listelenenAracSayisi.getText().replaceAll("\\D","");

        int aracListe = Integer.parseInt(listenenAracSayisi);

        int flag=0;

        for (int i = 1; i < 4; i++) {
            Driver.driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.abonesepeti.app:id/ll_car_details_row\"])[" + i + "]")).click();
            bekle(2);


            if (yakitTipi.getText().contains(yakit) && vitesTipi.getText().contains(vites)) {

                urunDevametButon.click();
                break;

            } else {

                urunIciBackButon.click();

                if (i % 3 == 0) {

                    scrollGesture(driver, kiralikAracUrun, "down", 5, 1500);

                    bekle(2);

                    i = 0;
                    if (flag >= aracListe) {
                        System.out.println("======Aradiginiz ozelliklerde arac bulunamamistir======");
                        break;
                    }

                }
            }

        }

    }


    public void lokasyonSecmeFarkliKonum() {


        konumlar.add("Bursa");
        konumlar.add("Sivas");
        konumlar.add("Manisa");
        konumlar.add("Çanakkale");
        konumlar.add("Ankara");
        konumlar.add("Adana");
        konumlar.add("Van");
        konumlar.add("Erzurum");
        konumlar.add("Rize");
        konumlar.add("Antalya");

        int randomIndex = random.nextInt(konumlar.size());
        String randomSehir = konumlar.get(randomIndex);

        neredenAlacaksinTextBox.click();
        konumAraTextBox.sendKeys(randomSehir);
        aracAlisKonum.click();
        nereyebirakacaksinizTextBox.click();
        konumAraTextBox.sendKeys(randomSehir);
        aracAlisKonum.click();
        eniyiFiyatiBulButon.click();

    }

    public void lokasyonSecmeAyniKonum() {


        konumlar.add("Sivas");
        konumlar.add("Manisa");
        konumlar.add("Çanakkale");
        konumlar.add("Ankara");
        konumlar.add("Aydın");
        konumlar.add("Balıkesir");
        konumlar.add("Van");
        konumlar.add("Erzurum");
        konumlar.add("Rize");
        konumlar.add("Trabzon");

        int randomIndex = random.nextInt(konumlar.size());
        String randomSehir = konumlar.get(randomIndex);


        neredenAlacaksinTextBox.click();
        konumAraTextBox.sendKeys(randomSehir);
        aracAlisKonum.click();
        eniyiFiyatiBulButon.click();


    }
//Us38--------------------------------------------- ☺
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Dergi Aboneliğini Başlat\")")
    public WebElement dergiAboneligiBaslat;

    @AndroidFindBy(className = "android.widget.Button")
    public List <WebElement> dergiFirstButton; //for cokie

    @AndroidFindBy(className = "android.widget.Image")
    public List <WebElement> dergiSepet; //dergi sepeti get(2)
    @AndroidFindBy(className = "android.widget.Image")
    public List <WebElement> dergiOdemeyeGit; //dergi sepeti get(9)

    @AndroidFindBy(className = "android.widget.EditText")
    public List <WebElement> dergi444HesabaGiris; //dergi giris mail and pass get(0-1)

    @AndroidFindBy(className = "android.widget.TextView")
    public List <WebElement> dergiAdresGirisi; //

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Adres Ekle\")")
    public WebElement dergiAdresEkle;

    @AndroidFindBy(className = "android.widget.EditText")
    public List <WebElement> dergi444KartNo;



    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Mesafeli Satış Sözleşmesi\")")
    public WebElement dergiMesafeliSatisSozlesme;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Ödemeye devam et\")")
    public WebElement dergiOdemeyeDevamEtButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Anasayfaya geri dön\")")
    public WebElement dergiAnasayfayaDön;
    //Us38------------------------------- ☻







}