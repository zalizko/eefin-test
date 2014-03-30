# X-tee veebiteenus (proovitoo ulesanne)

Rakenduse (too) eesmark: teha X-tee nimeruumide- ja protokolli baasil toimiv veebiteenus,
"fieAndmed" paringu tarbeks (teenuse kirjeldus -- WSDL on manuses kaasas).

## X-tee juhendid ja spetsifikatsioon

* [https://www.ria.ee/x-tee-juhendid/](https://www.ria.ee/x-tee-juhendid/)
* [http://x-road.ee/docs/est/nouded_infosusteemidele_ja_adapterserveritele_legacy.pdf](http://x-road.ee/docs/est/nouded_infosusteemidele_ja_adapterserveritele_legacy.pdf)

## Nouded

Rakendus peab olema kirjutatud Java keeles veebirakendusena ja peab olema kaivitatav monel
vabalt valitud Java toega rakendusserveril. Projekt peab olema koostatud „Maven3“ ehitustarkvara
pohjal ja lahtekood peab asuma „GitHub.com“ koodihoidlas. Projekti kompileerimise tulemusel peab
tekkima rakendusest paigaldusuhikuna WAR voi EAR pakend.

## Lahenduse kirjeldus

Loodav rakendus on etteantud WSDL-i (uriproxy.wsdl) pohjal koostatud veebiteenus, mis sisaldab
vastust uhele paringule.
Lahendus ei pea taitma X-tee turvaserverist tulenevaid vajadusi, ehk teenuse paises sisalduvaid
andmeid rakendus tootlema ei pea. Veebiteenuse poolt valjastatavad andmed voivad olla rakenduses
staatiliselt maaratud.

## Nouded tulemusele

Proovitoo tulemus on programmikood, mis peab olema kompileeritav ja tootama Java 1.6 voi 1.7
versioonil. Tulemus on viide „GitHub.com“ avalikule koodihoidlale kus asub antud programmi
lahtekood.