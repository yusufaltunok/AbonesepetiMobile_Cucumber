package abonesepeti.stepdefs.yeniAbonelik;

import abonesepeti.pages.HizmetAlPage;
import abonesepeti.pages.YeniAbonelikPage;
import abonesepeti.utilities.Driver;
import abonesepeti.utilities.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;

import static abonesepeti.utilities.Driver.driver;

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
           hizmetAlPage.dergi444HesabaGiris.get(0).sendKeys("qatesterfm@icloud.com");
           bekle(2);
           hizmetAlPage.dergi444HesabaGiris.get(1).click();
           hizmetAlPage.dergi444HesabaGiris.get(1).sendKeys("111111");
           bekle(3);
           hizmetAlPage.dergiFirstButton.get(3).click();
           bekle(1);

           try {
               hizmetAlPage.dergiAdresEkle.click();

               bekle(1);
               hizmetAlPage.dergiAdresGirisi.get(4).click();
               hizmetAlPage.dergiAdresGirisi.get(4).sendKeys(Keys.TAB, "AnaAdress", Keys.TAB, "Ankara", Keys.ENTER, Keys.TAB, "Çankaya", Keys.ENTER, Keys.TAB, "Ali", Keys.TAB, "Can", Keys.TAB, "11111111111",
                       Keys.TAB, "Adress No1", Keys.TAB, Keys.ENTER);
           }catch (Exception e) {
               System.out.println(" Teslimat Adresi Değiştirilemiyor Eklenemiyor");
               System.out.println(" ");
           }



    }
}