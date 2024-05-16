@US02_TC04

Feature: US02 Yeni Hesap Olusturma
  Scenario Outline: TC04 Yeni Hesap Olusturma Negatif Senaryo
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

    Then Gecerli bir mail adresi giriniz hata mesajinin ciktigini dogrular


    Examples:
      |   ad_soyad   |    E_posta       | sifre  |
      |      test    |  testabc.abc.com | 123456 |




