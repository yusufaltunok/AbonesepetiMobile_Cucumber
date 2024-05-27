@US03_TC01
  Feature: US03 Google hesabı ile yeni hesap olusturma
    Scenario: TC01 Google hesabı ile yeni hesap olusturma pozitif senaryo
    Given Kullanici Abonesepeti uygulamasini acar
    When Giris sayfasina ulasmak icin Atla butonuna tiklar
      And Kullanici Basla butonuna tiklar
      And Kullanici eklemek istedigi aboneligi secer
      And Kullanici Devam Et butonuna tiklar
      And Kullanici eklemek istedigi abonelik paketini secer
      And Kullanici KAYDET'e tiklar
      And Kullanici bildirim izni secer
      And Kullanici Google ikonuna tiklar
      And Kullanici acilan sayfada bir Google hesabi secer
      And Kullanici telefon numarasini girer
      And Kullanici Kodu Gonder butonuna tiklar
      And Kullanici Telefona SMS ile gelen 4 haneli dogrulama kodunu girer
      And Kullanici Dogrula butonuna tiklar
      And Kullanici "<ad_soyad>", "<E_posta>", "<sifre>" bilgilerini girer
      Then Basarili bir sekilde hesap olusturuldugunu dogrular

