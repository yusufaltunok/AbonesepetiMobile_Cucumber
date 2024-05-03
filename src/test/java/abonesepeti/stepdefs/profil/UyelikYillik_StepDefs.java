package abonesepeti.stepdefs.profil;

import abonesepeti.pages.LoginPage;
import abonesepeti.pages.ProfilPageUyelik;
import abonesepeti.pages.RegisterPage;
import io.cucumber.java.en.And;

import static org.junit.Assert.assertEquals;

public class UyelikYillik_StepDefs {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    ProfilPageUyelik profilPageUyelik = new ProfilPageUyelik();


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

    @And("Kullanici Satin Al butonuna tiklar")
    public void kullaniciSatinAlButonunaTiklar() {
        assertEquals("true", profilPageUyelik.satinAl.getAttribute("clickable"));
    }

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
}
