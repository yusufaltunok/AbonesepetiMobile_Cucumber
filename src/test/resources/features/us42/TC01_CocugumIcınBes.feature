
Feature: Gelecek Planı Teklifi Al
Scenario: Anadolu Hayat Gelecegim linkinden gelecek planlarini iceren teklifler alabilmeliyim.


  When Kullanici Abonesepeti uygulamasina giris yapar
  Then Kullanici Hizmet Al butonunu tiklar
Then Kullanıcı Anadolu Hayat Emeklilik butonuna tiklar.
Then Kullanici Bireysel emeklilik ürünleri başlıgı altında Cocugum Icın Bes linkine tiklar.
Then Kullanici gelen sayfada Satın Al butonuna tiklar.
And Kullanici Anadolu Hayat Emeklilik Sayfasına ulasır.