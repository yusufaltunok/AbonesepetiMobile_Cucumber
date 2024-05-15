package abonesepeti.pages;

import abonesepeti.utilities.Driver;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilPage extends ReusableMethods {
    public ProfilPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Ödeme geçmişi bulunmamaktadır.\")")
    public WebElement odemeGecmisiDogrula;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Ödeme - İşlem Geçmişi\")")
    public WebElement odemeGecmisi;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_back")
    public WebElement back_button;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Kişisel bilgiler\")")
    public WebElement kisisel_bilgiler_title;

    @AndroidFindBy(className = "android.widget.EditText")
    public List <WebElement> kisiselBilgiler;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Çıkış Yap\")")
    public WebElement cikisyap;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Evet\")")
    public WebElement evet;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/btn_personal_information\")")
    public WebElement kisisel_bilgiler_button;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/btn_delete_account\")")
    public WebElement hesabimiSil_button;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Yinede Sil\")")
    public WebElement yinedeSil_button;

    @AndroidFindBy(className="android.widget.EditText")
    public WebElement mevcutSifre_textbox;
  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/btn_continue_to_delete_account\")")
    public WebElement Sil_button_soru;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/btn_negative_custom_dialog\")")
    public WebElement Sil_button_bilgiMesaji;

    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.ScrollView\")")
    public WebElement profilPanel;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Bize Ulaşın\")")
    public WebElement bizeUlasin_button;

    @AndroidFindBy(id = "com.abonesepeti.app:id/edtExplanation_text")
    public WebElement aciklama_textbox;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btnContinue")
    public WebElement button_Gonder_Bize_Ulasin;

    @AndroidFindBy(id = "com.abonesepeti.app:id/txt_message_custom_dialog")
    public WebElement GeribildirimMesaji_text;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btn_positive_custom_dialog")
    public WebElement geriBildirimMesaji_Tamam_Button;



    @AndroidFindBy(id = "com.abonesepeti.app:id/imgProfile")
    public WebElement profil;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btnNotifications")
    public WebElement bildirim;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btnNotifications")
    public WebElement hane1;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Abonelik Ekle\")")
    public WebElement abonelikEkle ;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Yeni Abonelik\")")
    public WebElement yeniAbonelik;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Kolay İptal\")")
    public WebElement kolayIptal;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Fatura Ödeme\")")
    public WebElement faturaOdeme;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Tüm İşlemler\")")
    public WebElement tumIslemler;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Cebe TL (Yakında)\")")
    public WebElement cebeTLYakinda;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Araç Kirala\")")
    public WebElement aracKirala;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Sigorta Teklifi Al \")")
    public WebElement sigortaTeklifiAl;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Geleceğim\")")
    public WebElement gelecegim;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Kapat\")")
    public WebElement kapat;

    @AndroidFindBy(accessibility = "Abonesepeti")
    public WebElement abonesepetiButton;

    @AndroidFindBy(accessibility = "Abonelikler")
    public WebElement aboneliklerButton;

    @AndroidFindBy(accessibility = "İşlemler")
    public WebElement IslemlerButton;

    @AndroidFindBy(accessibility = "Kampanyalar")
    public WebElement KampanyalarButton;

    @AndroidFindBy(accessibility = "Yönet")
    public WebElement YonetButton;

    @AndroidFindBy(className = "android.widget.LinearLayout")
    public List<WebElement> ilkHane;



    @AndroidFindBy(id = "com.abonesepeti.app:id/tv_membership_status")
    public WebElement uyelik_button;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Pro Aylık\")")
    public WebElement pro_aylik_text;

    @AndroidFindBy(id = "com.abonesepeti.app:id/btnContinue")
    public WebElement satin_al_button;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/txt_message_custom_dialog\")")
    public WebElement eslesenHesapBulunamadi_messaji;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/txt_message_custom_dialog\")")
    public WebElement tamam_musteri_messaji;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"İptal\")")
    public WebElement iptal_silmeIslemi;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Profil\")")
    public WebElement profilSAyfasi_text;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/text_input_end_icon\")")
    public WebElement sifreGoruntule;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/edt_current_password\")")
    public WebElement sifreText;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/btn_continue_to_delete_account\")")
    public WebElement delete_account;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/txt_message_description_custom_dialog\")")
    public WebElement hesabimiSil_uyariMessaji;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Devam Et\")")
    public WebElement devamEt_text;

    @AndroidFindBy(id="com.abonesepeti.app:id/btn_continue_to_delete_account")
    public WebElement sil;

    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\")")
    public WebElement dogrulamaKoduGir;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/btn_verify_phone_number\")")
    public WebElement dogrula_button;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Yeniden gönder\")")
    public WebElement yenidenGonder;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/txtTitle\")")
    public WebElement hosgeldin_txt;

    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.abonesepeti.app:id/btnContinue\")")
    public WebElement devamEt_hosgeldinSayfasi;



    @AndroidFindBy(uiAutomator= ("new UiSelector().text(\"Şifremi Değiştir\")"))
    public WebElement Sifremi_Degistir;

    @AndroidFindBy(xpath = ("//*[@text=\"Mevcut Şifre\"]"))
    public WebElement Mevcut_Sifre;

    @AndroidFindBy(xpath = ("//*[@text=\"Yeni Şifre\"]"))
    public WebElement Yeni_Sifre;

    @AndroidFindBy(xpath = ("//*[@text=\"Yeni Şifre Doğrulama\"]"))
    public WebElement YeniSifre_Dogrulama;

    @AndroidFindBy(className = ("android.widget.Button"))
    public WebElement Kaydet_SifreDegistir;

    @AndroidFindBy(id="com.abonesepeti.app:id/btnContinue")
    public WebElement SifreDegistirildiMesaj;

    @AndroidFindBy(id = ("com.abonesepeti.app:id/txt_message_custom_dialog"))
    public WebElement YeniSifrenizMevcutSifreIleAyniOlamaz;

    @AndroidFindBy(id = ("com.abonesepeti.app:id/txt_message_custom_dialog"))
    public WebElement MevcutParolaniziHataliGirdiniz;


}


