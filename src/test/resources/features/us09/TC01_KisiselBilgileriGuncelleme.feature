@rabia9
Feature: Us09

  Scenario: TC01 Kullanici Kisisel Bilgileri Guncelleyebildigini dogrular

    When Kullanici Abonesepeti uygulamasina giris yapar
    Then Kullanici Profil butonununa tiklar
    Then Kullanici Kisisel Bilgiler butonuna tiklar ve sayfaya geçis yapar
    Then Kullanici Ad kutusunu temizler
    Then Kullanici Ad kutusuna valid bir deger girer
    Then Kullanici Soyad kutusunu temizler
    Then Kullanici Soyad kutusuna valid bir deger girer
    Then Kullanici TC kutusunu temizler
    Then Kullanici TC kutusuna valid bir deger girer
    Then Kullanici cep telefonu kutusunu temizler
    Then Kullanici cep telefonu kutusuna valid bir deger girer
    Then Kullanici dogum tarihi kutusunu temizler
    Then Kullanici dogum tarihi kutusuna valid bir deger girer
    Then Kullanici kaydet butonuna tiklar
    Then Kullanici geri tuşu ile profil sayfasina geciş yapar
    Then Kullanici Kişisel Bilgiler butonuna tiklar
    And Kullanici Kisisel Bilgiler' in basarili bir sekilde guncellendigini gorur






 # Navigate to Profil Page
  #Click on Kisisel Bilgiler
 # Ad kutusu temizlenir ve icerisine valid ad girilir
#  Soyad kutusu temizlenir ve icerisine valid soyad girilir
 # TC kutusu temizlenir ve icerisine valid TC girilir
  #Cep kutusu temizlenir ve icerisine valid Cep girilir
  #E-mail kutusu temizlenir ve icerisine valid E-mail girilir
  #Dogum Tarihi kutusu temizlenir ve icerisine valid dogum tarihi girilir
  #Click on Kaydet button
  #Go Back yapilarak Profil Page'e donulur
  #Click on Kisisel Bilgiler
