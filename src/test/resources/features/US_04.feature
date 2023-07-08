Feature: Sitenin footer bölümünde bulunan Featured Packages bölümündeki öğelerin görüntülenebilir
  ve aktif olduğunu görüntüleyebildiğimi doğrulayabilmeliyim


  Background:
    Given TripandwayUrl adresine gidilir
    Then  Cookies varsa kabul edilir

  @US04_TC01
  Scenario: Sitenin footer bölümünde bulunan Featured Packages bölümündeki 1. Sekmenin görüntülenebilir ve aktif olduğunu doğrulanmalı


    And Sayfanın Footer bölümüne inilir.
    And footer bölümünde bulunan Featured Packages bölümündeki "1.Sekmeyi tıkla
    When 1.Sekmenin sayfasının açıldığını test et
    And Sayfayi kapatir

  @US04_TC02
  Scenario: Sitenin footer bölümünde bulunan Featured Packages bölümündeki 2. Sekmenin görüntülenebilir ve aktif olduğunu doğrulanmalı


    Given footer bölümünde bulunan Featured Packages bölümündeki "2.Sekmeyi tıkla
    Then 2.Sekmenin sayfasının açıldığını test et
    And  Sayfayi kapatir




