@us43
Feature: US43 Abonelik Sorgulama
  Scenario: TC01 Abonelik Sorgulama
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici Islemler butonuna tiklar
    And Kullanici Aboneliklerini Sorgula butonuna tiklar
    Then Kullanici ilgili sayfada oldugunu dogrular


