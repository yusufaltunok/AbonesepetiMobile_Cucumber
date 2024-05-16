
@US21
Feature: US 21 Cocugum Icin BES

  Scenario: TC 01 "Kullanici "Cocugum icin Bes" menusune tikladiginda acilan sayfada gerekli bilgilendirmeleri ve satin al butonunu gorebilmeli.
    When Kullanici AboneSepeti uygulamasina giris yapar
    And Kullanici Hizmet Al butonunu tiklar
    And Kullicini Anadolu Hayat Gelecegim sekmesine tiklar.
    And Kullanici Cocugum icin BES sekmesine tiklar
    And Kullanici Cocugum icin BES sayfasinda oldugunu dogrular
    And Kullanici "Satın Al" butonunun gorunur oldugunu dogrular


  Scenario: TC 02 Kullanici Satin Al butonuna basinca url Anadolu Hayat Emeklilik banka uygulamasi giris sayfasina yonlendirilmeli.
    When Kullanici AboneSepeti uygulamasina giris yapar
    And Kullanici Hizmet Al butonunu tiklar
    And Kullicini Anadolu Hayat Gelecegim sekmesine tiklar.
    And Kullanici Cocugum icin BES sekmesine tiklar
    And Kullanici cocugum icin BES Satin Al butonu tiklar
    And Kullanici Anadolu Hayat Emeklilik banka uygulamasi giris sayfasina yonlendirilir

