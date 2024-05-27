@us39 @us39_01
Feature: Us39 - Arac Kiralama Islemi

Scenario: TC01 - Arac alış yeri ile birakis yerini farkli secerek arac kiralanabilmeli

When Kullanici Abonesepeti uygulamasina giris yapar
Then Kullanici ana sayfada bulunan hizmet al butonuna tiklar.
Then Kullanici hizmet al sayfasinda Araç kirala  sekmesine tiklar.
Then Kullanici Arac Kirala sayfasinda oldugunu dogrular.
Then Arac kirala sayfasinda nereden alacaksiniz? kutucuğuna tiklar
Then Kullanici Nereden Alacaksiniz? kutucuğuna gecerli bir konum bilgisi girer.
Then Kullanici Nereden Alacaksiniz? kutucuğuna girdiği konum bilgisine ait sekmeyi altta gorur ve tiklar.
Then Kullanici farkli bir yerde birakmak istiyorum kutucuğunu isaretler.
Then Kullanici Nereye birakacaksiniz? kutucugunu gorur ve tiklar.
Then Kullanici Nereye birakacaksiniz? kutucuguna gecerli bir konum bilgisi girer.
Then Kullanici Nereye birakacaksiniz? kutucuğuna girdiği konum bilgisine ait sekmeyi altta gorur ve tiklar.
Then Kullanici arac alıs tarihi bilgisini girer.
Then Kullanici birakiş tarihi bilgisini girer.
Then Kullanici en iyi fiyata bul butonuna tiklar.
Then Kullanici araç kirala sayfasinda listelenen araclari gorur.(veya aradıgınız kriterlere uygun arac bulunamadi yazisini gorur ve tamama tiklar
Then Kullanici sayfada listelenen araclardan istedigini secer ve arac kirala butonuna tiklar
Then Kullanici arac icin belirtilen tutar ile kredi kartından ödeyecegi tutarin aynı oldugunu kontrol eder ve devam et butonuna tiklar
Then Kullanici surucu bilgilerini girer ve devam et butonuna tiklar
And Kullanici odeme bilgileri sayfasinda kart bilgilerini girer ve odeme yap butonuna tiklar.