@Lg
Feature:US10
  Scenario:TC01_Kullanicinin valid sifre ile sifre guncelleme islemini gerceklestirebildigini dogrula {Valid Password}
    When Kullanici AboneSepeti uygulamasina giris yapar
    When Kullanici Profil butonununa tiklar
    When Kullanici Sifremi Degistir butonuna tiklar
    When Mevcut Sifre alanina eski sifre girilir
    When Yeni Sifre alanina valid eski sifreden farkli sifre girilir
    When Yeni Sifre Dogrulama alanina bir onceki stepte girilen sifre girilir
    When Kullanici Kaydete tiklar
    When Kullanici sifrenin basarili bir sekilde degistirildigini dogrular
    When Kullanici Çıkis Yap'a tıklar
    When Kullanici Evet'e tıklar
    When Kullanici E_postaileAboneSepeti uygulamasina giris yapar








 # When Kullanici eposta ile abonesepeti uygulamasina giris yapar
 #  Navigate to Profil Page
 #  Click on Sifremi Degistir
 #  Mevcut Sifre alanina eski sifre girilir
 #  Yeni Sifre alanina valid eski sifreden farkli sifre girilir
 #  Yeni Sifre Dogrulama alanina bir onceki stepte girilen sifre girilir
 #  Kaydet butonuna tiklanir
 #  Ekrana gelen Pop-Up mesajinda Tamam'a tiklanir
 #  Kullanici email ve yeni sifre ile login olur





