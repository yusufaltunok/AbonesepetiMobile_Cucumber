package abonesepeti.stepdefs.register_login;

import abonesepeti.pages.LoginPage;
import abonesepeti.pages.ProfilPage;
import abonesepeti.pages.RegisterPage;
import abonesepeti.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static abonesepeti.utilities.ReusableMethods.bekle;
import static abonesepeti.utilities.ReusableMethods.visibleWait;
import static org.junit.Assert.assertTrue;

public class Register_StepDefs {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();


    ProfilPage profilPage = new ProfilPage();



    @And("Giris sayfasi gelene kadar Devam Et butonuna tiklar")
    public void giris_sayfasi_gelene_kadar_devam_et_butonuna_tiklar() {
        visibleWait(Driver.getDriver(), registerPage.devamEt, 15);
        for (int i = 0; i < 8; i++) {
            registerPage.devamEt.click();
            bekle(1);
        }
    }
//    @Then("DEVAM ET butonuna tikladikca gelen onboarding ekranlarin goruntulendigini dogrula")
//    public void devam_et_butonuna_tikladikca_gelen_onboarding_ekranlarin_goruntulendigini_dogrula() {
//
//
//    }

    @Then("Login sayfasinin goruntulendigini dogrular")
    public void login_sayfasinin_goruntulendigini_dogrular() {
        assertTrue(loginPage.girisYap.isDisplayed());
    }

    @When("Giris sayfasina ulasmak icin Atla butonuna tiklar")
    public void girisSayfasinaUlasmakIcinAtlaButonunaTiklar() {
        bekle(2);
        loginPage.atla.click();
    }

    @And("Yeni hesap olustur butonuna tiklar")
    public void yeniHesapOlusturButonunaTiklar() {
        registerPage.yeniHesapOlustur.click();
    }

    @And("{string}, {string} bilgilerini girer")
    public void bilgileriniGirer(String telefon, String sifre) {

        registerPage.cepTelefonu.sendKeys(telefon);
        registerPage.sifre.sendKeys(sifre);
    }


    @And("Kullanici sozlesmesini kabul etmek icin checkbox'i tiklar")
    public void kullaniciSozlesmesiniKabulEtmekIcinCheckboxITiklar() {
        registerPage.sozlesmeCheckBox.click();
    }

    @And("Hesap olustur butonuna tiklar")
    public void hesapOlusturButonunaTiklar() {
        registerPage.yeniHesapOlustur.click();
    }

    @And("Telefona SMS ile gelen {int} haneli dogrulama kodunu girer")
    public void telefonaSMSIleGelenHaneliDogrulamaKodunuGirer(int arg0) {
        profilPage.dogrulamaKoduGir.sendKeys("8765");


    }

    @And("Dogrula butonuna tiklar")
    public void dogrulaButonunaTiklar() {
        profilPage.dogrula_button.click();
    }

    @Then("Basarili bir sekilde hesap olusturuldugunu dogrular")
    public void basariliBirSekildeHesapOlusturuldugunuDogrular() {
        profilPage.hosgeldin_txt.isDisplayed();
    }

    @Then("Girmis oldugunuz e-posta adresine ait uyelik bulunmaktadir Uyari yazisini gorur")
    public void girmisOldugunuzEPostaAdresineAitUyelikBulunmaktadirUyariYazisiniGorur() {
        assertTrue(registerPage.hataMsg.isDisplayed());
    }

    @And("Google ikonuna tiklar")
    public void googleIkonunaTiklar() {
        registerPage.googleIcon.click();
    }

    @And("Kayitli bir google hesabi sec")
    public void kayitliBirGoogleHesabiSec() {
        registerPage.googleHesapSec.click();
    }

    @When("Kullanici eposta ile abonesepeti uygulamasina giris yapar")
    public void kullaniciEpostaIleAbonesepetiUygulamasinaGirisYapar() {
        loginPage.girisYapEposta("testermehmetemin@gmail.com", "1234tester");
    }


    @And("Kullanici hesap olusturma sayfasina ulasmak icin Atla butonuna tiklar")
    public void kullaniciHesapOlusturmaSayfasinaUlasmakIcinAtlaButonunaTiklar() {
        loginPage.atla.click();
    }

    @And("Kullanici Yeni hesap olustur butonuna tiklar")
    public void kullaniciYeniHesapOlusturButonunaTiklar() {
        registerPage.yeniHesapOlustur.click();
    }

    @And("Kullanici onceden kayitli olan {string}, {string}, {string}, {string} ve {string} bilgilerini girer")
    public void kullaniciOncedenKayitliOlanVeBilgileriniGirer(String ad, String soyad, String telefon, String eposta, String sifre) {
        registerPage.ad.sendKeys(ad);
        registerPage.soyad.sendKeys(soyad);
        registerPage.cepTelefonu.sendKeys(telefon);
        registerPage.ePosta.sendKeys(eposta);
        registerPage.sifre.sendKeys(sifre);

    }

    @When("Kullanici Abonesepeti uygulamasini acar")
    public void kullaniciAbonesepetiUygulamasiniAcar() {
    }



        @And("{string}, {string}, {string}, {string}, {string} bilgilerini girer")
        public void bilgileriniGirer (String arg0, String arg1, String arg2, String arg3, String arg4){

        }

        @Then("Kullanici Hesabimi Sil butonuna tiklar")
        public void kullaniciHesabimiSilButonunaTiklar () {
            profilPage.hesabimiSil_button.click();

        }

        @Then("Kullanici Yinede Sil ve Iptal butonlarını goruntuler")
        public void kullaniciYinedeSilVeIptalButonlarınıGoruntuler () {
            profilPage.yinedeSil_button.isDisplayed();
            profilPage.iptal_silmeIslemi.isDisplayed();
        }

        @Then("Kullanici Iptal butonuna tiklar ve profil sayfasında kaldıgını dogrular")
        public void kullaniciIptalButonunaTiklarVeProfilSayfasındaKaldıgınıDogrular () {
            profilPage.iptal_silmeIslemi.click();
            assertTrue(profilPage.profilSAyfasi_text.isDisplayed());
        }

        @Then("Kullanici Yinede Sil butonunu tiklar")
        public void kullaniciYinedeSilButonunuTiklar () {
            profilPage.yinedeSil_button.click();
        }

        @Then("Kullanici mevcut sifre textboxina sifresini girer")
        public void kullaniciMevcutSifreTextboxinaSifresiniGirer () {
            profilPage.mevcutSifre_textbox.sendKeys("123456");
        }

        @Then("Kullanici sifrenin yanindaki goz simgesine tiklar")
        public void kullaniciSifreninYanindakiGozSimgesineTiklar () {
            profilPage.sifreGoruntule.click();
        }

        @Then("Kullanici gecerli sifresini girdigini dogrular")
        public void kullaniciGecerliSifresiniGirdiginiDogrular () {
            Assert.assertEquals("123456", profilPage.mevcutSifre_textbox.getText());
        }

        @Then("Kullanici sil butonunu tiklar")
        public void kullaniciSilButonunuTiklar () {
            profilPage.sil.click();
        }

        @Then("Kullanici musteri uyari mesajini goruntuler")
        public void kullaniciMusteriUyariMesajiniGoruntuler () {
            profilPage.hesabimiSil_uyariMessaji.isDisplayed();
        }

        @Then("Kullanici Sil ve Devam Et butonlarinin tiklanabilir oldugunu dogrular")
        public void kullaniciSilVeDevamEtButonlarininTiklanabilirOldugunuDogrular () {
            profilPage.sil.isEnabled();
            profilPage.devamEt_text.isEnabled();
        }

        @And("Kullanici silinen hesap bilgileri ile giris yapamadigini dogrular ve tamam butonuna tiklar")
        public void kullaniciSilinenHesapBilgileriIleGirisYapamadiginiDogrularVeTamamButonunaTiklar () {
            loginPage.girisYap.click();
            loginPage.cepTelefonu.sendKeys("5336954588");
            loginPage.sifre.sendKeys("Rabia3545");
            loginPage.girisYapButton.click();
            loginPage.girisYapTelefon("5336954588", "Rabia3545");
            profilPage.eslesenHesapBulunamadi_messaji.isDisplayed();

        }

        @Then("Kullanici mevcut sifre textboxina gecersiz sifre girer")
        public void kullaniciMevcutSifreTextboxinaGecersizSifreGirer () {
            profilPage.sifreText.sendKeys("gnnghmfgm");
        }

        @And("Kullanici girmis oldugunuz bilgilerle eslesen hesap bulunamadi yazisini gorur.")
        public void kullaniciGirmisOldugunuzBilgilerleEslesenHesapBulunamadiYazisiniGorur () {
            profilPage.eslesenHesapBulunamadi_messaji.isDisplayed();
        }

    @And("Kullanici {string}, {string}, {string}, {string}, {string} bilgilerini girer")
    public void kullaniciBilgileriniGirer(String ad, String soyad, String telefon, String mail, String sifre) {
        registerPage.ad.sendKeys(ad);
        registerPage.soyad.sendKeys(soyad);
        registerPage.cepTelefonu.sendKeys(telefon);
        registerPage.ePosta.sendKeys(mail);
        registerPage.sifre.sendKeys(sifre);
    }

    @Then("Basarili bir sekilde hesap olusturulamadigini dogrular")
    public void basariliBirSekildeHesapOlusturulamadiginiDogrular() {
        assertTrue(registerPage.hataMesaji.isDisplayed());
    }

    @Then("Gecerli bir mail adresi giriniz hata mesajinin ciktigini dogrular")
    public void gecerliBirMailAdresiGirinizHataMesajininCiktiginiDogrular() {
        assertTrue(registerPage.gecersizMailMesaji.isDisplayed());
    }

    @Then("Gecerli bir sifre giriniz hata mesajinin ciktigini dogrular")
    public void gecerliBirSifreGirinizHataMesajininCiktiginiDogrular() {
        assertTrue(registerPage.gecersizSifreMesaji.isDisplayed());
    }

    @Then("Hesap olusturulamadigini dogrular")
    public void hesapOlusturulamadiginiDogrular() {
        assertTrue(registerPage.yeniHesapOlustur.isDisplayed());
    }
}