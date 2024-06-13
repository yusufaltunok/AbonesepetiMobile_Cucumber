@us34
Feature: US34 Yeni Abonelik Baslat
  Scenario: TC01 Yeni Abonelik Baslat
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici Islemler butonuna tiklar
    And Kullanici islemler sayfasinda Abonelik Islemleri basligi altinda yer alan Abonelik Baslat sekmesine tiklar.
    And Kullanici abonelik tipinden TV & Yayin secer.
    And Secilen abonelik tipi icin ozel firsatlar bilgileri goruntuler ve TV+ tiklar.
    And Kullanici TV+ sayfasinda Satin Al butonuna tiklar.
    And Kullanici hane ve kisi secip devam et butonuna tiklar


