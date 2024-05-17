Feature: US_30_Gelecege Yatirim Plani
  Scenario:Kullanici"Gelecege Yatirim Plani"menusune tikladiginda acilan sayfada gerekli bilgilendirmeleri ve satin al butonunu gorebilmeli.
    And Kullanici Abonesepeti uygulamasina giris yapar
    And Kullanici Anasayfada Tum Islemler sekmesine tiklar
    And Kullanici Gelecegim sekmesine tiklar
    And Kullanici Bireysel Emeklilik Urunlerinden>Gelecege Yatirim Plani'na tiklar
    And Kullanici Gelecege Yatirim Plani bilgilendirme sayfasini gorur
    And Kullanici Gelecege Yatirim sayfasindaki 'satin Al' butonu gorur
    And Kullanici Anadolu Hayat Emeklilik sayfasinda oldugunu dogrular
