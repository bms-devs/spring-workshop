# Warsztaty - Podstawy frameworka Spring

## Przygotowanie do warsztatów

### Wymagane narzędzia

Pobierz i zainstaluj następujące narzędzia:
* Git - https://git-scm.com/downloads
* Java SE Development Kit 8 - http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* Maven - https://maven.apache.org/ -> Download
* IntelliJ IDEA Community Edition - https://www.jetbrains.com/idea/download/
* Postman - https://www.getpostman.com/apps

### Ustawienie PATH

Po zainstalowaniu wyżej wymienionych narzędzi ustaw PATH dla JDK i [Mavena](https://maven.apache.org/install.html).

#### Windows:

Ustawienie JDK Path (wpisz ścieżkę wybraną podczas instalacji):

```
setx JAVA_HOME "C:\Program Files (x86)\Java\jdk1.8.0_172" 
setx PATH "%PATH%;%JAVA_HOME%\bin";
```

Ustawienie Maven Path (wpisz ścieżkę z miejscem gdzie jest rozpakowany Maven):

```
setx PATH "%PATH%;C:\apache-maven-3.5.3\bin";
```

#### Linux:

Ustawienie JDK Path (wpisz ścieżkę wybraną podczas instalacji):

```
export JAVA_HOME=/usr/local/jdk1.8.0_17/
export PATH=$JAVA_HOME/bin:$PATH
```

Ustawienie Maven Path (wpisz ścieżkę z miejscem gdzie jest rozpakowany Maven):

```
export PATH=/opt/apache-maven-3.5.3/bin:$PATH
```

### Pierwsze uruchomienie aplikacji

1. Sklonowanie repozytorium kodu (wpisz komendę w konsoli):

`git clone git@github.com:bms-devs/spring-workshop.git`

2. Przejście do folderu z projektem:

`cd spring-workshop`

3. Uruchomienie aplikacji (uruchom skrypt z konsoli):

`mvn spring-boot:run`

Podczas pierwszego uruchomienia zostaną pobrane wszystkie zależności, co może zająć chwilę czasu. Na konsoli powinien pojawić się m.in. komunikat `Started SpringWorkshopApplication`.

---

W razie pytań (szczególnie dotyczących przygotowania środowiska do warsztatów) można zadawać pytania na: akademia@bms.com.pl
