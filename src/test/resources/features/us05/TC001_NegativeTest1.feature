@us05 @hepsi
Feature: US05 Onceden kayitli bilgiler ile Google Hesabi Kullanilarak Yeni Hesap Olusturamamali
  Scenario Outline: TC01 Yeni Hesap Olusturamama - negative Senaryo
   # When Kullanici Abonesepeti uygulamasina giris yapar
    And Giris sayfasina ulasmak icin Atla butonuna tiklar
    And Google ikonuna tiklar
    And Kayitli bir google hesabi sec
    And "<telefon>", "<sifre>" bilgilerini girer
    And Kullanici sozlesmesini kabul etmek icin checkbox'i tiklar
    And Hesap olustur butonuna tiklar
    Then Girmis oldugunuz e-posta adresine ait uyelik bulunmaktadir Uyari yazisini gorur

    Examples:
     | telefon    | sifre  |
     | 5056771625 | qqqqq1 |