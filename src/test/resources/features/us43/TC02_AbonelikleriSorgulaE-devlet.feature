@us43
Feature: US43 Abonelik Sorgulama
  Scenario: TC02 Abonelik Sorgulama
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici Islemler butonuna tiklar
    And Kullanici Aboneliklerini Sorgula butonuna tiklar
    And Kullanici E-Devlete Git butonuna tiklar
    Then Kullanici E-Devlet sayfasinda oldugunu dogrular


