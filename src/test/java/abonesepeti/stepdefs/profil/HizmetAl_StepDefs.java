package abonesepeti.stepdefs.profil;

import abonesepeti.pages.HizmetAlPage;
import abonesepeti.pages.LoginPage;
import abonesepeti.pages.ProfilPageUyelik;
import abonesepeti.pages.RegisterPage;
import io.cucumber.java.en.And;
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

}
