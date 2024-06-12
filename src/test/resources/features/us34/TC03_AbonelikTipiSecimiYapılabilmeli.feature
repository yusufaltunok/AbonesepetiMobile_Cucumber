@us34
Feature: US34 Yeni Abonelik Baslat
  Scenario: TC01 Yeni Abonelik Baslat
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici Islemler butonuna tiklar
    And Kullanici islemler sayfasinda Abonelik Islemleri basligi altinda yer alan Abonelik Baslat sekmesine tiklar.
    And Kullanici abonelik tipinden TV & Yayin secer.
    Then Kullanici abonelik tipinden TV & Yayin secimi yapabildigini dogrular.



