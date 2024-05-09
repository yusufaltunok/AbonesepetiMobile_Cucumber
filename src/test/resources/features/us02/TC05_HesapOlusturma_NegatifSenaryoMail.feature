@US02_TC05

Feature: US02 Yeni Hesap Olusturma
  Scenario Outline: TC05 Yeni Hesap Olusturma Negatif Senaryo
    Given Kullanici Abonesepeti uygulamasini acar
    When Giris sayfasina ulasmak icin Atla butonuna tiklar
    And Yeni hesap olustur butonuna tiklar
    And Kullanici "<ad>", "<soyad>", "<telefon>", "<mail>", "<sifre>" bilgilerini girer
    And Kullanici sozlesmesini kabul etmek icin checkbox'i tiklar
    And Hesap olustur butonuna tiklar
    Then Gecerli bir mail adresi giriniz hata mesajinin ciktigini dogrular


    Examples:
      | ad   | soyad | telefon    | mail            | sifre  |
      | test | test  | 5356901971 | testabc@abc+com | 12345  |




