package abonesepeti.stepdefs.profil;

import abonesepeti.pages.HizmetAlPage;
import abonesepeti.pages.LoginPage;
import abonesepeti.pages.ProfilPageUyelik;
import abonesepeti.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HizmetAl_StepDefs {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    ProfilPageUyelik profilPageUyelik = new ProfilPageUyelik();
    HizmetAlPage hizmetAlPage = new HizmetAlPage();

    @And("Kullanici Gelecegim sayfasında oldugunu dogrular")
    public void kullaniciGelecegimSayfasındaOldugunuDogrular() {
        Assert.assertTrue(hizmetAlPage.gelecegim.isDisplayed());
    }

    @And("Kullanici Genc Emeklilik Plani sekmesine tiklar")
    public void kullaniciGencEmeklilikPlaniSekmesineTiklar() {
    hizmetAlPage.gencEmeklilikPlani.click();
    }

    @And("Kullanici Genc Emeklilik Plani sayfasinda oldugunu dogrular")
    public void kullaniciGencEmeklilikPlaniSayfasindaOldugunuDogrular() {
    Assert.assertTrue(hizmetAlPage.gencEmeklilikPlaniDogrula.isDisplayed());
    }

    @And("Kullanici Satin Al butonunun gorunur oldugunu dogrular")
    public void kullaniciSatinAlButonununGorunurOldugunuDogrular() {
        Assert.assertTrue(hizmetAlPage.satinAlGencEmeklilik.isDisplayed());
    }



    @When("Kullanci Standart Kritik Hastalik Sigortasi bilgilendirme Sayfasini gorur")
    public void kullanciStandartKritikHastalikSigortasiBilgilendirmeSayfasiniGorur() {
        Assert.assertTrue(hizmetAlPage.StandartKritikHastalikAigortaSayfasi.isDisplayed());
    }

    @When("Kullanici Kullanici Standart Kritik Hastalik Sigortasi sayfasindaki {string} butonuna tiklar")
    public void kullaniciKullaniciStandartKritikHastalikSigortasiSayfasindakiButonunaTiklar(String arg0) {
        hizmetAlPage.SatinAlStandartKritikHastalikSigortasi.click();
    }

    @When("Kullanici Anadolu Hayat Emeklilik banka uygulamasi giris sayfasina yonlendirilir")
    public void kullaniciAnadoluHayatEmeklilikBankaUygulamasiGirisSayfasinaYonlendirilir() {
        hizmetAlPage.anadoluHayatEmeklilik.isDisplayed();
    }

    @And("Kullanici SigortaUrunlerinden Kadina Ozel Kritik Hastalik Sigortas tiklar")
    public void kullaniciSigortaUrunlerindenKadinaOzelKritikHastalikSigortasTiklar() {
        hizmetAlPage.KadinaOzelKritikHastalikSigortasiSekmesi.click();
    }

    @And("Kullanici Kadina Ozel Kritik Hastalik Sigortasi bilgilendirme sayfasini gorur")
    public void kullaniciKadinaOzelKritikHastalikSigortasiBilgilendirmeSayfasiniGorur() {
        Assert.assertTrue(hizmetAlPage.StandartKritikHastalikAigortaSayfasi.isDisplayed());
    }

    @And("Kullanici Kadina Ozel Kritik Hastalik Sigorta sayfasindaki {string} butonunu gorebilmeli")
    public void kullaniciKadinaOzelKritikHastalikSigortaSayfasindakiSatinAlButonunuGorebilmeli() {
        Assert.assertTrue(hizmetAlPage.satinAldogrulama.isDisplayed());

    }

    @And("Kullanici Kadina Ozel Kritik Hastalik Sigorta sayfasindaki {string} butonuna tiklar")
    public void kullaniciKadinaOzelKritikHastalikSigortaSayfasindakiSatinAlButonunaTiklar() {
        hizmetAlPage.satinAldogrulama.click();
    }
}
