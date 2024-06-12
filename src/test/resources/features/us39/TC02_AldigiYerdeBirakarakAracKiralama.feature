@us39_02
Feature: Us39 - Arac Kiralama Islemi

  Scenario: TC02 - Araci aldigi yerde birakma secenegi ile arac kiralanabilmeli

    When Kullanici Abonesepeti uygulamasina giris yapar
    Then Kullanici Hizmet Al butonunu tiklar
    Then Kullanici hizmet al sayfasinda Arac kirala  sekmesine tiklar.
    Then Kullanici Arac Kirala sayfasinda oldugunu dogrular.
    Then Arac kirala sayfasinda nereden alacaksiniz? kutucuğuna tiklar
    Then Kullanici Nereden Alacaksiniz? kutucuguna gecerli bir "Gümüşhane" bilgisi girer.
    Then Kullanici Nereden Alacaksiniz? kutucuğuna girdiği konum bilgisine ait sekmeyi altta gorur ve tiklar.
    Then Kullanici arac alıs "04 August" bilgisini girer
    Then Kullanici birakiş "08 August" bilgisini girer
    Then Kullanici en iyi fiyata bul butonuna tiklar.
    Then Kullanici ayni konumda arac kirala sayfasinda listelenen araclari gorur
    Then Kullanici sayfada listelenen araclardan istedigini "Benzin" "Otomatik" secer ve arac kirala butonuna tiklar
    Then Kullanici surucu bilgilerini "Sofu Ali Mahallesi" "Bolu" "Göynük" girer ve devam et butonuna tiklar
    Then Kullanici arac icin belirtilen tutar ile kredi kartindan odeyecegi tutarin ayni oldugunu kontrol eder ve devam et butonuna tiklar
    And Kullanici odeme bilgileri sayfasinda kart bilgilerini "Ali CAN" "4242 4242 4242 4242" "03" "26" "234" girer ve odeme yap butonuna tiklar.