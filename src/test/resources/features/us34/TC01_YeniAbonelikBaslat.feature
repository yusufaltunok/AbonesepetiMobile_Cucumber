@us34
Feature: US34 Yeni Abonelik Baslat
  Scenario: TC01 Yeni Abonelik Baslat
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici Islemler butonuna tiklar
    Then Kullanici islemler sayfasinda Abonelik İslemleri basligi altinda yer alan Abonelik Baslat sekmesinin gorunur oldugunu dogrular.



