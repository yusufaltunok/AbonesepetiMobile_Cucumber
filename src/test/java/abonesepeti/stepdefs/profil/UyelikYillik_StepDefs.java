package abonesepeti.stepdefs.profil;

import abonesepeti.pages.HizmetAlPage;
import abonesepeti.pages.LoginPage;
import abonesepeti.pages.ProfilPageUyelik;
import abonesepeti.pages.RegisterPage;
import abonesepeti.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static abonesepeti.utilities.Driver.driver;
import static org.junit.Assert.assertEquals;

public class UyelikYillik_StepDefs extends ReusableMethods {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    ProfilPageUyelik profilPageUyelik = new ProfilPageUyelik();

    HizmetAlPage hizmetAlPage = new HizmetAlPage();


    @And("Kullanici Uyelik butonuna tiklar")
    public void kullaniciUyelikButonunaTiklar() {
        profilPageUyelik.uyelik.click();
    }

    @And("Kullanici Uyelik butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciUyelikButonununTiklanabilirOldugunuDogrular() {
        assertEquals("true", profilPageUyelik.uyelik.getAttribute("clickable"));
    }

    @And("Kullanici Uyelik Plani sayfasinda oldugunu dogrular")
    public void kullaniciUyelikPlaniSayfasindaOldugunuDogrular() {
        assertEquals("Üyelik Planı", profilPageUyelik.uyelikPlaniTitle.getText());
    }

    @And("Kullanici Free Ucretsiz Planda Free yazisinin goruldugunu dogrular")
    public void kullaniciFreeUcretsizPlandaFreeYazisininGoruldugunuDogrular() {
        assertEquals("Free", profilPageUyelik.freeYazisi.getText());
    }

    @And("Kullanici Free Ucretsiz Plana tiklanabilir oldugunu dogrular")
    public void kullaniciFreeUcretsizPlanaTiklanabilirOldugunuDogrular() {
        assertEquals("true", profilPageUyelik.free.getAttribute("clickable"));
    }

    @And("Kullanici Free Ucretsiz Plana tiklar")
    public void kullaniciFreeUcretsizPlanaTiklar() {
        profilPageUyelik.free.click();
    }

    @And("Kullanici en altta Satin Al butonunun aktiflesmedigini dogrular")
    public void kullaniciEnAlttaSatinAlButonununAktiflesmediginiDogrular() {
        assertEquals("false", profilPageUyelik.satinAl.getAttribute("clickable"));
    }

    @And("Kullanici Pro Aylik Planda Pro Aylik yazisinin goruldugunu dogrular")
    public void kullaniciProAylikPlandaProAylikYazisininGoruldugunuDogrular() {
        assertEquals("true", profilPageUyelik.proAylikYazisi.getAttribute("displayed"));
    }

    @And("Kullanici Pro Aylik Plana tiklanabilir oldugunu dogrular")
    public void kullaniciProAylikPlanaTiklanabilirOldugunuDogrular() {
        assertEquals("true", profilPageUyelik.proAylik.getAttribute("clickable"));
    }

    @And("Kullanici Pro Aylik Plana tiklar")
    public void kullaniciProAylikPlanaTiklar() {
        profilPageUyelik.proAylik.click();
    }

    @And("Kullanici Satin Al butonunun aktiflestigini dogrular")
    public void kullaniciSatinAlButonununAktiflestiginiDogrular() {
        assertEquals("true", profilPageUyelik.satinAl.getAttribute("clickable"));
    }

    @And("Kullanici Pro Yillik Planda Pro Yillik yazisinin goruldugunu dogrular")
    public void kullaniciProYillikPlandaProYillikYazisininGoruldugunuDogrular() {
        assertEquals("true", profilPageUyelik.proYillikYazisi.getAttribute("displayed"));
    }

    @And("Kullanici Pro Yillik Plana tiklanabilir oldugunu dogrular")
    public void kullaniciProYillikPlanaTiklanabilirOldugunuDogrular() {
        assertEquals("true", profilPageUyelik.proYillik.getAttribute("clickable"));
    }

    @And("Kullanici Pro Yillik Plana tiklar")
    public void kullaniciProYillikPlanaTiklar() {
        profilPageUyelik.proYillik.click();
    }

//    @And("Kullanici Satin Al butonuna tiklar")
//    public void kullaniciSatinAlButonunaTiklar() {
//        assertEquals("true", profilPageUyelik.satinAl.getAttribute("clickable"));
//    }

    @And("Kullanici acilan sayfada Redeem code butonunun goruldugunu dogrular")
    public void kullaniciAcilanSayfadaRedeemCodeButonununGoruldugunuDogrular() {
        assertEquals("true", profilPageUyelik.redeemCodeButton.getAttribute("displayed"));
    }

    @And("Kullanici acilan sayfada Add credit or debit card butonunun goruldugunu dogrular")
    public void kullaniciAcilanSayfadaAddCreditOrDebitCardButonununGoruldugunuDogrular() {
        assertEquals("ture", profilPageUyelik.addCreditCardButton.getAttribute("displayed"));
    }

    @And("Kullanici Redeem code butonuna tiklar")
    public void kullaniciRedeemCodeButonunaTiklar() {
        profilPageUyelik.redeemCodeButton.click();
    }

    @And("Kullanici acilan sayfada Enter Code alaninin tiklanabilir oldugunu dogrular")
    public void kullaniciAcilanSayfadaEnterCodeAlanininTiklanabilirOldugunuDogrular() {
        assertEquals("true", profilPageUyelik.enterCode.getAttribute("clickable"));
    }

    @And("Kullanici Terms and Conditions linkinin tiklanabilir oldugunu dogrular")
    public void kullaniciTermsAndConditionsLinkininTiklanabilirOldugunuDogrular() {
        assertEquals("true", profilPageUyelik.termsAndCondtions.getAttribute("clickable"));
    }

    @And("Kullanici Enter Code alanina mail adresine gelen alti haneli kodu girer")
    public void kullaniciEnterCodeAlaninaMailAdresineGelenAltiHaneliKoduGirer() {
        profilPageUyelik.enterCode.sendKeys("232343");
    }

    @And("Kullanici en altta Redeem butonunun aktiflestigini dogrular")
    public void kullaniciEnAlttaRedeemButonununAktiflestiginiDogrular() {
        assertEquals("true", profilPageUyelik.redeemButton.getAttribute("clickable"));
    }

    @And("Kullanici Add creditor debit card butonuna tiklar")
    public void kullaniciAddCreditorDebitCardButonunaTiklar() {
        profilPageUyelik.addCreditCardButton.click();
    }



    @Then("Kullanici Hizmet Al bbutonunu tiklar")
    public void kullaniciHizmetAlBbutonunuTiklar() {
    hizmetAlPage.hizmetAl.click();
    }

    @Then("Kullanici Anadolu Hayat Gelecegim sekmesi tiklar")
    public void kullaniciAnadoluHayatGelecegimSekmesiTiklar() {
        hizmetAlPage.anadoluHayatGelecegim.click();
    }

    @Then("Kullanici Sigorta Urunlerim basligi altında cocugum icin egitim sigortasi butonu tikklar")
    public void kullaniciSigortaUrunlerimBasligiAltındaCocugumIcinEgitimSigortasiButonuTikklar() {
        hizmetAlPage.cocugumIcinEgitimSigortasi.click();
    }

    @Then("Kullanici gerekli bilgileri sayfada goruntuler")
    public void kullaniciGerekliBilgileriSayfadaGoruntuler() {
        hizmetAlPage.satinAl_egitim.isDisplayed();
    }

    @Then("Kullanici Satin Al butonunun gorur")
    public void kullaniciSatinAlButonununGorur() {
        hizmetAlPage.satinAl_egitim.isDisplayed();
    }

   // @Then("Kullanici Satin Al butonu tiklar")
  //  public void kullaniciSatinAlButonuTiklar() {

      //  hizmetAlPage.satinAl_egitim.click();
   // }

    @Then("Kullanici Anandolu Hayat Emeklilik banka uygulamasi sayfasina ulasir")
    public void kullaniciAnandoluHayatEmeklilikBankaUygulamasiSayfasinaUlasir() {
        hizmetAlPage.anadoluHayatEmeklilik.isDisplayed();
    }

    @When("Kullanici Abonesepeti mobil uygulamasına {string} girer")
    public void kullaniciAbonesepetiMobilUygulamasınaGirer(String arg0) {
        loginPage.atla.click();
        loginPage.girisYap.click();
        loginPage.cepTelefonu.sendKeys("5418743098");
        loginPage.sifre.sendKeys("1234tester");
        loginPage.girisYapButton.click();
        loginPage.tamam.click();
    }

    @And("Kullanici Hizmet Al butonuna tiklar")
    public void kullaniciHizmetAlButonunaTiklar() {
        bekle(2);
        hizmetAlPage.hizmetAl.click();
    }

    @And("Kullanici Anadolu Hayat Gelecegim sekmesine tiklar")
    public void kullaniciAnadoluHayatGelecegimSekmesineTiklar() {
        hizmetAlPage.anadoluHayatGelecegim.click();
        scrollGesture(driver, hizmetAlPage.ustaEmeklilikPlani, "down",7.0,1000);
    }
    @And("Kullanici Ferdi Kaza Sigortasi sekmesine tiklar")
    public void kullaniciFerdiKazaSigortasiSekmesineTiklar() {
        hizmetAlPage.ferdiKazaSigortasi.click();
    }
    @And("Kullanici Satin Al butonunu tiklar")
    public void kullaniciSatinAlButonunuTiklar() {
        hizmetAlPage.satinAl_egitim.click();
    }
    @Then("Kullanici Anadolu Hayat Emeklilik sayfasinda oldugunu dogrular")
    public void kullaniciAnadoluHayatEmeklilikSayfasindaOldugunuDogrular() {
        hizmetAlPage.anadoluHayatEmeklilik.isDisplayed();
    }

    @Then("Kullanici Sigorta Urunlerim basligi altında Tam Kapsamli Hayat Sigortasi butonu tikklar")
    public void kullaniciSigortaUrunlerimBasligiAltındaTamKapsamliHayatSigortasiButonuTikklar() {
        hizmetAlPage.tamKapsamliHayatSigortasi.click();
    }

    @Then("Kullanici hayat sigortasisayfasinda oldugunu dogrular")
    public void kullaniciHayatSigortasisayfasindaOldugunuDogrular() {
        hizmetAlPage.hayatSigortasiSayfasi.isDisplayed();
    }


    @And("Kullanici en altta Satin Al butonunun aktiflestigini dogrular")
    public void kullaniciEnAlttaSatinAlButonununAktiflestiginiDogrular() {
        assertEquals("true", profilPageUyelik.satinAl.getAttribute("clickable"));
    }
}
