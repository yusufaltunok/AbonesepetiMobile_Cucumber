
Feature: Us20 - Hesap Silme İslemi
  @us20_01
  Scenario Outline: TC01 Silme Islemi Icın Yeni Hesap Olusturma

    When Giris sayfasina ulasmak icin Atla butonuna tiklar
    And Yeni hesap olustur butonuna tiklar
    And Kullanici "<ad>", "<soyad>", "<telefon>", "<mail>", "<sifre>" bilgilerini girer
    And Kullanici sozlesmesini kabul etmek icin checkbox'i tiklar
    And Hesap olustur butonuna tiklar
    And Telefona SMS ile gelen 4 haneli dogrulama kodunu girer
    And Dogrula butonuna tiklar
    Then Basarili bir sekilde hesap olusturuldugunu dogrular

    Examples:
      | ad   | soyad | telefon    | mail            | sifre  |
      | bu bir | deneme | 5464302177 | deneme@abc.com | 123456 |

  @us20_02
  Scenario: TC02-Pozitive Scenario- Kullanici "Hesabimi Sil" islemini gerceklestirebildigini dogrular

    When Kullanici silmek istedigi hesaba giris yapar
    Then Kullanici Profil butonununa tiklar
    Then Kullanici Hesabimi Sil butonuna tiklar
    Then Kullanici Yinede Sil ve Iptal butonlarını goruntuler
    Then Kullanici Iptal butonuna tiklar ve profil sayfasında kaldıgını dogrular
    Then Kullanici Hesabimi Sil butonuna tiklar
    Then Kullanici Yinede Sil butonunu tiklar
    Then Kullanici mevcut sifre textboxina sifresini girer
    Then Kullanici sifrenin yanindaki goz simgesine tiklar
    Then Kullanici gecerli sifresini girdigini dogrular
    Then Kullanici sil butonunu tiklar
    Then Kullanici musteri uyari mesajini goruntuler
    Then Kullanici Sil ve Devam Et butonlarinin tiklanabilir oldugunu dogrular
    Then Kullanici sil butonunu tiklar
    And Kullanici silinen hesap bilgileri ile giris yapamadigini dogrular ve tamam butonuna tiklar


#hesaba girip profil sayfayasona geliyor. sayfann en altına imnmediği için hesabımı sil butonunu göremiyor
  #Ayrıca manuel olarak da silmeye çalışınca "beklenmeyen bir hata oluştu" uyarısı çıkıyor.

  @us20_03
  Scenario: TC03 -Negative Scenario - Kullanici sistemde kayitli cep telefonu ve gecersiz sifre bilgisiyle
  "Hesabimi Sil" islemini gerceklestirememeli"


    When Kullanici silmek istedigi hesaba giris yapar
    Then Kullanici Profil butonununa tiklar
    Then Kullanici Hesabimi Sil butonuna tiklar
    Then Kullanici Yinede Sil ve Iptal butonlarını goruntuler
    Then Kullanici Iptal butonuna tiklar ve profil sayfasında kaldıgını dogrular
    Then Kullanici Hesabimi Sil butonuna tiklar
    Then Kullanici Yinede Sil butonunu tiklar
    Then Kullanici mevcut sifre textboxina gecersiz sifre girer
    Then Kullanici sil butonunu tiklar
    Then Kullanici musteri uyari mesajini goruntuler
    Then Kullanici Sil ve Devam Et butonlarinin tiklanabilir oldugunu dogrular
    Then Kullanici sil butonunu tiklar
    And Kullanici girmiş oldugunuz bilgilerle eslesen hesap bulunamadi yazisini gorur.
