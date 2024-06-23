package abonesepeti.stepdefs.yeniAbonelik;

import abonesepeti.pages.HizmetAlPage;
import abonesepeti.pages.YeniAbonelikPage;
import abonesepeti.utilities.ConfigReader;
import abonesepeti.utilities.Driver;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static abonesepeti.utilities.Driver.driver;
import static org.junit.Assert.assertEquals;

public class DergiAbonelik_StepDefs extends ReusableMethods {

    //YeniAbonelikPage yeniAbonelikPage = new YeniAbonelikPage();

    HizmetAlPage hizmetAlPage = new HizmetAlPage();

    @And("Kullanici Dergi Aboneligi Baslat menusune tiklar")
    public void kullanici_Dergi_Aboneligi_Baslat_Menusune_Tiklar() {
        hizmetAlPage.dergiAboneligiBaslat.click();

    }

    @And("Kullanici Dergi Aboneligi Kategoriler butonuna tiklar")
    public void kullaniciDergiAboneligiKategorilerButonunaTiklar() {
        bekle(5);
        hizmetAlPage.dergiFirstButton.get(3).click(); //for cokiee
        bekle(1);
        hizmetAlPage.dergiFirstButton.get(1).click(); //for categories


    }

    @And("Kullanici Dergi Aboneligi is dünyasi kategroisine tiklar")
    public void kullaniciDergiAboneligiKategroisineTiklar() {
        bekle(4);
        clickGesture(driver,800,1400);
        bekle(4);
     //   hizmetAlPage.dergiFirstButton.get(2).click(); //for categories
       // bekle(2);

    }

    @And("Kullanici Dergi Aboneligi Ekonomist Dergisini Sepete Ekler")
    public void kullaniciDergiAboneligiDergisineTiklar() {
        hizmetAlPage.dergiFirstButton.get(2).click();
        bekle(6);


    }

/*    @And("Kullanici Secilen dergiyi sepete ekler")
    public void kullaniciSecilenDergiyiSepeteEkler() {

    }*/

    @And("Kullanici Dergi Aboneligi sepeti ikonuna butonuna tiklar")
    public void kullaniciDergiAboneligiSepetiIkonunaButonunaTiklar() {
        hizmetAlPage.dergiSepet.get(2).click();
        bekle(2);

    }

    @And("Kullanici Dergi Aboneligi icin odemeye git butonuna tiklar")
    public void kullaniciDergiAboneligiIcinOdemeyeGitButonunaTiklar() {
     //   hizmetAlPage.dergiOdemeyeGit.get(9).click();
        clickGesture(driver,300,2000);

        bekle(3);

    }
    @And("Kullanici Dergi Aboneligi odeme islemlerini tamamlar")
    public void kullaniciDergiAboneligiOdemeIslemleriniTamamlar() {
        hizmetAlPage.dergiFirstButton.get(2).click();
        bekle(3);


           clickGesture(driver, 530, 450);

           bekle(1);


           hizmetAlPage.dergi444HesabaGiris.get(0).click();
           hizmetAlPage.dergi444HesabaGiris.get(0).sendKeys(ConfigReader.getProperty("userAdresses"));
           bekle(2);
           hizmetAlPage.dergi444HesabaGiris.get(1).click();
           hizmetAlPage.dergi444HesabaGiris.get(1).sendKeys(ConfigReader.getProperty("userAddressPassword"));
           bekle(3);
           hizmetAlPage.dergiFirstButton.get(3).click();
           bekle(1);

       // try {
            /*hizmetAlPage.dergiAdresEkle.click();

            bekle(1);
            hizmetAlPage.dergiAdresGirisi.get(4).click();
            hizmetAlPage.dergiAdresGirisi.get(4).sendKeys(Keys.TAB, "AnaAdress", Keys.TAB, "Ankara", Keys.ENTER, Keys.TAB, "Çankaya", Keys.ENTER,
                    Keys.TAB, "Test", Keys.TAB, "Can", Keys.TAB, "11111111111",
                    Keys.TAB,"5059000000",Keys.TAB,
                    Keys.TAB, "Adress No1", Keys.TAB, Keys.ENTER);*/
        //}catch (Exception e) {

        driver. findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
        //assertEquals("true", hizmetAlPage.dergi444KartNo.get(0).getAttribute("clickable"));
            bekle(1);
            hizmetAlPage.dergi444KartNo.get(0).click();
            bekle(2);
            hizmetAlPage.dergi444KartNo.get(0).sendKeys("1234567812345678");
            bekle(1);
            hizmetAlPage.dergi444KartNo.get(1).sendKeys("Test Can");
            bekle(1);
            hizmetAlPage.dergi444KartNo.get(2).sendKeys("12");
            bekle(1);
            hizmetAlPage.dergi444KartNo.get(3).sendKeys("25");
            bekle(1);
            hizmetAlPage.dergi444KartNo.get(4).sendKeys("123");
            bekle(1);
            clickGesture(driver,836,2161);
            bekle(1);
            hizmetAlPage.dergiMesafeliSatisSozlesme.click();
            bekle(1);
            hizmetAlPage.dergiOdemeyeDevamEtButton.click();


/*//836-2161
hizmetAlPage.dergi444KartNo.get(0).sendKeys("1234567812345678",Keys.TAB,"Test Can",Keys.TAB,"12",Keys.TAB,"25",Keys.TAB,"123"
                    ,Keys.TAB,Keys.TAB,Keys.TAB,Keys.SPACE,Keys.TAB,Keys.ENTER);
*/

            bekle(15);

            Assert.assertTrue(hizmetAlPage.dergiAnasayfayaDön.isDisplayed());



       // }




    }
}