@us11
Feature: US11 Pro Aylik Aboneligi
  Scenario: TC01 Pro Aylik Aboneligi
    When Kullanici Abonesepeti uygulamasina giris yapar
    And Kullanici Profil butonununa tiklar
    And Kullanici Uyelik sekmesine tiklar
    And Kullanici Pro Aylik seceneginin oldugunu dogrular
    And Kullanici Pro Aylik secenegine tiklar
    And Kullanici Satin Al butonun tiknalabilir oldugunu dogrular
    And Kullanici Satin Al butonuna tiklar
    And Kullanici Abone Ol butonun aktif oldugunu dogrular
    Then Kullanici Abone Ol butonuna tiklar
