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

    @When("Kullicini Anadolu Hayat Gelecegim sekmesine tiklar.")
    public void kullicini_anadolu_hayat_gelecegim_sekmesine_tiklar() {
        hizmetAlPage.anadoluHayatGelecegim.click();
    }

    @When("Kullanici Cocugum icin BES sekmesine tiklar")
    public void kullanici_cocugum_icin_bes_sekmesine_tiklar() throws InterruptedException {
        hizmetAlPage.cocugumIcinBES.click();
        Thread.sleep(2000);
    }

    @When("Kullanici Cocugum icin BES sayfasinda oldugunu dogrular")
    public void kullanici_cocugum_icin_bes_sayfasinda_oldugunu_dogrular() {
        Assert.assertTrue(hizmetAlPage.cocugumIcinBESDogrula.isDisplayed());
    }

    @When("Kullanici {string} butonunun gorunur oldugunu dogrular")
    public void kullanici_butonunun_gorunur_oldugunu_dogrular(String string) {
        hizmetAlPage.satinAldogrulama.isDisplayed();
    }

    @When("Kullanici cocugum icin BES Satin Al butonu tiklar")
    public void kullanici_cocugum_icin_bes_satin_al_butonu_tiklar() {
        hizmetAlPage.satinAldogrulama.click();
    }


    @When("Kullanici {isim} Abone Sepeti uygulamasina giris yapar")
    public void kullaniciIsimAboneSepetiUygulamasinaGirisYapar() {

    }

}

