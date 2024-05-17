@US02_TC07

Feature: US02 Yeni Hesap Olusturma
  Scenario Outline: TC07 Yeni Hesap Olusturma Negatif Senaryo
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
    Then Hesap olusturulamadigini dogrular


    Examples:
      |   ad_soyad   |    E_posta       | sifre  |
      |  test  test  |  testabc@abc.com | 123456 |




#     Kullanıcı sözleşmesini kabul etmek için gerekli olan checkbox'ı tıklamadan üyelik oluşturmayı denemek için yapılmıştı,
#     ancak yeni akışta olmadığı için bu test işlevsiz duruma geldi.

