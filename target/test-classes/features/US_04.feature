Feature: Sitenin footer bölümünde bulunan Featured Packages bölümündeki öğelerin görüntülenebilir
          ve aktif olduğunu görüntüleyebildiğimi doğrulayabilmeliyim

  @Mert1
  Scenario: Sitenin footer bölümünde bulunan Featured Packages bölümündeki 1. Sekmenin görüntülenebilir ve aktif olduğunu doğrulanmalı
  Given TripandwayUrl adresine gidilir
  Then  Cookies varsa kabul edilir
  And Sayfanın Footer bölümüne inilir.
  And footer bölümünde bulunan Featured Packages bölümündeki "1.Sekmeyi tıkla
  When 1.Sekmenin sayfasının açıldığını test et
  And Sayfayi kapatir





