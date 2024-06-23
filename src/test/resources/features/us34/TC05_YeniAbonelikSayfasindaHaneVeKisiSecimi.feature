@us34
Feature: US34 Yeni Abonelik Baslat
  Scenario: TC01 Yeni Abonelik Baslat
    When Kullanici Abonesepeti mobil uygulamasına "Anasayfaya" girer
    And Kullanici Islemler butonuna tiklar
    And Kullanici islemler sayfasinda "Abonelik İslemleri" basligi altinda yer alan "Abonelik Baslat" sekmesine tiklar.
    And Kullanici "abonelik tipi" secimi yapar.
    And Secilen abonelik tipi icin ozel firsatlar bilgileri goruntuler ve Hemen Basvur butonuna tiklar.