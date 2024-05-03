@us22
Feature: US22 Genc Emeklilik Plani
  Scenario: TC02 Genc Emeklilik Plani
    When Kullanici Abonesepeti mobil uygulamasında "Anasayfaya" girer
    And Kullanici Anasayfada Tum Islemler sekmesine tiklar
    And Kullanici Gelecegim sekmesine tiklar
    And Kullanici Gelecegim sayfasında oldugunu dogrular
    And Kullanici Genc Emeklilik Plani sekmesine tiklar
    And Kullanici Genc Emeklilik Plani sayfasinda oldugunu dogrular
    Then Kullanici Satin Al butonunun gorunur oldugunu dogrular
