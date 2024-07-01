package abonesepeti.stepdefs.hizmetAl;

import abonesepeti.pages.HizmetAlPage;
import abonesepeti.pages.LoginPage;
import abonesepeti.pages.ProfilPageUyelik;
import abonesepeti.pages.RegisterPage;
import abonesepeti.utilities.Driver;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

import static abonesepeti.utilities.Driver.driver;
import static org.junit.Assert.assertEquals;

public class HizmetAl_StepDefs extends ReusableMethods {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    ProfilPageUyelik profilPageUyelik = new ProfilPageUyelik();
    HizmetAlPage hizmetAlPage = new HizmetAlPage();
    String aracBedeli;

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

    @And("Kullicini Anadolu Hayat Gelecegim sekmesine tiklar.")
    public void kulliciniAnadoluHayatGelecegimSekmesineTiklar() {
        hizmetAlPage.anadoluHayatGelecegim.click();
    }

    @And("Kullanici Cocugum icin BES sekmesine tiklar")
    public void kullaniciCocugumIcinBESSekmesineTiklar() {
        hizmetAlPage.cocugumIcinBES.click();
        bekle(2);
    }

    @And("Kullanici Cocugum icin BES sayfasinda oldugunu dogrular")
    public void kullaniciCocugumIcinBESSayfasindaOldugunuDogrular() {
        Assert.assertTrue(hizmetAlPage.cocugumIcinBESDogrula.isDisplayed());
    }

    @And("Kullanici {string} butonunun gorunur oldugunu dogrular")
    public void kullaniciButonununGorunurOldugunuDogrular(String arg0) {
        hizmetAlPage.satinAldogrulama.isDisplayed();
    }

    @And("Kullanici cocugum icin BES Satin Al butonu tiklar")
    public void kullaniciCocugumIcinBESSatinAlButonuTiklar() {
        hizmetAlPage.satinAldogrulama.click();
    }


//    @When("Kullanici {isim} Abone Sepeti uygulamasina giris yapar")
//    public void kullaniciIsimAboneSepetiUygulamasinaGirisYapar() {
//
//    }


    @And("Kullanici Bireysel Emeklilik Urunlerinden>Gelecege Yatirim Plani'na tiklar")
    public void kullaniciBireyselEmeklilikUrunlerindenGelecegeYatirimPlaniNaTiklar() {
        hizmetAlPage.GelecegeYatirimPlaniSekmesi.click();
    }

    @And("Kullanici Gelecege Yatirim Plani bilgilendirme sayfasini gorur")
    public void kullaniciGelecegeYatirimPlaniBilgilendirmeSayfasiniGorur() {
        hizmetAlPage.GelecegeYatirimPlaniSayfasiniDogrula.isDisplayed();
    }

    @And("Kullanici Gelecege Yatirim sayfasindaki {string} butonu gorur")
    public void kullaniciGelecegeYatirimSayfasindakiSatinAlButonuGorur() {
        hizmetAlPage.satinAldogrulama.isDisplayed();
    }

    @And("Kullanici Hizmet Al butonunu tiklar")
    public void kullaniciHizmetAlButonunuTiklar() {
        hizmetAlPage.hizmetAl.click();
    }

//    @And("Kullanici Satin Al butonuna tiklar")
//    public void kullaniciSatinAlButonunaTiklar() {
//        hizmetAlPage.satinAl_egitim.click();
//    }

    @And("Kullanici Sigorta kategorisnindeki sigorta tekliflerini gorur")
    public void kullaniciSigortaKategorisnindekiSigortaTeklifleriniGorur() {
        hizmetAlPage.hizmetAl.click();
    }

    @And("Kullanici  sigorta kategorisinde \\(herhangi biri )DASK sigortasina tiklar")
    public void kullaniciSigortaKategorisindeHerhangiBiriDASKSigortasinaTiklar() {
        hizmetAlPage.SigortaKateegorisiSec.click();
    }

    @And("Kullanici  DASK sigortasi teklifi sayfasini gorur")
    public void kullaniciDASKSigortasiTeklifiSayfasiniGorur() {
        hizmetAlPage.DaskSigortasiGirisSayfasi.click();
    }

    @Then("Kullanici hizmet al sayfasinda Arac kirala  sekmesine tiklar.")
    public void kullanici_hizmet_al_sayfasinda_arac_kirala_sekmesine_tiklar() {
        hizmetAlPage.aracKiralaButonu.click();

    }

    @Then("Kullanici Arac Kirala sayfasinda oldugunu dogrular.")
    public void kullanici_arac_kirala_sayfasinda_oldugunu_dogrular() {
        Assert.assertTrue(hizmetAlPage.neredenAlacaksinTextBox.isDisplayed());

    }

    @Then("Arac kirala sayfasinda nereden alacaksiniz? kutucuğuna tiklar")
    public void arac_kirala_sayfasinda_nereden_alacaksiniz_kutucuğuna_tiklar() {
        hizmetAlPage.neredenAlacaksinTextBox.click();
        bekle(2);
    }

    @Then("Kullanici Nereden Alacaksiniz? kutucuguna gecerli bir {string} bilgisi girer.")
    public void kullaniciNeredenAlacaksinizKutucugunaGecerliBirBilgisiGirer(String alisKonum) {

        hizmetAlPage.konumAraTextBox.sendKeys(alisKonum);

    }

    @Then("Kullanici Nereden Alacaksiniz? kutucuğuna girdiği konum bilgisine ait sekmeyi altta gorur ve tiklar.")
    public void kullanici_nereden_alacaksiniz_kutucuguna_girdigi_konum_bilgisine_ait_sekmeyi_altta_gorur_ve_tiklar() {

        hizmetAlPage.aracAlisKonum.click();

    }

    @Then("Kullanici farkli bir yerde birakmak istiyorum kutucuğunu isaretler.")
    public void kullanici_farkli_bir_yerde_birakmak_istiyorum_kutucugunu_isaretler() {

        hizmetAlPage.farkliBirYerdeBirakOnayKutusu.click();
    }

    @Then("Kullanici Nereye birakacaksiniz? kutucugunu gorur ve tiklar.")
    public void kullanici_nereye_birakacaksiniz_kutucugunu_gorur_ve_tiklar() {

        hizmetAlPage.nereyebirakacaksinizTextBox.click();

    }

    @Then("Kullanici Nereye birakacaksiniz? kutucuguna gecerli bir {string} bilgisi girer.")
    public void kullaniciNereyeBirakacaksinizKutucugunaGecerliBirBilgisiGirer(String arg0) {

        hizmetAlPage.konumAraTextBox.sendKeys(arg0);

    }

    @Then("Kullanici Nereye birakacaksiniz? kutucuğuna girdiği konum bilgisine ait sekmeyi altta gorur ve tiklar.")
    public void kullanici_nereye_birakacaksiniz_kutucuguna_girdigi_konum_bilgisine_ait_sekmeyi_altta_gorur_ve_tiklar() {

        hizmetAlPage.aracBirakmaKonum.click();

    }

    @Then("Kullanici arac alıs {string} bilgisini girer")
    public void kullaniciAracAlisBilgisiniGirer(String tarih) {
        hizmetAlPage.getAlisTarihiSec(tarih).click();
        hizmetAlPage.takvimSecButon.click();
        hizmetAlPage.takvimSecButon.click();


    }

    @Then("Kullanici birakiş {string} bilgisini girer")
    public void kullanici_birakis_bilgisini_girer(String arg) {
        hizmetAlPage.getBirakisTarihiSec(arg).click();
        hizmetAlPage.takvimSecButon.click();
        hizmetAlPage.takvimSecButon.click();

    }

    @Then("Kullanici en iyi fiyata bul butonuna tiklar.")
    public void kullanici_en_iyi_fiyata_bul_butonuna_tiklar() {
        hizmetAlPage.eniyiFiyatiBulButon.click();
        bekle(2);

    }

    @Then("Kullanici ayni konumda arac kirala sayfasinda listelenen araclari gorur")
    public void kullaniciAyniKonumdaAracKiralaSayfasindaListelenenAraclariGorur() {

        try {

            hizmetAlPage.aracBulunamadiTamamButon.click();

            hizmetAlPage.lokasyonSecmeAyniKonum();

            hizmetAlPage.kiralikAracGoruntuleme();

        } catch (Exception e) {

            hizmetAlPage.kiralikAracGoruntuleme();

        }

    }

    @Then("Kullanici farkli konumda arac kirala sayfasinda listelenen araclari gorur")
    public void kullaniciFarkliKonumdaAracKiralaSayfasindaListelenenAraclariGorur() {

        try {

            hizmetAlPage.aracBulunamadiTamamButon.click();

            hizmetAlPage.lokasyonSecmeFarkliKonum();

            hizmetAlPage.kiralikAracGoruntuleme();

        } catch (Exception e) {

            hizmetAlPage.kiralikAracGoruntuleme();
        }

    }


    @Then("Kullanici sayfada listelenen araclardan istedigini {string} {string} secer ve arac kirala butonuna tiklar")
    public void kullanici_sayfada_listelenen_araclardan_istedigini_secer_ve_arac_kirala_butonuna_tiklar(String yakit, String vites) {

        hizmetAlPage.aracSecme(yakit, vites);

    }


    @Then("Kullanici surucu bilgilerini {string} {string} {string} girer ve devam et butonuna tiklar")
    public void kullanici_surucu_bilgilerini_girer_ve_devam_et_butonuna_tiklar(String adres, String il, String ilce) {

        aracBedeli = hizmetAlPage.aracKiralamaTutari.getText();
        scrollGesture(driver, hizmetAlPage.surucuAdTextBox, "down", 7, 1500);
        hizmetAlPage.surucuAdresiTextBox.sendKeys(adres);
        hizmetAlPage.surucuIlTextBox.sendKeys(il);
        hizmetAlPage.surucuIlceTextBox.sendKeys(ilce);
        hizmetAlPage.urunDevametButon.click();


    }

    @Then("Kullanici arac icin belirtilen tutar ile kredi kartindan odeyecegi tutarin ayni oldugunu kontrol eder ve devam et butonuna tiklar")
    public void kullanici_arac_icin_belirtilen_tutar_ile_kredi_kartindan_odeyecegi_tutarin_ayni_oldugunu_kontrol_eder_ve_devam_et_butonuna_tiklar() {

        Assert.assertEquals(aracBedeli, hizmetAlPage.aracKiralamaTutari.getText());
    }


    @Then("Kullanici odeme bilgileri sayfasinda kart bilgilerini {string} {string} {string} {string} {string} girer ve odeme yap butonuna tiklar.")
    public void kullanici_odeme_bilgileri_sayfasinda_kart_bilgilerini_girer_ve_odeme_yap_butonuna_tiklar(String isim, String kartNo, String kartKulAy, String kartKulYil, String CVVKod) {

        hizmetAlPage.krediKartiIsim.sendKeys(isim);
        hizmetAlPage.kartNumarasi.sendKeys(kartNo);
        hizmetAlPage.kartKullanimAy.sendKeys(kartKulAy);
        hizmetAlPage.kartKullanimYil.sendKeys(kartKulYil);
        hizmetAlPage.kartCVVKodu.sendKeys(CVVKod);
        assertEquals("true", hizmetAlPage.odemeYapButon.getAttribute("clickable"));
    }



    @Then("Kullanici bireysel emeklilik urunleri basligi altindaki urunlere tiklar, satin alir.")
    public void kullaniciBireyselEmeklilikUrunleriBasligiAltindakiUrunlereTiklarSatinAlir() {
        hizmetAlPage.besIcinUrunSec();
    }
}

