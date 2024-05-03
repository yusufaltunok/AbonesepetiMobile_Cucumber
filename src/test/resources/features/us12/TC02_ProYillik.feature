@tarik1
Feature: US12 pro yillik odeme yapilabildigini dogrula
  Background:
    When Kullanici Abonesepeti uygulamasina giris yapar
    Then Kullanici Profil butonununa tiklar
    And Kullanici Uyelik butonuna tiklar

    Scenario: Pro Yillik Redeem Code ile Odeme
    And Kullanici Pro Yillik Plana tiklar
    #And Kullanici Satin Al butonuna tiklar
    And Kullanici acilan sayfada Redeem code butonunun goruldugunu dogrular
    And Kullanici acilan sayfada Add credit or debit card butonunun goruldugunu dogrular
    And Kullanici Redeem code butonuna tiklar
    And Kullanici acilan sayfada Enter Code alaninin tiklanabilir oldugunu dogrular
    And Kullanici Terms and Conditions linkinin tiklanabilir oldugunu dogrular
    And Kullanici Enter Code alanina mail adresine gelen alti haneli kodu girer
    And Kullanici en altta Redeem butonunun aktiflestigini dogrular

  Scenario: Pro Yillik Add credit or debit card ile Odeme
    #When Kullanici Abonesepeti uygulamasina giris yapar
    #Then Kullanici Profil butonununa tiklar
    #And Kullanici Uyelik butonuna tiklar
    And Kullanici Pro Yillik Plana tiklar
    # And Kullanici Satin Al butonuna tiklar
    And Kullanici acilan sayfada Redeem code butonunun goruldugunu dogrular
    And Kullanici acilan sayfada Add credit or debit card butonunun goruldugunu dogrular
    And Kullanici Add creditor debit card butonuna tiklar
#      And Kullanici acilan sayfada Card number alaninin tiklanabilir oldugunu dogrular
#      And Kullanici acilan sayfada en altta Save butonunun aktif olmadigini dogrular
#      And Kullanici Card number box alanina sanal kart numarasi olan 4242424242424242 girer
#      And Kullanici MM/YY box alanina 529 girer
#      And Kullanici CVC alanina uc haneli guvenlik kodunu girer
#      And Kullanici en altta Save butonunun aktiflestigini dogrular
#      And Kullanici Name Box alaninda otomatik olarak isim ve soyismini goruntuler
#      And Kullanici Country alaninda otomatik olarak Turkey secili olarak gorur
#      And Kullanici Postal Code box alaninin tiklanabilir oldugunu dogrular
#      And Kullanici Postal Code alanina gecerli 34415 posta kodu girer
#      And Kullanici Terms of Service linkinin tiklanabilir oldugunu dogrular
#      And Kullanici Privacy Notice linkinin tiklanabilir oldugunu dogrular









