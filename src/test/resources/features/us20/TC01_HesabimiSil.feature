
Feature: Us20 - Hesap Silme İslemi
  @us20_01
  Scenario Outline: TC01 Yeni Hesap Olusturma Pozitif Senaryo
    Given Kullanici Abonesepeti uygulamasini acar
    When Giris sayfasina ulasmak icin Atla butonuna tiklar
    And Kullanici Basla butonuna tiklar
    And Kullanici eklemek istedigi aboneligi secer
    And Kullanici Devam Et butonuna tiklar
    And Kullanici eklemek istedigi abonelik paketini secer
    And Kullanici KAYDET'e tiklar
    And Kullanici bildirim izni secer
    And Kullanici telefon numarasini girer
    And Kullanici Yeni hesap olustur butonuna tiklar
    And Kullanici Telefona SMS ile gelen 4 haneli dogrulama kodunu girer
    And Kullanici Dogrula butonuna tiklar
    And Kullanici "<ad_soyad>", "<E_posta>", "<sifre>" bilgilerini girer
    Then Basarili bir sekilde hesap olusturuldugunu dogrular
    And Kullanici devam et butonuna tiklar

       Examples:
         |   ad_soyad     |    E_posta       | sifre  |
         | bu bir  deneme |  deneme@abc.com  | 123456 |

  @us20_02
  Scenario: TC02-Pozitive Scenario- Kullanici "Hesabimi Sil" islemini gerceklestirebildigini dogrular
    Given Kullanici Abonesepeti uygulamasina giris yapar
#    When Kullanici silmek istedigi hesaba giris yapar
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
    And Kullanici girmis oldugunuz bilgilerle eslesen hesap bulunamadi yazisini gorur.
