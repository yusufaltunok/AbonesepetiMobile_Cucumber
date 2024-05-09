package abonesepeti.stepdefs.anasayfa;

import abonesepeti.pages.AnasayfaPage;
import abonesepeti.pages.HizmetAlPage;
import abonesepeti.pages.LoginPage;
import abonesepeti.pages.ProfilPage;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static abonesepeti.utilities.Driver.driver;
import static org.junit.Assert.assertEquals;


public class AnasayfaStepDefs extends ReusableMethods {
    ProfilPage profilPage = new ProfilPage();
    AnasayfaPage anasayfaPage = new AnasayfaPage();
    HizmetAlPage hizmetAlPage = new HizmetAlPage();

    LoginPage loginPage=new LoginPage();

    @Then("Kullanici Profil butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciProfilButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.profil.getAttribute("clickable"));
    }

    @And("Kullanici Bildirimler butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciBildirimlerButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.bildirim.getAttribute("clickable"));
    }

    @And("Kullanici Hane bir butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciHaneBirButonununTiklanabilirOldugunuDogrular() {
        anasayfaPage.haneler.get(1).click();
        assertEquals("true", anasayfaPage.haneler.get(0).getAttribute("clickable"));
    }

    @And("Kullanici Hane iki butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciHaneIkiButonununTiklanabilirOldugunuDogrular() {
        anasayfaPage.haneler.get(0).click();
        assertEquals("true", anasayfaPage.haneler.get(1).getAttribute("clickable"));
    }

    @And("Kullanici Tumunu Goster butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciTumunuGosterButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.haneler.get(2).getAttribute("clickable"));
    }

    @And("Kullanici Guncel Ay butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciGuncelAyButonununTiklanabilirOldugunuDogrular() {
        anasayfaPage.haneler.get(5).click();
        assertEquals("true", anasayfaPage.haneler.get(4).getAttribute("clickable"));
    }

    @And("Kullanici Son alti Ay butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciSonAltiAyButonununTiklanabilirOldugunuDogrular() {
        anasayfaPage.haneler.get(4).click();
        assertEquals("true", anasayfaPage.haneler.get(5).getAttribute("clickable"));
    }

    @And("Kullanici Son bir Yil butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciSonBirYilButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.haneler.get(6).getAttribute("clickable"));
    }

    @And("Kullanici Toplam butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciToplamButonununTiklanabilirOldugunuDogrular() {
    }

    @And("Kullanici Kurum butonunun gorulebilir oldugunu dogrular")
    public void kullaniciKurumButonununGorulebilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.haneler.get(9).getAttribute("displayed"));
    }

    @And("Kullanici Dijital butonunun gorulebilir oldugunu dogrular")
    public void kullaniciDijitalButonununGorulebilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.haneler.get(11).getAttribute("displayed"));
    }

    @And("Kullanici Isletme butonunun gorulebilir oldugunu dogrular")
    public void kullaniciIsletmeButonununGorulebilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.haneler.get(13).getAttribute("displayed"));
    }

    @And("Kullanici Diger butonunun gorulebilir oldugunu dogrular")
    public void kullaniciDigerButonununGorulebilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.haneler.get(15).getAttribute("displayed"));
    }

    @And("Kullanici Abonelik Ekle butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciAbonelikEkleButonununTiklanabilirOldugunuDogrular() {
         assertEquals("true", anasayfaPage.abonelikEkle.get(0).getAttribute("clickable"));
    }

    @And("Kullanici Yeni Abonelik butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciYeniAbonelikButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.abonelikEkle.get(1).getAttribute("clickable"));
    }

    @And("Kullanici Kolay Iptal butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciKolayIptalButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.abonelikEkle.get(2).getAttribute("clickable"));
    }

    @And("Kullanici Fatura Odeme butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciFaturaOdemeButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.abonelikEkle.get(3).getAttribute("clickable"));
    }

    @And("Kullanici Tum Islemler butonunun tiklanabilir oldugunu dogrular ve tiklar")
    public void kullaniciTumIslemlerButonununTiklanabilirOldugunuDogrularVeTiklar() {
        assertEquals("true", anasayfaPage.tumIslemler.getAttribute("clickable"));
        anasayfaPage.tumIslemler.click();
    }

    @And("Kullanici Cebe TL butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciCebeTLButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.abonelikEkle.get(4).getAttribute("clickable"));
    }

    @And("Kullanici Arac Kirala butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciAracKiralaButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.abonelikEkle.get(5).getAttribute("clickable"));
    }

    @And("Kullanici Sigorta Teklifi Al butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciSigortaTeklifiAlButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.abonelikEkle.get(6).getAttribute("clickable"));
    }

    @And("Kullanici Gelecegim butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciGelecegimButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.abonelikEkle.get(7).getAttribute("clickable"));
    }

    @And("Kullanici Kapat butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciKapatButonununTiklanabilirOldugunuDogrular() {
        driver. findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Kapat\"))"));
        assertEquals("true", anasayfaPage.kapat.getAttribute("clickable"));
    }

    @And("Kullanici Kampanyalar ikonlarinin tiklanabilir oldugunu dogrular")
    public void kullaniciKampanyalarIkonlarininTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.kampanyalarButton.getAttribute("clickable"));

    }

    @And("Kullanici Aboneliklerin tiklanabilir oldugunu dogrular")
    public void kullaniciAboneliklerinTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.aboneliklerButton.getAttribute("clickable"));
    }

    @And("Kullanici Size Ozel Kampanyalar sekmelerinin tiklanabilir oldugunu dogrular")
    public void kullaniciSizeOzelKampanyalarSekmelerininTiklanabilirOldugunuDogrular() {
        scrollGesture(driver,anasayfaPage.kapat,"down",3.0,750);
        assertEquals("true", anasayfaPage.kampanyalarResim.getAttribute("clickable"));
        for (int i = 0; i < 6 ; i++) {
            swipeGesture(driver, anasayfaPage.kampanyalarResim, "left", 0.16, 1000);
            assertEquals("true", anasayfaPage.kampanyalarResim.getAttribute("clickable"));
        }
    }

    @And("Kullanici Abonesepeti butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciAbonesepetiButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.abonesepetiButton.getAttribute("clickable"));
    }

    @And("Kullanici Abonelikler butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciAboneliklerButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.aboneliklerButton.getAttribute("clickable"));
    }

    @And("Kullanici Islemler butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciIslemlerButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.islemlerButton.getAttribute("clickable"));
    }

    @And("Kullanici Kampanyalar butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciKampanyalarButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.kampanyalarButton.getAttribute("clickable"));
    }

    @And("Kullanici Yonet butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciYonetButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", anasayfaPage.yonetButton.getAttribute("clickable"));
    }

    @When("Kullanici email ve yeni sifre ile login olur")
    public void kullaniciEmailVeYeniSifreIleLoginOlur() {

    }

    @When("Kullanici E_posta ile abonesepeti uygulamasina giris yapar")
    public void kullaniciE_postaIleAbonesepetiUygulamasinaGirisYapar() {
        loginPage.girisYapEposta("testermehmetemin@gmail.com","1234tester");


    }

    @When("Kullanici E_postaileAboneSepeti uygulamasina giris yapar")
    public void kullaniciE_postaileAboneSepetiUygulamasinaGirisYapar() {
      //  loginPage.girisYapEposta("alsonbahar@gmail.com", "111116");
    }

    @When("Kullanici Abonesepeti mobil uygulamasında {string} girer")
    public void kullaniciAbonesepetiMobilUygulamasındaGirer(String arg0) {
        loginPage.atla.click();
        loginPage.girisYap.click();
        loginPage.cepTelefonu.sendKeys("5418743098");
        loginPage.sifre.sendKeys("1234tester");
        loginPage.girisYapButton.click();
    }

    @And("Kullanici Anasayfada Tum Islemler sekmesine tiklar")
    public void kullaniciAnasayfadaTumIslemlerSekmesineTiklar() {
        loginPage.tamam.click();
        hizmetAlPage.tumIslemler.click();
        bekle(2);
    }

    @And("Kullanici Gelecegim sekmesine tiklar")
    public void kullaniciGelecegimSekmesineTiklar() {
        hizmetAlPage.gelecegimbutton.click();
        bekle(2);
    }

    @And("Kullanici Gelecegim sayfasında oldugunu dogrular")
    public void kullaniciGelecegimSayfasındaOldugunuDogrular() {
        Assert.assertTrue(hizmetAlPage.gelecegimdogrulama.isDisplayed());
    }

    @And("Kullanici Usta Emeklilik Plani sekmesine tiklar")
    public void kullaniciUstaEmeklilikPlaniSekmesineTiklar() {
        hizmetAlPage.ustaEmeklilikPlani.click();
    }

    @Then("Kullanici Satin Al butonunun gorunur oldugunu dogrular")
    public void kullaniciSatinAlButonununGorunurOldugunuDogrular() {
        Assert.assertTrue(hizmetAlPage.satinAldogrulama.isDisplayed());
    }
}
