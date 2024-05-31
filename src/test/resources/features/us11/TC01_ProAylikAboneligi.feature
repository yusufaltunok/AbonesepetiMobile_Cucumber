@us11
Feature: US11 Pro Aylik Aboneligi
  Scenario: TC01 Pro Aylik Aboneligi
    When Kullanici Abonesepeti uygulamasina giris yapar
    And Kullanici Profil butonununa tiklar
    And Kullanici Uyelik butonuna tiklar
    And Kullanici Uyelik Plani sayfasinda oldugunu dogrular
    And Kullanici Pro Aylik Planda Pro Aylik yazisinin goruldugunu dogrular
    And Kullanici en altta Satin Al butonunun aktiflesmedigini dogrular
    And Kullanici Pro Aylik Plana tiklanabilir oldugunu dogrular
    And Kullanici Pro Aylik Plana tiklar
    And Kullanici en altta Satin Al butonunun aktiflestigini dogrular
    And Kullanici Satin Al butonuna tiklar
    And Kullanici Abone Ol butonun aktif oldugunu dogrular
    Then Kullanici Abone Ol butonuna tiklar
