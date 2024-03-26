@us05
Feature: US05 Onceden kayitli bilgiler ile Yeni Hesap Olusturamamali
  Scenario Outline: TC01 Yeni Hesap Olusturamama - negative Senaryo
    When Kullanici Abonesepeti uygulamasina giris yapar
    And Giris sayfasina ulasmak icin Atla butonuna tiklar
    And Yeni hesap olustur butonuna tiklar
    And "<ad>", "<soyad>", "<telefon>", "<mail>", "<sifre>" bilgilerini girer
    And Kullanici sozlesmesini kabul etmek icin checkbox'i tiklar
    And Hesap olustur butonuna tiklar
    Then Girmis oldugunuz e-posta adresine ait uyelik bulunmaktadir Uyari yazisini gorur.

    Examples:
      | ad   | soyad | telefon    | mail            | sifre  |
      | test | test  | 5356901971 | testabc@abc.com | 123456 |