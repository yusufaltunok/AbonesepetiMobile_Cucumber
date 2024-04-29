@US12_TC01
  Feature: US12 pro aylik odeme yapilabildigini dogrula
    Scenario: TC01 - Genel Senaryo
      When Kullanici Abonesepeti uygulamasina giris yapar
      Then Kullanici Profil butonununa tiklar
      And Kullanici Uyelik butonuna tiklar
      And Kullanici Uyelik butonunun tiklanabilir oldugunu dogrular
      And Kullanici Uyelik Plani sayfasinda oldugunu dogrular
      And Kullanici Free Ucretsiz Plana tiklar
      And Kullanici Free Ucretsiz Plana tiklanabilir oldugunu dogrular
      And Kullanici Free Ucretsiz Planda Free textinin gectigini dogrular
      And Kullanici Free Ucretsiz Planda en altta Satin Al butonunun aktiflesmedigini dogrular
      And Kullanici Free Planda Kolay Iptalin yapilamadigini dogrular
      And Kullanici Free Planda Abonelik Baslatma yapilabildigini dogrular
      And Kullanici Free Planda Abonelik Yonetme yapilabildigini dogrular
      And Kullanici Free Planda Kredi Basvurusu yapilabildigini dogrular
      And Kullanici Free Planda Sigorta Teklifi yapilabildigini dogrular
      And Kullanici Pro Aylik Plana tiklar
      And Kullanici Pro Aylik Plana tiklanabilir oldugunu dogrular
      And Kullanici en altta Satin Al butonunun aktiflestigini dogrular
      And Kullanici Free planda Kolay Iptalin yapilamadigini dogrular
      And Kullanici Free planda Abonelik Baslatma yapilabildigini dogrular
      And Kullanici Free planda Abonelik Yonetme yapilabildigini dogrular
      And Kullanici Free planda Kredi Basvurusu yapilabildigini dogrular
      And Kullanici Free planda Sigorta Teklifi yapilabildigini dogrular

    Scenario: TC01 - Pozitif Senaryo
      When Kullanici Abonesepeti uygulamasina giris yapar
      Then Kullanici Profil butonununa tiklar
      And Kullanici Uyelik butonuna tiklar
      And Kullanici Uyelik butonunun tiklanabilir oldugunu dogrular
      And Kullanici Uyelik Plani sayfasinda oldugunu dogrular
      And Kullanici Free Ucretsiz Plana tiklar
      And Kullanici Free Ucretsiz Plana tiklanabilir oldugunu dogrular
      And Kullanici Free Ucretsiz Planda Free textinin gectigini dogrular





