Feature: US36 US_36 - Kullanici olarak başvurularimi görüntüleyebilmeliyim

  Scenario: TC001 "Kullanici basvurularini görüntülenebilmeli"
    When Kullanici AboneSepeti uygulamasina giris yapar
    And Kullanici Islemler butonunun tiklanabilir oldugunu dogrular
    And Kullanici Islemler butonuna tiklar
    And Kullanici basvuralarim butonunun gorunur oldugunu dogrular
    And Kullanici basvurularim sekmesinin tıklanabilir oldugunu dogrular
    And Kullanici basvurularim butonuna tiklar
    And Kullanici "Basvurularim" sayfasinda oldugunu dogrular
    And Kullanici Basvurularim sayfasinda "Kolay Iptal" sekmesinin gorunur oldugunu dogrular
    And Kullanici Basvurularim sayfasinda "Yeni Abonelik" sekmesinin gorunur oldugunu dogrular
    And Kullanici Basvurularim sayfasinda "Yeni Abonelik" sekmesine tiklar.
    And Kullanici Yeni Abonelik sekmesi altinda yaptigi basvurularini goruntuler.
