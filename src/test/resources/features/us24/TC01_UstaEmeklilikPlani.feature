@us24
Feature: US24 Usta Emeklilik Plani
  Scenario: TC01 Usta Emeklilik Plani
    When Kullanici Abonesepeti mobil uygulamasında "Anasayfaya" girer
    And Kullanici Anasayfada Tum Islemler sekmesine tiklar
    And Kullanici Gelecegim sekmesine tiklar
    And Kullanici Gelecegim sayfasında oldugunu dogrular
    And Kullanici Usta Emeklilik Plani sekmesine tiklar
    And Kullanici Satin Al butonunu tiklar
    And Kullanici Anadolu Hayat Emeklilik sayfasinda oldugunu dogrular