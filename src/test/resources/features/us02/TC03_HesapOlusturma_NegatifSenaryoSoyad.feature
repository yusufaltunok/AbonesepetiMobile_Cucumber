@US02_TC03

Feature: US02 Yeni Hesap Olusturma
  Scenario Outline: TC03 Yeni Hesap Olusturma Negatif Senaryo
    Given Kullanici Abonesepeti uygulamasini acar
    When Giris sayfasina ulasmak icin Atla butonuna tiklar
    And Yeni hesap olustur butonuna tiklar
    And Kullanici "<ad>", "<soyad>", "<telefon>", "<mail>", "<sifre>" bilgilerini girer
    And Kullanici sozlesmesini kabul etmek icin checkbox'i tiklar
    And Hesap olustur butonuna tiklar
    Then Basarili bir sekilde hesap olusturulamadigini dogrular


    Examples:
      | ad   | soyad | telefon    | mail            | sifre  |
      | test |   a   | 5356901971 | testabc@abc.com | 123456 |




