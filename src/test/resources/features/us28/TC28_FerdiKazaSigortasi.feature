@us28
Feature: US28 Ferdi Kaza Sigortasi
  Scenario: TC01 Ferdi Kaza Sigortasi
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici Hizmet Al butonuna tiklar
    And Kullanici Anadolu Hayat Gelecegim sekmesine tiklar
    And Kullanici Ferdi Kaza Sigortasi sekmesine tiklar
    And Kullanici Satin Al butonunu tiklar
    Then Kullanici Anadolu Hayat Emeklilik sayfasinda oldugunu dogrular